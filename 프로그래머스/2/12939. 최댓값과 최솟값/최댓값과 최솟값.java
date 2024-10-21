class Solution {
    public String solution(String s) {;
        
        String[] strArr = s.split(" ");
        
        int min = Integer.valueOf(strArr[0]);
        int max = Integer.valueOf(strArr[0]);
        for(int i=1; i<strArr.length; i++){
            min = Math.min(min, Integer.valueOf(strArr[i]));
            max = Math.max(max, Integer.valueOf(strArr[i]));
        }
        
        return ""+ min + " " + max;
    }
}