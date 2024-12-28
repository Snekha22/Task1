public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=876, Reverse=0;
		while(num!=0)
		{
			int remainder=num%10;
			Reverse=Reverse*10 + remainder;
			num=num/10;
		}
		System.out.println(Reverse);
	}

}