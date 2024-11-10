class Solution {
    public int solution(String[] order) {
        int total = 0;
        
        for(int i=0; i<order.length; i++){
            if(order[i].contains("americano") || order[i].contains("anything")){
                total += 4500;
            }else if(order[i].contains("cafelatte")){
                total += 5000;
            }
        }
        return total;
    }
}