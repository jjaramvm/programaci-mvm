package tetris;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tetris {

    public static void main(String[] args) {
        Tablero tablero = new Tablero(400,450);
        Nivel nivel = new Nivel(1,1);
        
        JFrame f = new JFrame();
        
        JButton b = new JButton("Empezar partida");
        b.setBounds(130, 180, 200, 50);// X, Y, anchura, altura  

        f.add(b);// botón empezar partida

        f.setSize(600, 550); // dimensiones ventana
        f.setLayout(null);
        f.setVisible(true);
    }
}
