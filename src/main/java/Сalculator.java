import java.util.Scanner;
public class Сalculator {

    public int requestQuantityOfPeople() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Подскажите, на скольких человек необходимо разделить счёт?");
        int quantityOfPeople = 0;
        while(true) {
            quantityOfPeople = getIntFromInput(scanner);
            if(!checkInputWithOne(quantityOfPeople)) {
                System.out.println("Значение неккоректно. Пожалуйста, введите целое число больше 1");
                scanner.nextLine();
            }
            else {
                break;
            }
        }
        return quantityOfPeople;
    }

    private  int getIntFromInput(Scanner scanner) {
        while(true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            else {
                System.out.println("Значение неккоректно. Пожалуйста, введите целое число");
                scanner.nextLine();
            }
        }
    }

    private boolean checkInputWithOne(int quantityOfPeople) {
        if(quantityOfPeople <= 1) {
            return false;
        }
        return true;
    }
}


