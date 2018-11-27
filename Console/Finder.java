class Finder
{
	public static void main (String[] args)
	{
		for(int i = 100000; i < 999999; i++){
			if(i%10 == (i/10)%7)
				System.out.println(i);
		}	
	}
}