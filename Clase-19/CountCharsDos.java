import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
import java.util.Collections;

public class CountCharsDos {
    public ArrayList<CharCounter> characters; 
    private Scanner reader;
    

    public CountCharsDos(String path) {
        try {
            this.characters = new ArrayList<>();
            this.reader = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void readFile() {
        try {
            while (this.reader.hasNextLine()) {
                String data = this.reader.nextLine();
                for (int i = 0; i < data.length(); i++)
                    this.count(data.charAt(i));
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

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("java CountCharsDos file.txt");
            return;
        }

        CountCharsDos cc = new CountCharsDos(args[0]);
        cc.readFile();
        System.out.println(cc);
    }
}
