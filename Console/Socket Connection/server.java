import java.io.*;
import java.net.*;
class server
{
public static void main(String []args)
	{
	try{
	ServerSocket ss=new ServerSocket(8000);
	Socket s=ss.accept();
	System.out.println("The Client has logged on");
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
}