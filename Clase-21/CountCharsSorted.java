import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
import java.util.Collections;

public class CountCharsSorted {
    public ArrayList<CharCounter> characters; 
    private Scanner reader;
    public int lineaInicial;
    public int lineaFinal; 
    
    public CountCharsSorted(int lineaInicial, int lineaFinal) {
        try {
            this.characters = new ArrayList<>();
            this.reader = new Scanner(new File("./BIBLIA_COMPLETA.txt"));
            this.lineaInicial = lineaInicial;
            this.lineaFinal = lineaFinal; 
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            System.exit(1);
        }
    }
    public void readFile() {
        int contLine=1;
        try {
            while (this.reader.hasNextLine()) {
                if(contLine>=lineaInicial && contLine<=lineaFinal){
                    String data = this.reader.nextLine();
                    for (int i = 0; i < data.length(); i++)
                        this.count(data.charAt(i));
                }else if(contLine>lineaFinal){
                    break;
                }
                contLine++;                
            }
            this.reader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            System.exit(1);
        }
    }
    public void count(char c) {
        if (c == '\n' || c == ' ' || c == '\t')
            return;
        CharCounter character = findCharacter(characters, c); 
        if(character != null){
            character.incrementarContador(); 
        }else{
            characters.add(new CharCounter(c)); 
        }
    }
    public static CharCounter findCharacter(ArrayList<CharCounter> lista, char c){
        for(CharCounter caracter : lista){
            if(caracter.getCaracter() == c){
                return caracter;
            }
        }
        return null; 
    }
    public String toString() {
        String out = "";
        Collections.sort(characters,new ComparatorCharacter());
        for(CharCounter character : characters){
            out += character.getCaracter() + "-" + character.getContador() + "\n";
        }
        return out;
    }
    public static void printSortedMap(int inicio, int fin){
        CountCharsSorted cc = new CountCharsSorted(inicio,fin);
        cc.readFile();
        System.out.println(cc);
    }
}
