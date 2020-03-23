package service.formatter;

public class WithoutWhiteCharsFormatter implements FormatText{
    @Override
    public String formatter(String edit) {
        return edit.replaceAll(" ","");
    }
}
