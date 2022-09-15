package practice;

import java.util.Arrays;

public class QuickSort {
    public int[] partition(int[] arr, int low, int hight){
        int l_pivot = arr[0];
        int r_pivot = arr[arr.length-1];

        // low 탐색
        for(int i=0; i<arr.length-1; i++){

            int temp = l_pivot;

            // low가 비교값보다 작다면 멈추기
            if(arr[i] < arr[i+1]){
                // index 값을 저장
                l_pivot = i;
                break;
            }
            // 그렇지 않다면 자리 교환하기
            else{
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(l_pivot);

        return arr;
    }

    public int[] sort(int[] arr){
        arr = partition(arr, 0, arr.length - 1);
        return arr;
    }
}