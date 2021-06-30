/*
 Navicat Premium Data Transfer

 Source Server         : dev1
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : 192.168.1.1:3306
 Source Schema         : veesing_sms_open

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : 65001

 Date: 30/06/2021 09:37:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for global_sms_code_received
-- ----------------------------
DROP TABLE IF EXISTS `global_sms_code_received`;
CREATE TABLE `global_sms_code_received` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `rec_phone` varchar(255) DEFAULT NULL,
  `rec_content` varchar(255) DEFAULT NULL,
  `rec_time` datetime DEFAULT NULL,
  `sent_id` bigint(20) DEFAULT NULL,
  `customer_id` bigint(20) DEFAULT NULL,
  `task_id` varchar(255) DEFAULT NULL,
  `push_time` datetime DEFAULT NULL,
  `push_result` varchar(255) DEFAULT NULL,
  `type` int(1) DEFAULT NULL,
  `international_code` varchar(255) DEFAULT NULL,
  `chinese_name` varchar(255) DEFAULT NULL,
  `create_user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of global_sms_code_received
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for global_sms_code_sent
-- ----------------------------
DROP TABLE IF EXISTS `global_sms_code_sent`;
CREATE TABLE `global_sms_code_sent` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `amount` bigint(20) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `international_code` varchar(50) DEFAULT NULL,
  `send_status` int(1) DEFAULT NULL,
  `send_time` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `customer_id` bigint(20) DEFAULT NULL,
  `pro_id` bigint(20) DEFAULT NULL,
  `task_id` varchar(255) DEFAULT NULL,
  `channel_id` bigint(20) DEFAULT NULL,
  `pass_id` bigint(20) DEFAULT NULL,
  `receipt_time` varchar(50) DEFAULT NULL,
  `receipt_code` varchar(50) DEFAULT NULL,
  `receipt_status` int(1) DEFAULT NULL,
  `push_result` varchar(255) DEFAULT NULL,
  `create_user_id` bigint(20) DEFAULT NULL,
  `push_time` datetime DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `cost_price` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of global_sms_code_sent
-- ----------------------------
BEGIN;
INSERT INTO `global_sms_code_sent` VALUES (27, 1, '【中昱维信】您的验证码是3334', '+861507**85196', '0086', 1, '2019-11-21 19:46:33', NULL, 336, 5878, '1134312326057431040', 136, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0.229', NULL);
COMMIT;

-- ----------------------------
-- Table structure for global_sms_code_template
-- ----------------------------
DROP TABLE IF EXISTS `global_sms_code_template`;
CREATE TABLE `global_sms_code_template` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_id` bigint(20) NOT NULL,
  `pd_type` varchar(255) DEFAULT NULL,
  `tpl_type` int(2) DEFAULT NULL,
  `tpl_name` varchar(50) DEFAULT NULL,
  `tpl_content` text,
  `tpl_status` int(1) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `create_user_id` bigint(20) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `opinion` varchar(255) DEFAULT NULL,
  `sms_id` varchar(255) DEFAULT NULL,
  `identify_time` datetime DEFAULT NULL,
  `identify_user_id` bigint(20) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of global_sms_code_template
-- ----------------------------
BEGIN;
INSERT INTO `global_sms_code_template` VALUES (9, 336, '6', 11, NULL, '【中昱维信】您的验证码是【变量】', 1, '2019-11-19 13:16:58', NULL, 2736, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for mms_batch
-- ----------------------------
DROP TABLE IF EXISTS `mms_batch`;
CREATE TABLE `mms_batch` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `phone` mediumtext,
  `numbers` bigint(20) DEFAULT NULL,
  `ware_id` bigint(20) DEFAULT NULL,
  `customer_id` bigint(20) DEFAULT NULL,
  `channel_id` bigint(20) DEFAULT NULL,
  `thread_id` int(11) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `send_state` int(11) DEFAULT NULL,
  `sendtime` datetime DEFAULT NULL,
  `createtime` datetime DEFAULT CURRENT_TIMESTAMP,
  `modifytime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `opnition` varchar(200) DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL,
  `frame_json` text,
  `title` varchar(255) DEFAULT NULL,
  `mms_size` int(11) DEFAULT NULL,
  `mms_code` longtext,
  `extend` text,
  `pro_id` bigint(20) DEFAULT NULL,
  `identify_user_id` bigint(20) DEFAULT NULL,
  `identify_time` datetime DEFAULT NULL,
  `submit_time` datetime DEFAULT NULL,
  `shield_json` text,
  `create_user_id` bigint(20) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `pd_type` int(20) DEFAULT NULL,
  `is_api` int(1) DEFAULT NULL,
  `job_time` datetime DEFAULT NULL,
  `black_filter` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20466 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of mms_batch
-- ----------------------------
BEGIN;
INSERT INTO `mms_batch` VALUES (20436, '', 1, NULL, 336, 111, NULL, 1, 2, NULL, '2021-06-03 20:10:44', '2021-06-28 17:59:11', NULL, NULL, '[{\"videopath\":\"/files/65233105-1adf-4c0b-8ffb-522efcf1ddb8.mp4\",\"mediaPath\":\"/files/65233105-1adf-4c0b-8ffb-522efcf1ddb8.mp4\",\"txt\":\"寻找最美三菱发动机车主行动开启啦，如果您的爱车使用的是三菱发动机，请速到就近广汽三菱授权经销商抽取大疆云台相机大奖了，置换新欧蓝德还可以享受10000元补贴，首付1.6万即可开回家，更多金融专案可详询店内销售顾问。\",\"time\":2,\"kb\":{\"media\":\"1862.42\",\"font\":0}}]', '一汽丰田', 1863, NULL, NULL, 23254, NULL, NULL, NULL, NULL, NULL, '127.0.0.1', 7, 1, '2021-11-07 14:37:31', 0);
INSERT INTO `mms_batch` VALUES (20465, '', 89998, 17470, 336, -1, NULL, 1, 1, '2021-06-10 16:01:36', '2021-06-10 15:59:46', '2021-06-28 17:59:11', NULL, NULL, '[{\"txt\":\"1111\",\"photopath\":\"/files/e371123a-27de-42fc-a86e-292dbe7f561a.jpg\",\"videopath\":\"\",\"voicepath\":\"\",\"mediaPath\":\"/files/e371123a-27de-42fc-a86e-292dbe7f561a.jpg\",\"kb\":{\"media\":\"26.95\",\"font\":1},\"time\":2}]', '2121', 28, NULL, NULL, 15116, 1, '2021-06-10 16:01:36', NULL, NULL, NULL, '127.0.0.1', 4, 0, NULL, 0);
COMMIT;

-- ----------------------------
-- Table structure for mms_sent
-- ----------------------------
DROP TABLE IF EXISTS `mms_sent`;
CREATE TABLE `mms_sent` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `phone` varchar(20) DEFAULT NULL,
  `send_status` int(1) DEFAULT NULL,
  `send_time` datetime DEFAULT NULL,
  `batch_id` bigint(20) DEFAULT NULL,
  `customer_id` bigint(20) DEFAULT NULL,
  `task_id` varchar(200) DEFAULT NULL,
  `product_id` bigint(20) DEFAULT NULL,
  `province_city` varchar(20) DEFAULT NULL,
  `num_section` int(1) DEFAULT NULL,
  `package_id` bigint(20) DEFAULT NULL,
  `channel_id` bigint(20) DEFAULT NULL,
  `pass_id` bigint(20) DEFAULT NULL,
  `port` varchar(20) DEFAULT NULL,
  `receipt_status` int(1) DEFAULT '2',
  `receipt_code` varchar(50) DEFAULT NULL,
  `receipt_time` varchar(255) DEFAULT NULL,
  `push_time` datetime DEFAULT NULL,
  `push_result` varchar(255) DEFAULT NULL,
  `create_user_id` bigint(20) DEFAULT NULL,
  `pd_type` int(20) DEFAULT NULL,
  `is_api` int(1) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27355204 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of mms_sent
-- ----------------------------
BEGIN;
INSERT INTO `mms_sent` VALUES (27355196, '183********', 1, '2021-06-10 16:01:36', 20465, 336, '3LEZIMHGMMA9', 15116, '江西-赣州', 1, -1, -1, -1, NULL, 1, '1000', '2021-06-10 16:05:04', NULL, NULL, 336, 4, 0, '2121');
INSERT INTO `mms_sent` VALUES (27355197, '183********', 1, '2021-06-10 16:01:36', 20465, 336, '3LEZIMHGMMA9', 15116, '浙江-湖州', 1, -1, -1, -1, NULL, 1, '1000', '2021-06-10 16:05:04', NULL, NULL, 336, 4, 0, '2121');
INSERT INTO `mms_sent` VALUES (27355198, '183********', 1, '2021-06-10 16:01:36', 20465, 336, '3LEZIMHGMMA9', 15116, '山东-济宁', 1, -1, -1, -1, NULL, 1, '1000', '2021-06-10 16:05:04', NULL, NULL, 336, 4, 0, '2121');
INSERT INTO `mms_sent` VALUES (27355199, '183********', 1, '2021-06-10 16:01:36', 20465, 336, '3LEZIMHGMMA9', 15116, '江苏-镇江', 1, -1, -1, -1, NULL, 1, '1000', '2021-06-10 16:05:04', NULL, NULL, 336, 4, 0, '2121');
INSERT INTO `mms_sent` VALUES (27355200, '183********', 1, '2021-06-10 16:01:36', 20465, 336, '3LEZIMHGMMA9', 15116, '山东-青岛', 1, -1, -1, -1, NULL, 1, '1000', '2021-06-10 16:05:04', NULL, NULL, 336, 4, 0, '2121');
INSERT INTO `mms_sent` VALUES (27355201, '183********', 1, '2021-06-10 16:01:36', 20465, 336, '3LEZIMHGMMA9', 15116, '上海-上海', 1, -1, -1, -1, NULL, 1, '1000', '2021-06-10 16:05:04', NULL, NULL, 336, 4, 0, '2121');
INSERT INTO `mms_sent` VALUES (27355202, '183********', 1, '2021-06-10 16:01:36', 20465, 336, '3LEZIMHGMMA9', 15116, '山西-太原', 1, -1, -1, -1, NULL, 1, '1000', '2021-06-10 16:05:04', NULL, NULL, 336, 4, 0, '2121');
INSERT INTO `mms_sent` VALUES (27355203, '183********', 1, '2021-06-10 16:01:36', 20465, 336, '3LEZIMHGMMA9', 15116, '北京-北京', 1, -1, -1, -1, NULL, 1, '1000', '2021-06-10 16:05:04', NULL, NULL, 336, 4, 0, '2121');
COMMIT;

-- ----------------------------
-- Table structure for mms_ware
-- ----------------------------
DROP TABLE IF EXISTS `mms_ware`;
CREATE TABLE `mms_ware` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) DEFAULT NULL,
  `createtime` datetime DEFAULT CURRENT_TIMESTAMP,
  `modifytime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `state` int(11) DEFAULT '2',
  `customerid` bigint(20) DEFAULT NULL,
  `mms_type` int(11) DEFAULT NULL,
  `is_api` int(1) DEFAULT NULL,
  `screenshot` varchar(255) DEFAULT NULL,
  `frame_json` text,
  `size` int(11) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `pd_type` int(20) DEFAULT NULL,
  `opinion` varchar(50) DEFAULT NULL,
  `channel_id` bigint(20) DEFAULT NULL,
  `no_audit` int(1) DEFAULT '0',
  `call_url` varchar(255) DEFAULT NULL,
  `template_uq` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17473 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of mms_ware
-- ----------------------------
BEGIN;
INSERT INTO `mms_ware` VALUES (1014, '中昱星空', '2019-03-28 16:36:14', NULL, 1, 336, 1, 1, '/files/62d43379-ed3d-4b02-afee-4d1478d360b2.jpeg', '[{\"txt\":\"中昱带您看完美的星空\",\"photopath\":\"/files/3410b1cf-a1b5-4382-b291-f8cb477a70fa.jpg\",\"videopath\":\"\",\"voicepath\":\"\",\"mediaPath\":\"/files/3410b1cf-a1b5-4382-b291-f8cb477a70fa.jpg\",\"kb\":{\"media\":\"66.33\",\"font\":0},\"time\":2}]', 67, NULL, 4, NULL, NULL, 0, NULL, 'xksksks');
INSERT INTO `mms_ware` VALUES (1015, '中国移动', '2019-03-28 16:47:19', '2021-06-29 16:50:50', 1, 336, 1, 1, '/files/d7666f41-9aec-48d4-b94d-72135c474fa0.jpeg', '[{\"videopath\":\"/files/65233105-1adf-4c0b-8ffb-522efcf1ddb8.mp4\",\"mediaPath\":\"/files/65233105-1adf-4c0b-8ffb-522efcf1ddb8.mp4\",\"txt\":\"寻找最美三菱发动机车主行动开启啦，如果您的爱车使用的是三菱发动机，请速到就近广汽三菱授权经销商抽取大疆云台相机大奖了，置换新欧蓝德还可以享受10000元补贴，首付1.6万即可开回家，更多金融专案可详询店内销售顾问。\",\"time\":2,\"kb\":{\"media\":\"1862.42\",\"font\":0}}]', 1863, NULL, 7, NULL, NULL, 0, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for sms_batch
-- ----------------------------
DROP TABLE IF EXISTS `sms_batch`;
CREATE TABLE `sms_batch` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_id` bigint(20) DEFAULT NULL,
  `cer_status` int(1) DEFAULT NULL,
  `opinion` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `phones` mediumtext,
  `content` mediumtext,
  `job_time` datetime DEFAULT NULL,
  `is_loop` int(1) DEFAULT NULL,
  `sub_time` datetime DEFAULT NULL,
  `send_time` datetime DEFAULT NULL,
  `phone_num` int(11) DEFAULT NULL,
  `cost_num` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `create_user_id` bigint(20) DEFAULT NULL,
  `task_id` varchar(255) DEFAULT NULL,
  `type` int(1) DEFAULT NULL,
  `pro_id` bigint(20) DEFAULT NULL,
  `send_status` int(1) DEFAULT NULL,
  `channel_id` bigint(20) DEFAULT NULL,
  `thread_id` bigint(20) DEFAULT NULL,
  `identify_user_id` bigint(20) DEFAULT NULL,
  `identify_time` datetime DEFAULT NULL,
  `shield_json` text,
  `ip` varchar(255) DEFAULT NULL,
  `content_length` int(11) DEFAULT NULL,
  `content_size` int(2) DEFAULT NULL,
  `is_api` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1409954 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sms_batch
-- ----------------------------
BEGIN;
INSERT INTO `sms_batch` VALUES (1409952, 336, 1, '', '', '', '【中国移动】感谢关注中国移动！戳 dwz.cn/KMzFf7x了解更多精彩内容！', NULL, NULL, NULL, '2021-06-21 10:58:22', 4, 4, '2021-06-20 10:41:51', 336, NULL, 3, 15115, 5, 188, NULL, 1, '2021-06-21 10:58:22', NULL, '127.0.0.1', 48, 1, 1);
INSERT INTO `sms_batch` VALUES (1409953, 336, 1, '', '', '', '【中国移动】感谢关注中国移动！戳 dwz.cn/KMzFf7x了解更多精彩内容！', NULL, NULL, NULL, '2021-06-21 10:55:14', 4, 4, '2021-06-20 10:41:52', 336, NULL, 3, 15115, 5, 188, NULL, 1, '2021-06-21 10:55:13', NULL, '127.0.0.1', 48, 1, 1);
COMMIT;

-- ----------------------------
-- Table structure for sms_custom_template
-- ----------------------------
DROP TABLE IF EXISTS `sms_custom_template`;
CREATE TABLE `sms_custom_template` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_id` bigint(20) NOT NULL,
  `tpl_type` int(2) DEFAULT NULL,
  `tpl_name` varchar(50) DEFAULT NULL,
  `tpl_content` text,
  `tpl_status` int(1) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `modify_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_user_id` bigint(20) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `opinion` varchar(255) DEFAULT NULL,
  `sms_id` varchar(255) DEFAULT NULL,
  `identify_user_id` bigint(20) DEFAULT NULL,
  `identify_time` datetime DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `channel_id` bigint(20) DEFAULT NULL,
  `no_audit` int(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=795 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sms_custom_template
-- ----------------------------
BEGIN;
INSERT INTO `sms_custom_template` VALUES (49, 336, 11, '订单通知', '【中昱维信】您好，您的订单是${变量1}，请注意查收', 1, '2018-10-15 11:20:27', NULL, 367, NULL, NULL, '111121', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `sms_custom_template` VALUES (107, 336, 24, '会员通知', '【中国移动】感谢关注中国移动！戳 dwz.cn/KMzFf7x了解更多精彩内容！', 1, '2019-05-20 16:19:06', '2021-06-29 16:51:38', 367, NULL, NULL, '111834', NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for sms_received
-- ----------------------------
DROP TABLE IF EXISTS `sms_received`;
CREATE TABLE `sms_received` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `rec_phone` varchar(255) DEFAULT NULL,
  `rec_content` varchar(255) DEFAULT NULL,
  `rec_time` datetime DEFAULT NULL,
  `sent_id` bigint(20) DEFAULT NULL,
  `customer_id` bigint(20) DEFAULT NULL,
  `task_id` varchar(255) DEFAULT NULL,
  `pre_id` bigint(20) DEFAULT NULL,
  `push_time` datetime DEFAULT NULL,
  `push_result` varchar(255) DEFAULT NULL,
  `type` int(5) DEFAULT NULL,
  `create_user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11407 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sms_received
-- ----------------------------
BEGIN;
INSERT INTO `sms_received` VALUES (11303, '131****0000', '好的', '2020-01-10 10:50:38', 9132381, 336, 'S9F6IAVGB0UF7TZPWIANIWUDCVIPDK1G', 1379936, '2020-01-10 10:50:38', '', 3, NULL);
INSERT INTO `sms_received` VALUES (11406, '131****0000', '1111111111111111111111', '2020-12-10 11:44:48', 10706759, 336, '362C1778A44A39FF9233F11043F4049F', 1409791, '2020-12-11 17:31:58', 'ok', 3, NULL);
COMMIT;

-- ----------------------------
-- Table structure for sms_sent
-- ----------------------------
DROP TABLE IF EXISTS `sms_sent`;
CREATE TABLE `sms_sent` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type` int(1) DEFAULT NULL,
  `amount` bigint(20) DEFAULT NULL,
  `content` text,
  `phone` varchar(100) DEFAULT NULL,
  `send_status` int(1) DEFAULT NULL,
  `send_time` datetime DEFAULT NULL,
  `create_user_id` bigint(20) DEFAULT NULL,
  `customer_id` bigint(20) DEFAULT NULL,
  `pro_id` bigint(20) DEFAULT NULL,
  `task_id` varchar(255) DEFAULT NULL,
  `pre_id` bigint(20) DEFAULT NULL,
  `package_id` bigint(20) DEFAULT NULL,
  `channel_id` bigint(20) DEFAULT NULL,
  `pass_id` bigint(20) DEFAULT NULL,
  `num_section` int(1) DEFAULT NULL,
  `province_city` varchar(50) DEFAULT NULL,
  `port` varchar(20) DEFAULT NULL,
  `receipt_time` varchar(50) DEFAULT NULL,
  `receipt_code` varchar(50) DEFAULT NULL,
  `receipt_status` int(10) DEFAULT NULL,
  `push_time` datetime DEFAULT NULL,
  `push_result` varchar(255) DEFAULT NULL,
  `content_length` int(11) DEFAULT NULL,
  `content_size` int(11) DEFAULT NULL,
  `is_api` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54118551 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sms_sent
-- ----------------------------
BEGIN;
INSERT INTO `sms_sent` VALUES (54118536, 3, 1, '【中国移动】感谢关注中国移动！戳 dwz.cn/KMzFf7x了解更多精彩内容！', '131****0000', 0, '2021-06-21 11:03:46', NULL, 336, 15115, NULL, 1409952, 4347118, 188, 290, 1, '上海-上海', NULL, NULL, NULL, NULL, NULL, NULL, 48, 1, 1);
INSERT INTO `sms_sent` VALUES (54118538, 3, 1, '【中国移动】感谢关注中国移动！戳 dwz.cn/KMzFf7x了解更多精彩内容！', '131****0000', 0, '2021-06-21 11:03:46', NULL, 336, 15115, NULL, 1409952, 4347119, 188, 290, 1, '河南-商丘', NULL, NULL, NULL, NULL, NULL, NULL, 48, 1, 1);
INSERT INTO `sms_sent` VALUES (54118543, 3, 1, '【中国移动】感谢关注中国移动！戳 dwz.cn/KMzFf7x了解更多精彩内容！', '131****0000', 0, '2021-06-21 11:03:47', NULL, 336, 15115, NULL, 1409952, 4347121, 188, 290, 3, '江西-南昌', NULL, NULL, NULL, NULL, NULL, NULL, 48, 1, 1);
INSERT INTO `sms_sent` VALUES (54118544, 3, 1, '【中国移动】感谢关注中国移动！戳 dwz.cn/KMzFf7x了解更多精彩内容！', '131****0000', 0, '2021-06-21 11:03:47', NULL, 336, 15115, NULL, 1409952, 4347120, 188, 290, 2, '黑龙江-绥化市', NULL, NULL, NULL, NULL, NULL, NULL, 48, 1, 1);
COMMIT;

-- ----------------------------
-- Table structure for sms_template
-- ----------------------------
DROP TABLE IF EXISTS `sms_template`;
CREATE TABLE `sms_template` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_id` bigint(20) NOT NULL,
  `tpl_type` int(2) DEFAULT NULL,
  `tpl_name` varchar(50) DEFAULT NULL,
  `tpl_content` text,
  `tpl_status` int(1) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `create_user_id` bigint(20) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `opinion` varchar(255) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=394 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sms_template
-- ----------------------------
BEGIN;
INSERT INTO `sms_template` VALUES (18, 336, 11, '通知', '【通知】您好，下午开会', 2, '2018-12-19 15:32:21', NULL, 367, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for sys_copyright
-- ----------------------------
DROP TABLE IF EXISTS `sys_copyright`;
CREATE TABLE `sys_copyright` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `logo` varchar(255) DEFAULT NULL,
  `copyright` varchar(255) DEFAULT NULL,
  `qq_consultation` varchar(255) DEFAULT NULL,
  `operation_guide` varchar(255) DEFAULT NULL,
  `msg_center` varchar(255) DEFAULT NULL,
  `customer_service_center` varchar(255) DEFAULT NULL,
  `customer_id` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user_id` bigint(20) DEFAULT NULL,
  `interface_doc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_copyright
-- ----------------------------
BEGIN;
INSERT INTO `sys_copyright` VALUES (1, '{\"logo\":\"/files/5d792900-6e80-4a50-88e3-b94e9b770d10.gif\",\"logoMin\":\"/files/7566434d-f2cb-48f4-a5f3-78d61755b276.png\"}', '上海中昱文化传播有限公司沪ICP备11025273号-4增值电信业务经营许可证号：B2-20160604', '{\"visible\":false,\"href\":\"https://shang.qq.com/wpa/qunwpa?idkey=42f08e4ae532ed9854e1e2d6bae986489fef2d40ed7ad6642816e2de252dc23d\",\"img\":\"/img/778371938.png\"}', '{\"visible\":true,\"href\":\"https://www.veesing.com/guide.html\"}', '{\"visible\":true}', '{\"visible\":true,\"phone\":\"400-68-10658\"}', 336, '2018-11-22 14:44:21', 1, '{\"visible\":true,\"href\":\"https://www.veesing.com/apidocs.html\"}');
COMMIT;

-- ----------------------------
-- Table structure for sys_customer
-- ----------------------------
DROP TABLE IF EXISTS `sys_customer`;
CREATE TABLE `sys_customer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_no` varchar(100) DEFAULT NULL,
  `company_name` varchar(100) DEFAULT NULL,
  `contact_name` varchar(50) DEFAULT NULL,
  `telephone` bigint(50) DEFAULT NULL,
  `customer_type` int(10) DEFAULT NULL,
  `parent_id` bigint(100) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `status` int(1) DEFAULT '3',
  `is_used` int(1) DEFAULT NULL,
  `logo` varchar(200) DEFAULT NULL,
  `license` varchar(200) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `modify_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `parent_name` varchar(50) DEFAULT NULL,
  `create_user_id` bigint(20) DEFAULT NULL,
  `init_user` varchar(50) DEFAULT NULL,
  `app_id` varchar(16) DEFAULT NULL,
  `app_key` varchar(16) DEFAULT NULL,
  `reason` varchar(200) DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL,
  `intention` varchar(200) DEFAULT NULL,
  `category` int(11) DEFAULT NULL,
  `cid` bigint(20) DEFAULT NULL,
  `customer_level` int(11) DEFAULT NULL,
  `need_examine` int(11) DEFAULT NULL,
  `lower_examine_num` int(11) DEFAULT NULL,
  `higher_examine_num` int(11) DEFAULT NULL,
  `need_white` int(1) DEFAULT '1',
  `need_collect_white` int(1) DEFAULT '1',
  `low_white_num` int(11) DEFAULT '10',
  `resend_white_num` int(11) DEFAULT '3',
  `need_shield` int(1) DEFAULT '1',
  `identify_time` datetime DEFAULT NULL,
  `ip_check` int(1) DEFAULT NULL,
  `ip_list` varchar(255) DEFAULT NULL,
  `identify_user_id` bigint(20) DEFAULT NULL,
  `cus_remark` varchar(255) DEFAULT NULL,
  `industry_id` bigint(50) DEFAULT NULL,
  `extra_config` json DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5383 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_customer
-- ----------------------------
BEGIN;
INSERT INTO `sys_customer` VALUES (336, 'veesing', 'veesing', 'veesing', 13800000000, 1, 1, '', 1, 1, '/files/e9f3c49e-d823-4860-8512-c95a2628835f.jpg', '/files/073b9034-3335-4bbb-a43f-933684117442.jpg', '2018-09-25 10:25:17', '2021-06-28 15:25:28', '中昱维信', 1, '15801806597', '58PO2PLE3HPO', '5063HNYFIK', NULL, '', '', 1, 105, 2, 1, 0, 0, 1, 1, 50, 3, 1, NULL, 0, '121.199.40.105,127.0.0.1', NULL, '2', NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for sys_file
-- ----------------------------
DROP TABLE IF EXISTS `sys_file`;
CREATE TABLE `sys_file` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type` int(11) DEFAULT NULL,
  `url` varchar(200) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8012 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='文件上传';

-- ----------------------------
-- Records of sys_file
-- ----------------------------
BEGIN;
INSERT INTO `sys_file` VALUES (8011, 0, '/files/629b6023-46c1-49b0-b463-182420a549d6.jpg', '2021-06-29 09:40:37');
COMMIT;

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `operation` varchar(50) DEFAULT NULL,
  `time` int(11) DEFAULT NULL,
  `method` varchar(200) DEFAULT NULL,
  `params` varchar(5000) DEFAULT NULL,
  `ip` varchar(64) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3381080 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='系统日志';

-- ----------------------------
-- Records of sys_log
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `menu_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `url` varchar(200) DEFAULT NULL,
  `perms` varchar(500) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `icon` varchar(100) DEFAULT NULL,
  `order_num` int(11) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1523 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
BEGIN;
INSERT INTO `sys_menu` VALUES (160, 0, '首页', '/home', '', 1, 'iconshouye1', 0, '2018-08-03 13:36:19', '2018-08-03 13:36:19');
INSERT INTO `sys_menu` VALUES (179, 0, '通讯录', '/telephoneBook', '', 0, 'icontongxunlu', 1, '2018-08-03 13:36:19', '2018-08-03 13:36:19');
INSERT INTO `sys_menu` VALUES (181, 0, '短信群发', '/client/sms', '', 0, 'iconsms', 2, '2018-08-03 13:36:19', '2018-08-03 13:36:19');
INSERT INTO `sys_menu` VALUES (189, 0, '短信验证码', '/client/smscode', '', 0, 'iconduanxinyanzhengma', 7, '2018-08-03 13:36:19', '2018-08-03 13:36:19');
INSERT INTO `sys_menu` VALUES (195, 0, '彩信群发', '/client/mms', '', 0, 'iconic_mms_px', 3, '2018-08-03 13:36:19', '2018-08-03 13:36:19');
INSERT INTO `sys_menu` VALUES (1117, 179, '操作', '', '', 2, '', NULL, '2018-11-27 09:26:07', NULL);
INSERT INTO `sys_menu` VALUES (1235, 0, '系统管理', '/sys', '', 0, 'iconxitongguanli', 35, '2019-08-21 17:33:10', NULL);
INSERT INTO `sys_menu` VALUES (1295, 181, '短信发送', '', '', 0, '', 1, '2019-09-25 17:52:12', NULL);
INSERT INTO `sys_menu` VALUES (1296, 1295, '模板管理', '/client/sms/template', '', 1, '', 2, '2019-09-25 17:53:19', NULL);
INSERT INTO `sys_menu` VALUES (1297, 1295, '在线发送', '/client/sms/group', '', 1, '', 1, '2019-09-25 17:53:49', NULL);
INSERT INTO `sys_menu` VALUES (1300, 0, '个性化短信', '/client/custom', '', 0, 'icongexinghua', 6, '2019-10-18 16:11:17', NULL);
INSERT INTO `sys_menu` VALUES (1303, 1235, '账 户 资 料', '/sys/account', '', 1, '', 0, '2019-10-23 14:22:10', NULL);
INSERT INTO `sys_menu` VALUES (1304, 1303, '更新', '', '', 2, '', NULL, '2019-10-23 14:22:34', NULL);
INSERT INTO `sys_menu` VALUES (1305, 1235, '修 改 密 码', '/sys/user/reset', '', 1, '', 1, '2019-10-23 14:23:04', NULL);
INSERT INTO `sys_menu` VALUES (1307, 1306, '提交', '', '', 2, '', NULL, '2019-10-23 14:24:19', NULL);
INSERT INTO `sys_menu` VALUES (1310, 1295, '接口文档', 'https://www.10658.com.cn/doc/62', '', 1, '', 3, '2019-10-25 13:51:20', NULL);
INSERT INTO `sys_menu` VALUES (1311, 181, '数据统计', '', '', 1, '', 2, '2019-10-25 13:56:44', NULL);
INSERT INTO `sys_menu` VALUES (1312, 1311, '发送记录', '/client/sms/sent', '', 1, '', 2, '2019-10-25 13:57:07', NULL);
INSERT INTO `sys_menu` VALUES (1313, 1311, '回复记录', '/client/sms/received', '', 1, '', 3, '2019-10-25 13:57:34', NULL);
INSERT INTO `sys_menu` VALUES (1314, 1311, '回执记录', '/client/sms/receipt', '', 1, '', 4, '2019-10-25 14:01:10', NULL);
INSERT INTO `sys_menu` VALUES (1316, 1315, '套餐充值', '/client/sms/recharge?id=3', '', 1, '', 1, '2019-10-25 15:02:26', NULL);
INSERT INTO `sys_menu` VALUES (1318, 181, '产品设置', '', '', 0, '', 4, '2019-10-25 15:03:16', NULL);
INSERT INTO `sys_menu` VALUES (1319, 1318, '通用设置', '/client/sms/common', '', 1, '', 0, '2019-10-25 15:04:04', NULL);
INSERT INTO `sys_menu` VALUES (1320, 1318, '安全设置', '/client/sms/security', '', 1, '', 99, '2019-10-25 15:04:25', NULL);
INSERT INTO `sys_menu` VALUES (1322, 181, '概览', '/client/sms', '', 1, '', 0, '2019-10-25 20:20:53', NULL);
INSERT INTO `sys_menu` VALUES (1323, 195, '概览', '/client/mms', '', 1, '', 0, '2019-10-25 20:37:57', NULL);
INSERT INTO `sys_menu` VALUES (1324, 195, '彩信发送', '', '', 0, '', 1, '2019-10-25 20:38:11', NULL);
INSERT INTO `sys_menu` VALUES (1327, 1324, '在线发送', '/client/mms/group', '', 1, '', 1, '2019-10-25 20:38:58', NULL);
INSERT INTO `sys_menu` VALUES (1328, 195, '数据统计', '', '', 0, '', 2, '2019-10-25 20:39:31', NULL);
INSERT INTO `sys_menu` VALUES (1329, 1328, '发送记录', '/client/mms/sent', '', 1, '', 2, '2019-10-25 20:39:51', NULL);
INSERT INTO `sys_menu` VALUES (1332, 1328, '回执记录', '/client/mms/receipt', '', 1, '', 4, '2019-10-25 20:40:26', NULL);
INSERT INTO `sys_menu` VALUES (1337, 195, '产品设置', '', '', 0, '', 4, '2019-10-25 20:42:15', NULL);
INSERT INTO `sys_menu` VALUES (1338, 1337, '安全设置', '/client/mms/security', '', 1, '', NULL, '2019-10-25 20:42:26', NULL);
INSERT INTO `sys_menu` VALUES (1339, 1337, '通用设置', '/client/mms/common', '', 1, '', NULL, '2019-10-25 20:42:35', NULL);
INSERT INTO `sys_menu` VALUES (1340, 1300, '概览', '/client/custom', '', 1, '', 0, '2019-10-28 17:28:34', NULL);
INSERT INTO `sys_menu` VALUES (1341, 1300, '短信发送', '', '', 0, '', 1, '2019-10-28 17:28:49', NULL);
INSERT INTO `sys_menu` VALUES (1342, 1341, '模板管理', '/client/custom/template', '', 1, '', 3, '2019-10-28 17:29:04', NULL);
INSERT INTO `sys_menu` VALUES (1343, 1341, '在线发送', '/client/custom/group', '', 1, '', 1, '2019-10-28 17:29:15', NULL);
INSERT INTO `sys_menu` VALUES (1344, 1300, '数据统计', '', '', 0, '', 2, '2019-10-28 17:29:34', NULL);
INSERT INTO `sys_menu` VALUES (1345, 1344, '发送记录', '/client/custom/sent', '', 1, '', 2, '2019-10-28 17:29:51', NULL);
INSERT INTO `sys_menu` VALUES (1346, 1344, '回复记录', '/client/custom/received', '', 1, '', 3, '2019-10-28 17:30:04', NULL);
INSERT INTO `sys_menu` VALUES (1347, 1344, '回执记录', '/client/custom/receipt', '', 1, '', 4, '2019-10-28 17:30:31', NULL);
INSERT INTO `sys_menu` VALUES (1351, 1300, '产品设置', '', '', 0, '', 4, '2019-10-28 17:31:27', NULL);
INSERT INTO `sys_menu` VALUES (1352, 1351, '通用设置', '/client/custom/common', '', 1, '', NULL, '2019-10-28 17:31:44', NULL);
INSERT INTO `sys_menu` VALUES (1353, 1351, '安全设置', '/client/custom/security', '', 1, '', NULL, '2019-10-28 17:31:59', NULL);
INSERT INTO `sys_menu` VALUES (1354, 189, '概览', '/client/smscode', '', 1, '', 0, '2019-10-28 17:48:12', NULL);
INSERT INTO `sys_menu` VALUES (1355, 189, '验证码发送', '', '', 0, '', 1, '2019-10-28 17:49:14', NULL);
INSERT INTO `sys_menu` VALUES (1356, 1355, '模板管理', '/client/smscode/template', '', 1, '', 1, '2019-10-28 17:49:34', NULL);
INSERT INTO `sys_menu` VALUES (1357, 189, '数据统计', '', '', 0, '', 2, '2019-10-28 18:40:48', NULL);
INSERT INTO `sys_menu` VALUES (1358, 1357, '发送记录', '/client/smscode/sent', '', 1, '', 1, '2019-10-28 18:42:37', NULL);
INSERT INTO `sys_menu` VALUES (1360, 1357, '回执记录', '/client/smscode/receipt', '', 1, '', 3, '2019-10-28 18:43:13', NULL);
INSERT INTO `sys_menu` VALUES (1364, 189, '产品设置', '', '', 0, '', 4, '2019-10-28 18:44:16', NULL);
INSERT INTO `sys_menu` VALUES (1365, 1364, '通用设置', '/client/smscode/common', '', 1, '', NULL, '2019-10-28 18:44:26', NULL);
INSERT INTO `sys_menu` VALUES (1366, 1364, '安全设置', '/client/smscode/security', '', 1, '', NULL, '2019-10-28 18:44:39', NULL);
INSERT INTO `sys_menu` VALUES (1367, 0, '国际验证码', '/client/globalcode', '', 0, 'iconjiaotongtongdao', 8, '2019-10-28 18:45:15', NULL);
INSERT INTO `sys_menu` VALUES (1368, 1367, '概览', '/client/globalcode', '', 1, '', 0, '2019-10-28 18:45:34', NULL);
INSERT INTO `sys_menu` VALUES (1369, 1367, '验证码发送', '', '', 0, '', 1, '2019-10-28 18:45:46', NULL);
INSERT INTO `sys_menu` VALUES (1370, 1369, '模板管理', '/client/globalcode/template', '', 1, '', 1, '2019-10-28 18:46:00', NULL);
INSERT INTO `sys_menu` VALUES (1371, 1367, '数据统计', '', '', 0, '', 2, '2019-10-28 18:46:13', NULL);
INSERT INTO `sys_menu` VALUES (1372, 1371, '发送记录', '/client/globalcode/sent', '', 1, '', 1, '2019-10-28 18:46:29', NULL);
INSERT INTO `sys_menu` VALUES (1377, 1367, '产品设置', '', '', 0, '', 4, '2019-10-28 18:47:41', NULL);
INSERT INTO `sys_menu` VALUES (1378, 1377, '通用设置', '/client/globalcode/common', '', 1, '', NULL, '2019-10-28 18:47:52', NULL);
INSERT INTO `sys_menu` VALUES (1379, 1377, '安全设置', '/client/globalcode/security', '', 1, '', NULL, '2019-10-28 18:48:02', NULL);
INSERT INTO `sys_menu` VALUES (1394, 1296, '操作', '', '', 2, '', NULL, '2019-10-29 11:39:51', NULL);
INSERT INTO `sys_menu` VALUES (1395, 1297, '操作', '', '', 2, '', NULL, '2019-10-29 11:42:17', NULL);
INSERT INTO `sys_menu` VALUES (1404, 1314, '操作', '', '', 2, '', NULL, '2019-10-29 19:12:28', NULL);
INSERT INTO `sys_menu` VALUES (1406, 1313, '操作', '', '', 2, '', NULL, '2019-10-29 19:13:17', NULL);
INSERT INTO `sys_menu` VALUES (1407, 1312, '操作', '', '', 2, '', NULL, '2019-10-29 19:13:43', NULL);
INSERT INTO `sys_menu` VALUES (1408, 1319, '操作', '', '', 2, '', NULL, '2019-10-30 09:25:32', NULL);
INSERT INTO `sys_menu` VALUES (1409, 1320, '操作', '', '', 2, '', NULL, '2019-10-30 09:26:55', NULL);
INSERT INTO `sys_menu` VALUES (1410, 1317, '操作', '', '', 2, '', NULL, '2019-10-30 09:27:40', NULL);
INSERT INTO `sys_menu` VALUES (1411, 1316, '操作', '', '', 2, '', NULL, '2019-10-30 09:42:51', NULL);
INSERT INTO `sys_menu` VALUES (1413, 1327, '发送操作', '', '', 2, '', NULL, '2019-10-30 13:43:24', NULL);
INSERT INTO `sys_menu` VALUES (1416, 1342, '操作', '', '', 2, '', NULL, '2019-10-30 13:58:34', NULL);
INSERT INTO `sys_menu` VALUES (1417, 1343, '操作', '', '', 2, '', NULL, '2019-10-30 14:04:45', NULL);
INSERT INTO `sys_menu` VALUES (1418, 1346, '操作', '', '', NULL, '', NULL, '2019-10-30 14:22:00', NULL);
INSERT INTO `sys_menu` VALUES (1419, 1347, '操作', '', '', 2, '', NULL, '2019-10-30 14:22:21', NULL);
INSERT INTO `sys_menu` VALUES (1420, 1345, '操作', '', '', 2, '', NULL, '2019-10-30 14:23:15', NULL);
INSERT INTO `sys_menu` VALUES (1421, 1360, '操作', '', '', 2, '', NULL, '2019-10-30 14:33:50', NULL);
INSERT INTO `sys_menu` VALUES (1422, 1358, '操作', '', '', 2, '', NULL, '2019-10-30 14:34:28', NULL);
INSERT INTO `sys_menu` VALUES (1423, 1356, '操作', '', '', 2, '', NULL, '2019-10-30 14:36:01', NULL);
INSERT INTO `sys_menu` VALUES (1425, 1372, '操作', '', '', 2, '', NULL, '2019-10-30 14:43:39', NULL);
INSERT INTO `sys_menu` VALUES (1426, 1370, '操作', '', '', 2, '', NULL, '2019-10-30 14:45:26', NULL);
INSERT INTO `sys_menu` VALUES (1432, 1324, '接口文档', 'https://www.10658.com.cn/doc/63', '', 1, '', 2, '2019-10-31 10:57:13', NULL);
INSERT INTO `sys_menu` VALUES (1433, 1332, '操作', '', '', 2, '', NULL, '2019-10-31 10:58:05', NULL);
INSERT INTO `sys_menu` VALUES (1436, 1329, '操作', '', '', 2, '', NULL, '2019-10-31 11:00:48', NULL);
INSERT INTO `sys_menu` VALUES (1439, 1355, '接口文档', 'https://www.10658.com.cn/doc/58', '', 1, '', 2, '2019-10-31 15:18:35', NULL);
INSERT INTO `sys_menu` VALUES (1440, 1357, '回复记录', '/client/smscode/received', '', 1, '', 2, '2019-10-31 15:38:20', NULL);
INSERT INTO `sys_menu` VALUES (1441, 1440, '操作', '', '', 2, '', NULL, '2019-10-31 15:39:21', NULL);
INSERT INTO `sys_menu` VALUES (1442, 1371, '回复记录', '/client/globalcode/received', '', 1, '', 2, '2019-10-31 16:32:45', NULL);
INSERT INTO `sys_menu` VALUES (1443, 1442, '操作', '', '', 2, '', NULL, '2019-10-31 16:33:13', NULL);
INSERT INTO `sys_menu` VALUES (1445, 1444, '添加', '', '', 2, '', NULL, '2019-10-31 17:02:52', NULL);
INSERT INTO `sys_menu` VALUES (1447, 1444, '删除', '', '', 2, '', NULL, '2019-10-31 17:08:19', NULL);
INSERT INTO `sys_menu` VALUES (1448, 0, '视频短信', '/client/videomms', '', 0, 'iconic_sms_px', 4, '2019-11-01 11:59:10', NULL);
INSERT INTO `sys_menu` VALUES (1449, 1448, '概览', '/client/videomms', '', 1, '', 0, '2019-11-01 13:40:55', NULL);
INSERT INTO `sys_menu` VALUES (1451, 1448, '短信发送', '', '', 0, '', 1, '2019-11-01 13:43:09', NULL);
INSERT INTO `sys_menu` VALUES (1452, 1451, '在线发送', '/client/videomms/group', '', 1, '', 1, '2019-11-01 13:44:30', NULL);
INSERT INTO `sys_menu` VALUES (1453, 1452, '操作', '', '', 2, '', NULL, '2019-11-01 13:45:54', NULL);
INSERT INTO `sys_menu` VALUES (1456, 1448, '数据统计', '', '', 0, '', 3, '2019-11-01 13:48:39', NULL);
INSERT INTO `sys_menu` VALUES (1459, 1456, '回执记录', '/client/videomms/receipt', '', 1, '', 4, '2019-11-01 13:49:43', NULL);
INSERT INTO `sys_menu` VALUES (1460, 1456, '发送记录', '/client/videomms/sent', '', 1, '', 2, '2019-11-01 13:49:57', NULL);
INSERT INTO `sys_menu` VALUES (1462, 1460, '操作', '', '', 2, '', NULL, '2019-11-01 13:56:19', NULL);
INSERT INTO `sys_menu` VALUES (1464, 1459, '回执记录', '', '', 2, '', NULL, '2019-11-01 13:57:00', NULL);
INSERT INTO `sys_menu` VALUES (1469, 1448, '产品设置', '', '', 0, '', 5, '2019-11-01 14:01:01', NULL);
INSERT INTO `sys_menu` VALUES (1470, 1469, '安全设置', '/client/videomms/security', '', 1, '', NULL, '2019-11-01 14:01:27', NULL);
INSERT INTO `sys_menu` VALUES (1471, 1469, '通用设置', '/client/videomms/common', '', 1, '', NULL, '2019-11-01 14:03:08', NULL);
INSERT INTO `sys_menu` VALUES (1472, 0, '语音短信', '/client/voice', '', 0, 'icondianhua1-copy', 5, '2019-11-01 14:04:29', NULL);
INSERT INTO `sys_menu` VALUES (1474, 1472, '语音发送', '', '', 0, '', 1, '2019-11-01 14:53:33', NULL);
INSERT INTO `sys_menu` VALUES (1475, 1474, '模板管理', '/client/voice/template', '', 1, '', 1, '2019-11-01 14:54:35', NULL);
INSERT INTO `sys_menu` VALUES (1476, 1472, '数据统计', '', '', 0, '', 2, '2019-11-01 14:55:33', NULL);
INSERT INTO `sys_menu` VALUES (1477, 1476, '发送记录', '/client/voice/sent', '', 1, '', NULL, '2019-11-01 14:56:02', NULL);
INSERT INTO `sys_menu` VALUES (1479, 1472, '概览', '/client/voice', '', 1, '', 0, '2019-11-01 15:01:52', NULL);
INSERT INTO `sys_menu` VALUES (1484, 1472, '产品设置', '', '', 0, '', 4, '2019-11-01 15:05:56', NULL);
INSERT INTO `sys_menu` VALUES (1485, 1484, '安全设置', '/client/voice/security', '', 1, '', 3, '2019-11-01 15:06:27', NULL);
INSERT INTO `sys_menu` VALUES (1486, 1484, '通用设置', '/client/voice/common', '', 1, '', NULL, '2019-11-01 15:06:55', NULL);
INSERT INTO `sys_menu` VALUES (1487, 1477, '操作', '', '', NULL, '', NULL, '2019-11-01 15:09:42', NULL);
INSERT INTO `sys_menu` VALUES (1489, 1381, '微信支付', '', '', 2, '', NULL, '2019-11-04 15:17:19', NULL);
INSERT INTO `sys_menu` VALUES (1490, 1381, '支付宝支付', '', '', 2, '', NULL, '2019-11-04 15:17:45', NULL);
INSERT INTO `sys_menu` VALUES (1492, 1327, '模板操作', '', '', 2, '', NULL, '2019-11-04 15:32:08', NULL);
INSERT INTO `sys_menu` VALUES (1493, 1451, '接口文档', 'https://www.10658.com.cn/doc/63', '', 1, NULL, 2, NULL, NULL);
INSERT INTO `sys_menu` VALUES (1494, 1474, '接口文档', 'https://www.10658.com.cn/doc/59', '', 1, NULL, 2, NULL, NULL);
INSERT INTO `sys_menu` VALUES (1495, 1369, '接口文档', 'https://www.10658.com.cn/doc/58', '', 1, NULL, 2, NULL, NULL);
INSERT INTO `sys_menu` VALUES (1509, 1341, '接口文档', 'https://www.veesing.com/apidocs/id/64.html', '', 1, '', 4, NULL, NULL);
INSERT INTO `sys_menu` VALUES (1514, 1341, '批量定时', '/client/custom/birthday', '', 1, '', 2, '2019-12-18 14:07:10', NULL);
COMMIT;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) NOT NULL,
  `role_sign` varchar(100) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  `user_id_create` bigint(255) DEFAULT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
BEGIN;
INSERT INTO `sys_role` VALUES (2, '', '', '', 1, '2021-06-28 13:32:28', '2021-06-28 13:32:28');
COMMIT;

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL,
  `menu_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=63765 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
BEGIN;
INSERT INTO `sys_role_menu` VALUES (63614, 2, 160);
INSERT INTO `sys_role_menu` VALUES (63615, 2, 179);
INSERT INTO `sys_role_menu` VALUES (63616, 2, 1117);
INSERT INTO `sys_role_menu` VALUES (63617, 2, 1322);
INSERT INTO `sys_role_menu` VALUES (63618, 2, 1297);
INSERT INTO `sys_role_menu` VALUES (63619, 2, 1395);
INSERT INTO `sys_role_menu` VALUES (63620, 2, 1296);
INSERT INTO `sys_role_menu` VALUES (63621, 2, 1394);
INSERT INTO `sys_role_menu` VALUES (63623, 2, 1311);
INSERT INTO `sys_role_menu` VALUES (63624, 2, 1312);
INSERT INTO `sys_role_menu` VALUES (63625, 2, 1407);
INSERT INTO `sys_role_menu` VALUES (63626, 2, 1313);
INSERT INTO `sys_role_menu` VALUES (63627, 2, 1406);
INSERT INTO `sys_role_menu` VALUES (63628, 2, 1314);
INSERT INTO `sys_role_menu` VALUES (63629, 2, 1404);
INSERT INTO `sys_role_menu` VALUES (63631, 2, 1316);
INSERT INTO `sys_role_menu` VALUES (63632, 2, 1411);
INSERT INTO `sys_role_menu` VALUES (63634, 2, 1410);
INSERT INTO `sys_role_menu` VALUES (63635, 2, 1318);
INSERT INTO `sys_role_menu` VALUES (63636, 2, 1319);
INSERT INTO `sys_role_menu` VALUES (63637, 2, 1408);
INSERT INTO `sys_role_menu` VALUES (63638, 2, 1320);
INSERT INTO `sys_role_menu` VALUES (63639, 2, 1409);
INSERT INTO `sys_role_menu` VALUES (63640, 2, 1323);
INSERT INTO `sys_role_menu` VALUES (63641, 2, 1327);
INSERT INTO `sys_role_menu` VALUES (63642, 2, 1492);
INSERT INTO `sys_role_menu` VALUES (63643, 2, 1413);
INSERT INTO `sys_role_menu` VALUES (63645, 2, 1329);
INSERT INTO `sys_role_menu` VALUES (63646, 2, 1436);
INSERT INTO `sys_role_menu` VALUES (63647, 2, 1332);
INSERT INTO `sys_role_menu` VALUES (63648, 2, 1433);
INSERT INTO `sys_role_menu` VALUES (63652, 2, 1337);
INSERT INTO `sys_role_menu` VALUES (63653, 2, 1339);
INSERT INTO `sys_role_menu` VALUES (63654, 2, 1338);
INSERT INTO `sys_role_menu` VALUES (63655, 2, 1449);
INSERT INTO `sys_role_menu` VALUES (63656, 2, 1452);
INSERT INTO `sys_role_menu` VALUES (63657, 2, 1453);
INSERT INTO `sys_role_menu` VALUES (63659, 2, 1460);
INSERT INTO `sys_role_menu` VALUES (63660, 2, 1462);
INSERT INTO `sys_role_menu` VALUES (63661, 2, 1459);
INSERT INTO `sys_role_menu` VALUES (63662, 2, 1464);
INSERT INTO `sys_role_menu` VALUES (63666, 2, 1469);
INSERT INTO `sys_role_menu` VALUES (63667, 2, 1471);
INSERT INTO `sys_role_menu` VALUES (63668, 2, 1470);
INSERT INTO `sys_role_menu` VALUES (63669, 2, 1479);
INSERT INTO `sys_role_menu` VALUES (63670, 2, 1475);
INSERT INTO `sys_role_menu` VALUES (63672, 2, 1477);
INSERT INTO `sys_role_menu` VALUES (63673, 2, 1487);
INSERT INTO `sys_role_menu` VALUES (63677, 2, 1484);
INSERT INTO `sys_role_menu` VALUES (63678, 2, 1486);
INSERT INTO `sys_role_menu` VALUES (63679, 2, 1485);
INSERT INTO `sys_role_menu` VALUES (63680, 2, 1340);
INSERT INTO `sys_role_menu` VALUES (63681, 2, 1343);
INSERT INTO `sys_role_menu` VALUES (63682, 2, 1417);
INSERT INTO `sys_role_menu` VALUES (63683, 2, 1514);
INSERT INTO `sys_role_menu` VALUES (63684, 2, 1342);
INSERT INTO `sys_role_menu` VALUES (63685, 2, 1416);
INSERT INTO `sys_role_menu` VALUES (63687, 2, 1344);
INSERT INTO `sys_role_menu` VALUES (63688, 2, 1345);
INSERT INTO `sys_role_menu` VALUES (63689, 2, 1420);
INSERT INTO `sys_role_menu` VALUES (63690, 2, 1346);
INSERT INTO `sys_role_menu` VALUES (63691, 2, 1418);
INSERT INTO `sys_role_menu` VALUES (63692, 2, 1347);
INSERT INTO `sys_role_menu` VALUES (63693, 2, 1419);
INSERT INTO `sys_role_menu` VALUES (63697, 2, 1351);
INSERT INTO `sys_role_menu` VALUES (63698, 2, 1353);
INSERT INTO `sys_role_menu` VALUES (63699, 2, 1352);
INSERT INTO `sys_role_menu` VALUES (63700, 2, 1354);
INSERT INTO `sys_role_menu` VALUES (63701, 2, 1356);
INSERT INTO `sys_role_menu` VALUES (63702, 2, 1423);
INSERT INTO `sys_role_menu` VALUES (63704, 2, 1357);
INSERT INTO `sys_role_menu` VALUES (63705, 2, 1358);
INSERT INTO `sys_role_menu` VALUES (63706, 2, 1422);
INSERT INTO `sys_role_menu` VALUES (63707, 2, 1440);
INSERT INTO `sys_role_menu` VALUES (63708, 2, 1441);
INSERT INTO `sys_role_menu` VALUES (63709, 2, 1360);
INSERT INTO `sys_role_menu` VALUES (63710, 2, 1421);
INSERT INTO `sys_role_menu` VALUES (63714, 2, 1364);
INSERT INTO `sys_role_menu` VALUES (63715, 2, 1366);
INSERT INTO `sys_role_menu` VALUES (63716, 2, 1365);
INSERT INTO `sys_role_menu` VALUES (63717, 2, 1368);
INSERT INTO `sys_role_menu` VALUES (63718, 2, 1370);
INSERT INTO `sys_role_menu` VALUES (63719, 2, 1426);
INSERT INTO `sys_role_menu` VALUES (63721, 2, 1372);
INSERT INTO `sys_role_menu` VALUES (63722, 2, 1425);
INSERT INTO `sys_role_menu` VALUES (63723, 2, 1442);
INSERT INTO `sys_role_menu` VALUES (63724, 2, 1443);
INSERT INTO `sys_role_menu` VALUES (63728, 2, 1377);
INSERT INTO `sys_role_menu` VALUES (63729, 2, 1379);
INSERT INTO `sys_role_menu` VALUES (63730, 2, 1378);
INSERT INTO `sys_role_menu` VALUES (63733, 2, 1490);
INSERT INTO `sys_role_menu` VALUES (63734, 2, 1489);
INSERT INTO `sys_role_menu` VALUES (63738, 2, 1447);
INSERT INTO `sys_role_menu` VALUES (63739, 2, 1445);
INSERT INTO `sys_role_menu` VALUES (63740, 2, 1303);
INSERT INTO `sys_role_menu` VALUES (63741, 2, 1304);
INSERT INTO `sys_role_menu` VALUES (63742, 2, 1305);
INSERT INTO `sys_role_menu` VALUES (63744, 2, 1307);
INSERT INTO `sys_role_menu` VALUES (63745, 2, -1);
INSERT INTO `sys_role_menu` VALUES (63746, 2, 181);
INSERT INTO `sys_role_menu` VALUES (63747, 2, 1295);
INSERT INTO `sys_role_menu` VALUES (63748, 2, 195);
INSERT INTO `sys_role_menu` VALUES (63749, 2, 1324);
INSERT INTO `sys_role_menu` VALUES (63750, 2, 1328);
INSERT INTO `sys_role_menu` VALUES (63751, 2, 1448);
INSERT INTO `sys_role_menu` VALUES (63752, 2, 1451);
INSERT INTO `sys_role_menu` VALUES (63753, 2, 1456);
INSERT INTO `sys_role_menu` VALUES (63754, 2, 1472);
INSERT INTO `sys_role_menu` VALUES (63755, 2, 1474);
INSERT INTO `sys_role_menu` VALUES (63756, 2, 1476);
INSERT INTO `sys_role_menu` VALUES (63757, 2, 1300);
INSERT INTO `sys_role_menu` VALUES (63758, 2, 1341);
INSERT INTO `sys_role_menu` VALUES (63759, 2, 189);
INSERT INTO `sys_role_menu` VALUES (63760, 2, 1355);
INSERT INTO `sys_role_menu` VALUES (63761, 2, 1367);
INSERT INTO `sys_role_menu` VALUES (63762, 2, 1369);
INSERT INTO `sys_role_menu` VALUES (63763, 2, 1371);
INSERT INTO `sys_role_menu` VALUES (63764, 2, 1235);
COMMIT;

-- ----------------------------
-- Table structure for sys_security
-- ----------------------------
DROP TABLE IF EXISTS `sys_security`;
CREATE TABLE `sys_security` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type` int(2) DEFAULT NULL,
  `pd_type` int(1) DEFAULT NULL,
  `key` varchar(255) DEFAULT NULL,
  `value` text,
  `customer_id` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `is_used` int(1) DEFAULT NULL,
  `trig_time` datetime DEFAULT NULL,
  `trig_count` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=181586 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_security
-- ----------------------------
BEGIN;
INSERT INTO `sys_security` VALUES (5545, 1, 1, '回执接收地址', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (5546, 2, 1, '上行接收地址', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (5547, 3, 1, '每天最大发送量', '', 336, '2018-09-25 10:25:17', 1, '2018-09-26 09:23:34', '1');
INSERT INTO `sys_security` VALUES (5548, 4, 1, '剩余条数提醒', '', 336, '2018-09-25 10:25:17', 1, '2018-09-26 09:23:34', '1');
INSERT INTO `sys_security` VALUES (5549, 5, 1, '单个手机号每日最大发送量', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (5550, 1, 2, '回执接收地址', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (5551, 3, 2, '每天最大发送量', '', 336, '2018-09-25 10:25:17', 1, NULL, '');
INSERT INTO `sys_security` VALUES (5552, 4, 2, '剩余条数提醒', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (5553, 5, 2, '单个手机号每日最大发送量', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (5554, 1, 3, '回执接收地址', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (5555, 2, 3, '上行接收地址', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (5556, 3, 3, '每天最大发送量', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (5557, 4, 3, '剩余条数提醒', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (5558, 5, 3, '单个手机号每日最大发送量', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (5559, 1, 4, '回执接收地址', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (5560, 2, 4, '上行接收地址', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (5561, 3, 4, '每天最大发送量', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (5562, 4, 4, '剩余条数提醒', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (5563, 5, 4, '单个手机号每日最大发送量', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (5564, 6, 0, '账户预警通知手机号', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (5565, 7, 0, '微信公众号', '', 336, '2018-09-25 10:25:17', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (99700, 1, 6, '回执接收地址', '', 336, '2019-11-18 19:30:01', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (99701, 2, 6, '上行接收地址', '', 336, '2019-11-18 19:30:01', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (99702, 3, 6, '每天最大发送量', '', 336, '2019-11-18 19:30:01', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (99703, 4, 6, '剩余条数提醒', '', 336, '2019-11-18 19:30:01', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (99704, 5, 6, '单个手机号每日最大发送量', '', 336, '2019-11-18 19:30:01', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (99705, 1, 5, '回执接收地址', '', 336, '2019-11-18 19:30:01', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (99706, 2, 5, '上行接收地址', '', 336, '2019-11-18 19:30:01', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (99707, 3, 5, '每天最大发送量', '', 336, '2019-11-18 19:30:01', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (99708, 4, 5, '剩余条数提醒', '', 336, '2019-11-18 19:30:01', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (99709, 5, 5, '单个手机号每日最大发送量', '', 336, '2019-11-18 19:30:01', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (99710, 1, 7, '回执接收地址', '', 336, '2019-11-18 19:30:01', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (99711, 2, 7, '上行接收地址', '', 336, '2019-11-18 19:30:01', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (99712, 3, 7, '每天最大发送量', '', 336, '2019-11-18 19:30:01', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (99713, 4, 7, '剩余条数提醒', '', 336, '2019-11-18 19:30:01', 1, NULL, '0');
INSERT INTO `sys_security` VALUES (99714, 5, 7, '单个手机号每日最大发送量', '', 336, '2019-11-18 19:30:01', 1, NULL, '0');
COMMIT;

-- ----------------------------
-- Table structure for sys_template
-- ----------------------------
DROP TABLE IF EXISTS `sys_template`;
CREATE TABLE `sys_template` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type_id` bigint(20) DEFAULT NULL,
  `tpl_name` varchar(50) DEFAULT NULL,
  `tpl_content` varchar(500) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `create_user_id` bigint(20) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=549 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_template
-- ----------------------------
BEGIN;
INSERT INTO `sys_template` VALUES (379, 11, '用户注册_1', '您手机注册的验证码为：【变量】，如有问题请拨打客服电话：【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (380, 11, '用户注册_2', '您注册小【变量】验证码：【变量】。请不要把验证码泄露给其他人！15分钟内有效。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (381, 11, '用户注册_3', '您的注册验证码是【变量】，请不要把验证码泄漏给其他人，如非本人请勿操作。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (382, 11, '用户注册_4', '恭喜您注册成功，您的会员编号：【变量】 ，请您及时登陆账户进行激活。【变量】 ', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (383, 11, '用户注册_5', '尊敬的【变量】园长，您的【变量】账户已注册，初始密码为【变量】，请尽快登录【变量】公众号修改您的密码。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (384, 12, '用户登录_6', '您的本次登录校验码为：【变量】,15分钟内输入有效！【变量】 ', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (385, 12, '用户登录_7', '您登录系统的动态码为【变量】，动态码有效时间为【变量】，请注意保密。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (386, 12, '用户登录_8', '您的登录密码是：【变量】。打死不要告诉别人！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (387, 12, '用户登录_9', '您的登录验证码是【变量】（5分钟内有效），请勿泄漏给他人。如非本人操作，请忽略本条消息。唯一客服热线【变量】。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (388, 12, '用户登录_10', '您的登录验证码为：【变量】。请按照提示完成登录，如有问题请致电【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (389, 13, '忘记密码_11', '您在【变量】平台下的【变量】后台登录账号信息已修改，名称：【变量】，密码：【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (390, 13, '忘记密码_12', '您的短信验证码是【变量】。您正在通过手机号重置登录密码，如非本人操作，请忽略该短信。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (391, 13, '忘记密码_13', '您正在找回密码，验证码为：【变量】请不要把验证码泄露给其他人。如非本人操作，可不用理会！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (392, 13, '忘记密码_14', '您好，您正在使用网站的忘记密码找回操作，本次验证码为：【变量】, 请勿泄露。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (393, 13, '忘记密码_15', '忘记密码提示：手机动态验证码为【变量】，请在2分钟内正确输入。祝万事如意！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (394, 13, '忘记密码_16', '您正在执行忘记密码的操作。您的验证码是【变量】。该验证码2小时内有效。请不要把验证码泄露给其他人。如非本人操作，可不用理会！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (395, 14, '信息变更_17', '尊敬的【变量】，【变量】为您预定的车辆信息变更如下：【变量】，车辆：【变量】，司机：【变量】师傅【变量】；感谢您的惠顾！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (396, 14, '信息变更_18', '尊敬的【变量】，【变量】派车信息变更如下：【变量】，车辆： 【变量】，司机：【变量】师傅【变量】；请回复\"【变量】\"表示确认。感谢您的惠顾！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (397, 14, '信息变更_19', '您预订的【变量】【变量】【变量】-【变量】【变量】}-【变量】，【变量】，变动为【变量】【变量】-【变量】【变量】－【变量】，【变量】。如同意该调整，请回复【变量】至本号码。一旦同意该变更，再次改期或退票将按照原客票规则收取手续费。如需帮助请致电【变量】【山河票务】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (398, 14, '信息变更_20', '帐户收支变更：收到【变量】预付款/维修费余款【变量】，余额【变量】。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (399, 14, '信息变更_21', '您本次变更微信帐号的验证码是【变量】。如非本人操作，请忽略此信息！—— 【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (400, 14, '信息变更_22', '尊敬的【变量】先生/女士您好！为了更好地为您服务，您的专属理财师已变更为【变量】先生/女士，我们将一如既往地为您提供优质的服务。感谢您信任！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (401, 14, '信息变更_23', '买家已确认订单数量变更，请及确认结算。订单：【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (402, 14, '信息变更_24', '其乐云学堂：您购买的【变量】老师的【变量】课程，上课日期已由【变量】变更为【变量】，敬请谅解。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (403, 14, '信息变更_25', '手机号变更验证码：【变量】，请勿泄露。如非本人操作，可不用理会！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (404, 14, '信息变更_26', '会员：【变量】你好，您正在申请变更您的密码，请确保该操作是您本人进行，您的校验码是【变量】，该校验码一分钟内有效。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (405, 14, '信息变更_27', '会员：【变量】，您好！您正在申请变更账号绑定手机，请您确认这是您本人的操作，确认后，请您输入校验码【变量】完成变更申请。【变量】 ', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (406, 14, '信息变更_28', '会员【变量】，您预约的【变量】，地址【变量】，【变量】的订单，已安排【变量】为您服务，如有变更，请随时联系客服。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (407, 14, '信息变更_29', '重要：【变量】，您的订单中时间为【变量】的【变量】课程，时间变更为【变量】，请您调整时间并准备教学计划。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (408, 15, '支付确认_30', '尊敬的用户，本次支付确认码：【变量】,有效期300秒。任何人索取确认码均为危险行为，为了您的资金安全切勿泄露！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (409, 15, '支付确认_31', '您正在进行支付确认，验证码是【变量】，请勿将验证码泄露给他人，如非本人操作，可不用理会！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (410, 15, '支付确认_32', '支付确认码为【变量】，亲爱滴财主，您正在使用本手机号码绑定的银行卡进行支付。如非本人操作，请致电客服热线：【变量】。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (411, 16, '活动确认_33', '您好，感谢您参与\"我在和田有棵树\"认养活动，您已成功认养。请保留此短信，作为认养凭证。详细问题，请您随时登录【变量】微信公共平台。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (412, 16, '活动确认_34', '尊敬的客户，您好！您参与的房源团购优惠活动报名成功，编号为：【变量】。请尽快核实信息，如有疑问请联系客服！【变量】 ', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (413, 16, '活动确认_35', '尊敬的【变量】先生/小姐,您的参赛编号为【变量】,此编号做为您参与活动和领取装备的凭证，请妥善保管，本短信转发无效。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (414, 16, '活动确认_36', '感谢您成为贵州广播电视台官方新闻客户端\"动静\"用户，欢迎参与此次\"城市动静 快递英雄\"活动，您所上传的作品已通过审核，你的作品编号为\"【变量】\",您可以通过活动页面搜索功能找到您的作品，快请您的朋友下载\"动静\"为您投票吧！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (415, 16, '活动确认_37', '您的验证码是：【变量】。 感谢您参与\"【变量】\"投票！【变量】 ', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (416, 16, '活动确认_38', '您好，您本次参与微信活动验证码是：【变量】。请不要把验证码泄露给其他人。如有问题请联系【变量】。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (417, 16, '活动确认_39', '您好，【变量】已成功预约南博【变量】活动\"【变量】--【变量】\"，若无法参加，请在活动开始24小时前取消预约。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (418, 16, '活动确认_40', '尊敬的用户，感谢您参与\"【变量】\"活动，【变量】元通讯礼包已充值，详情请登录网上营业厅查询，感谢您对【变量】的支持。', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (419, 17, '状态变更_41', '尊敬的用户，您于时间：【变量】申请的订单:【变量】，状态变更为【变量】，快递公司：【变量】,快递单号：【变量】。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (420, 17, '状态变更_42', '您预订的【变量】【变量】【变量】-【变量】【变量】}-【变量】，【变量】，变动为【变量】【变量】-【变量】【变量】－【变量】，【变量】。如同意该调整，请回复【变量】至本号码。一旦同意该变更，再次改期或退票将按照原客票规则收取手续费。如需帮助请致电【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (421, 17, '状态变更_43', '您订单号为【变量】的宝贝行李已送达至【变量】，请及时联系师傅交接行李，您可以在订单中查看状态。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (422, 17, '状态变更_44', '尊敬的客户，您的订单【变量】当前状态已更新到【变量】，请知悉，谢谢合作。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (423, 17, '状态变更_45', '温馨提示：尊敬的客户您好！您的订单有新的状态，请登录系统查看。———【变量】提供【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (424, 17, '状态变更_46', '您的订单已确认，稍后库房将为您发货，订单状态可通过登录【变量】网站的订单中心中查询。届时，请您保持电话畅通，以便联系送货【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (425, 18, '改签_47', '您提交的改签申请：【变量】到【变量】的【变量】次，可持二代居民身份证原件按订单号于在开车前到车站自动售票机或车站售票窗口换取纸质车票。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (426, 18, '改签_48', '您预订的【变量】【变量】【变量】-【变量】【变量】}-【变量】，【变量】，变动为【变量】【变量】-【变量】【变量】－【变量】，【变量】。如同意该调整，请回复【变量】至本号码。一旦同意该变更，再次改期或退票将按照原客票规则收取手续费。如需帮助请致电【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (427, 19, '到账通知_49', '您在【变量】有一笔用车订单【变量】，【变量】元已退回您的原支付账户，预计1~7个工作日到账，请注意查收。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (428, 19, '到账通知_50', '尊敬的用户【变量】，您于【变量】申请的【变量】元人民币的提现业务已受理成功，资金到账时间为受理成功日（不含当日）起两个工作日内，请注意查收。【变量】 ', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (429, 19, '到账通知_51', '尊敬的会员,您的借款项目【变量】已放款，【变量】元资金已到账，请登录平台账户提现【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (430, 19, '到账通知_52', '提醒：您【变量】申请提现【变量】元，资金已经转入尾号为【变量】的银行卡账号。部分银行可能存在延时，具体到账时间以银行到账通知为准。有任何疑问请咨询电话【变量】 【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (431, 19, '到账通知_53', '到账通知：您今日收到投资还款【变量】元，请登录网站查收。温馨提示：请合理安排投资，避免资金闲置。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (432, 20, '到期提醒_54', '资质到期提醒：【变量】，贵司所拥有的【变量】\"【变量】\"将于【变量】到期，请知悉！详情请登录【变量】了解。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (433, 20, '到期提醒_55', '您的【变量】服务还有【变量】到期，请及时续费以免影响您的正常使用。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (434, 20, '到期提醒_56', '尊敬的【变量】用户，您正在使用的宽带套餐于【变量】到期！建议您尽快办理续约，以免影响您宽带的正常使用。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (435, 20, '到期提醒_57', '姓名：【变量】，手机号：【变量】，地址：【变量】，于【变量】合同/租约到期。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (436, 20, '到期提醒_58', '您好！您的借款[【变量】]将于明天到期，请及时还款，以免逾期。感谢您对【变量】的支持，谢谢！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (437, 20, '到期提醒_59', '您好：【变量】会员，您的【变量】时间即将到期，请您及时充值续费，以免影响正常使用，谢谢！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (438, 20, '到期提醒_60', '您的【变量】服务将于【变量】到期，请联系您的专属顾问【变量】及时续费，谢谢！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (439, 20, '到期提醒_61', '亲爱的用户，因商家合作到期，您在【变量】上的订单无法继续消费，系统已自动为您发起退款申请, 预计3-5个工作日内到账。退款金额: 【变量】元, 客服电话: 【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (440, 21, '积分兑换_62', '您好，您的积分兑换码为【变量】。感谢您的支持！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (441, 21, '积分兑换_63', '会员：【变量】，您好！恭喜您积分兑换【变量】成功，请到【变量】 门店领取礼品。感谢您一直以来的支持！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (442, 21, '积分兑换_64', '您此次积分兑换的验证码是：【变量】。请不要把验证码泄露给其他人。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (443, 21, '积分兑换_65', '您好,您的订单号为【变量】的积分兑换商品已经飞奔在路上,请耐心等待,详情请进入积分兑换订单界面查看--【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (444, 21, '积分兑换_66', '积分兑换成功提示:您提交的积分兑换申请,已成功付款,请及时查看账户.【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (445, 21, '积分兑换_67', '您积分兑换的验证码是：【变量】。请不要把验证码泄露给其他人。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (446, 21, '积分兑换_68', '你已订购网上积分兑换产品【变量】凭手机短信验证码到商家进行消费。地址:【变量】电话：【变量】，账户剩于积分【变量】，祝您消费开心【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (447, 22, '面试通知_69', '恭喜您！您通过了【变量】的面试通知，面试时间【变量】联系人【变量】联系人电话【变量】面试地址【变量】，赶快登录掌上快招查询详细信息！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (448, 22, '面试通知_70', '【变量】，欢迎到普联软件面试【变量】，联系人：【变量】，请于2日内电话或邮件预约面试时间。详见邮件。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (449, 22, '面试通知_71', '恭喜，您报名【变量】工作被录用，面试日期：【变量】，面试地点【变量】，请准时参加面试【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (450, 22, '面试通知_72', '尊敬的【变量】您好，您申请的【变量】职位，初审已过，现诚邀您于【变量】来我公司面试，地址：【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (451, 22, '面试通知_73', '您的简历已通过【变量】审核，现邀请您于【变量】在【变量】进行面试。联系人：【变量】；联系电话：【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (452, 22, '面试通知_74', '尊敬的【变量】：您好！请于【变量】来我司面试，面试地点：【变量】。联系人：【变量】电话：【变量】。感谢您对【变量】的关注，祝您面试顺利。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (453, 22, '面试通知_75', '您好,【变量】的【变量】面试明天就开始了,请留意时间安排,如无法到场或有变化请致电【变量】或访问【变量】反馈.谢谢.【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (454, 22, '面试通知_76', '您好,这里是【变量】,欢迎参加我公司【变量】岗位面试,面试时间:【变量】,面试地址:【变量】.联系人【变量】:【变量】或【变量】.【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (455, 22, '面试通知_77', '面试通知:您好!现通知您于【变量】月【变量】日【变量】时参加面试。地址:【变量】。联系电话:【变量】.谢谢!【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (456, 23, '入职培训通知_78', '学员【变量】，【变量】培训已经达到最低【变量】个学时，及时拿着学时卡到驾校确认学时！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (457, 24, '会议通知_79', '会议通知：【变量】委员，兹定于【变量】在【变量】召开【变量】会议，请准时参加。会议原则上不得缺席，如确实不能参加，请履行请假手续。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (458, 24, '会议通知_80', '您好，【变量】，会议通知：【变量】，会议时间：【变量】，截至期限：【变量】，请及时登录系统报名，系统地址【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (459, 24, '会议通知_81', '会议通知:【变量】。收到请及时回复！回复【变量】为\"准时参加\",回复【变量】为\"无法参加\"。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (460, 24, '会议通知_82', '会议通知：请于【变量】在【变量】召开【变量】，会议重要，望准时到会，谢谢！ 【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (461, 24, '会议通知_83', '会议通知：请于【变量】在【变量】召开【变量】，会议重要，望准时到会，谢谢！ 【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (462, 24, '会议通知_84', '尊敬的领导，您的报名已经成功。会议名称：【变量】会议时间：【变量】会议地点：【变量】会务联系：【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (463, 25, '签到_85', '您好【变量】，签到成功【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (464, 25, '签到_86', '亲爱的【变量】 事业伙伴，欢迎您参加本次会议！您已签到成功，相关会议信息请向工作人员查询。祝您心情愉快，事业顺利！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (465, 25, '签到_87', '温馨提示：【变量】同学/老师：【变量】您有一堂【变量】在线课程，老师/学员（【变量】）,请按时登录【变量】进行课程签到。请勿迟到，逾期未签到系统会有不良记录哦！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (466, 25, '签到_88', '您好，【变量】：您现已签到成功。您的考场座位号：【变量】。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (467, 25, '签到_89', '请于【变量】上午准时参加【变量】比赛。到场签到时间【变量】前，地址：【变量】。谢谢！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (468, 25, '签到_90', '来自【变量】评标通知：请您（【变量】）于【变量】到【变量】签到，评标时间【变量】小时，【变量】，请假电话：【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (469, 25, '签到_91', '尊敬的用户您好，您已报名【变量】活动，请您准时签到。感谢您的参与。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (470, 25, '签到_92', '尊敬的用户您好，我们已收到您报名【变量】活动的报名费【变量】元，请您准时签到。感谢您的参与。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (471, 26, '审核结果_93', '报名资料审核结果：【变量】同学你的报名资料审核已经通过，请登录系统查询详细信息。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (472, 26, '审核结果_94', '您的审核结果：您的【变量】申请结果审核通过，请登录查看审核结果。如非本人操作，可不用理会！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (473, 26, '审核结果_95', '您的资料已提交成功，我司正在审核中，我司会在第一时间通知您审核结果，请耐心等待。如有疑问请咨询【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (474, 26, '审核结果_96', '您的注册信息【变量】已提交，我们将尽快审核并短信通知您审核结果，请耐心等待。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (475, 26, '审核结果_97', '您好，您在本站提交资料审核结果情况如下:【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (476, 27, '报名结果_98', '恭喜贵公司报名参加\"【变量】\"首届随行康首届大型公益活动，获得企业识别码码：【变量】。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (477, 27, '报名结果_99', '恭喜您，客户【变量】(电话：【变量】)已成功报名【变量】(海南专题活动)，请悉知.【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (478, 27, '报名结果_100', '尊敬的客户，您好！您参与的房源团购优惠活动报名成功，编号为：【变量】。请尽快核实信息，如有疑问请联系客服！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (479, 27, '报名结果_101', '恭喜！您报名的【变量】已经成功。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (480, 27, '报名结果_102', '恭喜您报名活动成功，登陆密码：【变量】。请勿泄漏，请登录账户：【变量】查看活动详情。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (481, 27, '报名结果_103', '您报名【变量】俱乐部的【变量】活动，已经报名成功，请在【变量】（开始时间）到【变量】（活动地址）地点参加，别迟到哟【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (482, 27, '报名结果_104', '您已成功报名【变量】【变量】活动\\课程。请于【变量】 准时至【变量】报到。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (483, 28, '服务开通_105', '您于【变量】成功开通【变量】的【变量】,有疑问请致电【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (484, 28, '服务开通_106', '亲爱的会员，您购买的【变量】【变量】服务已于【变量】开通。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (485, 28, '服务开通_107', '尊敬的客户，您的注册账户已开通，用户名为【变量】，初始密码是[123456],请您尽快到【变量】平台上修改初始密码，谢谢您的合作！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (486, 28, '服务开通_108', '您的【变量】会员资格正式开通，账号：【变量】，密码：【变量】。【变量】 ', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (487, 28, '服务开通_109', '您的账户已开通，登录名：【变量】；登录密码：【变量】。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (488, 28, '服务开通_110', '您的账号【变量】已开通，初始密码为【变量】，请登录系统修改密码。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (489, 28, '服务开通_111', '您好【变量】，您的会员帐号【变量】已成功开通。如有疑问请登录网站：【变量】咨询24小时在线客服，谢谢！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (490, 28, '服务开通_112', '校验码：【变量】，您正在开通快捷支付/钱包账号，[校验码很重要，请勿向任何人泄露您的短信校验码]【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (491, 29, '生日_113', '亲爱的【变量】您好！今天是您的生日，【变量】全体员工祝您生日快乐！同时感谢您长期以来的支持与信赖。再次送上我们的祝福：祝你生日快乐，身体健康。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (492, 29, '生日_114', '您好【变量】，今天是您的生日，【变量】全体员工祝您生日快乐，工作顺利。预约热线：【变量】。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (493, 29, '生日_115', '亲爱的【变量】：祝您生日快乐！愿您的生日布满无限的快乐，愿您今天的回忆温馨，愿您所有的梦想甜蜜，愿您爱的人幸福快乐，愿您这一年称心如意,并请您继续支持我们!【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (494, 29, '生日_116', '尊敬的【变量】,还有【变量】天就是您的生日了,现赠送【变量】张(不与其他活动同享),即日起5日内有效。【【变量】】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (495, 29, '生日_117', '我昨晚深夜未眠遥问神仙，得知今天是【变量】宝贝的家长您的生日！【变量】全体员工感谢您一路的支持，诚祝您生日快乐！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (496, 29, '生日_118', '生日快乐to【变量】宝贝！摘下天上的星星和彩云，捏成你的笑容送给可爱的宝贝，祝福【变量】宝贝每天都健康快乐！——【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (497, 29, '生日_119', '亲爱的会员：【变量】，您好！在您生日来临之即，祝您生日快乐，天天开心，衷心地祝福你--生日快乐!【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (498, 29, '生日_120', '尊敬的【变量】您好！【变量】是您的生日，【变量】祝您生日快乐！愿您生活如意，爱情甜蜜，工作顺利！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (499, 30, '新品发布会_121', '您好，【变量】于【变量】展开定制活动！请凭预约号【变量】前往体验专属定制。活动期间，您可携带自己的【变量】单品或现场采购新品参与！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (500, 30, '新品发布会_122', '恭喜您预约成功！请凭预约号【变量】于【变量】至【变量】体验专属定制活动，届时，您可携带自己的【变量】 单品或现场采购新品参与。【变量】 与你不见不散！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (501, 31, '团购_123', '会员【变量】成功报名【变量】的优惠团购活动，编号为：【变量】，联系方式：【变量】。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (502, 31, '团购_124', '订单号【变量】，您已成功参加【变量】发起的【变量】团购活动，还差【变量】人就可成团。团购发起后【变量】小时内未成团，订单会取消哦，到微信公众号\"【变量】\"-个人中心-待成团里召集伙伴参团吧！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (503, 31, '团购_125', '亲，有朋友继续参团~【变量】成功参加了您发起的【商品名】团购活动，购买了【变量】份，本团已达到【变量】份。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (504, 31, '团购_126', '您好，您在【变量】有新的团购订单！请注意查收！（【变量】）【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (505, 31, '团购_127', '尊敬的会员，您订阅的团购商品即将于【变量】开售。请您尽快登录【变量】购买。【变量】：【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (506, 31, '团购_128', '您购买了【变量】的团购服务：【变量】，商家电话：【变量】，消费时请出示序列号和密码。序列号：【变量】,密码：【变量】,截至日期：【变量】。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (507, 31, '团购_129', '您的【变量】团购券的密码为【变量】。需提前【变量】天预约。商家电话：【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (508, 31, '团购_130', '您的【变量】团购券的密码为【变量】。无需预约。商家电话：【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (509, 32, '会议邀请_131', '尊敬的【变量】(女士或先生),您被邀请参加《【变量】》会议,请登录政协系统查看详情。(此短信无需回复)【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (510, 32, '会议邀请_132', '您于【变量】，下午【变量】在【变量】有一个会议，请准时参加！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (511, 33, '乔迁_133', '尊敬的合作伙伴：公司经过快速且稳健发展，特别是运营规模的不断扩大，原办公地点已不能满足公司发展需要。公司自【变量】年【变量】月【变量】日乔迁并入【变量】。欢迎各界朋友亲临指导！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (512, 33, '乔迁_134', '本公司已经搬离到新地址，新地址为：【变量】，敬请知悉。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (513, 34, '开业_135', '【变量】诚挚邀请您参加【变量】年【变量】月【变量】举行的新公司开业典礼，欢迎您前来参加！邀请函已发送至您的邮箱，请查收并及时回复我们。谢谢！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (514, 34, '开业_136', '您的福袋验证码是：【变量】用于【变量】开业惊喜福袋预定申请，请勿泄露。如非本人操作，请勿理会！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (515, 34, '开业_137', '【变量】诚挚邀请您参加【变量】年【变量】月【变量】日举行的新公司开业典礼，欢迎您前来参加！邀请函已发送至您的邮箱，请查收并及时回复我们。谢谢！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (516, 35, '放假通知_138', '放假通知：尊敬的【变量】您好，这里是【变量】，【变量】至【变量】进行放假调休，共【变量】天。【变量】开始正常工作。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (517, 35, '放假通知_139', '你好【变量】，【变量】放假时间为【变量】，【变量】。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (518, 35, '放假通知_140', '通知：【变量】放假【变量】天，【变量】正常上班，【变量】！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (519, 35, '放假通知_141', '亲爱的【变量】家长您好！【变量】放假【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (520, 36, '元旦_142', '岁岁年年节相似，年年岁岁人不同；勤勉廉洁重修行，德高行端受人敬；清廉过节要做到，两袖清风人称道。值此元旦来临之际，【变量】祝您及家人节日快乐，身体健康，工作顺利，家庭幸福！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (521, 36, '元旦_143', '尊敬的【变量】，在2017年即将到来之际，祝您新年快乐，家庭恒祥，泰安!【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (522, 36, '元旦_144', '预定了新年的第一缕阳光给你愿你健康幸福!第一缕月光给你愿你浪漫依然!第一声鹊鸣给你愿你好运不断!第一个晨曦给你愿你吉祥如意!【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (523, 36, '元旦_145', '尊敬的车主，在2017年即将到来之际，祝您新年快乐，家庭恒祥，泰安！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (524, 37, '春节_146', '您好【变量】！您订购的【变量】下单成功，因雨雪天气及春节快递停运的影响，客服会在年后和您电话核实订单发货情况，敬请谅解！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (525, 37, '春节_147', '尊敬的【变量】，您购买商品已下单成功，我们客服会再春节后【变量】与您致电联系确认订单并发货，谢谢。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (526, 37, '春节_148', '陛下，您的维修订单已预约成功，因公司春节放假，【变量】起所下订单将于【变量】按下单次序统一接单，陆续安排。带来不便，敬请谅解！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (527, 37, '春节_149', '您的新家装修预计花费【变量】元，专属客服代表将在24小时内与您联系，免费为您提供详细的装修咨询服务，请保持手机畅通。【变量】恭祝您阖家团圆，新春快乐！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (528, 37, '春节_150', '值此新春佳节来临之际，感谢您一年以来的陪伴，祝君新春快乐，【变量】！【变量】一路为您保驾护航【变量】（电话）【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (529, 37, '春节_151', '由于系统故障，今天早上9点10分向您发了一条关于\"仁安里\"车贴任务的短信，请忽略该短信；由于我们的工作的不足给您带来了困扰，非常抱歉。希望一路(16)有你,一起(17)前行，祝您新年快乐，生活愉快！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (530, 37, '春节_152', '尊敬的【变量】，春节期间，锦食送上海分部将于2016年2月1日至2月15日暂停营运，并于2月16日全面恢复。在此，给您带来不便深感抱歉。预祝您新春快乐，万事大吉！全新锦食送与您年后见。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (531, 37, '春节_153', '晨曦出现的第一缕阳光是我对您的深深祝福，夕阳收起的最后一抹嫣红是我对您的忠心问候。在除夕来临之际，送上我们真挚祝福：【变量】年快乐!【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (532, 37, '春节_154', '您的验证码是【变量】。请不要把验证码泄露给其他人。如非本人操作，可不用理会！【变量】祝您新年快乐，幸福安康！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (533, 37, '春节_155', '【变量】给您拜年来啦！您的私人健康管家温馨提示：最近一次健康体检结果显示肝功能异常，所以春节期间切勿大鱼大肉，要荤素搭配哦，喝酒、熬夜绝不可取，保肝护胃身体才健康哦。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (534, 37, '春节_156', '2017，与您一起整理好事务，打理好财务！【变量】全体同仁祝您在新的一年，大显神通，一通百通，万事亨通！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (535, 38, '预约_157', '您提交的预约申请已经受理，请在【变量】准时到【变量】办理。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (536, 38, '预约_158', '恭喜你预约成功！请在【变量】期间到达指定地址，如有疑问请登录【变量】或官网。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (537, 38, '预约_159', '预约看房信息：【变量】，联系方式【变量】，预约【变量】房源，预约时间为【变量】。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (538, 38, '预约_160', '您成功预约了【变量】房源，发布人：【变量】，联系方式：【变量】，预约时间为：【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (539, 38, '预约_161', '您接到乘客【变量】的城际拼车订单，预约时间：【变量】，出发地：【变量】，目的地：【变量】，人数：【变量】，详情可在我的订单查看。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (540, 38, '预约_162', '您接到乘客【变量】的同城货运订单，预约时间：【变量】，出发地：【变量】，目的地：【变量】，详情可在我的订单查看。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (541, 39, '中秋_163', '中秋佳节到了，中国首家知名艺人在线预约平台正式上线，我们祝您节日快乐，阖家欢乐，我们将给您提供一个便捷、保障的预约平台，期待与您邂逅！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (542, 39, '中秋_164', '亲爱的用户，中秋快乐！您的订单将在【变量】配送哦~【变量】给您优惠券，兑换码【变量】可至app或公众号兑换。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (543, 39, '中秋_165', '尊敬的【变量】客户：值此中秋佳节来临之际，【变量】全体员工恭祝您中秋快乐，阖家幸福！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (544, 40, '国庆_166', '亲爱的用户，国庆快乐！【变量】在【变量】休息哦~您的订单将在【变量】配送哦~【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (545, 40, '国庆_167', '【变量】祝您国庆节快乐！敬祝工作顺利，万事如意！服务热线【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (546, 41, '端午_168', '恭喜您获得:【变量】,兑换码:【变量】,【变量】恭祝您端午节快乐!客服咨询电话：【变量】【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (547, 42, '情人节_169', '恭喜您在【变量】（情人节 到店礼） 活动中成功抽取兑换券一张，请到商场入口服务台兑换纸质兑换券。您的验证码是：【变量】。请不要把验证码泄露给其他人。如非本人操作，可不用理会！【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
INSERT INTO `sys_template` VALUES (548, 42, '情人节_170', '恭喜您！获得情人节专属电影票两张，您的兑换码是【变量】，请您于【变量】当天前往【变量】（地址：【变量】）活动现场领票（时间：【变量】-【变量】），如有任何问题请致电【变量】，电话：【变量】。【变量】', '2018-08-03 15:11:26', '2018-08-03 15:11:26', 1, NULL);
COMMIT;

-- ----------------------------
-- Table structure for sys_template_type
-- ----------------------------
DROP TABLE IF EXISTS `sys_template_type`;
CREATE TABLE `sys_template_type` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_template_type
-- ----------------------------
BEGIN;
INSERT INTO `sys_template_type` VALUES (11, '用户注册');
INSERT INTO `sys_template_type` VALUES (12, '用户登录');
INSERT INTO `sys_template_type` VALUES (13, '忘记密码');
INSERT INTO `sys_template_type` VALUES (14, '信息变更');
INSERT INTO `sys_template_type` VALUES (15, '支付确认');
INSERT INTO `sys_template_type` VALUES (16, '活动确认');
INSERT INTO `sys_template_type` VALUES (17, '状态变更');
INSERT INTO `sys_template_type` VALUES (18, '改签');
INSERT INTO `sys_template_type` VALUES (19, '到账通知');
INSERT INTO `sys_template_type` VALUES (20, '到期提醒');
INSERT INTO `sys_template_type` VALUES (21, '积分兑换');
INSERT INTO `sys_template_type` VALUES (22, '面试通知');
INSERT INTO `sys_template_type` VALUES (23, '入职培训通知');
INSERT INTO `sys_template_type` VALUES (24, '会议通知');
INSERT INTO `sys_template_type` VALUES (25, '签到');
INSERT INTO `sys_template_type` VALUES (26, '审核结果');
INSERT INTO `sys_template_type` VALUES (27, '报名结果');
INSERT INTO `sys_template_type` VALUES (28, '服务开通');
INSERT INTO `sys_template_type` VALUES (29, '生日');
INSERT INTO `sys_template_type` VALUES (30, '新品发布会');
INSERT INTO `sys_template_type` VALUES (31, '团购');
INSERT INTO `sys_template_type` VALUES (32, '会议邀请');
INSERT INTO `sys_template_type` VALUES (33, '乔迁');
INSERT INTO `sys_template_type` VALUES (34, '开业');
INSERT INTO `sys_template_type` VALUES (35, '放假通知');
INSERT INTO `sys_template_type` VALUES (36, '元旦');
INSERT INTO `sys_template_type` VALUES (37, '春节');
INSERT INTO `sys_template_type` VALUES (38, '预约');
INSERT INTO `sys_template_type` VALUES (39, '中秋');
INSERT INTO `sys_template_type` VALUES (40, '国庆');
INSERT INTO `sys_template_type` VALUES (41, '端午');
INSERT INTO `sys_template_type` VALUES (42, '情人节');
COMMIT;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `dept_id` int(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `mobile` varchar(100) DEFAULT NULL,
  `status` tinyint(255) DEFAULT NULL,
  `user_id_create` bigint(255) DEFAULT NULL,
  `gmt_create` datetime DEFAULT CURRENT_TIMESTAMP,
  `gmt_modified` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `customer_id` bigint(20) DEFAULT NULL,
  `customer_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5245 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
BEGIN;
INSERT INTO `sys_user` VALUES (336, 'veesing', '', '1c395122e70310edc681d73f5e8b4d37', NULL, NULL, '19974845850', 1, 1, '2018-09-17 15:36:01', '2021-06-28 15:21:30', 336, NULL);
COMMIT;

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5319 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
BEGIN;
INSERT INTO `sys_user_role` VALUES (402, 336, 2);
COMMIT;

-- ----------------------------
-- Table structure for telephone_book
-- ----------------------------
DROP TABLE IF EXISTS `telephone_book`;
CREATE TABLE `telephone_book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `group_id` bigint(20) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `customer_id` bigint(20) DEFAULT NULL,
  `contact_name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `company_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=757447 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='通讯录';

-- ----------------------------
-- Records of telephone_book
-- ----------------------------
BEGIN;
INSERT INTO `telephone_book` VALUES (742111, 302, '2019-11-14 14:13:06', '131****0000', 336, NULL, NULL, NULL);
INSERT INTO `telephone_book` VALUES (742112, 302, '2019-11-14 14:13:06', '131****0000', 336, NULL, NULL, NULL);
INSERT INTO `telephone_book` VALUES (742113, 302, '2019-11-14 14:13:06', '131****0000', 336, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for telephone_book_group
-- ----------------------------
DROP TABLE IF EXISTS `telephone_book_group`;
CREATE TABLE `telephone_book_group` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `group_name` varchar(255) DEFAULT NULL,
  `customer_id` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3409 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='通讯录分组';

-- ----------------------------
-- Records of telephone_book_group
-- ----------------------------
BEGIN;
INSERT INTO `telephone_book_group` VALUES (302, '三网', 336, '2019-11-14 14:13:05', '');
COMMIT;

-- ----------------------------
-- Table structure for trigmsg_received
-- ----------------------------
DROP TABLE IF EXISTS `trigmsg_received`;
CREATE TABLE `trigmsg_received` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `rec_phone` varchar(255) DEFAULT NULL,
  `rec_content` varchar(255) DEFAULT NULL,
  `rec_time` datetime DEFAULT NULL,
  `sent_id` bigint(20) DEFAULT NULL,
  `customer_id` bigint(20) DEFAULT NULL,
  `task_id` varchar(255) DEFAULT NULL,
  `push_time` datetime DEFAULT NULL,
  `push_result` varchar(255) DEFAULT NULL,
  `create_user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of trigmsg_received
-- ----------------------------
BEGIN;
INSERT INTO `trigmsg_received` VALUES (1, '13042062697', '收到', '2020-10-18 10:02:53', 3367, 336, '3637825', NULL, NULL, 731);
INSERT INTO `trigmsg_received` VALUES (3, '13042062697', 'T', '2020-10-18 10:02:53', 3369, 336, '3637881', NULL, NULL, 731);
COMMIT;

-- ----------------------------
-- Table structure for trigmsg_sent
-- ----------------------------
DROP TABLE IF EXISTS `trigmsg_sent`;
CREATE TABLE `trigmsg_sent` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type` int(1) DEFAULT NULL,
  `amount` bigint(20) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `send_status` int(1) DEFAULT NULL,
  `send_time` datetime DEFAULT NULL,
  `create_user_id` bigint(20) DEFAULT NULL,
  `customer_id` bigint(20) DEFAULT NULL,
  `pro_id` bigint(20) DEFAULT NULL,
  `task_id` varchar(255) DEFAULT NULL,
  `port` varchar(20) DEFAULT NULL,
  `num_section` int(255) DEFAULT NULL,
  `province_city` varchar(255) DEFAULT NULL,
  `channel_id` bigint(20) DEFAULT NULL,
  `pass_id` bigint(20) DEFAULT NULL,
  `receipt_time` varchar(255) DEFAULT NULL,
  `receipt_code` varchar(255) DEFAULT NULL,
  `receipt_status` int(20) DEFAULT NULL,
  `talk_time` varchar(2) DEFAULT NULL,
  `push_time` datetime DEFAULT NULL,
  `push_result` varchar(255) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `content_length` int(11) DEFAULT NULL,
  `content_size` int(2) DEFAULT NULL,
  `tpl_id` bigint(20) DEFAULT NULL,
  `variable` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=55136 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of trigmsg_sent
-- ----------------------------
BEGIN;
INSERT INTO `trigmsg_sent` VALUES (188, 1, 1, '【中昱维信】您注册中昱验证码：1235。请不要把验证码泄露给其他人！15分钟内有效。20180925', '1580**06597', 1, '2018-09-26 09:23:34', NULL, 336, 1210, '3479375', NULL, NULL, '上海-上海', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for trigmsg_template
-- ----------------------------
DROP TABLE IF EXISTS `trigmsg_template`;
CREATE TABLE `trigmsg_template` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_id` bigint(20) NOT NULL,
  `tpl_type` int(2) DEFAULT NULL,
  `tpl_name` varchar(50) DEFAULT NULL,
  `tpl_content` varchar(255) DEFAULT NULL,
  `tpl_status` int(1) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `modify_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_user_id` bigint(20) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `opinion` varchar(255) DEFAULT NULL,
  `identify_user_id` bigint(20) DEFAULT NULL,
  `identify_time` datetime DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `pd_type` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1062 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of trigmsg_template
-- ----------------------------
BEGIN;
INSERT INTO `trigmsg_template` VALUES (72, 336, 11, '用户注册_2', '【中昱维信】您注册【变量】验证码：【变量】。请不要把验证码泄露给其他人！15分钟内有效。【变量】', 1, '2020-09-25 10:28:14', '2021-06-29 10:33:58', 367, '', '', NULL, NULL, NULL, 1);
INSERT INTO `trigmsg_template` VALUES (74, 336, 11, '用户注册_1', '【中昱维信】您手机注册的验证码为：【变量】，如有问题请拨打客服电话：【变量】', 1, '2020-09-25 10:28:14', '2021-06-29 10:34:03', 367, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `trigmsg_template` VALUES (75, 336, 11, '用户注册', '【中昱维信】您好，您的验证码是【变量】，请妥善保管。', 1, '2018-09-26 09:31:39', '2021-06-29 10:34:03', 367, '', '', NULL, NULL, NULL, 1);
INSERT INTO `trigmsg_template` VALUES (76, 336, 11, '订单通知', '【中昱维信】尊敬的用户，您购买的【变量】，已成功发货，物流公司为【变量】，快递单号为【变量】，敬请查收。', 1, '2018-09-26 09:38:58', '2021-06-29 10:34:03', 367, '', '', NULL, NULL, NULL, 1);
INSERT INTO `trigmsg_template` VALUES (702, 336, 11, NULL, '【中昱维信】您的验证码是【变量】', 1, '2020-02-10 15:51:20', '2021-06-29 10:34:29', 367, NULL, '内容不合规', 1, '2020-02-10 15:51:44', '127.0.0.1', 2);
INSERT INTO `trigmsg_template` VALUES (703, 336, 11, NULL, '【中昱文化】您的验证码是【变量】', 1, '2020-10-21 16:56:36', '2021-06-29 10:34:32', 367, NULL, NULL, 1, '2020-10-21 17:01:57', '127.0.0.1', 1);
COMMIT;

-- ----------------------------
-- Procedure structure for test
-- ----------------------------
DROP PROCEDURE IF EXISTS `test`;
delimiter ;;
CREATE PROCEDURE `test`()
BEGIN
    DECLARE  v_id BIGINT(20);
    DECLARE  v_customerId  BIGINT(20);
    DECLARE  v_pdType  int(20);


    DECLARE done INT DEFAULT FALSE;

    DECLARE cur_account CURSOR FOR   SELECT c.id FROM vs_customer  c   WHERE c.company_name LIKE  "%咚咚%";


    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;


    OPEN  cur_account;

    read_loop: LOOP

            FETCH  NEXT from cur_account INTO v_id;
            IF done THEN
                LEAVE read_loop;
             END IF;


         UPDATE sys_security s SET s.`value` ='http://dd.veesing.com/ding/receipt' WHERE s.pd_type = 3 AND s.type =1 and  s.customer_id = v_id;
					UPDATE sys_security s SET s.`value` ='http://dd.veesing.com/ding/reply' WHERE s.pd_type = 3 AND s.type =2  and s.customer_id = v_id;


					UPDATE sys_security s SET s.`value` ='http://dd.veesing.com/ding/receipt' WHERE s.pd_type = 5 AND s.type =1 and  s.customer_id = v_id;
            UPDATE sys_security s SET s.`value` ='http://dd.veesing.com/ding/reply' WHERE s.pd_type = 5 AND s.type =2  and s.customer_id = v_id;



          UPDATE sys_security s SET s.`value` ='http://dd.veesing.com/ding/mms/receipt' WHERE s.pd_type = 4 AND s.type =1  and s.customer_id = v_id;
        UPDATE sys_security s SET s.`value` ='http://dd.veesing.com/ding/mms/reply' WHERE s.pd_type = 4 AND s.type =2 and  s.customer_id = v_id;

       UPDATE sys_security s SET s.`value` ='http://dd.veesing.com/ding/mms/receipt' WHERE s.pd_type = 7 AND s.type =1  and s.customer_id = v_id;
        UPDATE sys_security s SET s.`value` ='http://dd.veesing.com/ding/mms/reply' WHERE s.pd_type = 7 AND s.type =2  and s.customer_id = v_id;
    END LOOP;


    CLOSE cur_account;
END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
