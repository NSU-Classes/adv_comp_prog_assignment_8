// Assignment 2: Middle of Three Numbers
// Helmi Hernandez
import java.util.Random;

public class DblBufferHelmi {
    private final double[] buffer;
    private int bufferCount;
    final int BUFFER_SIZE;

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
}