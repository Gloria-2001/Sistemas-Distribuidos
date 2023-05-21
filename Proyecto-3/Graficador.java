/**
 * PROYECTO #3
 * NOMBRE: Gloria Oliva Olivares Ménez
 * GRUPO: 4CM12
 */

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Graficador {

    File myObj;
    Scanner myReader;
    HashMap<String, Integer> counter;
    String partidos[] = {"PAN", "PRI", "PRD", "PT", "VERDE", "MC", "MORENA"};
    int width = 500;
    int div = 1;
    int valsize = 5;

    public Graficador() {
        try {
            myObj = new File("Curps.txt");
            counter = new HashMap<String, Integer>();
            for (String partido : partidos) {
                counter.put(partido, 0);
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void graphic() {
        try {
            String partido;
            while (true) {
                myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String line = myReader.nextLine();
                    partido = line.split(",")[1];
                    counter.put(partido, counter.get(partido) + 1);
                }
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                print();
                myReader.close();
                Thread.sleep(3000);
            }
            
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            myReader.close();
        }
    }
    
    public void print() {
        int maxValue = 0;
        for (HashMap.Entry<String, Integer> entry : counter.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (maxValue < value) maxValue = value;
            System.out.format("%8s - %5d     ", key, value);
            int size = value / valsize;
            String output = "";
            for (int i = 0; i < size; i++) output += "*";
            System.out.println(output);
        }
        if (maxValue / width >= 1) {
            div++;
            width += 500;
            valsize += 5;
        }
    }

    public static void main(String[] args) {
        Graficador gr = new Graficador();
        gr.graphic();
    }
}
