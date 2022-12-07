package day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Part1 {
    final static String INPUT_PATH = "src/day6/input";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(INPUT_PATH));
        String signal = in.readLine();
        for (int i = 4; i < signal.length(); i++) {
            String marker = signal.substring(i - 4, i);
            if (allUnique(marker)) {
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean allUnique(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) return false;
            }
        }
        return true;
    }
}
