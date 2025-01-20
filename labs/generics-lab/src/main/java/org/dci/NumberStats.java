package org.dci;

import java.util.List;

public class NumberStats <T extends Number> {


    public double calculateAverage(List<? extends Number> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Your list of numbers cannot be null or empty");
        }

        double sum = 0.0;

        for (Number num : numbers) {
            sum += num.doubleValue();
        }

        return sum / numbers.size();

    }

    public T findMax(List<? extends Number> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Your list of numbers cannot be null or empty");
        }
        T maxValue = (T) numbers.getFirst();
        for (Number num : numbers) {
            if (num.doubleValue() > maxValue.doubleValue()) {
                maxValue = (T) num;
            }
        }
        return maxValue;
    }

}
