package org.elsoft.platform.hr.objects;

import org.tura.platform.object.TuraObject;

public interface StateDAO extends TuraObject {
    public void setName(String name);

    public String getName();
}
