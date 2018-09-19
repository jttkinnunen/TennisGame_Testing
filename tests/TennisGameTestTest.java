import static org.junit.Assert.*;

import org.junit.Test;

//public class TennisGameTestTest extends TennisGameTest {
public class TennisGameTestTest  {
	// Here is the format of the scores: "player1Score - player2Score"
	// "love - love" done
	// "deuce" done
		
	
	// "15 - 15" done
	@Test
	public void testTennisGame_Score_15_15() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "15 - 15", score);
	}
	// "30 - 30"
	@Test
	public void testTennisGame_Score_30_30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		//Act
				String score = game.getScore() ;
				// Assert
				assertEquals("Tie score incorrect", "30 - 30", score);
	}
	// "15 - love", "love - 15"
	@Test
	public void testTennisGame_Score_15_love() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		//game.player2Scored();
		
		//Act
				String score = game.getScore() ;
				// Assert
				assertEquals("15 love score incorrect", "15 - love", score);
	}
	
	// "15 - love", "love - 15"
		@Test
		public void testTennisGame_Score_love_15() throws TennisGameException {
			//Arrange
			TennisGame game = new TennisGame();
			
			//game.player1Scored();
			game.player2Scored();
			
			//Act
					String score = game.getScore() ;
					// Assert
					assertEquals("love 15 score incorrect", "love - 15", score);
		}
	// "30 - love"
		@Test
		public void testTennisGame_Score_30_love() throws TennisGameException {
			//Arrange
			TennisGame game = new TennisGame();
			
			//game.player1Scored();
			game.player1Scored();
			game.player1Scored();
			//Act
			String score = game.getScore() ;
			// Assert
			assertEquals("30 love score incorrect", "30 - love", score);
		}
		//  "love - 30"
				@Test
				public void testTennisGame_Score_love_30() throws TennisGameException {
					//Arrange
					TennisGame game = new TennisGame();
					
					game.player2Scored();
					game.player2Scored();
					//Act
							String score = game.getScore() ;
							// Assert
							assertEquals("love 30 score incorrect", "love - 30", score);
				}
		// "40 - love"
			@Test
			public void testTennisGame_Score_40_love() throws TennisGameException {
				//Arrange
				TennisGame game = new TennisGame();
					
					game.player1Scored();
					game.player1Scored();
					game.player1Scored();
					//Act
							String score = game.getScore() ;
							// Assert
							assertEquals("40 love score incorrect", "40 - love", score);
				}
		//  "love - 40"
			@Test
			public void testTennisGame_Score_love_40() throws TennisGameException {
							//Arrange
							TennisGame game = new TennisGame();
							
							game.player2Scored();
							game.player2Scored();
							game.player2Scored();
							//Act
							String score = game.getScore() ;
							// Assert
							assertEquals("love 40 score incorrect", "love - 40", score);
			}
		// "30 - 15"
			@Test
			public void testTennisGame_Score_30_15() throws TennisGameException {
				//Arrange
				TennisGame game = new TennisGame();
					
					game.player2Scored();
					game.player1Scored();
					game.player1Scored();
					//Act
							String score = game.getScore() ;
							// Assert
							assertEquals("30 15 score incorrect", "30 - 15", score);
				}
		//  "15 - 30"
			@Test
			public void testTennisGame_Score_15_30() throws TennisGameException {
							//Arrange
							TennisGame game = new TennisGame();
							
							game.player1Scored();
							game.player2Scored();
							game.player2Scored();
							//Act
							String score = game.getScore() ;
							// Assert
							assertEquals("15 30 score incorrect", "15 - 30", score);
			}
		// "40 - 15"
			@Test
			public void testTennisGame_Score_40_15() throws TennisGameException {
				//Arrange
				TennisGame game = new TennisGame();
					
					game.player2Scored();
					game.player1Scored();
					game.player1Scored();
					game.player1Scored();
					//Act
							String score = game.getScore() ;
							// Assert
							assertEquals("40 15 score incorrect", "40 - 15", score);
				}
		//  "15 - 40"
			@Test
			public void testTennisGame_Score_15_40() throws TennisGameException {
							//Arrange
							TennisGame game = new TennisGame();
							
							game.player2Scored();
							game.player1Scored();
							game.player2Scored();
							game.player2Scored();
							//Act
							String score = game.getScore() ;
							// Assert
							assertEquals("15 40 score incorrect", "15 - 40", score);
			}
			// "player1 has advantage"
			@Test
			public void testTennisGame_Score_player1_advance() throws TennisGameException {
				//Arrange
				TennisGame game = new TennisGame();
					
					game.player2Scored();
					game.player1Scored();
					game.player1Scored();
					game.player2Scored();
					game.player1Scored();
					game.player2Scored();
					game.player1Scored();
					//Act
							String score = game.getScore() ;
							// Assert
							assertEquals("player1 advance score incorrect", "player1 has advantage", score);
				}			
			
			
			// "player2 has advantage"
			@Test
			public void testTennisGame_Score_player2_advance() throws TennisGameException {
				//Arrange
				TennisGame game = new TennisGame();
					
					game.player2Scored();
					game.player1Scored();
					game.player1Scored();
					game.player2Scored();
					game.player1Scored();
					game.player2Scored();
					game.player2Scored();
					//Act
					String score = game.getScore() ;
					// Assert
					assertEquals("player2 advance score incorrect", "player2 has advantage", score);
				}
			
			// "player1 wins"
			@Test 
			public void testTennisGame_Player1WinsPointAfterGameEnded() throws TennisGameException {
				//Arrange
				TennisGame game = new TennisGame();
				//Act
				game.player1Scored();
				game.player1Scored();
				game.player1Scored();
				game.player1Scored();
				
				//Act
				String score = game.getScore() ;
				// Assert
				assertEquals("player1 wins score incorrect", "player1 wins", score);
			}
			
			// "player2 wins"
			@Test
			public void testTennisGame_Player2WinsPointAfterGameEnded() throws TennisGameException {
				//Arrange
				TennisGame game = new TennisGame();
				//Act
				game.player2Scored();
				game.player2Scored();
				game.player2Scored();
				game.player2Scored();
				
				//Act
				String score = game.getScore() ;
				// Assert
				assertEquals("player2 wins score incorrect", "player2 wins", score);
			}
}	
