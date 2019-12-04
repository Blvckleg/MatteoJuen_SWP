import java.util.Scanner;

public class Stringbearbeitung {
	public static void encode()
	{
		Scanner Sc = new Scanner(System.in);
		int ascii;
		int j = 0;
		System.out.println("Bitte einen Text eingeben: ");
		String encoded = "|";
		String decoded = Sc.nextLine();
		Sc.close();
		for(int i = 0; i < decoded.length(); i++) {	
			if(i % 3 == 0) {
				ascii = (int)(Math.random()*26)+65;
				char c = (char)ascii;
				encoded += c + "|";
			}else {
				ascii = (int)(decoded.charAt(i));
				encoded += ascii + "|";
			}
			encoded = encoded.replaceAll("R", "L");
	}

	System.out.println("Verschlüsselung: ");
	System.out.printf(encoded);
}
	public static void main(String args[])
	{
		encode();
	}
	
}
