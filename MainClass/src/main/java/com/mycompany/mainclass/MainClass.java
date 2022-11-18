/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mainclass;
import Board.GameBoard;

/**
 *
 * @author Abderraouf
 */




public class MainClass {

    public static void main(String[] args) {
        GameBoard board = new GameBoard(7,7);
        board.showBoard();
        /*while(!board.checkShuffledBoard()){
            board.reshuffle();
        }*/
        board.updateBoard();
        System.out.println("\n\n");
        board.showBoard();
    }
}
