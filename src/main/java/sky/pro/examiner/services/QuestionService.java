package sky.pro.examiner.services;

import sky.pro.examiner.entities.Question;

import java.util.Collection;

public interface QuestionService {
    Question questionAdd(String question, String answer);
    Question questionAdd(Question question);
    Question questionRemove(Question question);
    Collection<Question> getAll();
    Question getRandom();

}
