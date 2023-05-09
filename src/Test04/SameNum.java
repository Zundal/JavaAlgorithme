package Test04;

import java.util.*;

public class SameNum {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(i!=0) {
                if(arr[i-1] != arr[i]) {
                    list.add(arr[i]);
                }
            } else {
                list.add(arr[i]);
            }
        }
        
        int[] answer=list.stream().mapToInt(i -> i).toArray();
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

    }
}