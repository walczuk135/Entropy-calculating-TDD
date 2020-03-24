package service.formatter;

import service.FormatterKey;

import java.util.EnumMap;
import java.util.Optional;

public class FormatterTextService {
    private final EnumMap<FormatterKey,FormatText> formatter;

    public FormatterTextService() {
        formatter =new EnumMap<>(FormatterKey.class);
        formatter.put(FormatterKey.DEFAULT_FORMAT,new DefaultFormat());
        formatter.put(FormatterKey.LOWER_CASE,new LowerCaseFormatter());
        formatter.put(FormatterKey.UPPER_CASE,new UpperCaseFormatter());
        formatter.put(FormatterKey.WITHOUT_ALPHABETIC,new WithoutAlphabeticCharFormatter());
        formatter.put(FormatterKey.WITHOUT_NUMBER,new WithoutNumberFormatter());
        formatter.put(FormatterKey.WITHOUT_SPECIAL_CHAR,new WithoutSpecialCharFormatter());
        formatter.put(FormatterKey.WITHOUT_WHITE_CHAR,new WithoutWhiteCharsFormatter());
    }

    private FormatText getFormatter(FormatterKey key) {
        return Optional.ofNullable(formatter.get(key))
                .orElseThrow(() -> new FormatNotFoundException(key));
    }

    public String formatter(FormatterKey formatterKey,String text){
        return getFormatter(formatterKey).formatter(text);
    }
}
