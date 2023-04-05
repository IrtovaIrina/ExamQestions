package sky.pro.examiner.repositories;

import sky.pro.examiner.entities.Question;
import java.util.Collection;

public interface QuestionRepository {
    Question questionAdd(String question, String answer);
    Question questionAdd(Question question);
    Question questionRemove(Question question);
    Collection<Question> getAll();
    Question questionFind(Question question);

}
