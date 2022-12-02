package day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Part2 {
    final static String INPUT_PATH = "src/day2/input";

    public static void main(String[] args) throws IOException {
        Map<Character, Character> oppositions = new HashMap<>();
        oppositions.put('A', 'B');
        oppositions.put('B', 'C');
        oppositions.put('C', 'A');
        Map<Character, Integer> scores = new HashMap<>();
        scores.put('A', 1);
        scores.put('B', 2);
        scores.put('C', 3);

        BufferedReader in = new BufferedReader(new FileReader(INPUT_PATH));
        long score = 0;
        String s;
        while ((s = in.readLine()) != null) {
            char opponentChoice = s.charAt(0);
            char needsToEnd = s.charAt(2);
            if (needsToEnd == 'X') {
                char yourChoice = (char) (((oppositions.get(opponentChoice) - 'A' + 1) % 3) + 'A');
                score += scores.get(yourChoice);
            } else if (needsToEnd == 'Y') {
                score += scores.get(opponentChoice) + 3;
            } else {
                score += scores.get(oppositions.get(opponentChoice)) + 6;
            }
        }
        System.out.println(score);
    }
}
