-- auto Generated on 2022-01-18
-- DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	`name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'name',
	age INT (11) NOT NULL DEFAULT -1 COMMENT 'age',
	email VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'email',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'user';
