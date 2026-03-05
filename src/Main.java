import java.util.Scanner;
class Uc2 {
    String name;
    public boolean find(){
        boolean palin=true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the palindrome you want to check: ");
        name=input.nextLine();
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i)!=name.charAt(name.length()-i-1)) {
                palin=false;
                break;
            }
        }
        if(palin){
            System.out.println("It is a Palindrome " +name);
        }
        else{
            System.out.println("Not a Palindrome " +name);
        }
        return palin;
    }
}
public class Main {
    public static void main(String[] args) {
        Uc2 ob=new Uc2();
        ob.find();
    }
}