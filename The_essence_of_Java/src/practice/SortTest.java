package practice;

// bubble sort
// 1. 배열의 연속 두 항목을 가르킨다.
// 2. 두 항목을 비교하여 두번째 항목의 값이 작을 경우 값을 교환한다.
// 3. 값이 교환되지 않을때까지 반복한다.
// 4. 1-3을 배열의 원수 갯수에서 1씩 감소하여 반복한다.

import java.util.ArrayList;
import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {

        int[] arr = {6, 2, 7, 4, 8, 9, 1, 5, 3, 0};

        for(int i=arr.length; i>0; i--){

            for(int j=0; j<i; j++){

                if(j-1 < 0 ){
                    continue;
                }

                // 이전 원소와 현재 원소의 값을 비교한다.
                // 이전 원소의 값이 현재 원소의 값보다 크다면 교환한다.
                if(arr[j-1] > arr[j]){
                    // temp에 현재 값을 넣어놓는다.
                    int temp = arr[j];

                    // 이전값을 현재있던 인덱스에 넣어놓는다.
                    arr[j] = arr[j-1];
                    // temp에 넣어두었던 현재값을 이전 원소 위치에 넣어놓는다.
                    arr[j-1] = temp;

                     System.out.println(Arrays.toString(arr));

                }
            }
        }
    }
}
