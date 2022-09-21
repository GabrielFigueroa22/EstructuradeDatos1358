package juego.de.la.vida;
/**
 *
 * @author angel
 */
public class Tablero {
    private byte[][] tablero;
    
    public Tablero(){
        this.tablero = new byte[Herramientas.alto][Herramientas.ancho];
    }

    Tablero(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void set_coordenadas(int x, int y, byte value){
    try{this.tablero[x][y] = value;}
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("No se encuentra la coordenada, revise y vuelva a intentarlo");}
    }   
    public byte get_coordenadas(int x, int y){return this.tablero[x][y];}
     public int PartAct_alrededor(int x, int y){
     int count = 0;
     try{if(this.tablero[x-1][y-1]==1)count++;}
     catch(Exception e){}
     try{if(this.tablero[x+1][y-1]==1)count++;}
     catch(Exception e){}  
    try{if(this.tablero[x-1][y]==1)count++;}
     catch(Exception e){}
    try{if(this.tablero[x+1][y]==1)count++;}
     catch(Exception e){}
    try{if(this.tablero[x][y-1]==1)count++;}
     catch(Exception e){}
    try{if(this.tablero[x][y+1]==1)count++;}
     catch(Exception e){}
    try{if(this.tablero[x+1][y+1]==1)count++;}
     catch(Exception e){}
    try{if(this.tablero[x-1][y+1]==1)count++;}
     catch(Exception e){}
    return count;
 }
 public void print_estatus(){
     for(int x = 0; x< Herramientas.alto;x++){
         for(int y = 0; y< Herramientas.ancho; y++){
             if(this.tablero[x][y]==1) System.out.println("*");
             else System.out.print("0");
         }
         System.out.println();
     }
 }
}
