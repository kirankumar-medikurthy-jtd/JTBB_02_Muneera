class main
{
	public static void main(String[]args)
	{
		int principle=1000;
		int interest=15;
		int time=3;
		int n=1;
		
		int SI=(principle*interest*time)/100;
		int CI=(1+interest/n);
		int pow=n*time;
		
		double compound= principle*Math.pow(CI,pow)-(principle);
		System.out.println(SI);
		System.out.println(compound);
	}
}


/*class simple
{
	public static void main(String[] args)
	{
		int principle = 1000;
		int interest = 15;
		int time = 3 ;
		int frequencyPerAnnum = 1;
		
		float simpleIntrest = (principle *interest*time) /100;
		//int simple = total/100;
		
		int result = (1+interest/frequencyPerAnnum);
		int pow = frequencyPerAnnum * time;
		
		double compound = principle*Math.pow(result,pow)-(principle);
		
		System.out.println("simple interest : " + simpleIntrest);
		System.out.println("compound interest : " + compound);
		
		
	}
	
}*/
