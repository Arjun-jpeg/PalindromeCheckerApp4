import java.util.*;
class Uc11 {
    public void check() {
        String input = "refer";
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
        if (palin) {
            System.out.println("Palindrome verified: " + input);
        } else {
            System.out.println("Not a Palindrome: " + input);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Uc11 ob=new Uc11();
        ob.check();
    }
}