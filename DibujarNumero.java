package lcd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DibujarNumero extends TemplateNumero {

	/**
	 * MEtodo encargado de dibujar el numero correspondiente
	 * @param numero Numero a dibujar
	 */
	@Override
	protected void DibujarDigito(int numero) {
	
        switch (numero) {
            case 1:
               
               dibujarNumeroUno();
                break;
            case 2:
             dibujarNumeroDos();
                break;
            case 3:
             dibujarNumeroTres();
                break;
            case 4:
               dibujarNumeroCuatro();
                break;
            case 5:
              dibujarNumeroCinco();
                break;
            case 6:
              dibujarNumeroSeis();
                break;
            case 7:
               dibujarNumeroSiete();
                break;
            case 8:
           dibujarNumeroOcho();
                break;
            case 9:
            dibujarNumeroNueve();
                break;
            case 0:
               dibujarNumeroCero();
                break;
            default:
                break;
    
        }         
		
	}

	
	/**
	 * Metodos encargados de definir los segmentos de los numeros
	 * 
	 */
	public void dibujarNumeroUno() {
		 
		 adicionarLinea(this.matrizImpr, this.pf5, POSICION_Y,
                 this.size, CARACTER_VERTICAL);
      
         adicionarLinea(this.matrizImpr, this.pf4, POSICION_Y,
                 this.size, CARACTER_VERTICAL);
	}
	
	public void dibujarNumeroDos() {
		 
		  adicionarLinea(this.matrizImpr, this.pf1, POSICION_X,
                  this.size, CARACTER_HORIZONTAL);
    	  adicionarLinea(this.matrizImpr, this.pf5, POSICION_Y,
                  this.size, CARACTER_VERTICAL);
    	     adicionarLinea(this.matrizImpr, this.pf2, POSICION_X,
                     this.size, CARACTER_HORIZONTAL);
    	     adicionarLinea(this.matrizImpr, this.pf2, POSICION_Y,
                     this.size, CARACTER_VERTICAL);
    	     
    	     adicionarLinea(this.matrizImpr, this.pf3, POSICION_X,
                     this.size, CARACTER_HORIZONTAL);
	}
	
	public void dibujarNumeroTres() {
		 


        adicionarLinea(this.matrizImpr, this.pf1, POSICION_X,
                this.size, CARACTER_HORIZONTAL);
        
        adicionarLinea(this.matrizImpr, this.pf5, POSICION_Y,
                this.size, CARACTER_VERTICAL);
   
        adicionarLinea(this.matrizImpr, this.pf4, POSICION_Y,
                this.size, CARACTER_VERTICAL);
    
   
        adicionarLinea(this.matrizImpr, this.pf2, POSICION_X,
                this.size, CARACTER_HORIZONTAL);
     
        adicionarLinea(this.matrizImpr, this.pf3, POSICION_X,
                this.size, CARACTER_HORIZONTAL);
	}
	
	public void dibujarNumeroCuatro() {
		 
        adicionarLinea(this.matrizImpr, this.pf1, POSICION_Y,
                this.size, CARACTER_VERTICAL);
     

        adicionarLinea(this.matrizImpr, this.pf2, POSICION_X,
                this.size, CARACTER_HORIZONTAL);
        
        adicionarLinea(this.matrizImpr, this.pf5, POSICION_Y,
                this.size, CARACTER_VERTICAL);
   
        adicionarLinea(this.matrizImpr, this.pf4, POSICION_Y,
                this.size, CARACTER_VERTICAL);
    
   
     
	}
	
	public void dibujarNumeroCinco() {
		adicionarLinea(this.matrizImpr, this.pf1, POSICION_X,
                this.size, CARACTER_HORIZONTAL); 
        adicionarLinea(this.matrizImpr, this.pf1, POSICION_Y,
                this.size, CARACTER_VERTICAL);
     
        adicionarLinea(this.matrizImpr, this.pf2, POSICION_X,
                this.size, CARACTER_HORIZONTAL);
   
        adicionarLinea(this.matrizImpr, this.pf4, POSICION_Y,
                this.size, CARACTER_VERTICAL);  
     
        adicionarLinea(this.matrizImpr, this.pf3, POSICION_X,
                this.size, CARACTER_HORIZONTAL);
	}
	
	public void dibujarNumeroSeis() {
	     adicionarLinea(this.matrizImpr, this.pf1, POSICION_X,
	                this.size, CARACTER_HORIZONTAL);
		
        adicionarLinea(this.matrizImpr, this.pf1, POSICION_Y,
                this.size, CARACTER_VERTICAL);
        adicionarLinea(this.matrizImpr, this.pf2, POSICION_X,
                this.size, CARACTER_HORIZONTAL);
        
        adicionarLinea(this.matrizImpr, this.pf2, POSICION_Y,
                this.size, CARACTER_VERTICAL);
     
        adicionarLinea(this.matrizImpr, this.pf3, POSICION_X,
                this.size, CARACTER_HORIZONTAL);
        adicionarLinea(this.matrizImpr, this.pf4, POSICION_Y,
                this.size, CARACTER_VERTICAL);
    
         
     
	}
	
	
	public void dibujarNumeroSiete() {
		 
       

        adicionarLinea(this.matrizImpr, this.pf1, POSICION_X,
                this.size, CARACTER_HORIZONTAL);
   
        adicionarLinea(this.matrizImpr, this.pf5, POSICION_Y,
                this.size, CARACTER_VERTICAL);
   
        adicionarLinea(this.matrizImpr, this.pf4, POSICION_Y,
                this.size, CARACTER_VERTICAL);
    
       
	}
	
	
	public void dibujarNumeroOcho() {
	 
           adicionarLinea(this.matrizImpr, this.pf1, POSICION_Y,
                   this.size, CARACTER_VERTICAL);
        
           adicionarLinea(this.matrizImpr, this.pf2, POSICION_Y,
                   this.size, CARACTER_VERTICAL);
        
           adicionarLinea(this.matrizImpr, this.pf5, POSICION_Y,
                   this.size, CARACTER_VERTICAL);
      
           adicionarLinea(this.matrizImpr, this.pf4, POSICION_Y,
                   this.size, CARACTER_VERTICAL);
       
           adicionarLinea(this.matrizImpr, this.pf1, POSICION_X,
                   this.size, CARACTER_HORIZONTAL);
      
           adicionarLinea(this.matrizImpr, this.pf2, POSICION_X,
                   this.size, CARACTER_HORIZONTAL);
        
           adicionarLinea(this.matrizImpr, this.pf3, POSICION_X,
                   this.size, CARACTER_HORIZONTAL);
	}
	
	public void dibujarNumeroNueve() {
		 
        adicionarLinea(this.matrizImpr, this.pf1, POSICION_Y,
                this.size, CARACTER_VERTICAL);
     
      
        adicionarLinea(this.matrizImpr, this.pf5, POSICION_Y,
                this.size, CARACTER_VERTICAL);
   
        adicionarLinea(this.matrizImpr, this.pf4, POSICION_Y,
                this.size, CARACTER_VERTICAL);
    
        adicionarLinea(this.matrizImpr, this.pf1, POSICION_X,
                this.size, CARACTER_HORIZONTAL);
   
        adicionarLinea(this.matrizImpr, this.pf2, POSICION_X,
                this.size, CARACTER_HORIZONTAL);
     
        adicionarLinea(this.matrizImpr, this.pf3, POSICION_X,
                this.size, CARACTER_HORIZONTAL);
	}
	
	public void dibujarNumeroCero() {
		 
        adicionarLinea(this.matrizImpr, this.pf1, POSICION_Y,
                this.size, CARACTER_VERTICAL);
     
        adicionarLinea(this.matrizImpr, this.pf2, POSICION_Y,
                this.size, CARACTER_VERTICAL);
     
        adicionarLinea(this.matrizImpr, this.pf5, POSICION_Y,
                this.size, CARACTER_VERTICAL);
   
        adicionarLinea(this.matrizImpr, this.pf4, POSICION_Y,
                this.size, CARACTER_VERTICAL);
    
        adicionarLinea(this.matrizImpr, this.pf1, POSICION_X,
                this.size, CARACTER_HORIZONTAL);
   
       
     
        adicionarLinea(this.matrizImpr, this.pf3, POSICION_X,
                this.size, CARACTER_HORIZONTAL);
	}
	

}
