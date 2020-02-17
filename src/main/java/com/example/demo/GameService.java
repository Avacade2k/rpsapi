package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameService {

	@RequestMapping(value = "/Play", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String playerMove(String user1, String user2) {
		Main.decideWinner(user1, user2);
		String returnWinner = "Winner is "+ Main.winner;
		return returnWinner;
	}

	@RequestMapping(value = "/ScoreU1", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getScoreUser1() {
		String pattern = "{ \"wins\":\"%s\", \"losses\":\"%s\", \"ties\": \"%s\"\n}";
		return String.format(pattern, Main.userW, Main.userL, Main.ties);

	}
	
	@RequestMapping(value = "/ScoreU2", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getScoreUser2() {
		String pattern = "{ \"wins\":\"%s\", \"losses\":\"%s\", \"ties\": \"%s\"\n}";
		return String.format(pattern, Main.user2W, Main.user2L, Main.ties);

	}

}