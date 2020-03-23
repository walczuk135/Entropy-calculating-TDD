package service.formatter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UpperCaseFormatterTest {
    @Test
    void shouldCreateInstance() {
        //when
        FormatText upperCaseFormat=new UpperCaseFormatter();
        //then
        assertThat(upperCaseFormat).isNotNull();
    }

    @Test
    void shouldFormatTextToUpperCase() {
        //given
        String test="testowy";
        FormatText upperCaseFormat=new UpperCaseFormatter();
        //when
        String formatter = upperCaseFormat.formatter(test);
        //then
        assertThat(formatter).isEqualTo(test.toUpperCase());
    }
    @Test
    void shouldFormatTextAndNumberToUpperCase() {
        //given
        String test="2tes2to2wy555";
        FormatText upperCaseFormat=new UpperCaseFormatter();
        //when
        String formatter = upperCaseFormat.formatter(test);
        //then
        assertThat(formatter).isEqualTo(test.toUpperCase());
    }
}