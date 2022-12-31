class OtherComputations {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String [] args) {
		//Computations with Binary Numbers
		String a = "10110100";
		String b = "00101011";
		System.out.println("\nWorking with Binary Numbers");
		System.out.println("Sum is : " + Integer.toBinaryString(Integer.parseInt(a,2) + Integer.parseInt(b,2)));
		System.out.println("Diff is: " + Integer.toBinaryString(Integer.parseInt(a,2) - Integer.parseInt(b,2)));
		System.out.println("Prod is: " + Integer.toBinaryString(Integer.parseInt(a,2) * Integer.parseInt(b,2)));
		System.out.println("Quot is: " + Integer.toBinaryString(Integer.parseInt(a,2) / Integer.parseInt(b,2)));
		
		//Computations with Hexadecimal Numbers
		String c = "e4f";
		String d = "57d";
		System.out.println("\nWorking with Hexadecimal Numbers");
		System.out.println("Sum is : " + Integer.toHexString(Integer.parseInt(c,16) + Integer.parseInt(d,16)));
		System.out.println("Diff is: " + Integer.toHexString(Integer.parseInt(c,16) - Integer.parseInt(d,16)));
		System.out.println("Prod is: " + Integer.toHexString(Integer.parseInt(c,16) * Integer.parseInt(d,16)));
		System.out.println("Quot is: " + Integer.toHexString(Integer.parseInt(c,16) / Integer.parseInt(d,16)));
	
		
		//Computations with Booleans
		System.out.println("\nWorking with Booleans");
		System.out.println("Not True is        : " + (! true));
		System.out.println("Not False is       : " + (! false));
		System.out.println("False or False is  : " + (false || false));
		System.out.println("False or True is   : " + (false || true));
		System.out.println("True or False is   : " + (true || false));
		System.out.println("True or True is    : " + (true || true));
		
		System.out.println("False and False is : " + (false && false));
		System.out.println("False and True is  : " + (false && true));
		System.out.println("True and False is  : " + (true && false));
		System.out.println("True and True is   : " + (true && true));
		
		boolean e = true || false;
		boolean f = true;
		System.out.println("Boolean is         : " + !(e && f));
		
	}
}
