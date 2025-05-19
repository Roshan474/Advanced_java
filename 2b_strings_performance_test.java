/*
Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.
*/

package swing;

public class StringPerformanceTest {
    public static void main(String[] args) {
        int times = 10000;
        String text = "AIET";

        // Test with StringBuffer
        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < times; i++) {
            stringBuffer.append(text);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");

        // Test with StringBuilder
        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < times; i++) {
            stringBuilder.append(text);
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");

        // Justification
        System.out.println("\nJustification:");
        if (durationBuilder < durationBuffer) {
            System.out.println("StringBuilder is faster than StringBuffer because it is not synchronized.");
        } else {
            System.out.println("StringBuffer is slower than StringBuilder because it is synchronized (thread-safe).");
        }
    }
}

