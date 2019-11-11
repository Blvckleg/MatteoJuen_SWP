public class SelectionSort{
public static void main(String[] args) {

		int[] unsorted = {16, 7, 56, 2, -4};
		int[] sorted = selectionsort(unsorted);

		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + "|");
		}

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
}