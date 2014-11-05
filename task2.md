mysql> Create Database CognianceTask;
Query OK, 1 row affected (0.00 sec)

mysql> use CognianceTask;
Database changed
mysql> 

mysql> Create table Employee (id int not null auto_increment primary key,Name varchar(20) not null, Age int not null, Email varchar(20));
Query OK, 0 rows affected (0.06 sec)

mysql> create table Customers (CustomerID int not null auto_increment primary key,Name varchar(20) not null, Phone BIGINT, Email varchar(20));
Query OK, 0 rows affected (0.08 sec)

mysql> Create table Department (Name varchar(20) not null, Location varchar(20) not null, Employees int not null);
Query OK, 0 rows affected (0.09 sec)


mysql> insert into Customers (name,phone,email) Values("Jeffrey",0931234568,"jeffrey@gmail.com");
Query OK, 1 row affected (0.04 sec)

mysql> insert into Department (name,location,employees) Values ('QA','Office2',20);
Query OK, 1 row affected (0.04 sec)

mysql> insert into Employee (Name,Age,email)Values ('Tomas',27,'tomas@gmail.com');
Query OK, 1 row affected (0.04 sec)

mysql> select name from Customers where CustomerID = 1;

mysql> select distinct Customers.name, Employee.email from Customers,Employee;

mysql> select Count(CustomerID) From Customers;



