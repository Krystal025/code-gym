import java.util.Stack;

class Solution {
    boolean solution(String s) {

        // Character 타입을 담을 스택 객체 생성 
        Stack<Character> stack = new Stack<>();
        // 문자열을 char타입으로 변환하여 한글자씩 비교할 수 있도록 함 
        char[] arr = s.toCharArray();
        // 생성한 char 배열에서 한 문자씩 비교
        for(char c : arr){
            // (여는 괄호를 만나면 스택에 푸시 
            if(c == '('){
                stack.push(c);
            }
            // )닫는 괄호를 만났을 때 
            else{
                //스택이 비어있으면 짝이 맞지 않으므로 false 반환
                if(stack.isEmpty()){
                    return false;
                // 스택이 비어있지 않으면 (여는 괄호를 팝해서 소거해줌 
                }else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}