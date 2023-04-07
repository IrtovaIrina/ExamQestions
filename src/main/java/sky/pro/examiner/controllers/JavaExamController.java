package sky.pro.examiner.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import sky.pro.examiner.entities.Question;
import sky.pro.examiner.services.ExaminerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaExamController {

    private final ExaminerService service;

    @Autowired
    public JavaExamController(@Qualifier("javaExaminerService") ExaminerService service) {
        this.service = service;
    }

    @GetMapping("/{amount}")
    public Collection<Question> getQuestions(@PathVariable("amount") int amount) {
        return service.getQuestions(amount);
    }

}
