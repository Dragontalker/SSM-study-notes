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
    `sex` VARCHAR(255)
);

INSERT INTO emp(`ename`, `age`, `sex`) 
VALUES
	("ZhangSan", 23, "male"),
    ("LiSi", 12, "male"),
    ("WangWu", 33, "male"),
    ("ZhaoLiu", 22, "male"),
    ("TianQi", 11, "male"),
    ("CuiBa", 55, "male"),
    ("XiaoMing", 44, "male"),
    ("XiaoHong", 33, "male");

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