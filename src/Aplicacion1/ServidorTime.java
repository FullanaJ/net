package Aplicacion1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;


public class ServidorTime extends ConexionSer {
    public ServidorTime(String tipo) throws IOException {
        super(tipo);
    }
    public void startServer(){
        try {
            while (true) {
                cs = ss.accept();
                //Flujo de datos hacia el cliente
                salidaCliente = new DataOutputStream(cs.getOutputStream());
                salidaCliente.writeUTF("Hora: " + (new SimpleDateFormat("HH:mm").format(new java.util.Date())) + "\n");
                //Se enviarán dos mensajes
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            ServidorTime s = new ServidorTime("servidor");
            s.startServer();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

