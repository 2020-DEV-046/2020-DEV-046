package com.tictactoe.kata.game;

import org.springframework.stereotype.Component;

/**
 * Tic tac toe game processing class that calculate outcome of game based on
 * both player choices.
 * 
 * @author AKS1405
 *
 */
@Component
public class TicTacToeGameProcessor {

	private GAME_STATE[][] board = new GAME_STATE[3][3];	

	// Initialize board array with blank state of game
	public TicTacToeGameProcessor() {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				board[row][col] = GAME_STATE.BLANK;
			}
		}
	}

	// Mark circle in game board and change state of that square to circle
	public boolean markCircle(int row, int col) {
		return mark(row, col, GAME_STATE.CIRCLE);
	}

	// Mark cross in game board and change state of that square to cross
	public boolean markCross(int row, int col) {
		return mark(row, col, GAME_STATE.CROSS);
	}

	private boolean mark(int row, int col, GAME_STATE gameState) {
		if (board[row][col] == GAME_STATE.BLANK) {
			board[row][col] = gameState;
			return true;
		}
		return false;
	}
	
	public GAME_STATE[][] getBoard() {
		return this.board;
	}

	public boolean isCircle(int row, int col) {
		return board[row][col] == GAME_STATE.CIRCLE;
	}

	public boolean isCross(int row, int col) {
		return board[row][col] == GAME_STATE.CROSS;
	}	
}
