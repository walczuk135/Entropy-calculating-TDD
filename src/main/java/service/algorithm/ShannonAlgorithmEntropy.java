package service.algorithm;

import model.Data;
import model.Statistic;


class ShannonAlgorithmEntropy implements AlgorithmEntropy{

    @Override
    public String calculate(Data data) {

        String dataText=data.getDataText();
        Statistic statistic=data.getStatistic();
        double result=0;

        for (char sequence : statistic.getStatCount().keySet()) {
            double frequency = (double) statistic.getStatCount().get(sequence) / dataText.length();
            result -= frequency * (Math.log(frequency) / Math.log(2));
        }


        return DataNumberFormatter.formatter(result);


    }
}
