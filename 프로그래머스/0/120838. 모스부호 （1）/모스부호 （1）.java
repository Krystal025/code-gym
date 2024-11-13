import java.lang.StringBuilder;

class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        
        String[] alphabet = {"a", "b", "c", "d", "e", "f",
                             "g", "h", "i", "j", "k", "l",
                             "m", "n", "o", "p", "q", "r",
                             "s", "t", "u", "v", "w", "x",
                             "y", "z"};
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.",
                          "--.", "....", "..", ".---", "-.-", ".-..",
                          "--", "-.", "---", ".--.", "--.-", ".-.",
                          "...", "-", "..-", "...-", ".--", "-..-",
                          "-.--", "--.."};
        String[] strArr = letter.split(" ");
        
        for(String str : strArr){
            for(int i=0; i<morse.length; i++){
                if(str.equals(morse[i])) sb.append(alphabet[i]);
            }
        }
        return sb.toString();
    }
}