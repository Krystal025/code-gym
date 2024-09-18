class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        
        for(int i=0; i<code.length(); i++){
            // mode가 0일 때
             if(mode == 0){
                // (1이 아닌 문자일 때) 인덱스가 짝수인 문자만 이어붙임
                if(code.charAt(i) != '1'){
                    if(i%2 == 0){
                        ret.append(code.charAt(i));
                    }
                // 1이 나오면 mode 변경
                }else if(code.charAt(i) == '1'){
                    mode = 1;
                }
            // mode가 1일 때
            }else{
                // (1이 아닌 문자일 때) 인덱스가 홀수인 문자만 이어붙임
                if(code.charAt(i) != '1'){
                    if(i%2 == 1){
                        ret.append(code.charAt(i));
                    }
                // 1이 나오면 mode 변경 
                }else if(code.charAt(i) == '1'){
                    mode = 0;
                }
            }
        }
        
        if(ret.toString().isEmpty()){
            ret.append("EMPTY");
        } 
        
        return ret.toString();
    }
}