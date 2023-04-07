package sky.pro.examiner.repositories;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import sky.pro.examiner.entities.Question;


import java.util.HashSet;
import java.util.Set;
@Repository("mathRepository")
public class MathQuestionRepository extends JavaQuestionRepository implements QuestionRepository {
    private Set<Question> questions = new HashSet<>();
    @PostConstruct
    private void init(){
        questions.add(new Question("1 + 1","два"));
        questions.add(new Question("2 + 1","три"));
        questions.add(new Question("3 + 1","четыре"));
        questions.add(new Question("4 + 1","пять"));
        questions.add(new Question("5 + 1","шесть"));
    }

}
