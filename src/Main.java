import java.util.*;
class Uc9 {
    boolean check(String input, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        return check(input, start + 1, end - 1);
    }

    public void rec() {
        String input = "refer";

        boolean palin = check(input, 0, input.length() - 1);

        if (palin) {
            System.out.println("Palindrome verified: " + input);
        } else {
            System.out.println("Not a Palindrome: " + input);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Uc9 ob=new Uc9();
        ob.rec();
    }
}