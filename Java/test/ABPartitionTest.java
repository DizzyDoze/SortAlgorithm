package test;

import org.junit.Test;
import src.ABPartition;

import java.util.Arrays;


public class ABPartitionTest {

    @Test
    public void testABPartition(){
        ABPartition abPartition = new ABPartition();
        String[] arr = {"B", "B", "A", "B", "B", "A", "B", "B", "B", "A", "B", "A"};
        System.out.println(Arrays.toString(arr));
        abPartition.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
