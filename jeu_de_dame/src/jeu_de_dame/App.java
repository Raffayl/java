package jeu_de_dame;

import java.util.Scanner;

enum Color {
	WHITE, BLACK
}

class Piece {
	private Color color;
	private int x;
	private int y;

	public Piece(Color color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

class Move {
	private int startX;
	private int startY;
	private int endX;
	private int endY;

	public Move(int startX, int startY, int endX, int endY) {
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}

	public int getStartX() {
		return startX;
	}

	public int getStartY() {
		return startY;
	}

	public int getEndX() {
		return endX;
	}

	public int getEndY() {
		return endY;
	}
}

class Player {
	private String name;
	private Color color;

	public Player(String name, Color color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

	public Move getMove(Board board) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println(getName() + " (" + getColor() + ") turn:");
		System.out.print("Enter start x: ");
		int startX = Scanner.nextInt();
		System.out.print("Enter start y: ");
		int startY = Scanner.nextInt();
		System.out.print("Enter end x: ");
		int endX = Scanner.nextInt();
		System.out.print("Enter end y: ");
		int endY = Scanner.nextInt();
		return new Move(startX, startY, endX, endY);
	}
}

class Board {
	private Piece[][] grid;

	public Board() {
		this.grid = new Piece[8][8];
	}

	public void makeMove(Move move) {
		// code to make the move on the board
	}

	public boolean isGameOver() {
		// code to determine if the game is over
		return false;
	}
}

class Queen extends Piece {
	public Queen(Color color, int x, int y) {
		super(color, x, y);
	}

	public class Pawn {
		private int x;
		private int y;
		private boolean isWhite;
		private boolean isQueen;

		public Pawn(int x, int y, boolean isWhite, boolean isQueen) {
			this.x = x;
			this.y = y;
			this.isWhite = isWhite;
			this.isQueen = isQueen;
		}

		class Pawnmoove extends Piece {
			public Pawnmoove(Color color, int x, int y) {
				super(color, x, y);
			}

			public boolean isValidMove(Move move, Piece[][] board) {
				int destX = move.getEndX();
				int destY = move.getEndY();
				int startX = move.getStartX();
				int startY = move.getStartY();
				int direction = getColor() == Color.WHITE ? 1 : -1;

				if (startX + direction == destX && startY == destY) {
					// Le mouvement est un déplacement simple d'une case vers l'avant
					if (board[destX][destY] == null) {
						return true;
					} else {
						return false;
					}
				} else if (startX + direction == destX && Math.abs(startY - destY) == 1) {
					// Le mouvement est une prise de pièce
					if (board[destX][destY] != null && board[destX][destY].getColor() != getColor()) {
						return true;
					} else {
						return false;
					}
				} else {
					// Le mouvement n'est pas valide pour une pièce Pawn
					return false;
					
				}
			}
		}
	}
}
