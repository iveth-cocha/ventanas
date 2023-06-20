import javax.swing.*;
import java.awt.*;

public class Panel_dibujo  extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //al estra en una clase hija ya puedo generar mis atributos

        //get por defecto ya existente
        int anchura=getWidth();
        int altura=getHeight();

        //para dibujo
        g.drawLine(0,0,anchura,altura);//origen x1,y1;destino los otros dos restantes
        g.drawLine(0,altura,anchura,0);
    }
}
