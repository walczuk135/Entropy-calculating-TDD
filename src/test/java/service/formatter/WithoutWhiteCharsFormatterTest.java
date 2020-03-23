package service.formatter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WithoutWhiteCharsFormatterTest {

    @Test
    void shouldCreateInstance() {
        //when
        FormatText withoutWhiteCharsFormatter=new WithoutWhiteCharsFormatter();
        //then
        assertThat(withoutWhiteCharsFormatter).isNotNull();
    }

    @Test
    void shouldFormatTextWithoutWhiteChar() {
        //given
        String test="TESTOWY co tam how are you        ";
        FormatText withoutWhiteCharsFormatter=new WithoutWhiteCharsFormatter();
        //when
        String formatter = withoutWhiteCharsFormatter.formatter(test);
        //then
        assertThat(formatter).isEqualTo("TESTOWYcotamhowareyou");
    }

    @Test
    void shouldFormatTextAndNumberWithoutWhiteChar() {
        //given
        String test="   1  dadad  adda  adadad  adada ";
        FormatText withoutWhiteCharsFormatter=new WithoutWhiteCharsFormatter();
        //when
        String formatter = withoutWhiteCharsFormatter.formatter(test);
        //then
        assertThat(formatter).isEqualTo("1dadadaddaadadadadada");
    }
}