package algorithm;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DataNumberFormatterTest {

    @ParameterizedTest
    @MethodSource("dataNumber")
    void shouldFormatterNumber(double testNumber,String testResult) {
        //when
        String testString=DataNumberFormatter.formatter(testNumber);
        //then
        assertThat(testString).isEqualTo(testResult);
    }

    static Stream<Arguments> dataNumber(){
        return Stream.of(
                arguments(4.056198332810095,"4,056198332"),
                arguments(2.7942086837942446,"2,794208683"),
                arguments(2.7942086837942446,"2,794208683"),
                arguments(3.8667292966721747,"3,866729296"));
    }
}
