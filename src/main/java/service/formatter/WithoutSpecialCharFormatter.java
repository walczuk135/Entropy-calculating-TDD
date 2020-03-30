package service.formatter;

class WithoutSpecialCharFormatter implements FormatText {
    @Override
    public String formatter(String edit) {
        return edit.replaceAll("[~`!@#$%^&*()_+={};:,./?<>'\\[\\]~-]","");
    }
}
