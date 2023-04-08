package sky.pro.examiner.exception;

public class QuestionNotFoundException extends RuntimeException {
    public QuestionNotFoundException() {
        super();
    }

    public QuestionNotFoundException(String message) {
        super(message);
    }

    public QuestionNotFoundException(String message, Throwable t) {
        super(message, t);
    }

    public QuestionNotFoundException(Throwable t) {
        super(t);
    }
}
