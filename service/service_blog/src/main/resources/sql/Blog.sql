-- auto Generated on 2022-09-10
-- DROP TABLE IF EXISTS blog;
CREATE TABLE blog(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	title VARCHAR (50) NOT NULL DEFAULT '' COMMENT '标题',
	pic VARCHAR (255) NOT NULL DEFAULT '' COMMENT '图片',
	description LONGTEXT NOT NULL  COMMENT '描述',
	content LONGTEXT NOT NULL  COMMENT '正文',
	access_permission TINYINT (3) NOT NULL DEFAULT 0 COMMENT '访问权限',
	comment_enable TINYINT (3) NOT NULL DEFAULT 0 COMMENT 'commentEnable',
	is_top TINYINT (3) NOT NULL DEFAULT 0 COMMENT 'top',
	`like` INT (11) NOT NULL DEFAULT -1 COMMENT '点赞数',
	comment_count INT (11) NOT NULL DEFAULT -1 COMMENT '评论数',
	views INT (11) NOT NULL DEFAULT -1 COMMENT '浏览数',
	recommended TINYINT (3) NOT NULL DEFAULT 0 COMMENT '被推荐否？',
	word_count INT (11) NOT NULL DEFAULT -1 COMMENT '字数统计',
	category_id BIGINT (15) NOT NULL DEFAULT -1 COMMENT '类别',
	author_id BIGINT (15) NOT NULL DEFAULT -1 COMMENT '作者',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'blog';
