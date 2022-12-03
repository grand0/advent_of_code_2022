package day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Part2 {
    final static String INPUT_PATH = "src/day3/input";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(INPUT_PATH));
        int sum = 0;
        String s1 = in.readLine();
        String s2 = in.readLine();
        String s3 = in.readLine();
        while (s1 != null) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < s1.length(); i++) {
                set.add(s1.charAt(i));
            }

            Set<Character> set2 = new HashSet<>();
            for (int i = 0; i < s2.length(); i++) {
                set2.add(s2.charAt(i));
            }
            set.retainAll(set2);
            set2.clear();

            for (int i = 0; i < s3.length(); i++) {
                set2.add(s3.charAt(i));
            }
            set.retainAll(set2);

            char c = (char) (set.toArray()[0]);
            if (c >= 'a' && c <= 'z') {
                sum += c - 'a' + 1;
            } else {
                sum += c - 'A' + 27;
            }

            s1 = in.readLine();
            s2 = in.readLine();
            s3 = in.readLine();
        }
        System.out.println(sum);
    }
}
