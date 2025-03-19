import java.util.Random;

public class DblBufferHelmi {
    private double[] buffer;
    private int bufferCount;

    public DblBufferHelmi(){
        int BUFFER_SIZE = 8;
        bufferCount = 0;
    }

    public DblBufferHelmi(int bufferSize){
        bufferCount = 0;
    }

    void addRandomDouble(){
        // Add a random 2-digit double, rounded to 2 decimals.
        // Add actions to prevent buffer overflow.

        double newValue;
        Random rd = new Random();
        newValue = rd.nextDouble(10) * 100;
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
