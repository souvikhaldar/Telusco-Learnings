import java.io.*;
class bufferedreader
{
	public static void main(String args[]) throws IOException
	{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader obj=new BufferedReader(isr);
	String s=obj.readLine();
	System.out.println(s);
	}
}