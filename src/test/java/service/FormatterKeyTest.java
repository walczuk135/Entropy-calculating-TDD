package service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FormatterKeyTest {
    @Test
    void shouldFormatterKeyNotNull() {
        //given
        //when
        FormatterKey[] test = FormatterKey.values();
        //then
        assertThat(test).isNotNull();
    }

    @Test
    void shouldGetAllFormatterValues() {

        //when
        FormatterKey[] values = FormatterKey.values();
        //then
        assertThat(values).hasSize(7)
            .contains(FormatterKey.DEFAULT_FORMAT)
            .contains(FormatterKey.WITHOUT_ALPHABETIC)
            .contains(FormatterKey.WITHOUT_NUMBER)
            .contains(FormatterKey.WITHOUT_SPECIAL_CHAR)
            .contains(FormatterKey.WITHOUT_WHITE_CHAR)
            .contains(FormatterKey.LOWER_CASE)
            .contains(FormatterKey.UPPER_CASE);
    }
}
