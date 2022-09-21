package juego.de.la.vida;
/**
 *
 * @author angel
 */
import java.util.Scanner;
public class JuegoDeLaVida {
   private Tablero tablero;
   private byte[][] aux_board;
   private Scanner sc_key;
   
   public JuegoDeLaVida(){
       this.tablero = new Tablero();
       this.aux_board= new byte[Herramientas.alto][Herramientas.ancho];
       this.sc_key      = new Scanner(System.in);
       this.print_banner();
       this.set_board_user();
       this.game_process();
   }
      private void print_banner(){
       System.out.println("Y con ustedes:");
       System.out.println("*+*+*El Juego de la Vida*+*+*\n");
       System.out.println("------------------------------");
       System.out.println("Especificaciones:");
       System.out.println("El tamaño de la matriz se especifica en *Herramientas*");
       System.out.println("Instrucciones:");
       System.out.println("Configura las celdas correspondientes para empezar el juego ");
       System.out.println("\t\tUna prueba de funcion puede ser:\n\t\t3 2\n\t\t1 0\n");
       System.out.println("Use coordenadas validas, cualquier otra fuera del rango imposibilita el inicio del juego");
       System.out.println("*Inicio del Juego*");
       System.out.println("Por favor escriba las coordenadas en clave");
       this.sc_key.nextLine();
       this.clear_window();
    }  
      private void set_board_user(){
       int x,y = 0;
       boolean banderita = false;
       do{
           System.out.println("Vista:"); this.tablero.print_estatus();
           System.out.println("\n\nNueva clave:\t");
           x = this.sc_key.nextInt();
           y = this.sc_key.nextInt();
           banderita = x>=0 && x<=Herramientas.alto && y>=0 && y<=Herramientas.ancho;
           if(banderita) this.tablero.set_coordenadas(x,y,(byte)1);
       }while(banderita);
   }
         private void game_process(){
       int CPartActivas = 0;
       this.tablero.print_estatus();
       while(true){
           try{ Thread.sleep(Herramientas.TC); }
           catch(InterruptedException e){}
           finally{
               for(int x=0;x<Herramientas.alto;x++){
                   for(int y=0;y<Herramientas.ancho;y++){
                       CPartActivas = tablero.PartAct_alrededor(x,y);
                       if(this.tablero.get_coordenadas(x,y)==1){
                           if(CPartActivas>=Herramientas.PartAct1 && CPartActivas<=Herramientas.PartAct2){ aux_board[x][y] = (byte)1;}
                           else if(CPartActivas<Herramientas.PartAct1 || CPartActivas>Herramientas.PartAct2){ aux_board[x][y] = (byte)0;}
                           }
                   else if(CPartActivas==Herramientas.PartAct3){ aux_board[x][y] = (byte)1;} 
                   }             
               }
           }
           if(this.check_break_flag()) break;
           this.copy_boards();
           this.clear_window();
           this.tablero.print_estatus();                  
       }
    }
       private boolean check_break_flag(){
       for(int i=0;i<Herramientas.alto;i++) for(int j=0;j<Herramientas.ancho;j++) if(this.aux_board[i][j]!=this.tablero.get_coordenadas(i,j)) return false;
       return true;
   }
      private void copy_boards(){ for(int i=0;i<Herramientas.alto;i++) for(int j=0;j<Herramientas.ancho;j++) this.tablero.set_coordenadas(i,j,this.aux_board[i][j]); }
      
   @SuppressWarnings("empty-statement")
     private void clear_window(){for(int i=0;i<50;++i,System.out.println());}
   public static void main(String args[]){
       JuegoDeLaVida gol = new JuegoDeLaVida();
   }
}
