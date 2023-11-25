package IOPkg;
import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("###.##");
		float f = 3.147984765f;
		System.out.println(df.format(f));
	}

}
