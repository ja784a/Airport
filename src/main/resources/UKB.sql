create table airline (
id bigint not null auto_increment primary key, 
airline_name varchar(50), 
logo varchar(50), 
s_airline_jp varchar(50), 
s_airline_eg varchar(50) )

create table timetable (
id bigint not null auto_increment primary key, 
airline_id bigint, 
dept_time time, 
new_dept_time time, 
flight varchar(10), 
dest_id bigint, 
gate bigint, 
remark_id bigint )

create table remark (
id bigint not null auto_increment primary key, 
remark_jp varchar(50), 
remark_eg varchar(50) )

create table dest (
id bigint not null auto_increment primary key, 
dest_jp varchar(50), 
dest_eg varchar(50), 
s_dest_jp varchar(50), 
s_desteg varchar(50) )

create table area (
id bigint not null auto_increment primary key, 
area_name varchar(50), 
dom_or_int varchar(50) ) 