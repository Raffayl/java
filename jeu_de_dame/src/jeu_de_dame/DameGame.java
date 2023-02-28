package jeu_de_dame;

enum Color {
	WHITE, BLACK
}

abstract class Piece {
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

	public boolean isValidMove(Move move, Piece[][] board) {
		int startX = move.getStartX();
		int startY = move.getStartY();
		int endX = move.getEndX();
		int endY = move.getEndY();

		// Vérifier si la case de départ contient la pièce en question
		if (board[startX][startY] != this) {
			return false;
		}

		// Vérifier si la case d'arrivée est valide pour ce mouvement
		if (!canMove(board, endX, endY)) {
			return false;
		}

		// Vérifier si la case d'arrivée est sur la même diagonale que la case de départ
		if (Math.abs(endX - startX) != Math.abs(endY - startY)) {
			return false;
		}

		// Vérifier si le mouvement est valide pour une capture
		if (canCapture(board, endX, endY)) {
			return true;
		}

		// Vérifier si le mouvement est valide pour une simple avancée
		if (Math.abs(endX - startX) == 1 && Math.abs(endY - startY) == 1) {
			return true;
		}

		// Vérifier si le mouvement est valide pour une avancée de deux cases
		if (Math.abs(endX - startX) == 2 && Math.abs(endY - startY) == 2) {
			int captureX = (startX + endX) / 2;
			int captureY = (startY + endY) / 2;
			Piece capturedPiece = board[captureX][captureY];
			if (capturedPiece != null && capturedPiece.getColor() != this.getColor()) {
				return true;
			}
		}

		return false;
	}

	public boolean canMove(Piece[][] board, int endX, int endY) {
		int startX = getX();
		int startY = getY();
		// vérifier si la case de destination est sur le plateau
		if (endX < 0 || endX > 7 || endY < 0 || endY > 7) {
			return false;
		}

		// vérifier si la case de destination est occupée par une pièce
		if (board[endX][endY] != null) {
			return false;
		}

		// vérifier si la pièce se déplace dans la bonne direction
		if (color == Color.WHITE && endX <= startX) {
			return false;
		}

		if (color == Color.BLACK && endX >= startX) {
			return false;
		}

		// vérifier si la pièce se déplace en diagonale
		if (Math.abs(endX - startX) != Math.abs(endY - startY)) {
			return false;
		}

		return true;
	}

	public boolean canCapture(Piece[][] board, int endX, int endY) {
		int startX = getX();
		int startY = getY();

		// vérifier si la case de destination est sur le plateau
		if (endX < 0 || endX > 7 || endY < 0 || endY > 7) {
			return false;
		}

		// vérifier si la case de destination est occupée par une pièce
		if (board[endX][endY] != null) {
			return false;
		}

		// vérifier si la pièce se déplace dans la bonne direction
		if (color == Color.WHITE && endX <= startX) {
			return false;
		}

		if (color == Color.BLACK && endX >= startX) {
			return false;
		}

		// vérifier si une pièce est capturée
		if (Math.abs(endX - startX) == 2) {
			int captureX = (startX + endX) / 2;
			int captureY = (startY + endY) / 2;
			Piece capturedPiece = board[captureX][captureY];
			if (capturedPiece == null || capturedPiece.getColor() == color) {
				return false;
			}
		}

		// vérifier si la pièce se déplace en diagonale
		if (Math.abs(endX - startX) != Math.abs(endY - startY)) {
			return false;
		}

		return true;
	}
}

abstract class Pawn extends Piece {
	private boolean isKing;

	public Pawn(Color color, int x, int y) {
		super(color, x, y);
		this.isKing = false;
	}

	public boolean getIsKing() {
		return isKing;
	}
}

public class DameGame {
	private String[][] board;
	private String currentPlayer;

	public DameGame() {
		// Initialise le plateau
		board = new String[8][8];
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				board[row][col] = " ";
			}
		}

		// places les pions en positions de depart
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				if ((row + col) % 2 == 1 && row < 3) {
					board[row][col] = "O";
				} else if ((row + col) % 2 == 1 && row > 4) {
					board[row][col] = "X";
				}
			}
		}

		// Initialise le joueur courant
		currentPlayer = "X";
	}

	public String getCurrentPlayer() {
		return currentPlayer;
	}

	public boolean isValidMove(int startX, int startY, int endX, int endY) {
		// Vérifier si les coordonnées de départ sont valides
		if (startX < 0 || startX > 7 || startY < 0 || startY > 7) {
			return false;
		}

		// Vérifier si les coordonnées de destination sont valides
		if (endX < 0 || endX > 7 || endY < 0 || endY > 7) {
			return false;
		}

		// Vérifier si la case de départ contient une pièce du joueur courant
		if (!board[startX][startY].equals(currentPlayer)) {
			return false;
		}

		// Vérifier si le mouvement est valide pour une simple avancée
		if (Math.abs(endX - startX) == 1 && Math.abs(endY - startY) == 1) {
			return true;
		}

		// Vérifier si le mouvement est valide pour une avancée de deux cases
		if (Math.abs(endX - startX) == 2 && Math.abs(endY - startY) == 2) {
			int captureX = (startX + endX) / 2;
			int captureY = (startY + endY) / 2;
			String capturedPiece = board[captureX][captureY];
			if (capturedPiece.equals(getOpponent())) {
				return true;
			}
		}

		return false;
	}

	private Object getOpponent() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isGameOver() {
		// Vérifier si l'un des joueurs n'a plus de pions
		int xCount = 0;
		int oCount = 0;
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				if (board[row][col].equals("X")) {
					xCount++;
				} else if (board[row][col].equals("O")) {
					oCount++;
				}
			}
		}
		return xCount == 0 || oCount == 0;
	}

	public void printBoard() {
		System.out.println("  0 1 2 3 4 5 6 7");
		for (int row = 0; row < 8; row++) {
			System.out.print(row + " ");
			for (int col = 0; col < 8; col++) {
				System.out.print(board[row][col] + " ");
			}
			System.out.println(row);
		}
		System.out.println("  0 1 2 3 4 5 6 7");
	}



	public boolean checkWin(String currentPlayer2) {
		// TODO Auto-generated method stub
		return false;
	}

	public void movePiece(int startX, int startY, int endX, int endY) {
		// TODO Auto-generated method stub
		
	}

}
