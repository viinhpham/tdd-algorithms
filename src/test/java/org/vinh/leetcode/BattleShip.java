package org.vinh.leetcode;

import java.util.List;

/**
 * Author : Vinh Pham.
 * Date: 7/17/21.
 * Time : 6:09 PM.
 */
public class BattleShip {


	public static void play(String playerOneShips, List<String> playerTwoGuesses) {
		// D2 B2 E1 E3

		String[] ships = playerOneShips.split(" ");

		//validate player 1 input
		if (!isValueBattleShip(ships)) {
			System.out.println("Invalid");
			return;
		}

		//build the battle ship matrix
		char[][] boardGame = new char[6][6];
		for (int i = 0; i < boardGame.length; i++) {
			for(int j = 0; j < boardGame[0].length; j++) {

			}
		}


		// check P2 guesses
		playerTwoGuesses.stream().forEach( s -> {


		});
	}

	private static boolean isValueBattleShip(String [] ships) {

		if (ships.length == 0 || ships.length > 6) {
			return false;
		}

		for (int i = 0; i < ships.length - 1; i++) {
			if (ships[i].charAt(0) == ships[i+1].charAt(0)) {
				if ((int)(ships[i + 1].charAt(1)) - (int)(ships[i].charAt(1)) != 2) {
					return false;
				}
			}

			if (ships[i].charAt(1) == ships[i+1].charAt(1)) {
				if ((ships[i + 1].charAt(1)) - (ships[i].charAt(1)) != 2) {
					return false;
				}
			}
		}

		return true;
	}

}
