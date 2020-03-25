package service.algorithm;

import model.Data;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ShannonAlgorithmEntropyTest {
    private AlgorithmEntropy entropy;

    @BeforeEach
    void setUp() {
        entropy=new ShannonAlgorithmEntropy();
    }

    @ParameterizedTest
    @MethodSource("shannonEntropyParams")
    void shouldCalculateEntropy(String test,String expected) {
        //when
        String calculate = entropy.calculate(new Data(test));
        //then
        assertThat(calculate).isEqualTo(expected);
    }

    static Stream<Arguments> shannonEntropyParams(){
        return Stream.of(
                arguments("https://www.reddit.com/r/dailyprogrammer","4,056198332"),
                arguments("122333444455555666666777777788888888","2,794208683"),
                arguments("563881467447538846567288767728553786","2,794208683"),
                arguments("int main(int argc, char *argv[])","3,866729296"));
    }
}