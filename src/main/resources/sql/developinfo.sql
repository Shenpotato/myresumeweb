DROP TABLE IF EXISTS `developinfo`;
CREATE TABLE `developinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `startdate` DATE DEFAULT NULL,
  `enddate` DATE DEFAULT NULL,
  `projectname` varchar(255) DEFAULT NULL,
  `projectContents` varchar(1000) DEFAULT NULL,
  `owner` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;