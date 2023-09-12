package miau.dona.invalid;

import javax.swing.*;
import java.io.IOException;

public class AbrirConsola {
    public static void consola() {
        try {
            String osName = System.getProperty("os.name").toLowerCase();
            if (osName.contains("win")) {
                Runtime.getRuntime().exec("cmd /c start powershell");
                JOptionPane.showMessageDialog(null, "Consola abierta correctamente.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Sistema operativo desconocido.", "Fail", JOptionPane.ERROR_MESSAGE);
            }
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Error, no se pudo abrir la consola al intentarlo ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
