import ru.netology.stats.StatsService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        System.out.println(service.allSalesAmount(sales) + " сумма всех продаж");
        System.out.println(service.mediumSalesAmountMonth(sales) + " средняя сумма продаж в месяц");
        System.out.println(service.maxSalesAmountMonth(sales) + " номер месяца с макс.продажами");
        System.out.println(service.minSalesAmountMonth(sales) + " номер месяца с мин.продажами");
        System.out.println(service.salesAboveMediumMonth(sales) + " кол-во месяцев в которых продажи ниже среднего");
        System.out.println(service.salesBelowMediumMonth(sales) + " кол-во месяцев в которых продажи выше среднего");
    }

}