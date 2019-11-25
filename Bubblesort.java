
public class Bubblesort {
	//public static int[] getRandom(int length) {
	//for(int i = 0; i == length)
	//}
	
	
	public static  int[] Bubblesort(int length){
		int zwischenspeicher;
		int[] array = new int[length];
		for(int y = 0; y < length; y++)
		{
			array[y] = (int) (Math.random()*length);
		}

		int runden = length;
		while(runden != 0) {
		for(int i = 0; i < length - 1; i++)
		{
			if(array[i] > array[i+1])
			{
				zwischenspeicher = array[i+1];
				array[i+1] = array[i];
				array[i] = zwischenspeicher;
			}
			else
			{
				
			}
		}
		runden--;
	}
		for(int a = 0; a < length; a++)
		{
			System.out.print("|" + array[a] + "|");
		}
		return array;
}
	public static void main(String[] args) {
	long starttime = System.nanoTime();
	Bubblesort(8);
	System.out.println();
	System.out.print("Benötigte Zeit in Nanosekunden: ");
	System.out.print(System.nanoTime() - starttime);
	}

}
