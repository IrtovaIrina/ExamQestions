package sky.pro.examiner.repositories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sky.pro.examiner.entities.Question;
import sky.pro.examiner.exception.QuestionNotFoundException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class JavaQuestionRepositoryTest implements QuestionRepositoryTest{
    JavaQuestionRepository out = new JavaQuestionRepository();
    Question q = new Question("55","пятдесят пять");
    Question q2 = new Question("22","двадцать два");
    @Test
    public void addQuestionWithQuestionAndAnswer_success(){
        Assertions.assertEquals(out.questionAdd(new Question("55","пятдесят пять")),q);
        Assertions.assertTrue(out.getAll().contains(q));
    }
    @Test
    public void addQuestionWithQuestion_success(){
        Assertions.assertEquals(out.questionAdd(q2),q2);
        out.questionAdd(q2);
        Assertions.assertTrue(out.getAll().contains(q2));
    }
    @Test
    public void questionRemove_success(){
        out.questionAdd(q);
        Assertions.assertEquals(out.questionRemove(q),q);
        Assertions.assertFalse(out.getAll().contains(q));
    }

    @Test
    public void questionFind_success() {
        out.questionAdd(q);
        Assertions.assertEquals(out.questionFind(q), q);
        Assertions.assertTrue(out.getAll().contains(q));
    }
    @Test
    public void questionRemove_WithQuestionNotFoundException(){
        assertThrows(QuestionNotFoundException.class,
                () -> { out.questionRemove(q);
                });
    }

    @Test
    public void questionFind_WithQuestionNotFoundException() {
        assertThrows(QuestionNotFoundException.class,
                () -> {
                    out.questionRemove(q);
                });
    }
}
