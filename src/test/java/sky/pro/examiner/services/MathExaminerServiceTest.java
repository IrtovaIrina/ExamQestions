package sky.pro.examiner.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Qualifier;
import sky.pro.examiner.entities.Question;

import java.util.Collection;
import java.util.HashSet;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MathExaminerServiceTest {
    @Mock
    private QuestionService questionService;
    @InjectMocks
    private MathExaminerService out;


    int amount = 5;
    @Test
    void getQuestions_success(){
        Question question = new Question("23","двадцать три");
        Collection<Question> set= new HashSet<>();
        set.add(question);
        when(questionService.getRandom()).thenReturn(question);
        int size = out.getQuestions(amount).size();
        Assertions.assertEquals(out.getQuestions(amount),set);
    }
}
