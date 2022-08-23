--******************************************************************************
--**所属主题:
--**表名称:init.sql
--**功能描述:
--**创建日期:2022/8/23
--**修改日志:
--**修改日期:
--**修改人:
--**备注:
--******************************************************************************

CREATE TABLE IF NOT EXISTS bank.kehu(
`id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
`card_no` bigint(20)  COMMENT'卡号',
`name` varchar(100) NOT NULL COMMENT '名字',
`jine` decimal(22,9) NOT NULL COMMENT '金额',
`lilv`  decimal(22,9) NOT NULL COMMENT '利率',
`insert_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
`update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`) USING BTREE
)