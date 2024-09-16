class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        // my_string의 길이를 구한다
        int str1 = my_string.length();
        // overwrite_string의 길이를 구한다
        int str2 = overwrite_string.length();
        // substring()을 이용하여 my_string의 인덱스를 구분해서 추가한다 
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s+str2, str1);
        return answer;
    }
}