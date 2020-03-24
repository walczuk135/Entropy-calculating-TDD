package service.formatter;

import org.junit.jupiter.api.Test;
import service.FormatterKey;

import static org.assertj.core.api.Assertions.assertThat;

public class FormatterTextServiceTest {
    @Test
    void shouldCreateInstanceNotNull() {
        //when
        FormatterTextService formatterTextService = new FormatterTextService();
        //then
        assertThat(formatterTextService).isNotNull();
    }

    @Test
    void shouldFormatterTextLowerCase() {
        //given
        String test="TEST";
        FormatterTextService formatterTextService=new FormatterTextService();
        //when
        String formatter = formatterTextService.formatter(FormatterKey.LOWER_CASE, test);
        //then
        assertThat(formatter).isEqualTo("test");
    }
}
