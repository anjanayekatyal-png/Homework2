import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PartitionTest {

    @Test
    public void testLomutoSortedArray() {
        int[] arr = {10,17,19,21,44,55,57,63,65,67};
        int index = Partition.lomutoPartition(arr, 0, arr.length - 1);
        assertTrue(index >= 0);
    }

    @Test
    public void testLomutoEmptyArray() {
        int[] arr = {};
        int index = Partition.lomutoPartition(arr, 0, 0);
        assertEquals(-1, index);
    }

    @Test
    public void testLomutoUnsortedArray() {
        int[] arr = {84,3,7,1,9,6,2,5};
        int index = Partition.lomutoPartition(arr, 0, arr.length - 1);
        assertTrue(index >= 0);
    }

    @Test
    public void testHoareSortedArray() {
        int[] arr = {10,17,19,21,44,55,57,63,65,67};
        int index = Partition.hoarePartition(arr, 0, arr.length - 1);
        assertTrue(index >= 0);
    }

    @Test
    public void testHoareEmptyArray() {
        int[] arr = {};
        int index = Partition.hoarePartition(arr, 0, 0);
        assertEquals(-1, index);
    }

    @Test
    public void testHoareUnsortedArray() {
        int[] arr = {84,3,7,1,9,6,2,5};
        int index = Partition.hoarePartition(arr, 0, arr.length - 1);
        assertTrue(index >= 0);
    }
}
