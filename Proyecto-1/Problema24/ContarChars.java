import java.util.HashMap;
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ContarChars {
    private HashMap<Character, Integer> characters;
    private Scanner reader;

    public ContarChars(String path) {
        try {
            this.characters = new HashMap<Character, Integer>();
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
        if (!characters.containsKey(c))
            characters.put(c, 0);
        characters.put(c, characters.get(c) + 1);
    }

    public String toString() {
        String out = "";
        for (char i : characters.keySet())
            out += i + " - " + characters.get(i) + "\n";
        return out;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("java ContarChars file.txt");
            return;
        }

        ContarChars cc = new ContarChars(args[0]);
        cc.readFile();
        System.out.println(cc);
    }
}

