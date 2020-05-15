INSERT INTO `fms`.`feed_back_questions` (`ques_id`, `question`, `feedback_type`) 
VALUES ('1', 'How do you rate the overall event ?', 'Participated');

INSERT INTO `fms`.`feed_back_questions` (`ques_id`, `question`, `feedback_type`) 
VALUES ('2', 'What did you like about this volunteering activity ?', 'Participated');

INSERT INTO `fms`.`feed_back_questions` (`ques_id`, `question`, `feedback_type`) 
VALUES ('3', 'What can be improved in this volunteering activity ?', 'Participated');

INSERT INTO `fms`.`feed_back_questions` (`ques_id`, `question`, `feedback_type`) 
VALUES ('4', 'Reason for not joining the event : ', 'Not participated');

INSERT INTO `fms`.`feed_back_questions` (`ques_id`, `question`, `feedback_type`)
VALUES ('5', 'Please share your feedback for unregistering from the event', 'Unregistered');



INSERT INTO `fms`.`feed_back_answers` (`ans_id`, `ques_id`, `question`, `answer`, 
`user_id`) VALUES 
('1', '1', 'How do you rate the overall event ?', '5-excellent', '858373');
