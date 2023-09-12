package miau.dona.AbrirApp;

import javax.swing.*;
import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        final int PUERTO_BLOQUEO = 21345;
        ServerSocket socketBloqueo;

        try {
            socketBloqueo = new ServerSocket(PUERTO_BLOQUEO);
        } catch (IOException e) {
            System.out.println("Ya hay una instancia en ejecución.");
            return;
        }

        System.out.println("Programa en ejecución...");
        // EL SOCKET INICIA, AQUI ARRIBA



        Thread.sleep(5000);
        JOptionPane.showMessageDialog(null, "5 segundos despues", "Wait", JOptionPane.INFORMATION_MESSAGE);

        String ruta = JOptionPane.showInputDialog("Que aplicacion quieres iniciar? Escribe la ruta completa: ");
        if (ruta != null && !ruta.isBlank()) {
            JOptionPane.showMessageDialog(null, "Vamos a abrirla", "Abrir" + ruta, JOptionPane.INFORMATION_MESSAGE);
            try {
                Runtime.getRuntime().exec(ruta);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "No se pudo abrir la aplicacion", "Error2", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nombre invalido.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        AbrirApp.abrir(ruta);

        // EL SOCKET SE CIERRA, AQUI ABAJO
        try {
            socketBloqueo.close(); // Cierra el socket al finalizar
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar el socket: " + e.getMessage(), "SocketError", JOptionPane.ERROR_MESSAGE);
        }

    }
}
