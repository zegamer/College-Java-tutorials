public class HelloWorld
{
	public static void main(String[] args)
	{
		new Display().display("Hello World!");
	}
}
class Display
{
	public void display(String args)
	{
		System.out.println(args);
	}
}