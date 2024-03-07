package src;

import java.util.Objects;

public class ABPartition {

    public void sort(String[] arr){
        int i = 0;
        int j= arr.length - 1;
        while (i < j){
            while (Objects.equals(arr[i], "A")){
                i++;
            }
            while (Objects.equals(arr[j], "B")){
                j--;
            }
            // swap
            if (i < j){
                String tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }
}
