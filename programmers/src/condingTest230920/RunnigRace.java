package condingTest230920;

import java.util.HashMap;
import java.util.Map;

//달리기 경주
class RunningRace {
	
    public String[] solution(String[] players, String[] callings) {
    	
    	Map<String, Integer> rankMap = new HashMap<>();
    	for (int i = 0; i < players.length; i++) {
			rankMap.put(players[i], i);
		}
    	
    	for (String player : callings) {
			
    		//현재 등수 호출
    		int rank = rankMap.get(player);
    		
    		//앞선 선수 호출
    		String frontPlayer = players[rank-1];
    		
    		//배열 재배치
    		players[rank-1] = player;
    		players[rank] = frontPlayer;
    		
    		//rankMap 갱신
    		rankMap.put(player, rank-1);
    		rankMap.put(frontPlayer, rank);
    		
		}
    	
    	return players;
        
    }
    
}
