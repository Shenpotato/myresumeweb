DROP TABLE IF EXISTS `basicinfo`;
CREATE TABLE `basicinfo` (
  `id` int(11),
  `personalstatement` varchar(1000) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `birth` DATE DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phonenumber` varchar(255) DEFAULT NULL,
  `school` varchar(255) DEFAULT NULL,
  `photoaddr` varchar(255) DEFAULT NULL,
  `englishlevel` varchar(255) DEFAULT NULL,
  `hobby` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;