import java.util.ArrayList;
import java.util.List;

public class binarySearch {
	
	public static int binSearch(int search, List<Integer> sorted)	{
		int index = sorted.size() / 2;
		if(search == sorted.get(index))	{
			return index;
		}
		if(sorted.size() == 1)	{
			return -1;
		}
		if(search > sorted(index))	{
			int res = binSearch(search, sorted.subList(index, sorted.size()));
			if(res == -1)	{
				return -1;
			}
			return index + res;
		}
		int res= binSearch(search, sorted.subList(0, index));
		if(res == -1)	{
			return -1;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		liste.add(2);
		liste.add(2); 
		liste.add(3); 
		liste.add(4); 
		liste.add(4);
		liste.add(4);
		liste.add(5); 
		liste.add(6); 
		liste.add(7); 
		liste.add(8);
		liste.add(9);
		System.out.println(binSearch(8, list));
	}

}
