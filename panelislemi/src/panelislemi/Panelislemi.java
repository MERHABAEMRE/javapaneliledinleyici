/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelislemi;

import javax.swing.JFrame;

/**
 *
 * @author aliem
 */
public class Panelislemi {

    public static void main(String[] args) {
        JFrame j = new JFrame("DİNLEYİCİ ÖRNEĞİ");
        j.setSize(680, 400);
        j.add(new Mypencere());
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
