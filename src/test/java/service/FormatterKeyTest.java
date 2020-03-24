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
        assertThat(values).hasSize(7);
    }
}
