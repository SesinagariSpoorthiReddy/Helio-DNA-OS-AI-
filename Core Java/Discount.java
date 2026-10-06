public class Discount {

    public static void main(String[] args) {
        int amount = 6000;

        if (amount > 5000) {
            System.out.println("Discount is applicable.");
        }
        amount = 4000;

        if (amount > 5000) {
            System.out.println("Discount is applicable.");
        } else {
            System.out.println("No discount is applicable.");
        }
        for (int i = 1; i <= 3; i++) {
            System.out.println("Discount check: " + i);
        }
        int i = 1;

        while (i <= 5) {
            System.out.println("Discount check: " + i);
            i++;
        }
    }
}