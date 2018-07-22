
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    private TreeMap<Integer, Integer> row_1;

    public Solution(TreeMap<Integer, Integer> row_1) {
        this.row_1 = row_1;
    }

    public Map<Integer, Integer> getNewRow(TreeMap<Integer, Integer> row_2) {

        int first = row_2.firstKey();
        int last = row_2.lastKey();

        row_1.putAll(row_2);

        return row_1.subMap(first, true,  last, true);
    }
}
