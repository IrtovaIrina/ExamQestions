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
import sky.pro.examiner.repositories.QuestionRepository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {JavaQuestionService.class})
@ExtendWith(SpringExtension.class)

public class JavaQuestionServiceTest {
    @Autowired
    @Qualifier("javaService")
    private QuestionService questionService;
    @MockBean
    @Qualifier("javaRepository")
    private QuestionRepository repository;

    Question q = new Question("55","пятдесят пять");
    Question q2 = new Question("22","двадцать два");
    private Set<Question> questions = new HashSet<>();

    @Test
    void questionAddWithQuestionAndAnswer_success(){
        when(repository.questionAdd(q)).thenReturn(q);
        Assertions.assertEquals(questionService.questionAdd(new Question("55","пятдесят пять")),q);
    }
    @Test
    void questionAdd_success(){
        when(repository.questionAdd(q)).thenReturn(q);
        Assertions.assertEquals(questionService.questionAdd(q),q);
    }
    @Test
    void questionFind_success(){
        when(repository.questionFind(q)).thenReturn(q);
        Assertions.assertEquals(questionService.questionFind(q),q);
    }
    @Test
    void questionRemove_success(){
        when(repository.questionRemove(q)).thenReturn(q);
        Assertions.assertEquals(questionService.questionRemove(q),q);
    }
    @Test
    void getAll_success(){
        questions.add(q);
        questions.add(q2);
        when(repository.getAll()).thenReturn(questions);
        Assertions.assertEquals(questionService.getAll(),questions);
    }
}
