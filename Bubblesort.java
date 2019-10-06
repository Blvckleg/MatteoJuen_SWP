
public class Bubblesort {

	public static  int[] Bubblesort(){
		int zwischenspeicher;
		int[] array = new int[6];
		array[0] = 8;
		array[1] = 4;
		array[2] = 7;
		array[3] = 9;
		array[4] = 3;
		array[5] = 5;
		int runden = 7;
		while(runden != 0) {
		for(int i = 0; i < 5; i++)
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
		for(int a = 0; a < 6; a++)
		{
			System.out.print("|" + array[a] + "|");
		}
		return array;
}
	public static void main(String[] args) {
	Bubblesort();
	}

}
