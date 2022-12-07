package day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Part2 {
    final static String INPUT_PATH = "src/day6/input";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(INPUT_PATH));
        String signal = in.readLine();
        for (int i = 14; i < signal.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i - 14; j < i; j++) {
                char c = signal.charAt(j);
                if (set.contains(c)) {
                    break;
                } else {
                    set.add(c);
                }
            }
            if (set.size() == 14) {
                System.out.println(i);
                break;
            }
        }
    }
}
