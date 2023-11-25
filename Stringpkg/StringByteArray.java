// Construct String from subset of char array
package Stringpkg;
// Driver Class
class StringByteArray {
	// main function
	public static void main(String args[])
	{
		byte ascii[] = { 65, 82, 80, 73, 84 };

		String firstString = new String(ascii);
		System.out.println(firstString);

		String secondString = new String(ascii, 1, 2);
		System.out.println(secondString);
	}
}
