package jeu_du_morpion;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Initialise la grille de jeu
        char[][] grid = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        Scanner scanner = new Scanner(System.in);
        char player = 'X';

        while (true) {
            // Affiche la grille de jeu
            System.out.println("  0 1 2");
            for (int i = 0; i < 3; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }

            // Demande la prochaine position à jouer au joueur
            System.out.print("Ligne (0-2) pour " + player + " : ");
            int row = scanner.nextInt();
            System.out.print("Colonne (0-2) pour " + player + " : ");
            int col = scanner.nextInt();

            // Met à jour la grille de jeu
            if (grid[row][col] == ' ') {
                grid[row][col] = player;

                // Vérifie si un joueur a gagné
                if (checkWin(grid, player)) {
                    System.out.println(player + " a gagné !");
                    break;
                }

                // Change de joueur
                player = (player == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Case déjà jouée, veuillez réessayer.");
            }
        }
    }

    private static boolean checkWin(char[][] grid, char player) {
        // Vérifie les lignes
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == player && grid[i][1] == player && grid[i][2] == player) {
                return true;
            }
        }

        // Vérifie les colonnes
        for (int j = 0; j < 3; j++) {
            if (grid[0][j] == player && grid[1][j] == player && grid[2][j] == player) {
                return true;
            }
        }

        // Vérifie les diagonales
        if (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) {
            return true;
        }
        if (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player) {
            return true;
            
        }

        return false;
       
    }
    
}