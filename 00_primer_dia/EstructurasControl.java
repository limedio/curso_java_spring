class EstructurasControl {
	public static void main(String argumentos[]){
		int contador = 0;
		while (contador < 5){
			System.out.println("contador = " + contador);
			contador ++;
		}
		
		//se puede hacer un for como bucle infinito:
		for (;;) ;
		
		//se puede:
		int i = 0;
		for ( ; i < argumentos.length; i++) ;
	}
}