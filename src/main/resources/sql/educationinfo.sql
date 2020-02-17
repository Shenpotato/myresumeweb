DROP TABLE IF EXISTS `educationinfo`;
CREATE TABLE `educationinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `startdate` DATE DEFAULT NULL,
  `enddate` DATE DEFAULT NULL,
  `school` varchar(255) DEFAULT NULL,
  `major` varchar(255) DEFAULT NULL,
  `educationlevel` varchar(255) DEFAULT NULL,
  `owner` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;