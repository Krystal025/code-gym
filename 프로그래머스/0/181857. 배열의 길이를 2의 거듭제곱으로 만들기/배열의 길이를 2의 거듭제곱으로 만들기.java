class Solution {
    public int[] solution(int[] arr) {

        // 배열의 길이보다 크거나 같을 때까지 2의 제곱수를 구함
        int newSize = 1;
        while(newSize < arr.length){
            newSize *= 2;
        }
        // 새 배열 생성
        int[] newArr = new int[newSize];
        
        // 기존 배열을 새 배열에 복사 (나머지 공간은 이미 초기값 0으로 설정되어있음)
        for(int i=0; i<arr.length; i++){
            newArr[i] = arr[i];
        } 
        return newArr;
    }
}