import java.util.ArrayList;

/*
    TODO: 효율성 수정필요
        - [ ] 비교줄이기
*/
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

        ArrayList<String> list = new ArrayList<>(); 
        String answer = "";
        
        for (String el : participant) {
            list.add(el);
        }
        
        for (String ele : completion) {
            list.remove(ele);
        }

        return list.get(0);
    }
}