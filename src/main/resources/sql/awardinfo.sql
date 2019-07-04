DROP TABLE IF EXISTS `awardinfo`;
CREATE TABLE `awardinfo` (
  `id` int(11),
  `date` DATE DEFAULT NULL,
  `awardname` varchar(255) DEFAULT NULL,
  `awardlevel` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;