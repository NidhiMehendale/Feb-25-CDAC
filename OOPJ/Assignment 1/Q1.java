//1. Create a program that declares and initializes all primitive data types in Java and prints their default and assigned values.
class Q1{

	public static void main(String args[]){
		byte by = 0;
		short s = 0;
        int i = 0;
        long l = 0L;
        float f = 0.0f;
        double d = 0.0d;
        char c = '\u0000';
        boolean b = false;
		
		System.out.println("Default Values:");
        System.out.println("byte: " + by);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + b);
			
	    by = 10;
	    s = 20;
        i = 100;
        l = 1000L;
        f = 10.5f;
        d = 99.99;
        c = 'A';
        b = true;
		
		System.out.println("Assigned Values:");
        System.out.println("byte: " + by);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);

		
	}

}