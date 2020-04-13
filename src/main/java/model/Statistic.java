package model;

import java.util.Map;
import java.util.stream.Collectors;

public class Statistic {
    private final Map<Character, Long> statCount;

    public Statistic(String data) {
        statCount = calculateStatistic(data);
    }

    public Map<Character, Long> getStatCount() {
        return statCount;
    }

    private Map<Character, Long> calculateStatistic(String data) {
        return data.chars().mapToObj(i -> (char) i)
                .collect(Collectors
                        .groupingBy(e -> e,
                                Collectors.counting()));
    }


    public String toString() {
        return statCount.entrySet().stream().map(e -> e.getKey() + "=" + e.getValue())
                .collect(Collectors.joining("\n"));

    }
}
