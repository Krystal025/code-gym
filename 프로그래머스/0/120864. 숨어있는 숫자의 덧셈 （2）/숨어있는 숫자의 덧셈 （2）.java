class Solution {
    public int solution(String my_string) {
                
        String[] arr = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        
        int sum = 0;
        
        for(int i=0; i<arr.length; i++){
            if(!arr[i].isEmpty())
            sum += Integer.parseInt(arr[i]);
        }
        
        return sum;
    }
}