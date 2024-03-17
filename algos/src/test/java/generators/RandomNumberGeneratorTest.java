package generators;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomNumberGeneratorTest {

    /**
     * Checks if the target range is correct
     */
    @Test
    public void testGenerateRandomIntegerSize() {
        List<Integer> testList = new RandomNumberGenerator().generateList(1, 100, 10);
        assertTrue(testList.size() == 10);
    }
}