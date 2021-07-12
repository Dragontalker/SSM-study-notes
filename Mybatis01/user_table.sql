DROP DATABASE IF EXISTS ssm;

CREATE DATABASE ssm;

USE ssm;

DROP TABLE IF EXISTS user;

CREATE TABLE user(
	`uid` INT PRIMARY KEY AUTO_INCREMENT,
    `user_name` VARCHAR(255),
    `password` VARCHAR(255),
    `age` INT,
    `sex` VARCHAR(255)
);

INSERT user(`user_name`, `password`, `age`, `sex`) 
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
	("ZhangSan", 23, "1", 1),
    ("LiSi", 12, "1", 2),
    ("WangWu", 33, "1", 2),
    ("ZhaoLiu", 22, "1", 3),
    ("TianQi", 11, "0", 3),
    ("CuiBa", 55, "0", 4),
    ("XiaoMing", 44, "0", 1),
    ("XiaoHong", 33, "0", 2);

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