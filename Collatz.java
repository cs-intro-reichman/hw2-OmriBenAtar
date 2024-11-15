// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String args[]) {
        int seed = Integer.parseInt(args[0]);
        String mode = args[1];
        int step;
        int count = 0;
        for (int i = 0; i < seed; i++) {
            step = i + 1;
            count = 0;
            do {
                count++;
                if (mode.equals("v"))
                    System.out.print(step + " ");
                if (step % 2 == 0)
                    step = step / 2;
                else
                    step = step * 3 + 1;
            } while (step != 1);
            if (mode.equals("v")) {
                //adding value 1 once more
                System.out.print(step + " ");
                System.out.println("(" + (count + 1) + ")");
            }
        }
        System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
    }
}
