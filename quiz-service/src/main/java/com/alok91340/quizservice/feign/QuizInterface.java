package com.alok91340.quizservice.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.alok91340.quizservice.entities.QuestionWrapper;
import com.alok91340.quizservice.entities.Response;


@FeignClient("QUESTION-SERVICE")
public interface QuizInterface {
	
	@GetMapping("api/question/generate")
	public ResponseEntity<List<Integer> >getQuestionsForQuiz(@RequestParam String category, @RequestParam int numQ);
	
	@PostMapping("api/question/getQuestions")
	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> ids);
	
	@PostMapping("api/question/getScore")
	public ResponseEntity<Integer> getScore(@RequestBody List<Response> response);

}
