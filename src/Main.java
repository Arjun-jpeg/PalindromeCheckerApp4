import java.util.*;

interface PalindromeStrategy {
    void check();
}
class Uc11 implements PalindromeStrategy {
        public void check() {
            boolean palin=true;
            String input="refer";
            Queue<Character> q = new LinkedList<>();
            Stack<Character> s = new Stack<>();

            for (int i = 0; i < input.length(); i++) {
                q.add(input.charAt(i));
                s.push(input.charAt(i));
            }

            for (int i = 0; i < input.length() / 2; i++) {
                if (q.remove() != s.pop()) {
                    palin = false;
                    break;
                }
            }
            if(palin) {
                System.out.println("palindrome" +input);
            }
            else{
                System.out.println("not palindrome");
            }
        }
}
public class Main {
    public static void main(String[] args) {
        PalindromeStrategy ob=new Uc11();
        ob.check();
    }
}