DROP TABLE IF EXISTS `developinfo`;
CREATE TABLE `developinfo` (
  `id` int(11),
  `personalstatement` varchar(1000) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `startdate` DATE DEFAULT NULL,
  `enddate` DATE DEFAULT NULL,

  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phonenumber` varchar(255) DEFAULT NULL,
  `school` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;