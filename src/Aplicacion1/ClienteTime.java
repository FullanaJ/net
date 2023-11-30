package Aplicacion1;

import segundo.ClienteCalculo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class ClienteTime extends ConexionCli{
    public ClienteTime(String tipo) throws IOException {
        super(tipo);
    }
    public void startClient(){
        try {
            BufferedReader bfr = ClienteCalculo.getFlujo(cs.getInputStream());
            String resultado = bfr.readLine();
            System.out.println
                    (resultado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            ClienteTime c = new ClienteTime("cliente");
            c.startClient();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
