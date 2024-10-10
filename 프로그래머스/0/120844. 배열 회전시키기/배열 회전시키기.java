class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("right")){
            for(int i=1; i<=numbers.length; i++){
                answer[i-1] = i==1 ? numbers[numbers.length-1] : numbers[i-2];
            }
        }else{
            for(int i=1; i<=numbers.length; i++){
                answer[i-1] = i==numbers.length ? numbers[0] : numbers[i];
            }
        }
        return answer;
    }
}