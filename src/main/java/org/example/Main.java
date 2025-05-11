package org.example;


import java.util.Scanner;

public class Main {
    static int mod = 26;


    static int charToNum(char c) {
        return c - 'A';
    }

    static char numToChar(int n) {
        return (char) (n + 'A');
    }

    static String encryptBlock(int[][] keyMatrix, int[] block) {
        int n = block.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = 0;
            for (int j = 0; j < n; j++) {
                result[i] += keyMatrix[i][j] * block[j];
            }
            result[i] = result[i] % mod;
        }
        StringBuilder sb = new StringBuilder();
        for (int val : result) {
            sb.append(numToChar(val));
        }
        return sb.toString();
    }

    static String encrypt(String input, int[][] keyMatrix, int n) {
        StringBuilder encrypted = new StringBuilder();
       input = input.toUpperCase().replaceAll("[^A-Z]", "");
        while (input.length() % n != 0) {
            input += "X";
        }

        for (int i = 0; i < input.length(); i += n) {
            int[] block = new int[n];
            for (int j = 0; j < n; j++) {
                block[j] = charToNum(input.charAt(i + j));
            }
            encrypted.append(encryptBlock(keyMatrix, block));
        }

        return encrypted.toString();
    }


    static int[][] readMatrix(Scanner sc, int n) {
        int[][] matrix = new int[n][n];
        System.out.println("Fut elementët e matrices (" + n + "x" + n + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("Zgjidh madhësinë e matrices (2 - 4): ");
            n = sc.nextInt();
            if (n < 2 || n > 4) {
                System.out.println("Gabim! Ju lutem shtypni një numër nga 2 deri në 4.");
            }
        } while (n < 2 || n > 4);

        int[][] keyMatrix = readMatrix(sc, n);
        sc.nextLine();
        String input;

        do {
            System.out.print("Shkruaj tekstin për kriptim (vetëm shkronja A-Z): ");
            input = sc.nextLine().toUpperCase(); // konverton në shkronja të mëdha
            if (!input.matches("[A-Z]+")) {
                System.out.println("Gabim! Teksti mund të përmbajë vetëm shkronja nga A deri në Z.");
            }
        } while (!input.matches("[A-Z]+"));

        String encrypted = encrypt(input, keyMatrix, n);
        System.out.println("Teksti i koduar: " + encrypted);
    }

}
