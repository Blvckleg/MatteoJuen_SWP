import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monkeysort{
	
	public static List<Integer> init(int length) {
		ArrayList<Integer> list = new ArrayList<Integer>(length);
		for(int y = 0; y < length; y++)
		{
			int random = (int) (Math.random()*length);
			list.add(random);
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> zahlen = (ArrayList<Integer>) init(15);
		System.out.println("Ausgangszahlen: ");
		System.out.println(zahlen);
		System.out.println();
		long starttime = System.currentTimeMillis();
		monkeySort(zahlen);
		System.out.println();
		System.out.print("Benötigte Zeit in Millisekunden: ");
		System.out.print(System.currentTimeMillis() - starttime);
	}
	
	
	public static void monkeySort(List<Integer> deck) {
        if(isInOrder(deck)) {
        	System.out.println("Es ist schon sortiert");
        	System.out.print(deck);
        }
		while(!isInOrder(deck)) {
            Collections.shuffle(deck);
            if(isInOrder(deck)== true) {
            	System.out.println("Es ist Sortiert: ");
            	System.out.print(deck);
            }
        }
    }
     
    public static boolean isInOrder(List<Integer> deck) {
        for (int i = 0; i < deck.size() - 1; i++) {
            if (deck.get(i) > deck.get(i+1)) {
            	return false;
            }
        }
        return true;
    }
}