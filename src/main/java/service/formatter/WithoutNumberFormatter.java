package service.formatter;

public class WithoutNumberFormatter implements FormatText {
    @Override
    public String formatter(String edit) {
        return edit.replaceAll("\\d","");
    }
}
