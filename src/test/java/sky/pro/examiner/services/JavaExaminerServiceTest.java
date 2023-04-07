package sky.pro.examiner.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import sky.pro.examiner.entities.Question;

import java.util.Collection;
import java.util.HashSet;


import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {JavaExaminerService.class})
@ExtendWith(SpringExtension.class)
public class JavaExaminerServiceTest {
    @Autowired
    @Qualifier("javaExaminerService")
    private ExaminerService examinerService;
    @MockBean
    @Qualifier("javaService")
    private QuestionService questionService;

    Question q = new Question("55","пятдесят пять");
    Collection<Question> questions = new HashSet<>();
    @Test
    void getQuestions_success(){
        questions.add(q);
        when(questionService.getRandom()).thenReturn(q);
        when(questionService.getAll()).thenReturn(questions);
        Assertions.assertEquals(examinerService.getQuestions(1),questions);
        Assertions.assertEquals(examinerService.getQuestions(3),questions);
    }
}
