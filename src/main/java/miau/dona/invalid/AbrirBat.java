package miau.dona.invalid;

import javax.swing.*;
import java.io.IOException;

public class AbrirBat {
    public static void main() throws IOException {

        try {
            String directorio = System.getProperty("user.dir");
            System.out.println("Estas en " + directorio);
            Runtime.getRuntime().exec(directorio + "\\.consola.ps1");
            JOptionPane.showMessageDialog(null, "Se abrio", "funciona", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se pudo abrir", "Failed", JOptionPane.ERROR_MESSAGE);
        }

    }
}
