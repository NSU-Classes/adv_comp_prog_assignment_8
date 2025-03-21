// Assignment 2: Middle of Three Numbers
// Helmi Hernandez
public class Main {
    public static void main(String[] args) {
        testBuffer();
        testCurrency();
    }

    public static void testBuffer() {
        // Instantiate the DblBufferHelmi Class without an argument
        DblBufferHelmi wo_argument = new DblBufferHelmi();

        // Instantiate the DblBufferHelmi Class with an argument
        int buffer_size = 5;
        DblBufferHelmi w_argument = new DblBufferHelmi(buffer_size);

        // Add random doubles
        for (int i = 0; i < wo_argument.BUFFER_SIZE; i++){
            wo_argument.addRandomDouble();
        }
        for (int i = 0; i < w_argument.BUFFER_SIZE; i++){
            w_argument.addRandomDouble();
        }

        // Test that the buffers won't flow over
        wo_argument.addRandomDouble();
        w_argument.addRandomDouble();

        // Testing getBufferCount
        System.out.printf("\nBufferCount for the DblBufferHelmi Class without an argument: %d",
                wo_argument.getBufferCount());
        System.out.printf("\nBufferCount for the DblBufferHelmi Class with an argument: %d",
                w_argument.getBufferCount());

        // Testing printToScreen
        System.out.println("\nPrintToScreen for the DblBufferHelmi Class without an argument:");
        wo_argument.printToScreen();
        System.out.println("\nPrintToScreen for the DblBufferHelmi Class with an argument:");
        w_argument.printToScreen();
    }

    public static void testCurrency(){
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