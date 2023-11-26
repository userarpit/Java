package test;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeChar("arpit Khandelwal", 'a');
	}

	static void removeChar(String a, char b) {
	
		StringBuffer sb = new StringBuffer(a);
		String s = Character.toString(b);
		while(sb.indexOf(s,0)!=-1) {
			System.out.println(sb.indexOf(s,0));
			sb.deleteCharAt(sb.indexOf(s,0));	
		}
		System.out.println(sb);
	}
}