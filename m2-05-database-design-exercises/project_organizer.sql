
--creating tables
--I am assuming that gender can hold only Male or Female values and can not be null.

drop table emp_project
drop table project
drop table employee
drop table department

create sequence emp_seq_number;

create table employee (
emp_id int primary key NOT NULL default nextval('emp_seq_number'),
job_title varchar(35) NOT NULL,
first_name varchar(35) NOT NULL,
last_name varchar(35) NOT NULL,
gender varchar(10) NOT NULL,
birthday date NOT NULL,
hiredate date NOT NULL,
dep_id int,

CONSTRAINT fk_dep_id foreign key (dep_id) references department(dep_id),
CONSTRAINT ck_gender CHECK (gender IN ('Male', 'Female'))
);

create sequence dep_seq_number;

create table department (
dep_id int primary key NOT NULL default nextval('dep_seq_number'),
name varchar(35) NOT NULL
);

create sequence project_seq_number;

create table project (
project_id int primary key NOT NULL default nextval('project_seq_number'),
name varchar (35) NOT NULL,
start_date date NOT NULL
);

create table emp_project (
emp_id int,
project_id int,
CONSTRAINT fk_emp_id foreign key (emp_id) references employee(emp_id),
CONSTRAINT fk_project_id foreign key (project_id) references project (project_id), 
CONSTRAINT pk_project_id_emp_id primary key (project_id, emp_id)
);
--populating the department table

insert into department values ('Management')
insert into department values ('Finance')
insert into department values ('IT')

--populating employee table

insert into employee values ('Manager', 'Jhon', 'Smith', 'Male', '28/12/1970', '22/03/2000', 1)
insert into employee values ('Assistant_Manager', 'Sam', 'Cook', 'Male', '21/08/1967', '11/04/1996', 1)
insert into employee values ('Senior_Developer', 'Adita', 'Kapoor', 'Male', '03/01/1973', '15/09/2005', 3)
insert into employee values ('Buisness_Analyst', 'Pretty', 'Kumar', 'Female', '08/06/1990', '22/03/2014', 3)
insert into employee values ('Accountant', 'Sara', 'Anderson', 'Female', '26/11/1989', '11/05/2016', 2)
insert into employee values ('Auditor', 'Anthony', 'Mayer', 'Male', '03/10/1968', '07/10/1996', 2)
insert into employee values ('Marketer', 'Susan', 'White', 'Female', '04/08/1992', '22/03/2016', 2)
insert into employee values ('Java_developer', 'Ahmed', 'Ahmed', 'Male', '07/08/1987', '21/12/2017', 3)

--populating project table

insert into project values ('Vending_Machie', '12/10/2018')
insert into project values ('Sales_Tax', '03/09/2017')
insert into project values ('Project_3', '28/06/2016')
insert into project values ('Project_4', '07/04/2015')

--populating the emp_project table with the emp-number and project-number key matches

insert into emp_project values ('101', '11')
insert into emp_project values ('102', '11')
insert into emp_project values ('103', '12')
insert into emp_project values ('104', '12')
insert into emp_project values ('105', '13')
insert into emp_project values ('106', '13')
insert into emp_project values ('107', '14')
insert into emp_project values ('108', '14')


