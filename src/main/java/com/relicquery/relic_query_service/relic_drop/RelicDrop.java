package com.relicquery.relic_query_service.relic_drop;

public class RelicDrop {

    private String id;
    private String name;
    private double currentValue;
    private double[] historicValues;
    private double rollingAverage;

    public RelicDrop(
            String id,
            String name,
            double currentValue,
            double[] historicValues,
            double rollingAverage
    ) {
        this.id = id;
        this.name = name;
        this.currentValue = currentValue;
        this.historicValues = historicValues;
        this.rollingAverage = rollingAverage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public double[] getHistoricValues() {
        return historicValues;
    }

    public void setHistoricValues(double[] historicValues) {
        this.historicValues = historicValues;
    }

    public double getRollingAverage() {
        return rollingAverage;
    }

    public void setRollingAverage(double rollingAverage) {
        this.rollingAverage = rollingAverage;
    }

    public double calculateRollingAverage(int currentValue, double[] historicValues) {
        double historicValuesSum = 0;
        for (double historicValue : historicValues) {
            historicValuesSum += historicValue;
        }

        int numberOfValues = 1 + historicValues.length;
        return (currentValue + historicValuesSum)/numberOfValues;
    }
}
