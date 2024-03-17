package generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator {
    @Override
    public List<Integer> generateList(int min, int max, int numberOfItems) {
        List<Integer> generatedList = new ArrayList<>();
        for (int i=0; i<numberOfItems; i++) {
            generatedList.add(generateRandomNumberWithConstraints(min, max));
        }
        return generatedList;
    }

    @Override
    public int[] generateArray(int min, int max, int numberOfItems) {
        int[] generated = new int[numberOfItems];
        for (int i=0; i<numberOfItems; i++) {
            generated[i] = generateRandomNumberWithConstraints(min, max);
        }
        return generated;
    }

    private int generateRandomNumberWithConstraints(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
}
