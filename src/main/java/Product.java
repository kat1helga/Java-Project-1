import java.util.Scanner;

public class Product {
    public double requestProducts() {
        Scanner scanner = new Scanner(System.in);
        Formatter formatter = new Formatter();

        String listOfProducts = "";
        double sum = 0.00d;
        double priceOfProduct;

        while(true) {
            System.out.println("Введите наименование товара: ");
            String nameOfProduct = getNameOfProduct(scanner);

            System.out.println("Введите стоимость товаров в формате рубли.копейки: ");
            priceOfProduct = getPriceOfProduct(scanner);

            sum = sum + priceOfProduct;
            String currencyName = formatter.formatCurrencyName(priceOfProduct);

            listOfProducts = listOfProducts + "\n" + nameOfProduct + " " + String.format("%.2f", priceOfProduct) + " " + currencyName;
            System.out.println("Товар добавлен, спасибо!\nЕсли вы не хотите добавлять еще товары введите \"Завершить\"");

            if (scanner.next().trim().equalsIgnoreCase("Завершить")) {
                System.out.println("Добавленные товары: " + listOfProducts);
                break;
            }
            else {
                scanner.nextLine();
            }
        }
        return sum;
    }

    public  double getPriceOfProduct(Scanner scanner) {
        while(true) {
            double price = getDoubleFromInput(scanner, "Значение неккоректно. Пожалуйста, введите цену товара в формате рубли,копейки: : ");

            if(price > 0) {
                return price;
            }
            else {
                System.out.println("Значение неккоректно. Пожалуйста, введите цену товара больше 0: ");
            }
        }
        
    }

    private String getNameOfProduct(Scanner scanner) {
        while(true) {
            String inputString = getStringFromInput(scanner);
            String name = inputString.trim();

            if(!name.isEmpty()) {
                return name;
            }
            else {
                System.out.println("Значение неккоректно. Пожалуйста, введите наименование товара: ");
            }
        }
    }

    private String getStringFromInput(Scanner scanner) {
        if(scanner.hasNextLine())
        {
            return scanner.nextLine();
        }
        return null;
    }

    public double getDoubleFromInput(Scanner scanner, String errorMessage) {
        while(true) {
            if (scanner.hasNextDouble()) {
                double result = scanner.nextDouble();
                scanner.nextLine();
                return result;
            }
            else {
                System.out.println(errorMessage);
                scanner.nextLine();
            }
        }
    }
}
