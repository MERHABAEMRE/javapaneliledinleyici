/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelislemi;

import java.awt.Graphics;

class Cember {
    int x,y,genislik;

	public Cember(int x, int y, int genislik) {
		super();
		this.x = x;
		this.y = y;
		this.genislik = genislik;
	}
	
	public void ekranaCiz(Graphics g){
		g.drawOval(x, y, genislik, genislik);
	}
	
	public void genislet(int artis){
		x -= artis/2;
		y -= artis/2;
		genislik += artis;
	}
}
