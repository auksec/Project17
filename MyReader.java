impoort java.util.Scanner;

public class MyReader
{
    Scanner scanner;
	
    public MyReader()
    {
		scanner = new Scanner(System.in);
	}
	public int read()
	{
		return scanner.nextInt();
	}
	
}
