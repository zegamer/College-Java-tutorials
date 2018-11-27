import java.io.*;
import java.net.*;

class client
{
public static void main(String []args)
	{
	try{Socket s=new Socket("localhost",8000);}
	catch(Exception e){System.out.println(e);}
	}
}