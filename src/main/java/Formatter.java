import static java.lang.Math.floor;

import java.util.Scanner;

public class Formatter {
    public String formatCurrencyName(double priceOfProduct) {
        String currencyName;
        int intPrice = (int) floor(priceOfProduct);
        if((intPrice%100) >= 11 && (intPrice%100) <= 19) {
            currencyName = " рублей";
        }
        else {
            switch (intPrice % 10) {
                case 1:
                    currencyName = "рубль";
                    break;
                case 2:
                case 3:
                case 4: {
                    currencyName = "рубля";
                    break;
                }
                default:
                    currencyName = "рублей";
                    break;
            }
        }
        return currencyName;
    }

}
