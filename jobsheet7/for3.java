public class for3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int k = 5; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 7; i++) {
            for (int k = 7; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l = 0; l < 10; l++){
            for (int i = 1; i <= 5; i++) {
            for (int k = 5; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 5; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        }
        for (int i = 4; i >= 1; i--) {
            for (int k = 5; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
    }

    
}
