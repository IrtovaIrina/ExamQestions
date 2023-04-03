package sky.pro.examiner.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import sky.pro.examiner.entities.Question;
import sky.pro.examiner.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {

    private final QuestionService service;

    @Autowired
    public JavaQuestionController(@Qualifier("javaService")QuestionService service) {
        this.service = service;
    }
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        return String.format("%s %s", HttpStatus.BAD_REQUEST.value(), e.getMessage());
    }

    @GetMapping("/add")
    public Question addQuestion(@RequestParam("answer") String answer, @RequestParam("question") String question) {
        return service.questionAdd(answer,question);
    }
    @GetMapping
    public Collection<Question> getQuestion() {
        return service.getAll();
    }
    @GetMapping("/employee/contains")
    public Question removeQuestion(@RequestParam("answer") String answer, @RequestParam("question") String question) {
        return service.questionRemove(new Question(answer,question));
    }

}