
public class pascalschesdreieck {

	public static int Pascal( int Zeile, int Spalte ) {
		if( Spalte == 1 ) {
			return 1;
		}else 
			if( Zeile == Spalte ) {
					return 1;
		
	}
	return Pascal( Zeile-1, Spalte-1 ) + Pascal( Zeile - 1, Spalte );
	}

	public static void main(String[] args) {
		int res = Pascal(4, 2);
		System.out.println(res);

	}

}
