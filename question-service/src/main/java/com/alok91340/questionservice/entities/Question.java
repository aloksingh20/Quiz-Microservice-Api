package com.alok91340.questionservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String questionName;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String category;
	private String difficultyLevel;
	
	private String answer;

}
