import java.util.Scanner;
class Atm
{
	public static void main(String sha[])
	{
		double y;
		int x;
		//x is money to take out and y is total amount
		Scanner obj=new Scanner(System.in);
		x=obj.nextInt();
		y=obj.nextDouble();
		double r=x+0.5;
		//System.out.println(" "+r);
		if((x>=0&&x<=2000)&&(y>=0&&y<=2000))
		{
			if(r<y)
		{
			if((x%5==0))
				System.out.println((y-x-0.5));
			else
				System.out.printf("%.2f",y);
		}
		else
		{
			System.out.printf("%.2f",y);
		}
		}
			
		
	}
}