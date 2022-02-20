/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelislemi;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author aliem
 */
public class Mypencere extends JPanel implements ActionListener, MouseListener {

     Cember[] cemberler;
    int mevcut = 0;
    int mevcutKontrol = 0;
    int kapasite=30;
    
	int x, y, gen, yuk;
	int artis;
	
	public Mypencere(){
		
		cemberler = new Cember[kapasite];
		artis = 2;
	    addMouseListener(this);
	    Timer timer = new Timer(40, this);
	    timer.start();
	    
	}
    
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i = 0 ; i < mevcut; i++)
			cemberler[i].ekranaCiz(g);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0 ; i < mevcut; i++)
			cemberler[i].genislet(artis);
		repaint();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		if(mevcutKontrol < kapasite){
			Cember c = new Cember(e.getX(),e.getY(), 0);
			cemberler[mevcutKontrol] = c;
			mevcutKontrol++;
		    if(mevcut < kapasite)	
			   mevcut++;
		}else{
			mevcutKontrol %= 10;
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	

    
}
