package lcd;

public abstract class TemplateNumero {
	//private INumeroChain sucesor;
	 // Puntos fijos
	protected final int[] pf1;
    protected final int[] pf2;
    protected final int[] pf3;
    protected final int[] pf4;
    protected final int[] pf5;
    protected String[][] matrizImpr;

    static final String CARACTER_VERTICAL = "|";
    static final String CARACTER_HORIZONTAL = "-";
    static final String POSICION_X = "X";
    static final String POSICION_Y = "Y";

    // TODO code application logic here
    //String entrada = JOptionPane.showInputDialog("Digite el numero");
    protected int size;

    // Calcula el numero de filasDig
    protected int filasDig;
    protected int columDig;
    protected int totalFilas;
    protected int totalColum;
  
	
    
    
    public TemplateNumero() {
        // Inicializa variables
        this.pf1 = new int[2];
        this.pf2 = new int[2];
        this.pf3 = new int[2];
        this.pf4 = new int[2];
        this.pf5 = new int[2];
    }
	

	    
    /**
    *
    * Metodo encargado de añadir una linea a la matriz de Impresion
    *
    * @param matriz Matriz Impresion
    * @param punto Punto Pivote
    * @param posFija Posicion Fija
    * @param size Tamaño Segmento
    * @param caracter Caracter Segmento
    */  
    protected void adicionarLinea(String[][] matriz, int[] punto, String posFija,
            int size, String caracter) {

        if (posFija.equalsIgnoreCase(POSICION_X)) 
        {
            for (int y = 1; y <= size; y++) 
            {
                int valor = punto[1] + y;
                matriz[punto[0]][valor] = caracter;
            }
        } 
        else 
        {
            for (int i = 1; i <= size; i++) 
            {
                int valor = punto[0] + i;
                matriz[valor][punto[1]] = caracter;
            }
        }
    }
	
    /**
    *
    * Metodo encargado de imprimir un numero
    *
    * @param size Tamaño Segmento Digitos
    * @param numeroImp Numero a Imprimir
    * @param espacio Espacio Entre digitos
    */  
	 public void imprimirNumero(int size, String numeroImp, int espacio) 
	    {
	        int pivotX = 0;
	        char[] digitos;

	        this.size = size;

	        // Calcula el numero de filas cada digito
	        this.filasDig = (2 * this.size) + 3;

	        // Calcula el numero de columna de cada digito
	        this.columDig = this.size + 2;

	        // Calcula el total de filas de la matriz en la que se almacenaran los digitos
	        this.totalFilas = this.filasDig;

	        // Calcula el total de columnas de la matriz en la que se almacenaran los digitos
	        this.totalColum = (this.columDig * numeroImp.length())
	                + (espacio * numeroImp.length());

	        // crea matriz para almacenar los numero a imprimir
	        this.matrizImpr = new String[this.totalFilas][this.totalColum];

	        // crea el arreglo de digitos
	        digitos = numeroImp.toCharArray();

	        // Inicializa matriz
	        for (int i = 0; i < this.totalFilas; i++) {
	            for (int j = 0; j < this.totalColum; j++) {
	                this.matrizImpr[i][j] = " ";
	            }
	        }

	        for (char digito : digitos) {
	            
	            //Valida que el caracter sea un digito
	            if( ! Character.isDigit(digito))
	            {
	                throw new IllegalArgumentException("Caracter " + digito
	                    + " no es un digito");
	            }

	            int numero = Integer.parseInt(String.valueOf(digito));

	            //Calcula puntos fijos
	            this.pf1[0] = 0;
	            this.pf1[1] = 0 + pivotX;

	            this.pf2[0] = (this.filasDig / 2);
	            this.pf2[1] = 0 + pivotX;

	            this.pf3[0] = (this.filasDig - 1);
	            this.pf3[1] = 0 + pivotX;

	            this.pf4[0] = (this.columDig - 1);
	            this.pf4[1] = (this.filasDig / 2) + pivotX;

	            this.pf5[0] = 0;
	            this.pf5[1] = (this.columDig - 1) + pivotX;

	            pivotX = pivotX + this.columDig + espacio;

	    
	            
	            DibujarDigito(numero);
	        }
	        // Imprime matriz
	        for (int i = 0; i < this.totalFilas; i++) {
	            for (int j = 0; j < this.totalColum; j++) {
	                System.out.print(this.matrizImpr[i][j]);
	            }
	            System.out.println();
	        }
	        }
	
	        protected abstract void DibujarDigito(int numero);
	        
	  
	       
}
