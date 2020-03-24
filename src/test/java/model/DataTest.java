package model;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class DataTest {

    @Test
    void shouldCreateDataNotNul() {
        //given
        String test="adaddada";
        //when
        Data data = new Data(test);
        //then
        assertThat(data).isNotNull();
        assertThat(data.getDataText()).isNotNull();
        assertThat(data.getStatistic()).isNotNull();
    }

    @Test
    void shouldGetStatisticData() {
        //given
        String test="Paweł";
        Map<Character,Long> testMap=Map.of('P',1L,
                'a',1L,
                'w',1L,
                'e',1L,
                'ł',1L);
        //when
        Data data = new Data(test);
        //then
        assertThat(data.getStatistic().getStatCount()).isNotNull();
        assertThat(data.getStatistic().getStatCount()).isEqualTo(testMap);
        assertThat(data.getDataText()).isEqualTo(test);
    }
}
