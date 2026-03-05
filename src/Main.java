import java.util.*;
class Uc10 {

    public void space() {
        String input = "Re fer";
        boolean palin = true;

        input = input.replaceAll("\\s", "").toLowerCase();
        for(int i=0;i<input.length()/2;i++){
            if(input.charAt(i)!=input.charAt(input.length()-i-1)) {
                palin=false;
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
        Uc10 ob=new Uc10();
        ob.space();
    }
}