package conversion;

public class HexatoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDecimal("a"));
		System.out.println(getDecimal("f"));
		System.out.println(getDecimal("121"));
	}

	public static int getDecimal(String s) {
		String fullstr = "0123456789abcdef";
		s = s.toLowerCase();
		
		//System.out.println(s);
		
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(fullstr.indexOf((c[i])) == -1) {
				System.out.println("invalid input");
				Runtime.getRuntime().exit(0);
			}			
		}
		
		int val=0;
		int len = c.length;
		for(int j=0;j<len;j++) {
			val = val + fullstr.indexOf((c[len-j-1])) * (int)Math.pow(16, j);			
		}
		return val;
	}
}
