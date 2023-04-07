package sky.pro.examiner.services;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import sky.pro.examiner.entities.Question;


@ContextConfiguration(classes = {MathExaminerService.class})
@ExtendWith(SpringExtension.class)
public class MathExaminerServiceTest extends JavaExaminerServiceTest implements ExaminerServiceTest {
    @Autowired
    @Qualifier("mathExaminerService")
    private ExaminerService examinerService;
    @MockBean
    @Qualifier("mathService")
    private QuestionService questionService;

    Question q = new Question("52","пятдесят два");
}


