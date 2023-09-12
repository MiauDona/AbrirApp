package miau.dona.invalid;

import java.io.FileWriter;
import java.io.IOException;

public class CrearBat {
        public static void main() {
            String contenidoBat = "# Verificar si hay una instancia de PowerShell abierta\n" +
                    "$procesoPowerShell = Get-Process -Name powershell -ErrorAction SilentlyContinue\n" +
                    "\n" +
                    "if ($procesoPowerShell) {\n" +
                    "    Write-Host \"Powershell ya está abierto.\"\n" +
                    "} else {\n" +
                    "    Write-Host \"Abriendo Powershell y ejecutando el programa Java...\"\n" +
                    "    \n" +
                    "    # Abrir una nueva instancia de PowerShell y ejecutar el programa Java\n" +
                    "    Start-Process powershell -ArgumentList \"-NoProfile -ExecutionPolicy Bypass -Command `\"java -jar miprograma.jar`\"\" -Wait";
            try {
                FileWriter fileWriter = new FileWriter(".consola.ps1");
                fileWriter.write(contenidoBat);
                fileWriter.close();
                System.out.println("Archivo consola.ps1 creado exitosamente.");
            } catch (IOException e) {
                System.out.println("Error al crear el archivo consola.ps1: " + e.getMessage());
            }
        }

}
