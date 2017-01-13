import java.util.Scanner;
public class Progect17
{
	public static void main (String[] arg)
	{
	Program program = new Program;
	program.start();
	}
	public void start()
	{
		MyReader reader = new Reader();
		int a = reader.read();
		int b = reader.read();
		MyWorker worker = new Myworker();
		worker.calcSum(a,b);
		System.out.println(worker.getResult());
		
	}
	
	
}
