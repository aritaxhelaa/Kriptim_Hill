package org.example;


public class Main {


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

    public static void main(String[] args) {


        }
    }
}