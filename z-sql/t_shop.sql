/*
Navicat MySQL Data Transfer

Source Server         : 130
Source Server Version : 50640
Source Host           : 192.168.19.130:3306
Source Database       : lcn-b

Target Server Type    : MYSQL
Target Server Version : 50640
File Encoding         : 65001

Date: 2018-12-14 09:47:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_shop
-- ----------------------------
DROP TABLE IF EXISTS `t_shop`;
CREATE TABLE `t_shop` (
  `id` varchar(64) NOT NULL,
  `name` varchar(64) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `number` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_shop
-- ----------------------------
INSERT INTO `t_shop` VALUES ('1001', '飞机', '10000.00', '-50');
