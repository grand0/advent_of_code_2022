package day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Part1 {
    final static String INPUT_PATH = "src/day4/input";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(INPUT_PATH));
        int count = 0;
        String s;
        while ((s = in.readLine()) != null) {
            String[] assignments = s.split(",");
            String[] a1 = assignments[0].split("-");
            String[] a2 = assignments[1].split("-");
            int min1 = Integer.parseInt(a1[0]);
            int max1 = Integer.parseInt(a1[1]);
            int min2 = Integer.parseInt(a2[0]);
            int max2 = Integer.parseInt(a2[1]);
            if ((min1 <= min2 && max1 >= max2) || (min2 <= min1 && max2 >= max1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
