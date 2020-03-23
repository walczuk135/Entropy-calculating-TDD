package model;

public class Data {
    private final String dataText;
    private final Statistic statistic;

    public Data(String dataText) {
        this.dataText = dataText;
        this.statistic = new Statistic(dataText);
    }

    public String getDataText() {
        return dataText;
    }

    public Statistic getStatistic() {
        return statistic;
    }
}
