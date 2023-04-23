package ru.netology.stats;

public class StatsService {
    public int allSalesAmount(int[] sales) {
        int totalSales = 0; // сумма всех продаж
        for (int all : sales) {
            totalSales = all + totalSales;
        }
        return totalSales;
    }

    public int mediumSalesAmountMonth(int[] sales) { // средняя сумма продаж в месяц
        return allSalesAmount(sales) / sales.length;
    }

    public int maxSalesAmountMonth(int[] sales) {
        int maxSales = 0; // номер месяца с максимумом продаж
        for (int max = 0; max < sales.length; max++) {
            if (sales[max] >= sales[maxSales]) {
                maxSales = max;
            }
        }
        return maxSales + 1;
    }

    public int minSalesAmountMonth(int[] sales) {
        int minSales = 0; // номер месяца с минимумом продаж
        for (int min = 0; min < sales.length; min++) {
            if (sales[min] <= sales[minSales]) {
                minSales = min;
            }
        }
        return minSales + 1;
    }

    public int salesAboveMediumMonth(int[] sales) {
        int maxSalesMonth = 0; // количество месяцев с продажами выше среднего
        for (int maxMonth = 0; maxMonth < sales.length; maxMonth++) {
            if (sales[maxMonth] > mediumSalesAmountMonth(sales)) {
                maxSalesMonth++;
            }
        }
        return maxSalesMonth;
    }

    public int salesBelowMediumMonth(int[] sales) {
        int minSalesMonth = 0; // количество месяцев с продажами ниже среднего
        for (int minMonth = 0; minMonth < sales.length; minMonth++) {
            if (sales[minMonth] < mediumSalesAmountMonth(sales)) {
                minSalesMonth++;
            }
        }
        return minSalesMonth;
    }
}
