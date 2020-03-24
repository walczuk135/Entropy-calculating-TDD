package service.formatter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LowerCaseFormatterTest {
    @Test
    void shouldCreateInstance() {
        //when
        FormatText lowerCaseTest=new LowerCaseFormatter();
        //then
        assertThat(lowerCaseTest).isNotNull();
    }

    @Test
    void shouldFormatTextToLowerCase() {
        //given
        String test="TESTOWY";
        FormatText lowerCaseFormat=new LowerCaseFormatter();
        //when
        String formatter = lowerCaseFormat.formatter(test);
        //then
        assertThat(formatter).isEqualTo(test.toLowerCase());
    }

    @Test
    void shouldFormatTextAndNumberToLowerCase() {
        //given
        String test="T2ES3TO5WY";
        FormatText lowerCaseFormat=new LowerCaseFormatter();
        //when
        String formatter = lowerCaseFormat.formatter(test);
        //then
        assertThat(formatter).isEqualTo(test.toLowerCase());
    }
}
