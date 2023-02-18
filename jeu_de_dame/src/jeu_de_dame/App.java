package jeu_de_dame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jeu_de_dame.Pawn.King.Move;

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

	public abstract boolean isValidMove(Move move, Piece[][] board);

	public boolean canMove(Piece[][] board, int endX, int endY) {
		int startX = getX();
		int startY = getY();

		// vérifier si la case de destination est sur le plateau
		if (endX < 0 || endX > 7 || endY < 0 || endY > 7) {
			return false;
		}

		// vérifier si la case de destination est occupée par une pièce de la même
		// couleur
		if (board[endX][endY] != null && board[endX][endY].getColor() == color) {
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

		// vérifier si la case de destination est occupée par une pièce de la même
		// couleur
		if (board[endX][endY] != null && board[endX][endY].getColor() == color) {
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

		return true;
	}
}

abstract class Pawn extends Piece {
	private boolean isKing;

	public Pawn(Color color, int x, int y) {
		super(color, x, y);
		this.isKing = false;
	}

	abstract class King extends Piece {
		public King(Color color, int x, int y) {
			super(color, x, y);
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

			public Move getMove(Scanner scanner) {
				System.out.print(name + ", entrez les coordonnées de la case de départ (ex. a2) : ");
				String start = scanner.next();
				System.out.print(name + ", entrez les coordonnées de la case d'arrivée (ex. b3) : ");
				String end = scanner.next();
				int startX = start.charAt(0) - 'a';
				int startY = Integer.parseInt(start.charAt(1) + "") - 1;
				int endX = end.charAt(0) - 'a';
				int endY = Integer.parseInt(end.charAt(1) + "") - 1;
				return new Move(startX, startY, endX, endY);
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

		    public boolean isValid(Piece[][] board) {
		        Piece piece = board[startX][startY];
		        if (piece == null) {
		            return false;
		        }
		    		  // Vérifier si le mouvement est valide pour cette pièce
		            if (!piece.isValidMove(this, board)) {
		                return false;
		            }

		            // Vérifier si la pièce peut capturer une autre pièce
		            if (piece.canCapture(board, endX, endY)) {
		                return true;
		            }

		            // Vérifier si la case d'arrivée est vide
		            if (board[endX][endY] != null) {
		                return false;
		            }

		            // Vérifier si la pièce se déplace de deux cases en avant
		            if (Math.abs(endX - startX) == 2) {
		                int captureX = (startX + endX) / 2;
		                int captureY = (startY + endY) / 2;
		                Piece capturedPiece = board[captureX][captureY];
		                if (capturedPiece == null || capturedPiece.getColor() == piece.getColor()) {
		                    return false;
		                }
		            }

		            // Vérifier si la pièce atteint le bord opposé pour devenir une dame
		            if (endX == 0 && piece.getColor() == Color.BLACK) {
		                piece.setIsKing(true);
		            } else if (endX == 7 && piece.getColor() == Color.WHITE) {
		                piece.setIsKing(true);
		            }

		            return true;
		        }

		        public Piece[][] execute(Piece[][] board) {
		            Piece[][] newBoard = cloneBoard(board);
		            newBoard[startX][startY] = null;
		            newBoard[endX][endY] = board[startX][startY];

		            // Capturer une pièce si nécessaire
		            if (Math.abs(endX - startX) == 2) {
		                int captureX = (startX + endX) / 2;
		                int captureY = (startY + endY) / 2;
		                newBoard[captureX][captureY] = null;
		            }

		            return newBoard;
		        }

		        private Piece[][] cloneBoard(Piece[][] board) {
		            Piece[][] newBoard = new Piece[8][8];
		            for (int i = 0; i < 8; i++) {
		                for (int j = 0; j < 8; j++) {
		                    Piece piece = board[i][j];
		                    if (piece != null) {
		                        newBoard[i][j] = piece.copy();
		                    }
		                }
		            }
		            return newBoard;
		        }
		    }
	}
}
