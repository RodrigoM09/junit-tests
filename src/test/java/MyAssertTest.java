import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class MyAssertTest {

    List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

    @Test
 public void test() {
        boolean test = todos.contains("AWS");

        assertEquals(true, test);
        assertEquals(3,todos.size());
    }
}
