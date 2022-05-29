// TODO: 효율성 수정필요
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Solution a = new Solution();
        String[] ab = {"mislav", "stanko", "mislav", "ana"};
        String[] cd = {"stanko", "ana", "mislav"};
        
        a.solution(ab, cd);
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        List<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, participant);

        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (String ele : completion) {
            boolean flag = false;
            for (String el : participant) {
                if(flag == true){
                    continue;
                }
                if(ele.equals(el)) {
                    if(list1.remove(ele) == true){
                        flag = true;
                    }
                }
            }
        }
        for(String ell:list1){
            answer = ell;
        }

        return answer;
    }
}