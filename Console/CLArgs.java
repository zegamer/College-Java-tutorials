public class CLArgs
{
	public static void main(String[] args)
	{
		if(args.length != 2)
		{
			System.out.println("Less or more args entered");
		}
		else
		{
			System.out.println("Hello " + args[0] + "! Are you " + args[1] + "?\n");
		}
	}
}