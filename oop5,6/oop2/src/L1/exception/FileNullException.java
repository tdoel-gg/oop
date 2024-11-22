package L1.exception;

import java.io.IOException;

public class FileNullException extends IOException {
    public FileNullException(String message) {
        super(message);
    }
}
