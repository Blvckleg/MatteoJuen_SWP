
public class fizzbuzzk {

	public static void fizzbuzz()
	{
		for(int fb = 1; fb <= 100; fb++)
		{
			boolean alreadypr = false;
			if(fb%3 == 0)
			{
				System.out.print("fizz - ");
				alreadypr = true;
				
			}
			if(fb%4 == 0)
			{
				System.out.print("buzz - ");
				alreadypr = true;
			}
			if(alreadypr == false)
			{
				System.out.print(fb+" - ");
			}
			}
		}
	
	
	
	public static void main(String[] args) {
		
		fizzbuzz();
	}

}
