package day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Part1 {
    final static String INPUT_PATH = "src/day3/input";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(INPUT_PATH));
        int sum = 0;
        String s;
        while ((s = in.readLine()) != null) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < s.length() / 2; i++) {
                set.add(s.charAt(i));
            }
            for (int i = s.length() / 2; i < s.length(); i++) {
                if (set.contains(s.charAt(i))) {
                    char c = s.charAt(i);
                    if (c >= 'a' && c <= 'z') {
                        sum += c - 'a' + 1;
                    } else {
                        sum += c - 'A' + 27;
                    }
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
