-- 基本设置
use gxd_blog;
set foreign_key_checks=0;
set NAMES utf8mb4;

-- auto Generated on 2022-09-10
-- DROP TABLE IF EXISTS blog;
CREATE TABLE blog(
                     id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
                     title VARCHAR (50) NOT NULL DEFAULT '' COMMENT '标题',
                     pic VARCHAR (255) NOT NULL DEFAULT '' COMMENT '图片',
                     description LONGTEXT NOT NULL COMMENT '描述',
                     content LONGTEXT NOT NULL COMMENT '正文',
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

-- auto Generated on 2022-09-10
-- DROP TABLE IF EXISTS category;
CREATE TABLE category(
                         id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '主键',
                         `name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT '类别',
                         create_time DATETIME NOT NULL DEFAULT now() COMMENT '创建时间',
                         PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'category';

-- auto Generated on 2022-09-10
-- DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`(
                          id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
                          content VARCHAR (50) NOT NULL DEFAULT '' COMMENT '评论内容',
                          `status` INT (11) NOT NULL DEFAULT -1 COMMENT '评论状态',
                          is_top TINYINT (3) NOT NULL DEFAULT 0 COMMENT '置顶',
                          nickname VARCHAR (50) NOT NULL DEFAULT '' COMMENT '评论用户昵称',
                          blog_id BIGINT (15) NOT NULL DEFAULT -1 COMMENT '评论的博客id',
                          avatar VARCHAR (50) NOT NULL DEFAULT '' COMMENT '评论者的头像',
                          commenter_id BIGINT (15) NOT NULL DEFAULT -1 COMMENT '评论者id',
                          href VARCHAR (50) NOT NULL DEFAULT '' COMMENT '评论者的链接',
                          ip VARCHAR (50) NOT NULL DEFAULT '' COMMENT '评论者的ip',
                          `like` INT (11) NOT NULL DEFAULT -1 COMMENT '评论的点赞数',
                          parent_id BIGINT (15) NOT NULL DEFAULT -1 COMMENT '父评论id.',
                          outside VARCHAR (50) NOT NULL DEFAULT '' COMMENT '外部链接方式,比如qq、微信等授权',
                          create_time DATETIME NOT NULL DEFAULT now() COMMENT '创建时间',
                          PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'comment';

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
                          content LONGTEXT NOT NULL COMMENT '错误内容',
                          ip VARCHAR (255) NOT NULL DEFAULT '' COMMENT '操作者ip',
                          ip_address VARCHAR (255) NOT NULL DEFAULT '' COMMENT '操作者地址',
                          os VARCHAR (255) NOT NULL DEFAULT '' COMMENT '操作者系统',
                          PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'error_log';

-- auto Generated on 2022-09-10
-- DROP TABLE IF EXISTS me;
CREATE TABLE me(
                   id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '主键',
                   surname VARCHAR (50) NOT NULL DEFAULT '' COMMENT '姓',
                   given_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT '名',
                   name_ek VARCHAR (50) NOT NULL DEFAULT '' COMMENT '英文名',
                   info LONGTEXT NOT NULL COMMENT '附加信息',
                   PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'me';

-- auto Generated on 2022-09-10
-- DROP TABLE IF EXISTS operation_log;
CREATE TABLE operation_log(
                              id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
                              username VARCHAR (255) NOT NULL DEFAULT '' COMMENT '操作者名',
                              user_agent VARCHAR (2000) NOT NULL DEFAULT '' COMMENT '用户代理',
                              content VARCHAR (255) NOT NULL DEFAULT '' COMMENT '操作内容',
                              url VARCHAR (255) NOT NULL DEFAULT '' COMMENT '接口',
                              `method` VARCHAR (50) NOT NULL DEFAULT '' COMMENT '调用方式',
                              param VARCHAR (255) NOT NULL DEFAULT '' COMMENT '调用参数',
                              create_time DATETIME NOT NULL DEFAULT now() COMMENT '创建日期',
                              ip VARCHAR (255) NOT NULL DEFAULT '' COMMENT '操作者ip',
                              ip_address VARCHAR (255) NOT NULL DEFAULT '' COMMENT '操作者地址',
                              os VARCHAR (255) NOT NULL DEFAULT '' COMMENT '操作者系统',
                              PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'operation_log';

-- auto Generated on 2022-09-10
-- DROP TABLE IF EXISTS tag;
CREATE TABLE tag(
                    id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
                    `name` VARCHAR (255) NOT NULL DEFAULT '' COMMENT '标签名',
                    mark VARCHAR (255) NOT NULL DEFAULT '' COMMENT '标签的标记',
                    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'tag';

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

-- auto Generated on 2022-09-10
-- DROP TABLE IF EXISTS visitor;
CREATE TABLE visitor(
                        id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '主键',
                        uuid VARCHAR (255) NOT NULL DEFAULT '' COMMENT '用户标识',
                        ip VARCHAR (255) NOT NULL DEFAULT '' COMMENT 'ip',
                        ip_address VARCHAR (255) NOT NULL DEFAULT '' COMMENT 'ip地址',
                        os VARCHAR (255) NOT NULL DEFAULT '' COMMENT 'Operation System',
                        last_visit DATETIME NOT NULL DEFAULT now() COMMENT '最后访问时间',
                        create_t_ime DATETIME NOT NULL DEFAULT now() COMMENT '创建时间',
                        browser VARCHAR (255) NOT NULL DEFAULT '' COMMENT '浏览器',
                        visit_count BIGINT (15) NOT NULL DEFAULT -1 COMMENT '浏览次数',
                        user_agent VARCHAR (2000) NOT NULL DEFAULT '' COMMENT '用户代理',
                        PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'visitor';
