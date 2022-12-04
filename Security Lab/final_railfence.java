import java.util.Scanner;

public class final_railfence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String pt = s.nextLine();
        int k = s.nextInt();
        s.close();

        // ENC
        char[][] mat = new char[k][pt.length()];
        int row = 0;
        boolean alt = false;

        for (int col = 0; col < pt.length(); col++) {
            mat[row][col] = pt.charAt(col);
            if (row == k - 1) {
                alt = true;
            } else if (row == 0) {
                alt = false;
            }
            row = alt ? row - 1 : row + 1;
        }
        print(mat);

        StringBuilder enc = new StringBuilder();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int c = mat[i][j];
                if (c >= 65 && c <= 90) {
                    enc.append((char) c);
                }
            }
        }
        System.out.println("Enc: " + enc.toString());

        // DEC
        char[][] decm = new char[k][enc.length()];

        alt = false;
        row = 0;
        for (int col = 0; col < enc.length(); col++) {
            decm[row][col] = '*';
            if (row == k - 1) {
                alt = true;
            } else if (row == 0) {
                alt = false;
            }
            row = alt ? row - 1 : row + 1;
        }

        int enci = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < enc.length(); j++) {
                if (decm[i][j] == '*') {
                    decm[i][j] = enc.charAt(enci++);
                }
            }
        }

        print(decm);
        StringBuilder dec = new StringBuilder();
        row = 0;
        for (int col = 0; col < enc.length(); col++) {
            dec.append(decm[row][col]);
            if (row == k - 1) {
                alt = true;
            } else if (row == 0) {
                alt = false;
            }
            row = alt ? row - 1 : row + 1;
        }

        System.out.println("Dec: " + dec.toString());
    }

    public static void print(char[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
