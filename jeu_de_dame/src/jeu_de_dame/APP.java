package jeu_de_dame;

import java.util.Scanner;
import jeu_de_dame.DameGame;

public class APP {

	public static void main(String[] args) {
		DameGame game = new DameGame();
		Scanner scanner = new Scanner(System.in);
		boolean gameFinished = false;
		String currentPlayer = "X";

		while (!gameFinished) {
			// demander au joueur courant de jouer
			System.out.println("C'est au tour du joueur " + currentPlayer + ".");
			game.printBoard();
			System.out.print("Veuillez saisir les coordonnées de la pièce à déplacer (ligne colonne) : ");
			int startX = scanner.nextInt();
			int startY = scanner.nextInt();
			System.out.print("Veuillez saisir les coordonnées de la case d'arrivée (ligne colonne) : ");
			int endX = scanner.nextInt();
			int endY = scanner.nextInt();

			// vérifier si le mouvement est valide et mettre à jour le plateau de jeu
			if (game.isValidMove(startX, startY, endX, endY)) {
				game.movePiece(startX, startY, endX, endY);

				// vérifier si le joueur courant a gagné
				if (game.checkWin(currentPlayer)) {
					System.out.println("Le joueur " + currentPlayer + " a gagné !");
					gameFinished = true;
				} else {
					// passer au joueur suivant
					currentPlayer = currentPlayer.equals("X") ? "O" : "X";
				}
			} else {
				System.out.println("Le mouvement est invalide, veuillez réessayer.");
			}
		}
		scanner.close();
	}

}