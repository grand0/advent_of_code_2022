package day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Part2 {
    final static String INPUT_PATH = "src/day1/input";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(INPUT_PATH));
        long sum = 0;
        TreeSet<Long> set = new TreeSet<>();
        String s;
        while ((s = in.readLine()) != null) {
            if (s.isEmpty()) {
                set.add(sum);
                sum = 0;
            } else {
                sum += Long.parseLong(s);
            }
        }
        if (sum != 0) {
            set.add(sum);
            sum = 0;
        }
        for (int i = 0; i < 3; i++) {
            sum += set.pollLast();
        }
        System.out.println(sum);
    }
}
