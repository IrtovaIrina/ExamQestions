package sky.pro.examiner.controllers;

import sky.pro.examiner.entities.Question;
import sky.pro.examiner.services.ExaminerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class ExamController {

    private final ExaminerService service;

    @Autowired
    public ExamController(ExaminerService service) {
        this.service = service;
    }
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        return String.format("%s %s", HttpStatus.BAD_REQUEST.value(), e.getMessage());
    }

    @GetMapping("/exam/get/{amount}")
    public Collection<Question> getQuestions(@PathVariable("amount") int amount) {
        return service.getQuestions(amount);
    }

}
