
package sky.pro.examiner.services;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import sky.pro.examiner.repositories.QuestionRepository;


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

