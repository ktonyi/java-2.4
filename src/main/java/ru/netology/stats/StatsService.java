package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] SalesAmount){

        int sum =0;
        for (int sale : SalesAmount) {
            sum += sale;
        }

        return sum;
    }

    public int calculateAverage(int[] SalesAmount) {
        int sum = calculateSum(SalesAmount);
        return sum / SalesAmount.length;
    }

    public int calculateMonthOfMaxSales(int[] turnover){
        int calculateMax = turnover[0];
        int numberMonth = 1;
        int numberMonthOfMax = 1;
        for (int sale : turnover){
            if (calculateMax <= sale){
                calculateMax = sale;
                numberMonthOfMax = numberMonth;
            }
            numberMonth++;
        }
        return numberMonthOfMax;
    }

    public int calculateMonthOfMinSales(int[] SalesAmount){
        int calculateMin = SalesAmount[0];
        int numberMonth = 1;
        int numberMonthOfMin = 1;
        for (int sale : SalesAmount) {
            if (calculateMin >= sale) {
                calculateMin = sale;
                numberMonthOfMin = numberMonth;
            }
            numberMonth++;
        }
        return numberMonthOfMin;
    }

    public int calculateMonthBelowAverage(int[] SalesAmount){
        int average = calculateAverage(SalesAmount);
        int months = 0;
        for (int sale : SalesAmount){
            if (sale < average){
                months++;
            }
        }
        return  months;
    }

    public int calculateMonthAboveAverage(int[] SalesAmount){
        int average = calculateAverage(SalesAmount);
        int months = 0;
        for (int sale : SalesAmount){
            if (sale > average){
                months++;
            }
        }
        return  months;
    }

}