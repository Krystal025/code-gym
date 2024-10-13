class Solution {
    public int solution(String binomial) {
        
        // 공백을 분리하여 a, op, b를 추출 
        String[] parts = binomial.split(" ");
        int a = Integer.parseInt(parts[0]);
        String op = parts[1];
        int b = Integer.parseInt(parts[2]);
        
        int answer = 0;
        
        // 연산자에 따라 다른 연산 수행 
        switch(op){
            case "+":
                answer = a + b;
                break;
            case "-":
                answer =  a - b;
                break;
            case "*":
                answer = a * b;
                break;
        }
        return answer;
    }
}