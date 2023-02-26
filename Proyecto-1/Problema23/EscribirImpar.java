import java.io.File; // Import the File class
import java.io.FileWriter;
import java.util.Scanner; // Import the Scanner class to read text files

public class EscribirImpar {
    private FileWriter outputFile;
    private Scanner reader;

    public EscribirImpar(String path) {
        try {
            String oPath = "output_" + path;
            File newFile = new File(oPath);
            newFile.createNewFile();
            this.outputFile = new FileWriter(oPath);
            this.reader = new Scanner(new File(path));
        } catch (Exception  e) {
            System.out.println("An constructor error occurred.");
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void readAndWrite() {
        try {
            int i = 1;
            while (this.reader.hasNextLine()) {
                String data = this.reader.nextLine();
                if ((i++ % 2)== 0) continue;
                this.outputFile.write(data + "\n");
            }
            this.reader.close();
            this.outputFile.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("java EscribirImpar file.txt");
            return;
        }

        new EscribirImpar(args[0]).readAndWrite();
    }
}
