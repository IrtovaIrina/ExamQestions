package sky.pro.examiner.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sky.pro.examiner.entities.Question;
import sky.pro.examiner.exception.QuestionOutOfIndexException;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

@Service("javaExaminerService")
public class JavaExaminerService implements ExaminerService {
    private Random random = new Random();
    private final QuestionService questionService;

    public JavaExaminerService(@Qualifier("javaService") QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (questionService.getAll().size() < amount) {
            throw new QuestionOutOfIndexException("Количество вопросов: " + questionService.getAll().size() + ".");

        } else {
            Collection<Question> collection = new HashSet<>();
            while (collection.size() != amount) {
                collection.add(questionService.getRandom());
            }
            return collection;
        }
    }
}
