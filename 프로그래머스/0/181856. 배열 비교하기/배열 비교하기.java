class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sumArr1 = 0, sumArr2 = 0;
        
        // 두 배열의 길이가 다르다면 길이로 크기 비교 
        if(arr1.length != arr2.length){
            answer = arr1.length < arr2.length ? -1 : 1;
        // 두 배열의 길이가 같다면 요소들의 합으로 비교 
        }else{
            for(int i=0; i<arr1.length; i++){
                sumArr1 += arr1[i];
                sumArr2 += arr2[i];
            }
            answer = sumArr1 == sumArr2 ? 0 : (sumArr1 < sumArr2 ? -1 :1);
        }
        return answer;
    }
}