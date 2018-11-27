import java.net.*;
class Inetadd
{
public static void main(String []args)
	{
	InetAddress add = InetAddress.getLocalHost();
	System.out.println(add);
	Address=InetAddress.getByName("rediff.com");
	System.out.print(add);
	Address=InetAddress.getByName("www.yahoo.co.in");
	System.out.print(add);
	}
}