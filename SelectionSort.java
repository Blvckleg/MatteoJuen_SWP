public class SelectionSort{
public static void main(String[] args) {
	long starttime = System.nanoTime();
	int length = 10;
	int[] unsorted = new int[length];
	for(int y = 0; y < length; y++)
	{
		unsorted[y] = (int) (Math.random()*length);
	}
		int[] sorted = selectionsort(unsorted);

		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + "|");
		}
		System.out.println();
		System.out.print("Benötigte Zeit in Nanosekunden: ");
		System.out.print(System.nanoTime() - starttime);
	}

	public static int[] selectionsort(int[] sort) {
		for (int i = 0; i < sort.length - 1; i++) {
			for (int j = i + 1; j < sort.length; j++) {
				if (sort[i] > sort[j]) {
					int sp = sort[i];
					sort[i] = sort[j];
					sort[j] = sp;
				}
			}
		}
		return sort;
	}
	//public static void init(int length) {
	//	int[] unsorted = new int[length];
	//	for(int y = 0; y < length; y++)
	//	{
	//		unsorted[y] = (int) (Math.random()*length);
	//	}
	//}
}