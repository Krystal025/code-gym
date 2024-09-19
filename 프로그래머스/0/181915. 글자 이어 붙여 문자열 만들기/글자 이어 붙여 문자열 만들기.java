class Solution {
    public String solution(String my_string, int[] index_list) {
        
        // StringBuilder answer = new StringBuilder();
        // int index = 0;
        // for(int i=0; i<index_list.length; i++){
        //     index = index_list[i];
        //     answer.append(my_string.charAt(index));
        // }
        // return answer.toString();
        
        StringBuilder answer = new StringBuilder();
        for(int index : index_list){
            answer.append(my_string.charAt(index));
        }
        return answer.toString();
    }
}