/*
Navicat MySQL Data Transfer

Source Server         : yancey
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : yancey

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-07-01 15:23:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminId` varchar(50) NOT NULL,
  `adminPwd` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`adminId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('admin', 'admin');

-- ----------------------------
-- Table structure for advertisement
-- ----------------------------
DROP TABLE IF EXISTS `advertisement`;
CREATE TABLE `advertisement` (
  `adId` int(11) NOT NULL,
  `adTitle` varchar(255) DEFAULT NULL,
  `adIntroduction` varchar(255) DEFAULT NULL,
  `adContent` varchar(255) DEFAULT NULL,
  `adPicture` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`adId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of advertisement
-- ----------------------------
INSERT INTO `advertisement` VALUES ('1', '2016草莓音乐节--天津站', '“草莓音乐节”是国内音乐厂牌摩登天空继“摩登天空音乐节”之后，于2009年创办的另一音乐节品牌，比之“摩登天空音乐节”，“草莓”的气质更为多元，更具有春天、浪漫、爱的特质', '<p>&nbsp;</p>\r\n\r\n<h1>呵呵哒</h1>\r\n\r\n<p><s>呵呵哒</s></p>\r\n\r\n<p style=\"text-align:center\">呵呵哒</p>\r\n\r\n<p style=\"text-align:center\">&nbsp;</p>\r\nrefre', 'image-54.jpg');
INSERT INTO `advertisement` VALUES ('2', '中国新歌声——国庆特辑', '在鸟巢总决赛的最后战役打响之前，“新歌声”四大导师那英、汪峰、哈林、周杰伦携14位人气学员唱响澳门，在澳门威尼斯人金光综艺馆上演了最后一次欢乐的聚会。享受舞台的同时，导师和学员们也为年度“最佳战队”的荣誉而战。', 'http://dr.com', 'image-56.jpg');
INSERT INTO `advertisement` VALUES ('3', '小娟和山谷里的居民', '城市中的吟唱，山谷里的声音。清新自然的音乐风格，无为而为的歌唱态度，简单质朴的生活观念，在创作民谣领域辛勤耕耘，以现场演出的良好口碑和民间口口相传的力量，得到众多聆听者的喜爱。', 'http://dr.com', 'image-55.jpg');
INSERT INTO `advertisement` VALUES ('4', '致敬——永远的Beyond', 'Life is not what you have gained but what you have done! (生命不在乎得到什么 只在乎做过什么)', 'http://dr.com', 'image-53.jpg');
INSERT INTO `advertisement` VALUES ('5', '友情の賛助', '在全新绿箭无糖薄荷糖，清新口气，不留痕迹。', 'http://dr.com', 'image-57.jpg');

-- ----------------------------
-- Table structure for euus
-- ----------------------------
DROP TABLE IF EXISTS `euus`;
CREATE TABLE `euus` (
  `euusId` int(11) NOT NULL,
  `euusTitle` varchar(255) DEFAULT NULL,
  `euusMusic` varchar(255) DEFAULT NULL,
  `euusPicture` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`euusId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of euus
-- ----------------------------
INSERT INTO `euus` VALUES ('1', 'Adele - Rolling In The Deep', 'g-in-the-deep-adele.mp3', 'adele.jpg');
INSERT INTO `euus` VALUES ('2', 'Bruno - When I Was Your Man', 'when-i-was-your-man-bruno-mars.mp3', 'bruno-mars.jpg');
INSERT INTO `euus` VALUES ('3', 'BSB - Everything But Mine', 'Everything But Mine.mp3', 'bsb.jpg');
INSERT INTO `euus` VALUES ('4', 'Eminem - Love The Way You Lie(Rihanna Ft)', 'love-the-way-you-lie-rihanna-feat-eminem.mp3', 'eminem.jpg');
INSERT INTO `euus` VALUES ('5', 'Linkin Park - Numb', 'Linkin Park - Numb.mp3', 'linkin-park.jpg');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` varchar(255) NOT NULL,
  `userPwd` varchar(255) DEFAULT NULL,
  `userEmail` varchar(255) DEFAULT NULL,
  `userTel` varchar(255) DEFAULT NULL,
  `userBirthday` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('', '', '', '', '');
INSERT INTO `user` VALUES ('11111111', '111', '111', '123@123.com', 'tttt');
INSERT INTO `user` VALUES ('123', '1234', '1234', '1@qq.com', '0131');
INSERT INTO `user` VALUES ('1233', '111', '111', '1@qq.com', '8887');
INSERT INTO `user` VALUES ('1234', '123', '123', '1@qq.com', '3222');
INSERT INTO `user` VALUES ('1234323543', '1234', '1234', '1@qq.com', '4444');
INSERT INTO `user` VALUES ('142', '111', '111', '1@qq.com', '7777');
INSERT INTO `user` VALUES ('222', '123', '123', '1@qq.com', '1111');
INSERT INTO `user` VALUES ('333', '', '', '', '');
INSERT INTO `user` VALUES ('4444', '1234', '1234', '1@qq.com', '1111');
INSERT INTO `user` VALUES ('444y', '123', '123', '1@qq.com', '1111');
INSERT INTO `user` VALUES ('5435', '333', '333', '123@123.com', 'rrrr');
INSERT INTO `user` VALUES ('7086', '33333', '33333', '1@qq.com', '0544');
INSERT INTO `user` VALUES ('777', '777', '777', '2@qq.com', '7777');
INSERT INTO `user` VALUES ('888', '1234', '1234', '1@qq.com', '1111');
INSERT INTO `user` VALUES ('8989', '888', '888', '1@qq.com', '2222');
INSERT INTO `user` VALUES ('99999', '123', '123', '1@qq.com', '1111');
INSERT INTO `user` VALUES ('999999', '999', '999', '123@123.com', '9999');
INSERT INTO `user` VALUES ('9999999', '999', '999', '1@qq.com', '2222');
INSERT INTO `user` VALUES ('aaaa', '123', '123', '123@123.com', '2222');
INSERT INTO `user` VALUES ('asfs', '123', '123', '1@qq.com', '2222');
INSERT INTO `user` VALUES ('bbbb', 'bbb', 'bbb', 'a@11.com', '1111');
INSERT INTO `user` VALUES ('eee', '123', '123', '1@qq.com', '1111');
INSERT INTO `user` VALUES ('rrrrrrr', '123', '123', '1@qq.com', '3333');
INSERT INTO `user` VALUES ('wwww', 'wwww', 'wwww', '1@qq.com', 'wwww');
INSERT INTO `user` VALUES ('yyyyy', '123', '123', '1@qq.com', '2222');
INSERT INTO `user` VALUES ('zzzzzzzza', '111', '111', '1@qq.com', '2212');
INSERT INTO `user` VALUES ('zzzzzzzzzz', '123', '123', '1@qq.com', '2222');
