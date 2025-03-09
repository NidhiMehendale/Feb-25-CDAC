//6. Write a program to display character and string literals along with their ASCII values.

class Q6{
    public static void main(String[] args) {
        char c = 'A';
        String s = "Hello";
        
        System.out.println("Character: " + c);
        System.out.println("ASCII value of char" + (int)c);

        System.out.println("String: " + s);
        System.out.println("ASCII values of string:");
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            System.out.println(ch + " : " + (int)ch);
        }
    }
}