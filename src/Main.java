import java.util.*;
class Uc7 {
    public void que() {
        String input = "refer";

        Deque<Character> dq = new ArrayDeque<>();


        for (int i = 0; i < input.length(); i++) {
            dq.add(input.charAt(i));
        }

        boolean palin = true;


        while (dq.size() > 1) {
            char front = dq.removeFirst();
            char rear = dq.removeLast();

            if (front != rear) {
                palin = false;
                break;
            }
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
        Uc7 ob=new Uc7();
        ob.que();
    }
}