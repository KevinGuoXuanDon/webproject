-- auto Generated on 2022-09-10
-- DROP TABLE IF EXISTS error_log;
CREATE TABLE error_log(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '异常id',
	username VARCHAR (255) NOT NULL DEFAULT '' COMMENT '操作者名',
	user_agent VARCHAR (2000) NOT NULL DEFAULT '' COMMENT '用户代理',
	url VARCHAR (255) NOT NULL DEFAULT '' COMMENT '接口',
	`method` VARCHAR (50) NOT NULL DEFAULT '' COMMENT '调用方式',
	param VARCHAR (255) NOT NULL DEFAULT '' COMMENT '调用参数',
	create_time DATETIME NOT NULL DEFAULT now() COMMENT '创建日期',
	content LONGTEXT NOT NULL  COMMENT '错误内容',
	ip VARCHAR (255) NOT NULL DEFAULT '' COMMENT '操作者ip',
	ip_address VARCHAR (255) NOT NULL DEFAULT '' COMMENT '操作者地址',
	os VARCHAR (255) NOT NULL DEFAULT '' COMMENT '操作者系统',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'error_log';
