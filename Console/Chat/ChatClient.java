import java.io.*;
import java.net.Socket;
public class client {
    public static void main(String args[]) throws Exception
    {
        while(true)
        {
            Socket soc = new Socket("localhost",2000);
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str = br.readLine();
            OutputStream os = soc.getOutputStream();
            PrintWriter pw = new PrintWriter(os,true);
            pw.println(str);
        }
    }
}