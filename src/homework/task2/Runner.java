package homework.task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Runner {

    /*
        Task2

            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
    */


    public static void main(String[] args) {

        int[] arr = {3,4,2,7};
        int sum = 10;

        Set<Integer> set = new HashSet<>();

        for (int i=0; i < arr.length; i++){
            int tmp = sum - arr[i];
            if(set.contains(tmp)){
                System.out.println(Arrays.toString(new int[]{ arr[i], tmp}) );
                break;
            }
            set.add(arr[i]);
        }



    }
}
