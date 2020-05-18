CREATE TABLE `event` (
  `event_no` int(11) NOT NULL AUTO_INCREMENT,
  `event_id` varchar(45) DEFAULT NULL,
  `base_location` varchar(45) DEFAULT NULL,
  `beneficiary_name` varchar(100) DEFAULT NULL,
  `council_name` varchar(45) DEFAULT NULL,
  `event_name` varchar(100) DEFAULT NULL,
  `event_description` varchar(200) DEFAULT NULL,
  `event_date` date DEFAULT NULL,
  `emp_id` bigint(20) DEFAULT NULL,
  `emp_name` varchar(45) DEFAULT NULL,
  `volunteer_hours` int(11) DEFAULT NULL,
  `travel_hours` int(11) DEFAULT NULL,
  `lives_impacted` int(11) DEFAULT NULL,
  `business_unit` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `iiep_category` varchar(45) DEFAULT NULL,
  `summary_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`event_no`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1$$
delimiter $$

