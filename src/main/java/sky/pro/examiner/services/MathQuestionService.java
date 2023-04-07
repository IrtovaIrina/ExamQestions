package sky.pro.examiner.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sky.pro.examiner.entities.Question;
import sky.pro.examiner.repositories.QuestionRepository;
import java.util.Collection;
import java.util.Random;
@Service("mathService")
public class MathQuestionService extends JavaQuestionService implements QuestionService{
    QuestionRepository repository;

    public MathQuestionService(@Qualifier("mathRepository") QuestionRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
