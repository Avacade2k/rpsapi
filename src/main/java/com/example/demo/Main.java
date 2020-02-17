package com.example.demo;

public class Main {
	
	public static String winner;
	public static int ties;
	public static int userW, userL;
	public static int user2W, user2L;
		
	public static void decideWinner(String user1, String user2) {
		if (user1.equals(user2)){
			ties++;
			winner = "tie";
		}
		else if (user1.equals("Rock")) {
            if (user2.equals("Scissors")) {
            	userW++;
            	user2L++;
            	winner = "user1";
            }
            else if (user2.equals("Paper")) {
                userL++;
                user2W++;
                winner = "user2";
            }
		}
		else if (user1.equals("Paper")) {
            if (user2.equals("Scissors")) {
                userL++;
                user2W++;
                winner = "user2";
            }
            else if (user2.equals("Rock")) {
            	userW++;
            	user2L++;
            	winner = "user1";
			}
		}
		else if (user1.equals("Scissors")) {
            if (user2.equals("Paper")) {
            	userW++;
            	user2L++;
            	winner = "user1";
			}
            else if (user2.equals("Rock")) {
                userL++;
                user2W++;
                winner = "user2";
            }
		}
		
	}
}
