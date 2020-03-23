package service.formatter;

public class WithoutAlphabeticCharFormatter implements FormatText {
    @Override
    public String formatter(String edit) {
        return edit.replaceAll("\\D","");
    }
}
