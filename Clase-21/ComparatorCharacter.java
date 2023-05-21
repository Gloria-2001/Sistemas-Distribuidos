import java.util.*;
public class ComparatorCharacter implements Comparator <CharCounter>{
    @Override
    public int compare(CharCounter c1, CharCounter c2){
        return c2.getContador() - c1.getContador(); 
    }
}
