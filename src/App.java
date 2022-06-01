import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        List<String> list = new ArrayList<String>(Arrays.asList(participant));
        
        for (String ele : completion) {
            list.remove(ele);
        }
        System.out.println("test");
        
        return list.get(0);
    }
}
