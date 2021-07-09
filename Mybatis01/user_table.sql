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

SELECT * FROM t_user;