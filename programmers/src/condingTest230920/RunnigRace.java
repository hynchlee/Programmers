package condingTest230920;

import java.util.HashMap;
import java.util.Map;

//�޸��� ����
class RunningRace {
	
    public String[] solution(String[] players, String[] callings) {
    	
    	Map<String, Integer> rankMap = new HashMap<>();
    	for (int i = 0; i < players.length; i++) {
			rankMap.put(players[i], i);
		}
    	
    	for (String player : callings) {
			
    		//���� ��� ȣ��
    		int rank = rankMap.get(player);
    		
    		//�ռ� ���� ȣ��
    		String frontPlayer = players[rank-1];
    		
    		//�迭 ���ġ
    		players[rank-1] = player;
    		players[rank] = frontPlayer;
    		
    		//rankMap ����
    		rankMap.put(player, rank-1);
    		rankMap.put(frontPlayer, rank);
    		
		}
    	
    	return players;
        
    }
    
}
