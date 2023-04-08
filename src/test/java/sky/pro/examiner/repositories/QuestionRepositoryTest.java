package sky.pro.examiner.repositories;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public interface QuestionRepositoryTest {
    void addQuestionWithQuestionAndAnswer_success();

    void addQuestionWithQuestion_success();

    void questionRemove_success();

    void questionFind_success();

    void questionRemove_WithQuestionNotFoundException();

    void questionFind_WithQuestionNotFoundException();
}
