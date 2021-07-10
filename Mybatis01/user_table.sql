DROP DATABASE IF EXISTS ssm;

CREATE DATABASE ssm;

USE ssm;

DROP TABLE IF EXISTS t_user;

CREATE TABLE t_user(
	`uid` INT PRIMARY KEY AUTO_INCREMENT,
    `user_name` VARCHAR(255),
    `password` VARCHAR(255),
    `age` INT,
    `sex` VARCHAR(255)
);

INSERT t_user(`user_name`, `password`, `age`, `sex`) 
VALUES("admin", "123456", 23, "male");

DROP TABLE IF EXISTS emp;

CREATE TABLE emp(
	`eid` INT PRIMARY KEY AUTO_INCREMENT,
    `ename` VARCHAR(255),
    `age` INT,
    `sex` VARCHAR(255),
    `did` INT
);

INSERT INTO emp(`ename`, `age`, `sex`, `did`) 
VALUES
	("ZhangSan", 23, "male", 1),
    ("LiSi", 12, "male", 2),
    ("WangWu", 33, "male", 3),
    ("ZhaoLiu", 22, "male", 4),
    ("TianQi", 11, "male", 1),
    ("CuiBa", 55, "male", 2),
    ("XiaoMing", 44, "male", 3),
    ("XiaoHong", 33, "male", 4);

DROP TABLE IF EXISTS dept;

CREATE TABLE dept(
	`did` INT PRIMARY KEY AUTO_INCREMENT,
    `dname` VARCHAR(255)
);

INSERT INTO dept(`dname`)
VALUES 
	("Human Resource"),
    ("Development"),
    ("Research"),
    ("Marketing");