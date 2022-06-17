package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSumSales(long[] sales) {
        int sum = sumSales(sales);
        int averageSum = sum / sales.length;
        return averageSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSumSales(long[] sales) {
        int averageSum = averageSumSales(sales);
        int belowAverageSum = 0;
        for (long sale : sales) {
           if (sale < averageSum) {
               belowAverageSum = belowAverageSum + 1;
           }
        }
        return belowAverageSum;
    }

    public int aboveAverageSumSales(long[] sales) {
        int averageSum = averageSumSales(sales);
        int aboveAverageSum = 0;
        for (long sale : sales) {
            if (sale > averageSum) {
                aboveAverageSum = aboveAverageSum + 1;
            }
        }
        return aboveAverageSum;
    }






}
