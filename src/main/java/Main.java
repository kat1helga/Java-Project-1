import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Сalculator calculator = new Сalculator();
        int quantityOfPeopleToPrint = calculator.requestQuantityOfPeople();
        System.out.println("Количество персон = " + quantityOfPeopleToPrint);

        Product product = new Product();
        double totalSum = product.requestProducts();
        double totalSumForEach = totalSum/quantityOfPeopleToPrint;

        Formatter formatter = new Formatter();
        String totalCurrencyName = formatter.formatCurrencyName(totalSumForEach);

        System.out.println("Каждому нужно заплатить по: " + String.format("%.2f ", totalSumForEach) + totalCurrencyName);
   }
}
