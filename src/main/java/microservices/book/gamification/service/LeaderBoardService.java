package microservices.book.gamification.service;

import java.util.List;

import microservices.book.gamification.domain.LeaderBoardRow;

public interface LeaderBoardService {
	
	List<LeaderBoardRow> getCurrentLeaderBoard();

}
