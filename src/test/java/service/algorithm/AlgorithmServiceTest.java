package service.algorithm;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AlgorithmServiceTest {

    @Test
    void shouldCreateDataNotNul() {
        //given
        //when
        AlgorithmService algorithmService =new AlgorithmService();
        //then
        assertThat(algorithmService).isNotNull();
    }

    @Test
    void shouldSetContextAlgorithm() {
        //given
        AlgorithmService algorithmService =new AlgorithmService();
        AlgorithmEntropy shannonEntropy=new ShannonAlgorithmEntropy();
        //when
        algorithmService.setAlgorithmEntropy(shannonEntropy);
        //then
        assertThat(algorithmService.getAlgorithmEntropy()).isEqualTo(shannonEntropy);
    }

    @Test
    void shouldCalculateEntropyTest() {
        //given
        String test="https://www.reddit.com/r/dailyprogrammer";
        AlgorithmService algorithmService =new AlgorithmService();
        algorithmService.setAlgorithmEntropy(new ShannonAlgorithmEntropy());
        //when
        String calculate = algorithmService.calculate(test);
        //then
        assertThat(calculate).isEqualTo("4,056198332");
    }
}