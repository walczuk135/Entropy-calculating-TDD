package service.formatter;

class LowerCaseFormatter implements FormatText {
    @Override
    public String formatter(String edit) {
        return edit.toLowerCase();
    }
}
