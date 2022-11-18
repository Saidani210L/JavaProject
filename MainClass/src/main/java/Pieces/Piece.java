/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pieces;

/**
 *
 * @author Abderraouf
 */
public sealed class Piece permits SpecialPiece,Macheroom {
    private int x;
    private int y;
    private int color;
    public Piece(int x, int y, int color){
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setColor(int color){
        this.color = color;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getColor(){
        return color;
    }
}
