
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
import sky.pro.examiner.repositories.QuestionRepositoryTest;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {MathQuestionService.class})
@ExtendWith(SpringExtension.class)

public class MathQuestionServiceTest extends JavaQuestionServiceTest implements QuestionServiceTest {
    @Autowired
    @Qualifier("mathService")
    private QuestionService questionService;
    @MockBean
    @Qualifier("mathRepository")
    private QuestionRepository repository;
}

