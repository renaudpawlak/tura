﻿-- Table: hr.city

-- DROP TABLE hr.city;

CREATE TABLE hr.city
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  name character varying(255),
  parent_id bigint,
  CONSTRAINT city_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.company

-- DROP TABLE hr.company;

CREATE TABLE hr.company
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  company_name character varying(255),
  country_id bigint,
  description character varying(255),
  parent_id bigint,
  CONSTRAINT company_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.country

-- DROP TABLE hr.country;

CREATE TABLE hr.country
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  name character varying(255),
  parent_id bigint,
  CONSTRAINT country_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.department

-- DROP TABLE hr.department;

CREATE TABLE hr.department
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  department_id bigint,
  department_name character varying(255),
  description character varying(255),
  location_id bigint,
  manager_id bigint,
  parent_id bigint,
  CONSTRAINT department_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.dept2emp

-- DROP TABLE hr.dept2emp;

CREATE TABLE hr.dept2emp
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  bool_val boolean,
  department_ref bigint,
  entity_ref bigint,
  image character varying(255),
  parent_id bigint,
  CONSTRAINT dept2emp_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);



-- Table: hr.employee

-- DROP TABLE hr.employee;

CREATE TABLE hr.employee
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  commission_pct real,
  department_id bigint,
  email character varying(255),
  employee_id bigint,
  first_name character varying(255),
  hire_date timestamp without time zone,
  last_name character varying(255),
  manager_id bigint,
  parent_id bigint,
  phone_number character varying(255),
  salary real,
  CONSTRAINT employee_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.file

-- DROP TABLE hr.file;

CREATE TABLE hr.file
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  directory boolean,
  file_name character varying(255),
  parent_id bigint,
  size integer,
  CONSTRAINT file_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.holderobject

-- DROP TABLE hr.holderobject;

CREATE TABLE hr.holderobject
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  CONSTRAINT holderobject_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.state

-- DROP TABLE hr.state;

CREATE TABLE hr.state
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  name character varying(255),
  parent_id bigint,
  CONSTRAINT state_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.street

-- DROP TABLE hr.street;

CREATE TABLE hr.street
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  name character varying(255),
  parent_id bigint,
  CONSTRAINT street_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);



-- Table: hr."user"

-- DROP TABLE hr."user";

CREATE TABLE hr."user"
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  parent_id bigint,
  password character varying(255),
  user_name character varying(255),
  CONSTRAINT user_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);


-- Table: hr.vehicle

-- DROP TABLE hr.vehicle;

CREATE TABLE hr.vehicle
(
  obj_id bigint NOT NULL,
  active_date timestamp without time zone,
  create_date timestamp without time zone,
  exp_date timestamp without time zone,
  obj_status character varying(255),
  obj_type character varying(255),
  update_date timestamp without time zone,
  optlock integer,
  parent_id bigint,
  plate_number character varying(255),
  vehicle_maker character varying(255),
  CONSTRAINT vehicle_pkey PRIMARY KEY (obj_id)
)
WITH (
  OIDS=FALSE
);




