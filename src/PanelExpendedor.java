import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanelExpendedor extends JPanel{
    public static Expendedor expen = new Expendedor(4,500);
    public int vvv;
    ImageIcon fondo = new ImageIcon("src/exp.png");
    ImageIcon[] imagenes = new ImageIcon[8];

    public PanelExpendedor(){
        Color c = new Color(31, 39, 50);
        this.setBackground(c);
        imagenes[0] = new ImageIcon("src/100peso.png");

        imagenes[1] = new ImageIcon("src/500peso.png");

        imagenes[2] = new ImageIcon("src/1000peso.png");

        imagenes[3] = new ImageIcon("src/1500peso.png");

        imagenes[4] = new ImageIcon("src/coca.png");

        imagenes[5] = new ImageIcon("src/sprite.png");

        imagenes[6] = new ImageIcon("src/super8.png");

        imagenes[7] = new ImageIcon("src/snicker.png");

    }
    private int estado=0 ;

    public void setEstado(int nuevoEstado) {
        this.estado = nuevoEstado;
        repaint();
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        switch (estado) {
            case 0:
                g.drawImage(fondo.getImage(), 0, 0, null);

                if(expen.ccoca()!=0){
                    g.drawImage(imagenes[4].getImage(), 95, 145, null);
                }
                if(expen.csprite()!=0){
                    g.drawImage(imagenes[5].getImage(), 210, 145, null);
                }
                if(expen.csuper8()!=0){
                    g.drawImage(imagenes[6].getImage(), 95, 316, null);
                }
                if(expen.csnicker()!=0){
                    g.drawImage(imagenes[7].getImage(), 210, 316, null);
                }

                break;
            case 1:
                g.drawImage(fondo.getImage(), 0, 0, null);

                if(expen.ccoca()!=0){
                    g.drawImage(imagenes[4].getImage(), 95, 145, null);
                }
                if(expen.csprite()!=0){
                    g.drawImage(imagenes[5].getImage(), 210, 145, null);
                }
                if(expen.csuper8()!=0){
                    g.drawImage(imagenes[6].getImage(), 95, 316, null);
                }
                if(expen.csnicker()!=0){
                    g.drawImage(imagenes[7].getImage(), 210, 316, null);
                }
                g.drawImage(imagenes[4].getImage(), 149, 568, null);




                break;
            case 2:
                g.drawImage(fondo.getImage(), 0, 0, null);

                if(expen.ccoca()!=0){
                    g.drawImage(imagenes[4].getImage(), 95, 145, null);
                }
                if(expen.csprite()!=0){
                    g.drawImage(imagenes[5].getImage(), 210, 145, null);
                }
                if(expen.csuper8()!=0){
                    g.drawImage(imagenes[6].getImage(), 95, 316, null);
                }
                if(expen.csnicker()!=0){
                    g.drawImage(imagenes[7].getImage(), 210, 316, null);
                }
                g.drawImage(imagenes[5].getImage(), 149, 568, null);




                break;
            case 3:
                g.drawImage(fondo.getImage(), 0, 0, null);

                if(expen.ccoca()!=0){
                    g.drawImage(imagenes[4].getImage(), 95, 145, null);
                }
                if(expen.csprite()!=0){
                    g.drawImage(imagenes[5].getImage(), 210, 145, null);
                }
                if(expen.csuper8()!=0){
                    g.drawImage(imagenes[6].getImage(), 95, 316, null);
                }
                if(expen.csnicker()!=0){
                    g.drawImage(imagenes[7].getImage(), 210, 316, null);
                }
                g.drawImage(imagenes[6].getImage(), 149, 568, null);




                break;
            case 4:
                g.drawImage(fondo.getImage(), 0, 0, null);

                if(expen.ccoca()!=0){
                    g.drawImage(imagenes[4].getImage(), 95, 145, null);
                }
                if(expen.csprite()!=0){
                    g.drawImage(imagenes[5].getImage(), 210, 145, null);
                }
                if(expen.csuper8()!=0){
                    g.drawImage(imagenes[6].getImage(), 95, 316, null);
                }
                if(expen.csnicker()!=0){
                    g.drawImage(imagenes[7].getImage(), 210, 316, null);
                }
                g.drawImage(imagenes[7].getImage(), 149, 568, null);


                break;
            case 5:
                g.drawImage(fondo.getImage(), 0, 0, null);

                if(expen.ccoca()!=0){
                    g.drawImage(imagenes[4].getImage(), 95, 145, null);
                }
                if(expen.csprite()!=0){
                    g.drawImage(imagenes[5].getImage(), 210, 145, null);
                }
                if(expen.csuper8()!=0){
                    g.drawImage(imagenes[6].getImage(), 95, 316, null);
                }
                if(expen.csnicker()!=0){
                    g.drawImage(imagenes[7].getImage(), 210, 316, null);
                }
                for(int i = 0;i< vvv;i++){

                    g.drawImage(imagenes[0].getImage(), 355, 565-i*10, null);
                }



                break;
            default:
                g.drawImage(fondo.getImage(), 0, 0, null);
                break;
        }
    }
}

