// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        // gets two inputs: a string and a non-negative integer value
        //prints a crowd cheering output.
        String fullWord = args[0].toUpperCase();
        int cheers = Integer.parseInt(args[1]);
        String replaceA = "AEFHILMNORSX";
        char letter;
        for (int i = 0; i < fullWord.length(); i++) {
            letter = fullWord.charAt(i);
            System.out.print("Give me ");
            if (replaceA.indexOf(letter) >= 0)
                System.out.print("an ");
            else
                System.out.print("a  ");
            System.out.println(letter + ": " + letter + "!");
        }
        System.out.println("What does that spell?");
        for (int i = 0; i < cheers; i++) {
            System.out.println(fullWord + "!!!");
        }
    }
}
