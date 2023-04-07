package sky.pro.examiner.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sky.pro.examiner.entities.Question;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
@Service("mathExaminerService")
public class MathExaminerService extends JavaExaminerService implements ExaminerService{
    private Random random = new Random();
    private final QuestionService questionService;

    public MathExaminerService(@Qualifier("mathService") QuestionService questionService) {
        super(questionService);
        this.questionService = questionService;
    }
}
