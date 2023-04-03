package sky.pro.examiner.services;

import org.springframework.beans.factory.annotation.Qualifier;
import sky.pro.examiner.entities.Question;
import org.springframework.stereotype.Service;
import sky.pro.examiner.repositories.JavaQuestionRepository;
import sky.pro.examiner.repositories.QuestionRepository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
@Service("javaService")
public class JavaQuestionService implements QuestionService{
    private QuestionRepository repository;

    public JavaQuestionService(@Qualifier("javaRepository") QuestionRepository repository) {
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
