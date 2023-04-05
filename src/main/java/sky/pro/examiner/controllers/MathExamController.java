package sky.pro.examiner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sky.pro.examiner.entities.Question;
import sky.pro.examiner.services.ExaminerService;

import java.util.Collection;

@RestController
@RequestMapping("/exam/math")
public class MathExamController {
    private final ExaminerService service;

    @Autowired
    public MathExamController(@Qualifier("mathExaminerService") ExaminerService service) {
        this.service = service;
    }

    @GetMapping("/{amount}")
    public Collection<Question> getQuestions(@PathVariable("amount") int amount) {
        return service.getQuestions(amount);
    }

}
