package day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Part1 {
    final static String INPUT_PATH = "src/day2/input";

    public static void main(String[] args) throws IOException {
        Map<String, String> oppositions = new HashMap<>();
        oppositions.put("A", "Y");
        oppositions.put("B", "Z");
        oppositions.put("C", "X");
        Map<String, Integer> scores = new HashMap<>();
        scores.put("X", 1);
        scores.put("Y", 2);
        scores.put("Z", 3);

        BufferedReader in = new BufferedReader(new FileReader(INPUT_PATH));
        long score = 0;
        String s;
        while ((s = in.readLine()) != null) {
            String opponentChoice = s.substring(0, 1);
            String yourChoice = s.substring(2, 3);
            if (opponentChoice.charAt(0) - 'A' == yourChoice.charAt(0) - 'X') {
                score += 3;
            } else if (oppositions.get(opponentChoice).equals(yourChoice)) {
                score += 6;
            }
            score += scores.get(yourChoice);
        }
        System.out.println(score);
    }
}
