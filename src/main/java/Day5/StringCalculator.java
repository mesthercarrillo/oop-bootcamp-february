package Day5;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCalculator {

    public static int add(String numbers) {
        if (numbers.trim().isEmpty()) {
            return 0;
        }

        ArrayList<String> numbersList = new ArrayList<>(Arrays.asList(numbers.trim().split(",|\\n")));
        return numbersList.stream().mapToInt(Integer::parseInt).sum();
    }
}
