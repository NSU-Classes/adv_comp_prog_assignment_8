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

    void addRandomDouble(){
        // Add a random 2-digit double, rounded to 2 decimals.
        // Add actions to prevent buffer overflow.
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

        // Add random doubles to the DblBufferHelmi Class
        for (int i = 0; i < wo_argument.BUFFER_SIZE; i++){
            wo_argument.addRandomDouble();
        }

        for (int i = 0; i < w_argument.BUFFER_SIZE; i++){
            w_argument.addRandomDouble();
        }

        // Test that the buffers won't go over their limit
        wo_argument.addRandomDouble();
        w_argument.addRandomDouble();

        // Print out statements
        System.out.println("\nFor the DblBufferHelmi Class without an argument:");
        for (int i = 0; i < wo_argument.BUFFER_SIZE; i++){
            System.out.printf("Item %d: %.2f\n", i, wo_argument.buffer[i]);
        }
        System.out.println("\nFor the DblBufferHelmi Class with an argument:");
        for (int i = 0; i < w_argument.BUFFER_SIZE; i++){
            System.out.printf("Item %d: %.2f\n", i, w_argument.buffer[i]);
        }
    }
}