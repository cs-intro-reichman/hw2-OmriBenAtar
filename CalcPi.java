// Computes an approximation of PI.
public class CalcPi {
    public static void main(String[] args) {
        int terms = Integer.parseInt(args[0]);
        int denominator = 1;
        double piCalc = 0.0;
        for (int i = 0; i < terms; i++) {
            if (i % 2 == 0)
                piCalc += (double) 1 / denominator;
            else
                piCalc -= (double) 1 / denominator;
            denominator += 2;
        }
        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + piCalc * 4);
    }
}
