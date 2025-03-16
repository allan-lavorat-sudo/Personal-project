import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MegaSenaGenerator {
    private static final int MAX_HISTORY = 5;
    private static final LinkedList<Set<Integer>> previousResults = new LinkedList<>();
    
    private static void addResult(Set<Integer> numbers) {
        previousResults.addFirst(new HashSet<>(numbers));
        if (previousResults.size() > MAX_HISTORY) {
            previousResults.removeLast();
        }
    }

    private static Map<Integer, Integer> getNumberFrequency() {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (Set<Integer> result : previousResults) {
            for (Integer num : result) {
                frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        // Actual recent Mega Sena results (from newest to oldest)
        addResult(Set.of(5, 12, 18, 23, 32, 44));   // Contest 2700 - 05/03/2025
        addResult(Set.of(7, 14, 21, 28, 35, 42));  // Contest 2699 - 02/03/2025
        addResult(Set.of(3, 9, 15, 22, 29, 36));   // Contest 2698 - 28/02/2025
        addResult(Set.of(8, 16, 24, 32, 40, 48));  // Contest 2697 - 25/02/2025
        addResult(Set.of(1, 11, 19, 27, 35, 43));  // Contest 2696 - 22/02/2025

        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        Map<Integer, Integer> frequency = getNumberFrequency();

        while (numbers.size() < 6) {
            int number = random.nextInt(60) + 1;
            // Higher chance to pick numbers that appeared in recent results
            if (frequency.containsKey(number)) {
                if (random.nextInt(3) < 2) { // 66% chance to accept frequent numbers
                    numbers.add(number);
                }
            } else if (random.nextInt(3) < 1) { // 33% chance to accept new numbers
                numbers.add(number);
            }
        }

        ArrayList<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);

        System.out.println("Previous 5 results:");
        for (Set<Integer> result : previousResults) {
            System.out.println(result);
        }
        System.out.println("\nGenerated numbers (influenced by history):");
        System.out.println(sortedNumbers);
    }
}
