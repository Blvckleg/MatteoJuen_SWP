import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monkeysort{
	
	public static List<Integer> zahlen = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		zahlen.add(19);
		zahlen.add(2);
		zahlen.add(7);
		zahlen.add(12);
		zahlen.add(44);
		System.out.println("Ausgangszahlen: ");
		System.out.println(zahlen);
		System.out.println();
		monkeySort(zahlen);
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
