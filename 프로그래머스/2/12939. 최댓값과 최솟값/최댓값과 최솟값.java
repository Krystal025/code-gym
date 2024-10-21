class Solution {
    public String solution(String s) {;
        
        String[] strArr = s.split(" ");
                                      
        int min, max, n;
        min = max = Integer.valueOf(strArr[0]);

        for(int i=1; i<strArr.length; i++){
            n = Integer.parseInt(strArr[i]);
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        
        return min + " " + max;
    }
}