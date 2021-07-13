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
	("a1", 23, "male", 1),
    ("a2", 12, "male", 2),
    ("a3", 33, "male", 2),
    ("a4", 22, "male", 3),
    ("a5", 11, "female", 3),
    ("a6", 55, "female", 4),
    ("a7", 44, "female", 1),
    ("a8", 33, "female", 2),
    ("a9", 23, "male", 1),
    ("a10", 12, "male", 2),
    ("a11", 33, "male", 2),
    ("a12", 22, "male", 3),
    ("a13", 11, "female", 3),
    ("a14", 55, "female", 4),
    ("a15", 44, "female", 1),
    ("a16", 33, "female", 2);

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