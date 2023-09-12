package miau.dona.invalid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EliminarArchivo {
    public static void main() {
        String nombreArchivo = ".consola.ps1"; // Reemplaza con el nombre de tu archivo

        Path rutaArchivo = Paths.get(nombreArchivo);

        try {
            Files.delete(rutaArchivo);
            System.out.println("Archivo eliminado exitosamente.");
        } catch (IOException e) {
            System.out.println("No se pudo eliminar el archivo: " + e.getMessage());
        }
    }
}
