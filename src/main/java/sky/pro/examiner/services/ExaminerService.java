package sky.pro.examiner.services;

import sky.pro.examiner.entities.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
