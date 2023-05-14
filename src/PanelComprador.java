import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanelComprador extends JPanel {
    Moneda m ;
    int vueltocom;

    int cualproducto, vuelto=0;
    public PanelComprador(PanelExpendedor a){


        this.setLayout(new GridLayout(5,2 ,10, 10));
        Color c = new Color(31, 39, 50);
        this.setBackground(c);
        ImageIcon[] imagenes = new ImageIcon[8];
        imagenes[0] = new ImageIcon("Tarea_1/src/100peso.png");
        JToggleButton b1 = new JToggleButton(imagenes[0]);
        imagenes[1] = new ImageIcon("Tarea_1/src/500peso.png");
        JToggleButton b2 = new JToggleButton(imagenes[1]);
        imagenes[2] = new ImageIcon("Tarea_1/src/1000peso.png");
        JToggleButton b3 = new JToggleButton(imagenes[2]);
        imagenes[3] = new ImageIcon("Tarea_1/src/1500peso.png");
        JToggleButton b4 = new JToggleButton(imagenes[3]);
        imagenes[4] = new ImageIcon("Tarea_1/src/coca.png");
        JToggleButton b5 = new JToggleButton(imagenes[4]);
        imagenes[5] = new ImageIcon("Tarea_1/src/sprite.png");
        JToggleButton b6 = new JToggleButton(imagenes[5]);
        imagenes[6] = new ImageIcon("Tarea_1/src/super8.png");
        JToggleButton b7 = new JToggleButton(imagenes[6]);
        imagenes[7] = new ImageIcon("Tarea_1/src/snicker.png");
        JToggleButton b8 = new JToggleButton(imagenes[7]);

        JToggleButton b9 = new JToggleButton("Comprar");
        JToggleButton b10 = new JToggleButton("Obtener Vuelto");
        b10.setEnabled(false);

        this.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(b2.isSelected()){
                    b2.setSelected(false);
                }
                if(b3.isSelected()){
                    b3.setSelected(false);
                }
                if(b4.isSelected()){
                    b4.setSelected(false);
                }
                if(b1.isSelected()){
                     m = new Moneda100();
                }
            }
        });
        this.add(b2);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(b1.isSelected()){
                    b1.setSelected(false);
                }
                if(b3.isSelected()){
                    b3.setSelected(false);
                }
                if(b4.isSelected()){
                    b4.setSelected(false);
                }
                if(b2.isSelected()){
                     m = new Moneda500();
                }
            }
        });
        this.add(b3);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(b2.isSelected()){
                    b2.setSelected(false);
                }
                if(b1.isSelected()){
                    b1.setSelected(false);
                }
                if(b4.isSelected()){
                    b4.setSelected(false);
                }
                if(b3.isSelected()){
                     m = new Moneda1000();
                }
            }
        });
        this.add(b4);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(b2.isSelected()){
                    b2.setSelected(false);
                }
                if(b3.isSelected()){
                    b3.setSelected(false);
                }
                if(b1.isSelected()){
                    b1.setSelected(false);
                }
                if(b4.isSelected()){
                     m = new Moneda1500();
                }
            }
        });
        this.add(b5);
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(b6.isSelected()){
                    b6.setSelected(false);
                }
                if(b7.isSelected()){
                    b7.setSelected(false);
                }
                if(b8.isSelected()){
                    b8.setSelected(false);
                }
                if(b5.isSelected()){
                     cualproducto = Expendedor.COCA;
                }
            }
        });

        this.add(b6);
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(b5.isSelected()){
                    b5.setSelected(false);
                }
                if(b7.isSelected()){
                    b7.setSelected(false);
                }
                if(b8.isSelected()){
                    b8.setSelected(false);
                }
                if(b6.isSelected()){
                    cualproducto = Expendedor.SPRITE;
                }
            }
        });
        this.add(b7);
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(b6.isSelected()){
                    b6.setSelected(false);
                }
                if(b5.isSelected()){
                    b5.setSelected(false);
                }
                if(b8.isSelected()){
                    b8.setSelected(false);
                }
                if(b7.isSelected()){
                    cualproducto = Expendedor.SPR8;
                }
            }
        });
        this.add(b8);
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(b6.isSelected()){
                    b6.setSelected(false);
                }
                if(b7.isSelected()){
                    b7.setSelected(false);
                }
                if(b5.isSelected()){
                    b5.setSelected(false);
                }
                if(b8.isSelected()){
                    cualproducto = Expendedor.SNKR;
                }
            }
        });

        this.add(b9);
        b9.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {


                // Código que se ejecuta cuando se hace clic en el botón
                try {
                    Comprador c;
                    c = new Comprador(m, cualproducto, a.expen);
                    vueltocom= c.cuantoVuelto();
                    vueltocom=vueltocom/100;
                    a.vvv= vueltocom;
                    if(cualproducto==Expendedor.COCA){a.setEstado(1);}
                    if(cualproducto==Expendedor.SNKR){a.setEstado(4);}
                    if(cualproducto==Expendedor.SPRITE){a.setEstado(2);}
                    if(cualproducto==Expendedor.SPR8){a.setEstado(3);}

                    b10.setEnabled(true);
                    b9.setEnabled(false);
                    b8.setEnabled(false);
                    b7.setEnabled(false);
                    b6.setEnabled(false);
                    b5.setEnabled(false);
                    b4.setEnabled(false);
                    b3.setEnabled(false);
                    b2.setEnabled(false);
                    b1.setEnabled(false);


                    a.expen.Pago(m);
                } catch ( PagoIncorrectoException f) {

                }catch(PagoInsuficienteException | NoHayProductoException eee){
                    vueltocom= m.getValor();
                    vueltocom=vueltocom/100;
                    a.vvv= vueltocom;

                    b10.setEnabled(true);
                    b9.setEnabled(false);
                    b8.setEnabled(false);
                    b7.setEnabled(false);
                    b6.setEnabled(false);
                    b5.setEnabled(false);
                    b4.setEnabled(false);
                    b3.setEnabled(false);
                    b2.setEnabled(false);
                    b1.setEnabled(false);
                }
                m=null;
                cualproducto=4434;



                b1.setSelected(false);
                b2.setSelected(false);
                b3.setSelected(false);
                b4.setSelected(false);
                b5.setSelected(false);
                b6.setSelected(false);
                b7.setSelected(false);
                b8.setSelected(false);
            }

        });

        this.add(b10);
        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b10.setEnabled(false);
                b9.setEnabled(true);
                b8.setEnabled(true);
                b7.setEnabled(true);
                b6.setEnabled(true);
                b5.setEnabled(true);
                b4.setEnabled(true);
                b3.setEnabled(true);
                b2.setEnabled(true);
                b1.setEnabled(true);
                a.setEstado(5);
                vuelto =0;
            }
        });




    }


    public void paint (Graphics g){
        super.paint(g);

    }
}
