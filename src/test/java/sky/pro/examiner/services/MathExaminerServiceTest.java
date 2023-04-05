package sky.pro.examiner.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import sky.pro.examiner.entities.Question;
import sky.pro.examiner.repositories.QuestionRepository;

import java.util.Collection;
import java.util.HashSet;

import static org.mockito.Mockito.when;
@ContextConfiguration(classes = {MathExaminerService.class})
@ExtendWith(MockitoExtension.class)
public class MathExaminerServiceTest {
    @Autowired
    @Qualifier("mathExaminerService")
    private ExaminerService examinerService;
    @MockBean
    @Qualifier("mathService")
    private QuestionService questionService;


    int amount = 5;
    @Test
    void getQuestions_success(){
        Question question = new Question("23","двадцать три");
        Collection<Question> set= new HashSet<>();
        set.add(question);
        when(questionService.getRandom()).thenReturn(question);
        int size = examinerService.getQuestions(amount).size();
        Assertions.assertEquals(examinerService.getQuestions(amount),set);
    }
}
