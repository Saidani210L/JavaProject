/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainclass;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author Abderraouf
 */
public class GamePanel extends JPanel{
    public GamePanel(){
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //g.setColor(Color.BLACK);
        g.fillRoundRect(100, 100, 200, 50, 30, 30);
        g.fillRoundRect(100, 175, 200, 50, 30, 30);
        g.fillRoundRect(100, 250, 200, 50, 30, 30);
    }
}
