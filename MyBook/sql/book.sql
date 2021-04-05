DROP DATABASE IF EXISTS book;

CREATE DATABASE book;#创建数据库

USE book;#使用数据库

CREATE TABLE t_user(
    `id` INT PRIMARY KEY AUTO_INCREMENT,
    `username` VARCHAR(20) NOT NULL UNIQUE,
    `password` VARCHAR(32) NOT NULL,
    `email` VARCHAR(200)
);

INSERT INTO t_user(`username`,`password`,`email`)
VALUES('shystart','123456','shystart@126.com');

SELECT * FROM t_user;