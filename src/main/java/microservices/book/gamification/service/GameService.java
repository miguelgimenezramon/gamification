package microservices.book.gamification.service;

import microservices.book.gamification.domain.GameStats;

public interface GameService {
	
	GameStats newAttemptForUser(Long userId, Long attempId, boolean correct);
	
	GameStats retrieveStatsForUser(Long userId);

}
