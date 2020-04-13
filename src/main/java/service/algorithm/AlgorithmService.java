package service.algorithm;

import model.Data;

public class AlgorithmService {
    private AlgorithmEntropy algorithmEntropy;
    private Data data;

    public AlgorithmService() {
        this.data = new Data("");
    }

    public AlgorithmEntropy getAlgorithmEntropy() {
        return algorithmEntropy;
    }

    public void setAlgorithmEntropy(AlgorithmEntropy algorithmEntropy) {
        this.algorithmEntropy = algorithmEntropy;
    }

    public String calculate(String dataString){
        this.data=new Data(dataString);
        return algorithmEntropy.calculate(data)+"\n"+getStatistics();
    }

    public String getStatistics(){
        return data.getStatistic().toString();
    }
}
