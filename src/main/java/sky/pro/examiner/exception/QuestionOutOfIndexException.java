package sky.pro.examiner.exception;

public class QuestionOutOfIndexException extends RuntimeException {
    public QuestionOutOfIndexException() {
        super();
    }

    public QuestionOutOfIndexException(String message) {
        super(message);
    }

    public QuestionOutOfIndexException(String message, Throwable t) {
        super(message, t);
    }

    public QuestionOutOfIndexException(Throwable t) {
        super(t);
    }
}
