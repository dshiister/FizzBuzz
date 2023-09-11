public class Multiples {

    public static void main(String[] args) {

        int count = 1;
        int i = 1;

        while (i < 1000) {
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3) {

                count++;

            } else if (divisibleBy5) {

                count++;

            }

            i++;

        }

        System.out.println(count);

    }

}
