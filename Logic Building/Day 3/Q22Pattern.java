class Q22Pattern {
    public static void main(String[] args) {
     
        for (int i = 9; i >= 1; i -= 2) {
            for (int k = 0; k < (9 - i) / 2; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 3; i <= 9; i += 2) {
            for (int k = 0; k < (9 - i) / 2; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// Sample Output:
// *********
//  *******
//  *****
//    ***
//      *
//    ***
//   *****
//  *******
// *********