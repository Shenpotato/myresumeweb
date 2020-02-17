DROP TABLE IF EXISTS `schoolinfo`;
CREATE TABLE `schoolinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `startdate` DATE DEFAULT NULL,
  `enddate` DATE DEFAULT NULL,
  `orginazationname` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `activitycontents` varchar(1000) DEFAULT NULL,
  `owner` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;