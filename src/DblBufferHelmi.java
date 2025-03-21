// Assignment 2: Middle of Three Numbers
// Helmi Hernandez
import java.util.Random;

public class DblBufferHelmi {
    private final double[] buffer;
    private int bufferCount;
    private final int BUFFER_SIZE;

    public DblBufferHelmi(){
        this.BUFFER_SIZE = 8;
        this.buffer = new double[this.BUFFER_SIZE];
        bufferCount = 0;
    }

    public DblBufferHelmi(int bufferSize){
        this.BUFFER_SIZE = bufferSize;
        this.buffer = new double[this.BUFFER_SIZE];
        bufferCount = 0;
    }

    // Add a random 2-digit double, rounded to 2 decimals.
    void addRandomDouble(){
        // If statement prevents buffer overflow
        if (bufferCount < buffer.length) {
            double min = 10.00;
            double max = 99.99;

            double newValue;
            Random rd = new Random();
            newValue = min + (max - min) * rd.nextDouble();
            buffer[bufferCount++] = Math.round(newValue * 100.0) / 100.0;
        }
    }

    int getBufferCount(){
        return bufferCount;
    }

    void printToScreen(){
        for (double item: buffer){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
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
}