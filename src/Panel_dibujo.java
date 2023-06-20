import javax.naming.Name;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Panel_dibujo  extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //al estra en una clase hija ya puedo generar mis atributos

        //get por defecto ya existente
        /*
        int anchura=getWidth();
        int altura=getHeight();

        //para dibujo
        g.drawLine(0,0,anchura,altura);//origen x1,y1;destino los otros dos restantes
        g.drawLine(0,altura,anchura,0);

         */
        /* mi nombre
        g.drawLine(50,1000,50,100);
        g.drawLine(50,100,50,50);

        g.drawLine(m,1000,1000,100);
        */

        String name=getName();
        float altura;
        float peso;

        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        name=entrada.nextLine();
        System.out.println("Ingrese su peso:");



        g.drawString(name,20,20);


    }
}
