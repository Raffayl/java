
package jeu_de_dame;
import java.util.Scanner;
import java.util.ArrayList;

class Piece {
    public enum Color {
        WHITE, BLACK
    }

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

public class App{
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}

class Game {
	private Player currentPlayer;
	   private Piece[][] board
	    // code ...
	   
	        // initialize the board 
	        board = new Piece[8][8]
	    
	    public boolean isValidMove(Move move) {
	        // Check if the start and end positions are within the board bounds
	        int startX = move.getStartX();
	        int startY = move.getStartY();
	        int endX = move.getEndX();
	        int endY = move.getEndY();
	        if(startX<0 || startX > 8 || startY<0 || startY > 8) return false;
	        if(endX<0 || endX > 8 || endY<0 || endY > 8) return false;
	        // check if the piece at the start position belongs to the current player
	        if (board[startX][startY].getColor() != currentPlayer.getColor()) return false;
	        // check if the end position is a valid destination for the piece
	        if (board[endX][endY].getColor() == currentPlayer.getColor()) return false;
	        // check if the move respect the rules of the piece
	        if (board[startX][startY].isPiece() ) {
	            if(startX-endX != 1 || Math.abs(startY-endY) != 1) return false;
	        } else {
	            // check for special moves for queen
	        }
	        // Check for captures
	        // check if the game is blocked
	        return true;
	    }
	
    
    private Player player1;
    private Player player2;

    public Game() {
        this.board = new Board();
        this.player1 = new Player("Player 1", Piece.Color.WHITE);
        this.player2 = new Player("Player 2", Piece.Color.BLACK);
    }

    public void start() {
        while (true) {
            // Print the current state of the board
            System.out.println(board);

            // Get the current player's move
            Player currentPlayer = getCurrentPlayer();
            Move move = currentPlayer.getMove(board);

            // Validate the move
            while (!board.isValidMove(move)) {
                System.out.println("Invalid move,\n please try again.");
                move = currentPlayer.getMove(board);
            }

            // Make the move on the board
            board.makeMove(move);

            // Check if the game is over
            if (board.isGameOver()) {
                System.out.println("Game over! The winner is: " + currentPlayer.getName());
                break;
            }

            // Switch players
            switchPlayers();
        }
    }

    private Player getCurrentPlayer() {
    	
        // Code to determine the current player
    	return player1;
    }

    private void switchPlayers() {
        // Code to switch the current player
    }
}


class Board {
private ArrayList<Piece> pieces;
    //remaining code 
    public boolean isValidMove(Move move) {
    	// code to check if the move is valid according to the rules of the game
    	// Check if the start and end positions are within the board bounds
        int startX = move.getStartX();
        int startY = move.getStartY();
        int endX = move.getEndX();
        int endY = move.getEndY();
        if(startX<0 || startX > 8 || startY<0 || startY > 8) return false;
        if(endX<0 || endX > 8 || endY<0 || endY > 8) return false;
        // check if the piece at the start position belongs to the current player
        if (board[startX][startY].getColor() != currentPlayer.getColor()) return false;
        // check if the end position is a valid destination for the piece
        if (board[endX][endY].getColor() == currentPlayer.getColor()) return false;
        // check if the move respect the rules of the piece
        if (board[startX][startY].isPiece() ) {
            if(startX-endX != 1 || Math.abs(startY-endY) != 1) return false;
        } else {
            // check for special moves for queen
        }
        // Check for captures
        // check if the game is blocked
        return true;
    }
    public boolean isGameOver() {
        // code to check if the game is over
    }
    public void makeMove(Move move) {
        // code to make the move on the board, including capturing pieces if applicable
        // and promoting pawns if they reach the opposite side
    }
    public String toString() {
        // code to create a string representation of the board
    }
}

class Player {
	   public boolean isValidMove(Move move) {
	        // check if the move is valid, for example:
	        // 1. Check if the start and end positions are within the board bounds
	        // 2. Check if the piece at the start position belongs to the current player
	        // 3. Check if the end position is a valid destination for the piece
	        // 4. return true if the move is valid, false otherwise
	        int startX = move.getStartX();
	        int startY = move.getStartY();
	        int endX = move.getEndX();
	        int endY = move.getEndY();
	        
	        if(startX<0 || startX > 8 || startY<0 || startY > 8) return false; //verify if startX and startY are inside the board limit
	        if(endX<0 || endX > 8 || endY<0 || endY > 8) return false; //verify if endX and endY are inside the board limit
	        //more control here
	        return true;
	   }
    private String name;
    private Piece.Color color;
    

    public Player(String name, Piece.Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public Piece.Color getColor() {
        return this.color;
    }

    public Move getMove(Board board) {
    	private Scanner input = new Scanner(System.in);
    	   // Reading input from the console for startX, startY, endX, endY
        int startX = input.nextInt();
        int startY = input.nextInt();
        int endX = input.nextInt();
        int endY = input.nextInt();
        // create Move object with user inputs
        return new Move(startX, startY, endX, endY);
    }
}
	   
