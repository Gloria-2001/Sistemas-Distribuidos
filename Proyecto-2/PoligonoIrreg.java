public class PoligonoIrreg{
    Coordenada [] vertices;
    int tam;
  
    public PoligonoIrreg(int size){
        this.tam = size;
        vertices = new Coordenada[size];
    }

    public void anadeVertice(double x,double y){
        Coordenada vertice = new Coordenada (x,y);
        for(int i =0;i<tam;i++){
            if(vertices[i] == null){
                vertices[i] = vertice;
                break;
            }
        
        }
        System.out.println(vertice);
    }

    @Override
    public String  toString(){
        System.out.println("\nPoligono con vertices: \n ");
        String cadena ="";
        String aux="";
        for(int i =0;i<tam;i++){
            aux = aux + "" + vertices[i] + "\n";        
        }
        
        cadena = cadena + aux;
        
        return cadena;
    }
}