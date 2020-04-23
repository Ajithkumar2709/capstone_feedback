package com.feedback.domain;

import reactor.core.publisher.Flux;

public class QuestionsModel {
	
	private Long questionId;
	
	private String questionName;
	
	private Flux<AnswersModel> answersModel;

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public Flux<AnswersModel> getAnswersDTO() {
		return answersModel;
	}

	public void setAnswersDTO(Flux<AnswersModel> answersModel) {
		this.answersModel = answersModel;
	}

	public QuestionsModel(Long questionId, String questionName,
			Flux<AnswersModel> answersModel) {
		super();
		this.questionId = questionId;
		this.questionName = questionName;
		this.answersModel = answersModel;
	}

	public QuestionsModel() {
		super();
	}
	
	

}
