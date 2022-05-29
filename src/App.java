import java.util.Stack;
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
        Stack<String> stack = new Stack<>();
        String answer = "";
        
        for (String el : participant) {
            stack.push(el);
        }
        
        for (String ele : completion) {
            for(int i = 0; i < stack.size(); i++) {
                if(ele.equals(stack.elementAt(i))){
                    stack.remove(i);
                    break;
                }
            }
        }

        for(String el:stack){
            answer = el;
        }
        return answer;
    }
}