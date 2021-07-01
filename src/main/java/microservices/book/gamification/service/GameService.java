package microservices.book.gamification.service;

import microservices.book.gamification.domain.GameStats;
import microservices.book.gamification.domain.ScoreCard;

public interface GameService {
	
	GameStats newAttemptForUser(Long userId, Long attempId, boolean correct);
	
	GameStats retrieveStatsForUser(Long userId);
	
	ScoreCard getScoreForAttempt(Long attempId);

}
