// Assignment 2: Middle of Three Numbers
// Helmi Hernandez
import java.util.Scanner;

public class CurrencyHelmi {
    private double amount;
    private char currencyType;
    private double amountDollars;
    private double amountEuros;
    private double amountYen;

    public void getCurrFromUser(){
    String[] input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will ask you for an amount and the currency. " +
                "Use D for Dollars, E for Euros, or Y for Yen.\n" +
                "Enter an amount followed by the currency: ");

        // Splits the user's input
        input = scanner.nextLine().split(" ");
        setAmount(Double.parseDouble(input[0]));
        setCurrencyType(input[1].charAt(0));

        // Calls the methods to set the conversions
        setAmountDollars(amount);
        setAmountEuros(amount);
        setAmountYen(amount);
    }

    // region Getters and Setters
    // Conversions are performed in their respective setters.
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public char getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(char currencyType) {
        this.currencyType = currencyType;
    }

    public double getAmountDollars() {
        return amountDollars;
    }

    public void setAmountDollars(double amountDollars) {
        switch (currencyType){
            case 'E':
                this.amountDollars = amountDollars / 0.914;
                break;
            case 'Y':
                this.amountDollars = amountDollars / 147.895;
                break;
            default:
                this.amountDollars = amountDollars;
        }
    }

    public double getAmountEuros() {
        return amountEuros;
    }

    public void setAmountEuros(double amountEuros) {
        switch (currencyType){
            case 'D':
                this.amountEuros = amountEuros * 0.914;
                break;
            case 'Y':
                this.amountEuros = amountEuros / 161.810;
                break;
            default:
                this.amountEuros = amountEuros;
        }
    }

    public double getAmountYen() {
        return amountYen;
    }

    public void setAmountYen(double amountYen) {
        switch (currencyType){
            case 'D':
                this.amountYen = amountYen * 147.895;
                break;
            case 'E':
                this.amountYen = amountYen * 161.810;
                break;
            default:
                this.amountYen = amountYen;
        }
    }
    // endregion
}
