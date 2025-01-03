class Solution {
    public String solution(String polynomial) {        
        int coef = 0, cons = 0;
        // 정규식에서 +는 1회 이상을 의미하기 떄문에 이스케이프 처리 필요
        String[] strArr = polynomial.split(" \\+ ");
        
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("x")){
                if(strArr[i].equals("x")){
                    coef++;   
                }else{
                    String temp = strArr[i].substring(0, strArr[i].indexOf('x'));
                    coef += Integer.parseInt(temp);
                }
            }else{
                cons += Integer.parseInt(strArr[i]);
            }
        }
        if(cons == 0){
            return coef == 1 ? "x" : coef+"x";
        }else if(coef == 0){
            return cons+"";
        }else{
            return coef == 1 ? "x + "+cons : coef+"x + "+cons;
        }
    }
}