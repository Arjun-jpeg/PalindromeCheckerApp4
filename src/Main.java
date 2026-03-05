import java.util.*;
class Uc13 {
    public void check() {
        String input = "refer";
        long startTime = System.nanoTime();
        int start = 0;
        int end = input.length() - 1;
        boolean palin = true;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                palin = false;
                break;
            }
            start++;
            end--;
        }
        long endTime = System.nanoTime();
        if (palin) {
            System.out.println("Palindrome verified: " + input);
        } else {
            System.out.println("Not a Palindrome: " + input);
        }
        System.out.println("Execution Time: " + (endTime - startTime) + " ns");
    }
}
public class Main {
    public static void main(String[] args) {
        Uc13 ob=new Uc13();
        ob.check();
    }
}