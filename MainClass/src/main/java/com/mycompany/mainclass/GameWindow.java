/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainclass;

import javax.swing.JFrame;

/**
 *
 * @author Abderraouf
 */
public class GameWindow{
    private JFrame jframe;
    public GameWindow(GamePanel gp){
        jframe = new JFrame();
        jframe.setSize(400, 400);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gp);
        jframe.setVisible(true);
    }
}
