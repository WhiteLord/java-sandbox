package generators;

import java.util.List;

public interface NumberGenerator {
    List<Integer> generateList(int min, int max, int numberOfItems);

    int[] generateArray(int min, int max, int numberOfItems);
}
