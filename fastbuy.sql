create database fastbuy;

use fastbuy;

CREATE TABLE `fastbuy` (
`fastbuy_id`  bigint NOT NULL AUTO_INCREMENT COMMENT '商品库存id' ,
`name`  varchar(120) NOT NULL COMMENT '商品名称' ,
`number`  int NOT NULL COMMENT '库存数量' ,
`create_time`  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
`start_time`  timestamp NOT NULL COMMENT '秒杀开启时间' ,
`end_time`  timestamp NOT NULL COMMENT '秒杀结束时间' ,

PRIMARY KEY (`fastbuy_id`),
INDEX `idx_start_time` (`start_time`) ,
INDEX `idx_end_time` (`end_time`) ,
INDEX `idx_create_time` (`create_time`) 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8
COMMENT='秒杀库存表'
AUTO_INCREMENT=1000
;

insert into 
	fastbuy(name,number,start_time,end_time)
values 
	('1000元秒杀小米5',100,'2016-5-7','2015-6-1'),
	('800元秒杀小米5',80,'2016-5-7','2015-6-1'),
	('600元秒杀小米5',60,'2016-5-7','2015-6-1'),
	('400元秒杀小米5',40,'2016-5-7','2015-6-1'),
	('200元秒杀小米5',20,'2016-5-7','2015-6-1');

CREATE TABLE `success_buy` (
`fastbug_id`  bigint NOT NULL COMMENT '秒杀商品id' ,
`user_phone`  bigint NOT NULL COMMENT '用户手机号' ,
`state`  tinyint NOT NULL COMMENT '状态表示：-1：无效 0：成功 1：已付款' ,
`create_time`  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
PRIMARY KEY (`fastbug_id`),
INDEX `idx_create_time` (`create_time`) 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8
COMMENT='秒杀成功明细表'
;


