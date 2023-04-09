import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("Hello", "Hello", "Hello", "World", "World"));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("Задача 2");
        Set<Integer> numsSet = new HashSet<>(nums);
        for (Integer num : numsSet) {
            if (num % 2 != 1)
                System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Задача 3");
        Set<String> wordsNew = new HashSet<>(words);
        System.out.println(wordsNew);

        System.out.println();
        System.out.println("Задача 4");
        System.out.println(words.size() - wordsNew.size());
    }
}