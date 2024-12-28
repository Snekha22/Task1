import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       System.out.println("Enter a Num:");
       int a=scan.nextInt();
       if(a>0)
{
    System.out.println("It Is A Positive Number.");
    
}   
else
{
System.out.println("It Is A Negative Number.");
        
}
    }
}