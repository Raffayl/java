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

    public void setIsKing(boolean isKing) {
        this.isKing = isKing;
    }

    public boolean getIsKing() {
        return true;
    }
}
public Piece copy() {
    if (isKing) {
        return new King(color, getX(), getY());
    } else {
        return new Pawn(color, getX(), getY());
    }
}

public boolean isValidMove(Move move, Piece[][] board) {
    int startX = move.getStartX();
    int startY = move.getStartY();
    int endX = move.getEndX();
    int endY = move.getEndY();

    // Vérifier si la case de départ est la même que la case d'arrivée
    if (startX == endX && startY == endY) {
        return false;
    }

    // Vérifier si la case de destination est vide ou peut être capturée
    if (!canMove(board, endX, endY) && !canCapture(board, endX, endY)) {
        return false;
    }

    // Vérifier si la pièce se déplace en diagonale de 1 case
    if (Math.abs(endX - startX) == 1 && Math.abs(endY - startY) == 1) {
        return true;
    }

    // Vérifier si la pièce peut capturer une autre pièce
    if (Math.abs(endX - startX) == 2) {
        int captureX = (startX + endX) / 2;
        int captureY = (startY + endY) / 2;
        Piece capturedPiece = board[captureX][captureY];
        if (capturedPiece == null || capturedPiece.getColor() == color) {
            return false;
        }
        return true;
    }

    return false;
}

public boolean isKing() {
    return isKing;
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
                ((Pawn) piece).setKing(true);
            } else if (endX == 7 && piece.getColor() == Color.WHITE) {
                ((Pawn) piece).setKing(true);
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

class Board {
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {
                    if (i < 3) {
                        board[i][j] = new Pawn(Color.BLACK, i, j);
                    } else if (i > 4) {
                        board[i][j] = new Pawn(Color.WHITE, i, j);
                    }
                }
            }
        }
    }

    public Piece getPiece(int x, int y) {
        return board[x][y];
    }
    public void movePiece(Move move) {
        board = move.execute(board);
    }

    public boolean isGameOver() {
        boolean blackExists = false;
        boolean whiteExists = false;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Piece piece = board[i][j];
                if (piece != null) {
                    if (piece.getColor() == Color.BLACK) {
                        blackExists = true;
                    } else {
                        whiteExists = true;
                    }
                }
            }
        }
        return !blackExists || !whiteExists;
    }

    public String toString() {
        String s = "  ";
        for (int i = 0; i < 8; i++) {
            s += (char) ('a' + i) + " ";
        }
        s += "\n";
        for (int i = 0; i < 8; i++) {
            s += (i + 1) + " ";
            for (int j = 0; j < 8; j++) {
                Piece piece = board[i][j];
                if (piece == null) {
                    s += "- ";
                } else if (piece.getColor() == Color.BLACK) {
                    if (piece.getIsKing()) {
                        s += "B ";
                    } else {
                        s += "b ";
                    }
                } else {
                    if (piece.getIsKing()) {
                        s += "W ";
                    } else {
                        s += "w ";
                    }
                }
            }
            s += (i + 1) + "\n";
        }
        s += "  ";
        for (int i = 0; i < 8; i++) {
            s += (char) ('a' + i) + " ";
        }
        return s;
    }
}

public class CheckersGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Créer un plateau de jeu
        Board board = new Board();

        // Créer les joueurs
        Player player1 = new Player("Joueur 1", Color.BLACK);
        Player player2 = new Player("Joueur 2", Color.WHITE);

        // Boucle de jeu
        boolean gameIsOver = false;
        Player currentPlayer = player1;
        while (!gameIsOver) {
            System.out.println(board);
            Move move = currentPlayer.getMove(scanner);
            if (move.isValid(board.getBoard())) {
                board.movePiece(move);
                if (currentPlayer == player1) {
                    currentPlayer = player2;
                } else {
                    currentPlayer = player1;
                }
            } else {
                System.out.println("Mouvement invalide, veuillez réessayer");
            }
            gameIsOver = board.isGameOver();
        }

        // Afficher le gagnant
        if (currentPlayer == player1) {
            System.out.println("Joueur 2 a gagné !");
        } else {
            System.out.println("Joueur 1 a gagné !");
        }
    }
}
}