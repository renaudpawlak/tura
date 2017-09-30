/**
 * Copyright (C) 2010 David Rousselie <drousselie@octo.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.octo.java.sql;

import static com.octo.java.sql.query.Query.c;
import static com.octo.java.sql.query.Query.f;
import static com.octo.java.sql.query.Query.select;
import static com.octo.java.sql.query.Query.update;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Map;

import org.junit.Test;

import com.octo.java.sql.query.QueryException;
import com.octo.java.sql.query.UpdateQuery;

public class UpdateQueryTest {
  @Test
  public void testShouldBuildUpdateSQLQuery() throws QueryException {
    final UpdateQuery query = update("myTable") //
        .set(c("firstCol"), "v1") //
        .set(c("secondCol"), "v2");

    assertEquals(
        "UPDATE myTable SET firstCol = :p1, secondCol = :p2",
        (String)query.toSql());
    assertEquals(2, (int)query.getParams().size());
  }

  @Test
  public void testShouldBuildUpdateSQLQueryWithNullValue()
      throws QueryException {
    final UpdateQuery query = update("myTable").set(c("firstCol"), null);

    assertEquals("UPDATE myTable SET firstCol = :p1", (String)query.toSql());
    final Map<String, Object> params = query.getParams();
    assertEquals(1, (int)params.size());
    assertNull( params.get("p1"));
  }

  @Test
  public void testShouldBuildUpdateSQLQueryWithOneWhereClauseLike()
      throws QueryException {
    final UpdateQuery query = update("myTable") //
        .set(c("firstCol"), "v1") //
        .set(c("secondCol"), "v2") //
        .where(c("thirdCol")).like("%1%");

    assertEquals(
        "UPDATE myTable SET firstCol = :p1, secondCol = :p2 WHERE (thirdCol LIKE :p3)",
        query.toSql());
    assertEquals(3, (int)query.getParams().size());
    assertEquals("%1%", (String)query.getParams().get("p3"));
  }

  @Test
  public void testShouldBuildUpdateSQLQueryWithNestedSelectWhereClause()
      throws QueryException {
    final UpdateQuery query = update("myTable") //
        .set(c("firstCol"), "v1") //
        .set(c("secondCol"), "v2") //
        .where(c("thirdCol")).like("%1%") //
        .and(c("col4")).eq( //
            select(f("MAX", c("colnum"))).from("otherTable") //
                .where(c("otherCol")).eq(42) //
        );

    assertEquals(
        "UPDATE myTable SET firstCol = :p1, secondCol = :p2 WHERE ((thirdCol LIKE :p3) AND (col4 = (SELECT MAX(colnum) FROM otherTable WHERE (otherCol = :p4))))",
        (String)query.toSql());
    assertEquals(4, (int)query.getParams().size());
    assertEquals("%1%", (String)query.getParams().get("p3"));
    assertEquals(42, (int)query.getParams().get("p4"));
  }
}
