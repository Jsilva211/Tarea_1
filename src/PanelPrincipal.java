import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;
    public PanelPrincipal(){
        this.setLayout(new GridLayout(1,2));
        exp = new PanelExpendedor();
        com = new PanelComprador(exp);
        this.setBackground(Color.white);
        this.add(exp);
        this.add(com);

    }

    public void paint (Graphics g){
        super.paint(g);

    }
}
