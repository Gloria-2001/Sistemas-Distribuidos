/**
 * PROYECTO #3
 * NOMBRE: Gloria Oliva Olivares Ménez
 * GRUPO: 4CM12
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Generador {
    String Letra = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String Numero = "0123456789";
    String Sexo = "HM";
    String Entidad[] = {"AS", "BC", "BS", "CC", "CS", "CH", "CL", "CM", "DF", "DG", "GT", "GR", "HG", "JC", "MC", "MN", "MS", "NT", "NL", "OC", "PL", "QT", "QR", "SP", "SL", "SR", "TC", "TL", "TS", "VZ", "YN", "ZS"}; 
    int numReg;
    String nameFile = "Curps.txt";

    String partidos[] = {"PAN", "PRI", "PRD", "PT", "VERDE", "MC", "MORENA"};

    public Generador (int n) {
        numReg = n;
    }

    public void runSimulation() throws FileNotFoundException {
        int indice = 0;
        PrintWriter myWriter = new PrintWriter("Curps.txt");
        try {
            while (true) {
                for (int i = 0; i < numReg; i++) {
                    String curp = getCURP();
                    indice = (int) (partidos.length * Math.random());
                    String partido = partidos[indice];
                    myWriter.println(curp + "," + partido);
                    myWriter.flush();
                }
                Thread.sleep(1000);
            }
            
        } catch (Exception e) {
            System.err.println(e);
            myWriter.close();
        }
    }
    
    public String getCURP() { 
        int indice; 
        StringBuilder sb = new StringBuilder(18); 
        for (int i = 1; i < 5; i++) { 
            indice = (int) (Letra.length()* Math.random()); 
            sb.append(Letra.charAt(indice)); 
        } 
        for (int i = 5; i < 11; i++) { 
            indice = (int) (Numero.length()* Math.random());
            sb.append(Numero.charAt(indice));
        } 
        indice = (int) (Sexo.length()* Math.random()); 
        sb.append(Sexo.charAt(indice)); 
        sb.append(Entidad[(int)(Math.random() * 32)]); 
        for (int i = 14; i < 17; i++) { 
            indice = (int) (Letra.length() * Math.random()); 
            sb.append(Letra.charAt(indice)); 
        } for (int i = 17; i < 19; i++) { 
            indice = (int) (Numero.length()* Math.random()); 
            sb.append(Numero.charAt(indice)); 
        } 
        return sb.toString(); 
    }

    public static void main(String[] args) {
        try {
            Generador gen = new Generador(5);
            gen.runSimulation();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}