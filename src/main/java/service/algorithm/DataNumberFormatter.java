package service.algorithm;

class DataNumberFormatter {
    public static String formatter(Double test) {
        return String.format("%.9f",test-0.000000001);
    }
}
