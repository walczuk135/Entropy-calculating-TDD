package service.formatter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WithoutSpecialCharFormatterTest {
    @Test
    void shouldCreateInstance() {
        //when
        FormatText withoutSpecialCharFormatter=new WithoutSpecialCharFormatter();
        //then
        assertThat(withoutSpecialCharFormatter).isNotNull();
    }

    @Test
    void shouldFormatTextWithoutSpecialChar() {
        //given
        String test="!';@Paw$(12*";
        FormatText withoutSpecialCharFormatter=new WithoutSpecialCharFormatter();
        //when
        String formatter = withoutSpecialCharFormatter.formatter(test);
        //then
        assertThat(formatter).isEqualTo("Paw12");
    }
}
