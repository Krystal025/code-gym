class Solution {
    public int solution(String number) {
        int sum = 0;
        
        for(int i=number.length()-1; i>=0; i--){
            sum += Character.getNumericValue(number.charAt(i));
        }
        
        return sum % 9;
        
    }
}