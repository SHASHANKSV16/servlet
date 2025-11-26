Create database MatrimonyDB;
Create table Matrimony(
email varchar(20) ,
forWhom varchar(20),
Gender varchar(1),
 DOB date ,
 Religion varchar(20),
 MotherTongue varchar(20),
 MartialStatus  varchar(20),
 Height int
 );
 
 desc matrimony;
 
 insert into matrimony values("chethan@gmail.com","self",'M','2003-01-01',"Hindu","Kannada","Never Married",5);
 
 select * from matrimony