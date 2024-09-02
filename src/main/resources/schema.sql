-- [1] DB 생성  , DB 생성은 mysql workbench
-- drop database if exists springpy;
-- create database springpy;
-- use springpy;

-- [2] 테이블 생성
drop table if exists user;
create table user (
    id int auto_increment ,
    name varchar(20) ,
    age int ,
    primary key (id)
   );

drop table if exists account;
create table account (
    accountid int auto_increment ,
    accountinfo varchar(100) ,
    accountprice int ,
    accountdate date default (current_date),
    primary key (accountid)
   );


