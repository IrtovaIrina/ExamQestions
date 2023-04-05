package sky.pro.examiner.repositories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sky.pro.examiner.entities.Question;
import sky.pro.examiner.exception.QuestionNotFoundException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathQuestionRepositoryTest {
    MathQuestionRepository out = new MathQuestionRepository();
    Question q = new Question("55","пятдесят пять");
    Question q2 = new Question("22","двадцать два");
    @Test
    void addQuestionWithQuestionAndAnswer_success(){
        Assertions.assertEquals(out.questionAdd(new Question("55","пятдесят пять")),q);
        Assertions.assertTrue(out.getAll().contains(q));
    }
    @Test
    void addQuestionWithQuestion_success(){
        Assertions.assertEquals(out.questionAdd(q2),q2);
        out.questionAdd(q2);
        Assertions.assertTrue(out.getAll().contains(q2));
    }
    @Test
    void questionRemove_success(){
        out.questionAdd(q);
        Assertions.assertEquals(out.questionRemove(q),q);
        Assertions.assertFalse(out.getAll().contains(q));
    }

    @Test
    void questionFind_success() {
        out.questionAdd(q);
        Assertions.assertEquals(out.questionFind(q), q);
        Assertions.assertTrue(out.getAll().contains(q));
    }
    @Test
    void questionRemove_WithQuestionNotFoundException(){
        assertThrows(QuestionNotFoundException.class,
                () -> { out.questionRemove(q);
                });
    }

    @Test
    void questionFind_WithQuestionNotFoundException() {
        assertThrows(QuestionNotFoundException.class,
                () -> { out.questionRemove(q);
                });
    }

}
