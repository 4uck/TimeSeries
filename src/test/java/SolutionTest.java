import org.junit.Test;

import java.util.TreeMap;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    @Test
    public void test_with_offset(){

        TreeMap<Integer, Integer> row_1 = new TreeMap<>();
        row_1.put(1, 10); row_1.put(3, 30); row_1.put(5, 50);

        Solution solution = new Solution(row_1);


        TreeMap<Integer, Integer> row_2 = new TreeMap<>();
        row_2.put(2, 2); row_2.put(3, 3); row_2.put(6, 6);

        TreeMap<Integer, Integer> row_3 = new TreeMap<>();
        row_3.put(2, 2); row_3.put(3, 3); row_3.put(5, 50); row_3.put(6, 6);

        assertThat(solution.getNewRow(row_2), is(row_3));
    }

    @Test
    public void test_when_row1_contains_row2(){

        TreeMap<Integer, Integer> row_1 = new TreeMap<>();
        row_1.put(1, 10); row_1.put(3, 30); row_1.put(5, 50); row_1.put(6, 60); row_1.put(7, 70);

        Solution solution = new Solution(row_1);


        TreeMap<Integer, Integer> row_2 = new TreeMap<>();
        row_2.put(2, 2); row_2.put(3, 3); row_2.put(6, 6);

        TreeMap<Integer, Integer> row_3 = new TreeMap<>();
        row_3.put(2, 2); row_3.put(3, 3); row_3.put(5, 50); row_3.put(6, 6);

        assertThat(solution.getNewRow(row_2), is(row_3));
    }

    @Test
    public void test_with_one_element_1(){

        TreeMap<Integer, Integer> row_1 = new TreeMap<>();
        row_1.put(1, 10); row_1.put(3, 30); row_1.put(5, 50); row_1.put(6, 60); row_1.put(7, 70);

        Solution solution = new Solution(row_1);


        TreeMap<Integer, Integer> row_2 = new TreeMap<>();
        row_2.put(2, 2);

        TreeMap<Integer, Integer> row_3 = new TreeMap<>();
        row_3.put(2, 2);

        assertThat(solution.getNewRow(row_2), is(row_3));
    }

    @Test
    public void test_wth_one_element_2(){

        TreeMap<Integer, Integer> row_1 = new TreeMap<>();
        row_1.put(1, 10); row_1.put(3, 30); row_1.put(5, 50); row_1.put(6, 60); row_1.put(7, 70);

        Solution solution = new Solution(row_1);


        TreeMap<Integer, Integer> row_2 = new TreeMap<>();
        row_2.put(3, 3);

        TreeMap<Integer, Integer> row_3 = new TreeMap<>();
        row_3.put(3, 3);

        assertThat(solution.getNewRow(row_2), is(row_3));
    }
}
