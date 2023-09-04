package Descompressao;

public class Descompressao {
   private int indice; 
   private int indiceDescompressor; 
   private int contador; 
   private int contadorNumerador;
   private char interadorLetra; 
   private String texto_descomprimido = "";
   
   
   
    
public int getIndice() {
	return indice;
}

public void setIndice(int indice) {
	this.indice = indice;
}

public int getIndiceDescompressor() {
	return indiceDescompressor;
}

public void setIndiceDescompressor(int indiceDescompressor) {
	this.indiceDescompressor = indiceDescompressor;
}

public int getContador() {
	return contador;
}

public void setContador(int contador) {
	this.contador = contador;
}

public int getContadorNumerador() {
	return contadorNumerador;
}

public void setContadorNumerador(int contadorNumerador) {
	this.contadorNumerador = contadorNumerador;
}

public char getInteradorLetra() {
	return interadorLetra;
	
}

public void setInteradorLetra(char interadorLetra) {
	this.interadorLetra = interadorLetra;
}

public String getTexto_descomprimido() {
	return texto_descomprimido;
}

public void setTexto_descomprimido(String texto_descomprimido) {
	this.texto_descomprimido = texto_descomprimido;
}





public String descomprimir(String texto) {
	 
	while (indice < texto.length()) {
		contadorNumerador= 0;
		while (!Character.isAlphabetic((texto.charAt(indice)))) {
			contadorNumerador++;
			indice++;
		}
		
		contador = Integer.parseInt(texto.substring(indice-contadorNumerador, indice));
		
		interadorLetra = texto.charAt(indice);
		
		
		for (indiceDescompressor = 1; indiceDescompressor <= contador; indiceDescompressor++) {
			texto_descomprimido += interadorLetra;

			
			
		}
		
		indice+=1;
		
		
	}
	

	
	
	return texto_descomprimido;
	
	
	
}

   
   
   
   
}
