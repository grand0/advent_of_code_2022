package day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Part2 {
    final static String INPUT_PATH = "src/day5/input";

    public static void main(String[] args) throws IOException {
        final int NUM_STACKS = 9;

        BufferedReader in = new BufferedReader(new FileReader(INPUT_PATH));
        Deque<Character>[] stacks = new ArrayDeque[NUM_STACKS];
        for (int i = 0; i < NUM_STACKS; i++) {
            stacks[i] = new ArrayDeque<>();
        }
        String s;
        while (!(s = in.readLine()).contains("1")) {
            for (int i = 0; i < s.length(); i += 4) {
                char c = s.charAt(i + 1);
                if (c != ' ') {
                    stacks[i / 4].addLast(c);
                }
            }
        }
        in.readLine();
        while ((s = in.readLine()) != null) {
            String[] spl = s.split("move | from | to ");
            int quantity = Integer.parseInt(spl[1]);
            int from = Integer.parseInt(spl[2]) - 1;
            int to = Integer.parseInt(spl[3]) - 1;
            char[] buf = new char[quantity];
            for (int i = 0; i < quantity; i++) {
                buf[i] = stacks[from].pop();
            }
            for (int i = quantity - 1; i >= 0; i--) {
                stacks[to].push(buf[i]);
            }
        }
        for (int i = 0; i < NUM_STACKS; i++) {
            System.out.print(stacks[i].poll());
        }
    }
}
