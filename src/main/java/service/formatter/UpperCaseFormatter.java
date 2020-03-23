package service.formatter;

public class UpperCaseFormatter implements FormatText{
    @Override
    public String formatter(String edit) {
        return edit.toUpperCase();
    }
}
