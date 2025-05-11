package org.example;


public class Main {

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

    public static void main(String[] args) {


        }
    }
}