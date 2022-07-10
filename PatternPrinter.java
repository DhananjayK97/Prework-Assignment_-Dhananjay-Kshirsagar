import java.util.Scanner;
class PatternPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        patternPrinter(n);
    }
    static void patternPrinter(int n) {
        // write your code here
         if (n > 0) {
            for (int k = n; k > 0; k--) {
                for (int i = n; i > 0; i--) {
                    for (int j = k; j > 0; j--) {// j= 1st loop
                        System.out.print(i);
                    }
                }

                System.out.println("");
            }
        }
    }
}