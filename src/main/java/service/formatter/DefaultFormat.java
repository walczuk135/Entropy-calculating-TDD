package service.formatter;

public class DefaultFormat implements FormatText {
    @Override
    public String formatter(String edit) {
        return edit;
    }
}
