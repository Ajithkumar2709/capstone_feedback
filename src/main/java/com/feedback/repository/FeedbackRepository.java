package com.feedback.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.feedback.domain.FeedbackModel;


public interface FeedbackRepository extends ReactiveCrudRepository<FeedbackModel, Long>{

}
