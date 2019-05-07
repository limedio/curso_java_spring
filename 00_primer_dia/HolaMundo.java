class HolaMundo {
	public static void main(String argumentos[]){
		System.out.println("Hola mundo");
		for (int i=0; i < argumentos.length; i++) {
			System.out.println("Arg "+ i + " = " + argumentos[i]);
		}
		int entero; 
		entero = 1234567890;
		float decimal = 1234567890123456789F;
		double doblePrecision = 1234567890123456789D;
		long enteroLargo = 12345678901234567L;
		byte unByte = 127;  //-127 a 127
		char caracter = 'A'; //siempre comilla simple
		String texto ;
		texto= "Cualquier texto";
		
		System.out.println("entero = " + entero);
		System.out.println("decimal = " + decimal);
		System.out.println("doblePrecision = " + doblePrecision);
		System.out.println("enteroLargo = " + enteroLargo);
		System.out.println("unByte = " + unByte);
		System.out.println("texto = " + texto);
		System.out.println("caracter = " + caracter);
	}
}