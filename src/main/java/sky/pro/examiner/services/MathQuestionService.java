package sky.pro.examiner.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sky.pro.examiner.entities.Question;
import sky.pro.examiner.repositories.QuestionRepository;
import java.util.Collection;
import java.util.Random;
@Service("mathService")
public class MathQuestionService implements QuestionService{
    QuestionRepository repository;

    public MathQuestionService(@Qualifier("mathRepository") QuestionRepository repository) {
        this.repository = repository;
    }
    @Override
    public Question questionAdd(String question, String answer) {
        return repository.questionAdd(question,answer);
    }

    @Override
    public Question questionAdd(Question question) {
        return repository.questionAdd(question);
    }

    @Override
    public Question questionRemove(Question question) {
        return repository.questionRemove(question);
    }
    @Override
    public Question questionFind(Question question) {
        return repository.questionFind(question);
    }

    @Override
    public Collection<Question> getAll() {
        return repository.getAll();
    }

    @Override
    public Question getRandom() {
        Random random = new Random();
        int r = random.nextInt(getAll().size());
        return (Question)getAll().toArray()[r];
    }
}
