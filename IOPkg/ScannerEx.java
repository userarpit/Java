package IOPkg;
import java.util.*;
public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale l = sc.locale();
		System.out.println(l.getDisplayCountry());
		System.out.println(l.getDisplayName());
		System.out.println(sc.toString());
		System.out.println(sc.next());
		sc.close();
	}
}