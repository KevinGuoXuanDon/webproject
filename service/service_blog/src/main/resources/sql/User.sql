-- auto Generated on 2022-09-10
-- DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '主键id',
	username VARCHAR (255) NOT NULL DEFAULT '' COMMENT '用户名',
	`password` VARCHAR (255) NOT NULL DEFAULT '' COMMENT '密码',
	nickname VARCHAR (255) NOT NULL DEFAULT '' COMMENT '可修改昵称',
	profile VARCHAR (255) NOT NULL DEFAULT '' COMMENT '头像信息',
	email VARCHAR (255) NOT NULL DEFAULT '' COMMENT '邮箱地址',
	create_date DATETIME NOT NULL DEFAULT now() COMMENT '创建时间',
	update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
	authority VARCHAR (50) NOT NULL DEFAULT '' COMMENT '权限角色',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'user';
