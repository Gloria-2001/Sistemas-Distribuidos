import java.util.ArrayList;
import java.util.Iterator;

public class Curp {
    
    static ArrayList <String> Curps = new ArrayList<>();
    static int num = 10;
    public static void main(String[] args)
    {                 
        for(int i = 0; i < num; i++)  {
            String curpAux = getCURP();
            System.out.println(curpAux + "\n");
            Curps.add(curpAux);
        }
        
        BorraHombre();       
        System.out.println(Curps);        
        
    }
    
    public static void BorraMujer(){
         Iterator <String> It = Curps.iterator();
         while (It.hasNext()) {
            String aux = It.next();
            if(EsMujer(aux))
            {
                It.remove();
            }
            
        }
        
    }
    
    public static  void BorraHombre(){
         Iterator <String> It = Curps.iterator();
         while (It.hasNext()) {
            String aux = It.next();
            if(!EsMujer(aux))
            {
                It.remove();
            }
            
        }
        
    }
    
    public static boolean EsMujer (String Curp)
    {
        char[] curpC = Curp.toCharArray();
        
        if(curpC[10] == 'M')
        {
            return true;
        }
        
        return false;
    }
    
 
    static String getCURP()
    {
        String Letra = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Numero = "0123456789";
        String Sexo = "HM";
        String Entidad[] = {"AS", "BC", "BS", "CC", "CS", "CH", "CL", "CM", "DF", "DG", "GT", "GR", "HG", "JC", "MC", "MN", "MS", "NT", "NL", "OC", "PL", "QT", "QR", "SP", "SL", "SR", "TC", "TL", "TS", "VZ", "YN", "ZS"};
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
        sb.append(Entidad[(int)(Math.random()*32)]);
        for (int i = 14; i < 17; i++) {
            indice = (int) (Letra.length()* Math.random());
            sb.append(Letra.charAt(indice));        
        }
        for (int i = 17; i < 19; i++) {
            indice = (int) (Numero.length()* Math.random());
            sb.append(Numero.charAt(indice));        
        }
        return sb.toString();
    }           
}