/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Board;

import java.util.Random;
/**
 *
 * @author Abderraouf
 */
public class GameBoard {
    private int width;
    private int height;
    private int[][] board;
    public GameBoard(int height, int width){
        this.height = height;
        this.width = width;
        board = new int[height][width];
        for(int i=0; i<this.height; i++){
            for(int j=0; j<this.width; j++){
                Random r = new Random();
                board[i][j] = r.nextInt(6) + 1;
            }
        }
    }
    public void setHeight(int heigth){
        this.height = heigth;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public void showBoard(){
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                System.out.print(board[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
    public boolean checkShuffledBoard(){
        boolean shuffled = true;
        int realiser = 0;
            for(int i=0; i<height; i++){
            if(i == 0 || i == height-1){
                for(int k=1; k<width-1; k++){
                    int current = board[i][k];
                    int previous = board[i][k-1];
                    int next = board[i][k+1];
                    if((current == previous && current == next)){
                        shuffled = false;
                    }
                }
            }
            for(int j=0; j<width; j++){
                if(i>=1 && i<height-1 && j>=1 && j<width-1){
                    int current = board[i][j];
                    int previous = board[i][j-1];
                    int next = board[i][j+1];
                    int up = board[i-1][j];
                    int down = board[i+1][j];
                    if((current == previous && current == next) || (current == up && current == down)){
                        shuffled = false;
                    }
                }
                if((j == 0 || j == width-1) && realiser < 2){
                    for(int k=1; k<height-1; k++){
                        int current = board[k][j];
                        int up = board[k-1][j];
                        int down = board[k+1][j];
                        if((current == up && current == down)){                          
                            shuffled = false;
                        }
                    }
                    realiser += 1;
                }    
            }
        
        } 
            return shuffled;
    }
    public void reshuffle(){
        for(int i=0; i<this.height; i++){
            for(int j=0; j<this.width; j++){
                Random r = new Random();
                board[i][j] = r.nextInt(6) + 1;
            }          
        }
    }
    
    public void updateBoard(){
        int[][] update = new int[height][width];
        Random r = new Random();
        for (int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                update[i][j] = board[i][j];
            }
        }
        int realiser = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height-1) {
                    for (int k = 1; k < width-1; k++) {
                        int current = board[i][k];
                        int previous = board[i][k-1];
                        int next = board[i][k+1];
                        if (current == previous && current == next) {
                            update[i][k] = 0;
                            update[i][k-1] = 0;
                            update[i][k+1] = 0;                                
                        }
                    }
                }
                if((j == 0 || j == width-1) && realiser < 2){
                    for (int k = 1; k < height-1; k++) {
                        int current = board[k][j];
                        int top = board[k-1][j];
                        int bottom = board[k+1][j];
                        if (current == top && current == bottom) {
                            update[k][j] = 0;
                            update[k-1][j] = 0;
                            update[k+1][j] = 0;
                        }
                    }
                    realiser += 1;
                }if (i>0 && i<height-1 && j>0 && j<width-1) {
                    int current = board[i][j];
                    int top = board[i-1][j];
                    int bottom = board[i+1][j];
                    int previous = board[i][j-1];
                    int next = board[i][j+1];
                    if (current == previous && current == next) {
                        update[i][j] = 0;
                        update[i][j-1] = 0;
                        update[i][j+1] = 0;
                    }
                    if (current == top && current == bottom) {
                        update[i][j] = 0;
                        update[i-1][j] = 0;
                        update[i+1][j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (update[j][i] == 0){
                    if (j == 0) {
                        update[0][i] = r.nextInt(6) + 1;
                    }
                    for (int k = j; k > 0; k--) {
                        update[k][i] = update[k-1][i];
                        update[0][i] = r.nextInt(6) + 1;
                    }   
                }
            }
        }
        for (int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                board[i][j] = update[i][j];
            }
        }
    }

}