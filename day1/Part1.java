import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Part1 {
    final static String INPUT_PATH = "day1/input";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(INPUT_PATH));
        long sum = 0;
        long max = 0;
        String s;
        while ((s = in.readLine()) != null) {
            if (s.isEmpty()) {
                max = Math.max(max, sum);
                sum = 0;
            } else {
                sum += Long.parseLong(s);
            }
        }
        System.out.println(Math.max(max, sum));
    }
}
