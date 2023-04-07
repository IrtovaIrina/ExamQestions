package sky.pro.examiner.repositories;

import sky.pro.examiner.entities.Question;

public class MathQuestionRepositoryTest extends JavaQuestionRepositoryTest implements QuestionRepositoryTest{
    MathQuestionRepository out = new MathQuestionRepository();
    Question q = new Question("55","пятдесят пять");
    Question q2 = new Question("22","двадцать два");
}
