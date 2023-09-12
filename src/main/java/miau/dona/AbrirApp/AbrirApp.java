package miau.dona.AbrirApp;

import javax.swing.*;
import java.io.IOException;

public class AbrirApp {
    public static void abrir(String ruta) throws IOException {
        try {
            Runtime.getRuntime().exec(ruta);
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Error: " + error.getMessage(), "IOError", JOptionPane.ERROR_MESSAGE);
        }
    }
}
