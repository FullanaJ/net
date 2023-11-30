package Aplicacion2;

import Aplicacion1.ConexionSer;

import java.io.*;

public class ServidorFile extends ConexionSer {
    public ServidorFile(String tipo) throws IOException {
        super(tipo);
    }

    @Override
    public void startServer() {
        try {
            cs = ss.accept();
            InputStream is = cs.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader bf = new BufferedReader(isr);
            String linea = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
