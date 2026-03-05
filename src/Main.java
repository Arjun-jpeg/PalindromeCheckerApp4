import java.util.*;
class Uc8 {
    public void ll() {
        String input = "refer";

        LinkedList<Character> list = new LinkedList<>();


        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }

        boolean palin = true;


        while (list.size() > 1) {
            char front = list.removeFirst();
            char rear = list.removeLast();

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
        Uc8 ob=new Uc8();
        ob.ll();
    }
}