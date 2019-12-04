import java.util.Scanner;

public class testbsp {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		String date = Sc.nextLine();
		int c = date.indexOf(".");
		String day = date.substring(c-2, c);
		String month = date.substring(c+1, c+3);
		String year = date.substring(c+4, c+8);
		String ndate = month + "/" + day + "/" + year;
		System.out.println(ndate);
		

	}

}
