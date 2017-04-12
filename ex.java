class ex{
	public static void main(String sha[])
	{
		int k=100,count=0;
		for(int i=5;i<=1000;i++)
		{
			int m=i;
			while(m%5==0)
			{
				count++;
				m=m/5;
				
			}
		}
		System.out.println(count);
	}
	
}