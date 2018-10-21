
--creating tables
--I am assuming that gender can hold only Male or Female values and can not be null.
create table employee (
emp_number int primary key,
job_title varchar(35) NOT NULL,
first_name varchar(35) NOT NULL,
last_name varchar(35) NOT NULL,
gender varchar(10) NOT NULL,
birthday varchar(25),
hiredate varchar(35),
dep_number int NOT NULL,

CONSTRAINT fk_dep_number foreign key (dep_number) references department(dep_number)
CONSTRAINT ck_gender check (gender = 'Male' OR gender = 'Female')
);

create table department (
dep_number serial primary key,
name varchar(35) NOT NULL
);

create table project (
project_number int primary key,
name varchar (35) NOT NULL,
start_date varchar(35)
);

create table emp_project (
id serial primary key,
emp_number int,
project_number int,
CONSTRAINT fk_emp_number foreign key (emp_number) references employee(emp_number),
CONSTRAINT fk_project_number foreign key (project_number) references project (project_number) 
);
--populating the department table

insert into department values (1, 'Management')
insert into department values (2, 'Finance')
insert into department values (3, 'IT')

--populating employee table

insert into employee values ('101', 'Manager', 'Jhon', 'Smith', 'Male', '28/12/1970', '22/03/2000', 1)
insert into employee values ('102', 'Assistant_Manager', 'Sam', 'Cook', 'Male', '21/08/1967', '11/04/1996', 1)
insert into employee values ('103', 'Senior_Developer', 'Adita', 'Kapoor', 'Male', '03/01/1973', '15/09/2005', 3)
insert into employee values ('104', 'Buisness_Analyst', 'Pretty', 'Kumar', 'Female', '08/06/1990', '22/03/2014', 3)
insert into employee values ('105', 'Accountant', 'Sara', 'Anderson', 'Female', '26/11/1989', '11/05/2016', 2)
insert into employee values ('106', 'Auditor', 'Anthony', 'Mayer', 'Male', '03/10/1968', '07/10/1996', 2)
insert into employee values ('107', 'Marketer', 'Susan', 'White', 'Female', '04/08/1992', '22/03/2016', 2)
insert into employee values ('108', 'Java_developer', 'Ahmed', 'Ahmed', 'Male', '07/08/1987', '21/12/2017', 3)

--populating project table

insert into project values ('11', 'Vending_Machie', '12/10/2018')
insert into project values ('12', 'Sales_Tax', '03/09/2017')
insert into project values ('13', 'Project_3', '28/06/2016')
insert into project values ('14', 'Project_4', '07/04/2015')

--populating the emp_project table with the emp-number and project-number key matches

insert into emp_project values ( 1,'101', '11')
insert into emp_project values ( 2,'102', '11')
insert into emp_project values ( 3, '103', '12')
insert into emp_project values ( 4, '104', '12')
insert into emp_project values ( 5, '105', '13')
insert into emp_project values ( 6, '106', '13')
insert into emp_project values ( 7, '107', '14')
insert into emp_project values ( 8, '108', '14')


