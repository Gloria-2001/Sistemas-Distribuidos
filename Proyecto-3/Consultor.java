/**
 * PROYECTO #3
 * NOMBRE: Gloria Oliva Olivares Ménez
 * GRUPO: 4CM12
 */

import java.io.File;
import java.time.Year;
import java.util.HashMap;
import java.util.Scanner;

public class Consultor {

    File myObj;
    Scanner myReader;
    Scanner readConsole;
    HashMap<String, Integer> counter;
    String partidos[] = {"PAN", "PRI", "PRD", "PT", "VERDE", "MC", "MORENA"};
    String entidades[] = {"AS", "BC", "BS", "CC", "CS", "CH", "CL", "CM", "DF", "DG", "GT", "GR", "HG", "JC", "MC", "MN", "MS", "NT", "NL", "OC", "PL", "QT", "QR", "SP", "SL", "SR", "TC", "TL", "TS", "VZ", "YN", "ZS"}; 

    String questions[] = {
        "1. Cuantos votos totales se ha realizado por sexo?",
        "2. Cuantos votos totales se ha realizado por cada estado de la republica?",
        "3. Cuantos votos se ha realizado por ciudadanos de X anios de edad?",
        "4. Cuantos votos van por cada partido?",
        "5. Salir"
    };

    public Consultor() {
        myObj = new File("Curps.txt");
        readConsole = new Scanner(System.in);
    }

    public void runConsultor() {
        while(true) {
            System.out.println("Eliga una opcion");
            for (String q : questions)
                System.out.println("\t" + q);
            System.out.print("Opcion: ");
            int opt = readConsole.nextInt();
            switch (opt) {
                case 1:
                    getFromSex();
                    break;
                case 2:
                    getFromState();
                    break;
                case 3:
                    System.out.print("Escriba la edad de interes: ");
                    getFromAge(readConsole.nextInt());
                    break;
                case 4:
                    getFromParty();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choose other option");
                    break;
            }
            System.out.println();
        }
    }

    public void getFromSex() {
        counter = new HashMap<String, Integer>();
        counter.put("H", 0);
        counter.put("M", 0);
        try {
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String curp = line.split(",")[0];
                String sex = String.valueOf(curp.charAt(10));
                counter.put(sex, counter.get(sex) + 1);
            }
            for (HashMap.Entry<String, Integer> entry : counter.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println(key + " = " + value);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void getFromState() {
        counter = new HashMap<String, Integer>();
        for (String entidad : entidades) {
            counter.put(entidad, 0);
        }
        try {
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String curp = line.split(",")[0];
                String entidad = curp.substring(11, 13);
                counter.put(entidad, counter.get(entidad) + 1);
            }
            for (HashMap.Entry<String, Integer> entry : counter.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println(key + " = " + value);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void getFromAge(int age) {
        int yearCounter = 0;
        int currYear = Year.now().getValue();
        String year = String.valueOf(currYear - age).substring(2, 4);

        try {
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String curp = line.split(",")[0];
                String curp_year = curp.substring(4, 6);
                if (curp_year.equals(year)) yearCounter++;
            }
            System.out.println("Personas con edad de " + age + " anios: " + yearCounter);
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void getFromParty() {
        counter = new HashMap<String, Integer>();
        for (String partido : partidos) {
            counter.put(partido, 0);
        }
        try {
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String partido = line.split(",")[1];
                counter.put(partido, counter.get(partido) + 1);
            }
            for (HashMap.Entry<String, Integer> entry : counter.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println(key + " = " + value);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Consultor con = new Consultor();
        con.runConsultor();
    }
}
