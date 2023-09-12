@echo off

tasklist | find /i "powershell.exe" > nul
if %errorlevel% equ 0 (
    echo PowerShell está abierto.
) else (
    echo PowerShell no está abierto. Abriendo PowerShell...
    powershell -command "Start-Process java -ArgumentList '-jar', 'miPrograma.jar' -NoNewWindow"
)

pause