package service.formatter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultFormatterTest {
    @Test
    void shouldCreateInstance() {
        //when
        FormatText defaultFormat=new DefaultFormat();
        //then
        assertThat(defaultFormat).isNotNull();
    }
    @Test
    void shouldFormatDefaultFormat() {
        //given
        String test="TESTOWY";
        FormatText defaultFormat=new DefaultFormat();
        //when
        String formatter = defaultFormat.formatter(test);
        //then
        assertThat(formatter).isEqualTo(test);
    }

}
