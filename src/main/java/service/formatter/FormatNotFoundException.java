package service.formatter;

import service.FormatterKey;

public class FormatNotFoundException extends RuntimeException {
    public FormatNotFoundException(FormatterKey type) {
        super("Formatter for: " + type + " has not been found.");
    }
}
