import java.util.Scanner;

public class Ascii {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
         String k =   in.nextLine();
        }
        String text = in.nextLine().toUpperCase();

        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();

            for(int j = 0; j < text.length(); j++) {
                int delta = text.charAt(j) - 65; // Ascii code for 'A'
                if (delta < 0 || delta >= 26) {
                    delta = 26;
                }

                System.out.print(ROW.substring(L * delta, L * (delta + 1)));
            }
            System.out.println();
        }
    }
}