package service.formatter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WithoutNumberFormatterTest {
    @Test
    void shouldCreateInstance() {
        //when
        FormatText withoutNumberFormatter=new WithoutNumberFormatter();
        //then
        assertThat(withoutNumberFormatter).isNotNull();
    }

    @Test
    void shouldFormatTextWithoutNumber() {
        //given
        String test="1234aba2";
        FormatText withoutNumberFormatter=new WithoutNumberFormatter();
        //when
        String formatter = withoutNumberFormatter.formatter(test);
        //then
        assertThat(formatter).isEqualTo("aba");
    }

}
