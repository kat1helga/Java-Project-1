import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Сalculator calculator = new Сalculator();
        int quantityOfPeopleToPrint = calculator.requestQuantityOfPeople();
        System.out.println("Количество персон = " + quantityOfPeopleToPrint);

        Product product = new Product();
        double totalSum = product.requestProducts();

        System.out.println("Каждому нужно заплатить по: " + String.format("%.2f", totalSum/quantityOfPeopleToPrint));
   }
}
