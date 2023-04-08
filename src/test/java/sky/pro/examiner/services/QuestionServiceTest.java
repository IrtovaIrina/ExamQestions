package sky.pro.examiner.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sky.pro.examiner.entities.Question;

import static org.mockito.Mockito.when;

public interface QuestionServiceTest {
    void questionAddWithQuestionAndAnswer_success();

    void questionAdd_success();

    void questionFind_success();

    void questionRemove_success();

    void getAll_success();
}
