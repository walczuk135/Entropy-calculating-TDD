package model;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class StatisticTest {

    @Test
    void shouldCreateStatisticNotNul() {
        //given
        String test="Paweł";
        //when
        Statistic statistic = new Statistic(test);
        //then
        assertThat(statistic).isNotNull();
    }

    @Test
    void shouldGetStatCount() {
        //given
        String test="Paweł";
        Map<Character,Long> testMap=Map.of('P',1L,
                'a',1L,
                'w',1L,
                'e',1L,
                'ł',1L);

        //when
        Map<Character, Long> statCount = new Statistic(test).getStatCount();
        //then
        assertThat(statCount).isEqualTo(testMap);
    }

    @Test
    void shouldGetStatOnlyString() {
        //given
        String test="aaabcdhjjuhHagsabbvvccada";
        Map<Character,Long> testMap= Map.ofEntries(Map.entry('H',1L),
                Map.entry('a',7L),
                Map.entry('b',3L),
                Map.entry('c',3L),
                Map.entry('d',2L),
                Map.entry('g',1L),
                Map.entry('h',2L),
                Map.entry('j',2L),
                Map.entry('s',1L),
                Map.entry('u',1L),
                Map.entry('v',2L));

        //when
        Map<Character, Long> statCount = new Statistic(test).getStatCount();
        //then
        assertThat(statCount).isEqualTo(testMap);
    }

    @Test
    void shouldGetStatOnlyNumber() {
        //given
        String test="14932849201232435132143513";
        Map<Character,Long> testMap= Map.ofEntries(
                Map.entry('0',1L),
                Map.entry('1',5L),
                Map.entry('2',5L),
                Map.entry('3',6L),
                Map.entry('4',4L),
                Map.entry('5',2L),
                Map.entry('8',1L),
                Map.entry('9',2L));
        //when
        Map<Character, Long> statCount = new Statistic(test).getStatCount();
        //then
        assertThat(statCount).isEqualTo(testMap);
    }

    @Test
    void shouldGetStatOnlySpecialChar() {
        //given
        String test=";!@#@#@*$@&!(@!()@$&^%@#&!^@^*#*!@&*!:";
        Map<Character,Long> testMap= Map.ofEntries(
                Map.entry('@',9L),
                Map.entry('!',6L),
                Map.entry('#',4L),
                Map.entry('$',2L),
                Map.entry('%',1L),
                Map.entry('&',4L),
                Map.entry('(',2L),
                Map.entry(')',1L),
                Map.entry(':',1L),
                Map.entry('*',4L),
                Map.entry(';',1L),
                Map.entry('^',3L)
        );
        //when
        Map<Character, Long> statCount = new Statistic(test).getStatCount();
        //then
        assertThat(statCount).isEqualTo(testMap);
    }
    @Test
    void shouldGetStatExample() {
        //given
        String test="laguna1234@gmail.com to jest jego email";
        Map<Character,Long> testMap= Map.ofEntries(
                Map.entry(' ',4L),
                Map.entry('@',1L),
                Map.entry('a',4L),
                Map.entry('c',1L),
                Map.entry('e',3L),
                Map.entry('g',3L),
                Map.entry('i',2L),
                Map.entry('j',2L),
                Map.entry('l',3L),
                Map.entry('m',3L),
                Map.entry('.',1L),
                Map.entry('n',1L),
                Map.entry('o',3L),
                Map.entry('1',1L),
                Map.entry('2',1L),
                Map.entry('s',1L),
                Map.entry('3',1L),
                Map.entry('t',2L),
                Map.entry('4',1L),
                Map.entry('u',1L)
        );
        //when
        Map<Character, Long> statCount = new Statistic(test).getStatCount();
        //then
        assertThat(statCount).isEqualTo(testMap);
    }
}
