package jeu_de_dame;

public class Board {
	private Piece[][grid];private int
	private booleean whiteTurn

	public Board(int size) {
		this.size = size;
		this.grid = newPiece[size][size];
		this.whiteTurne = true;
		initializePieces();
	}

	private void initializePieces() {

	}

	public Piece getPiece(int x, int y) {
		return grid[x][y];
	}

	public void setPiece(int x, int y, Piece Piece) {
		grid[x][y] = piece;
	}

public boolean isWhiteTurn( {
	whiteTurn;
}

	public void changeturn = !witheTurn;
}

