CREATE  TABLE `fms`.`feed_back_questions` (
  `ques_id` INT NOT NULL AUTO_INCREMENT ,
  `question` VARCHAR(200) NULL ,
  `feedback_type` VARCHAR(60) NULL,
  PRIMARY KEY (`ques_id`) 
)ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1$$


CREATE  TABLE `fms`.`feed_back_answers` (
  `ans_id` INT NOT NULL AUTO_INCREMENT ,
  `ques_id` INT NULL ,
  `question` VARCHAR(200) NULL ,
  `answer` VARCHAR(200) NULL ,
  `user_id` BIGINT NULL ,
  PRIMARY KEY (`ans_id`) );


