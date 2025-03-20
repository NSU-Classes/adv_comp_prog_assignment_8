// Assignment 2: Middle of Three Numbers
// Helmi Hernandez
public class Main {
    public static void main(String[] args) {
        CurrencyHelmi currencyHelmi = new CurrencyHelmi();
        currencyHelmi.getCurrFromUser();

        System.out.printf("Amount in Dollars: %.2f\n",
                currencyHelmi.getAmountDollars());
        System.out.printf("Amount in Euros: %.2f\n",
                currencyHelmi.getAmountEuros());
        System.out.printf("Amount in Yen: %.2f\n",
                currencyHelmi.getAmountYen());
    }
}
