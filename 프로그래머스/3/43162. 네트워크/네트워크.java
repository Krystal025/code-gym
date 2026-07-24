/*
    연결되어있지 않은 네트워크 개수 반환이 핵심
    직접이든 간접이든 연결되어있으면 하나의 네트워크
*/
import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        
        int visited[] = new int[n]; // 전체 기준 해당 컴퓨터를 한 번이라도 방문했는지 기록
        Arrays.fill(visited, -1);
        
        Queue<Integer> queue = new LinkedList<>();
        
        int cnt = 0; // 네트워크 개수

        for (int i = 0; i < n; i++) { // 모든 컴퓨터 확인
            
            if(visited[i] == 1) continue; // 이미 방문한 컴퓨터는 어떤 네트워크에 속했으니 무시
            // 여기까지 왔다는 건 = i는 "아직 한 번도 어느 네트워크에도 안 낀 애"
            visited[i] = 1; // 방문 표시
            queue.offer(i); // BFS 시작점 큐에 삽입
            cnt++; // 네트워크 추가
            
            // i와 연결된 모든 컴퓨터 방문 표시 (같은 네트워크)
            while (!queue.isEmpty()) {
                int cur = queue.poll();
                // cur과 직접 연결된 컴퓨터들을 전부 확인 (0 ~ n-1번 다 봐야 함)
                for (int j = 0; j < n; j++) {
                    // 직접 연결(1) 이면서 아직 방문 안된 컴퓨터
                    if(computers[cur][j] == 1 && visited[j] == -1){
                        visited[j] = 1;
                        queue.offer(j);
                    }
                }
            }
            // while문 종료 = i에서 시작해서 도달 가능한 모든 컴퓨터를 다 방문 처리한 것 
        }
        return cnt;
        
    }
}