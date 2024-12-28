import java.util.Scanner;
public class Purchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan= new Scanner(System.in);
System.out.println("Enter a Purchase Amount:");
double amount=scan.nextInt();


if(amount<500)
	
{
	
	System.out.println("No Discount is Applied."  );

}
else if(amount>500 && amount<1000)
{
	
	double disc=amount*10/100.0;
	double price=amount-disc;
	System.out.println("10% Discount is Applied." );
	System.out.println("Final Amount To pay:" +price);
	
}
else if(amount>=1000)
{
	double disc=amount*20/100.0;
	double price=amount-disc;
	System.out.println("20% Discount is Applied.");
	System.out.println("Final Amount To pay:"+price);
	
	}
	
}


	}


