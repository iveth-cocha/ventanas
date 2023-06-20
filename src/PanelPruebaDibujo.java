import javax.swing.*;
import java.util.Scanner;

public class PanelPruebaDibujo {
    public static void main(String[] args) {
        /*

        //nueva instancia en la clase panel dibujo
        Panel_dibujo panel=new Panel_dibujo();

        //crear un marco en la ventana
        JFrame aplicacion =new JFrame();

        //boton de cierre de ventana
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //aggrego un "panel" a la ventana
        aplicacion.add(panel);
        //tamaño ventana
        aplicacion.setSize(250,250);
        //visualizacion de la ventana
        aplicacion.setVisible(true);
        }
*/
        //nueva instancia en la clase panel dibujo
        Panel_dibujo panel=new Panel_dibujo();

        //crear un marco en la ventana
        JFrame aplicacion =new JFrame();
        //boton de cierre de ventana
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //aggrego un "panel" a la ventana
        aplicacion.add(panel);
        //tamaño ventana
        aplicacion.setSize(250,250);
        //visualizacion de la ventana
        aplicacion.setVisible(true);


    }
}
