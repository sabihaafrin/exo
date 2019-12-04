/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author 19101136
 */
public class ttt {

    public static int row, col;
    public static Scanner sc = new Scanner(System.in);
    public static char board[][] = new char[3][3];
    public static char turn = 'X';
    

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }
        Play();
    }

    public static void play() {
        boolean playing = true;
        PrintBoard();
        while (playing) {
            System.out.println("please enter a row and a column:");
            row = sc.nextInt() - 1;
            col = sc.nextInt() - 1;
            board[row][col] = turn;
            if (GameOver( row, col)) {
                playing = false;
                System.out.println("Game over! player" + turn + "wins.");
            }
            PrintBoard();
            if (turn == 'X') {
                turn = 'O';
            } else {
                turn = 'X';
            }
        }
    }

    public static void PrintBoard() 
        {
            for (int i = 0; i < 3; i++) {
                System.out.println();
                for (int j = 0; j < 3; j++) {
                    if (j == 0) {
                        System.out.print("| ");
                    }
                    System.out.print(board[i][j] + " | ");
                }
            }
            System.out.println();
        }
 
 
     

    public boolean Gameover(int rMove, int cMove) {
        // perpendicular win
        if (board[0][cMove] == board[1][cMove] && board[0][cMove] == board[2][cMove]) {
            return true;
        }
        if (board[0][rMove] == board[1][rMove] && board[0][rMove] == board[2][rMove]) {
            return true;
        }
        //if diagonal win
        if ((board[0][0] == board[1][1]) && (board[0][0] == board[2][2]) && (board[1][1] != '_')) {
            return true;
        }
        if ((board[0][2] == board[1][1]) && (board[0][0] == board[0][2]) && (board[2][0] != '_')) 
            
        
            return true;
        
        return false;

    }
}
