package com.hyperskill;

public class TotalCost {
    public static double calculateTotalCost(double[] itemPrices, int[] itemQuantities) {
        double totalCost = 0.0;
        for (int i = 0; i < itemPrices.length; i++) {
            totalCost += itemPrices[i] * itemQuantities[i];
        }
        return totalCost;
    }
}
