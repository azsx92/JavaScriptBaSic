public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}