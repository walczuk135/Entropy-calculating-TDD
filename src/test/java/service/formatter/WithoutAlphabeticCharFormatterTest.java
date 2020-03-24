package service.formatter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WithoutAlphabeticCharFormatterTest {
    @Test
    void shouldCreateInstance() {
        //when
        FormatText withoutAlphabeticCharFormatter=new WithoutAlphabeticCharFormatter();
        //then
        assertThat(withoutAlphabeticCharFormatter).isNotNull();
    }

    @Test
    void shouldFormatTextWithoutAlphabeticChar() {
        //given
        String test="1234aba2";
        FormatText withoutAlphabeticCharFormatter=new WithoutAlphabeticCharFormatter();
        //when
        String formatter = withoutAlphabeticCharFormatter.formatter(test);
        //then
        assertThat(formatter).isEqualTo("12342");
    }
}
