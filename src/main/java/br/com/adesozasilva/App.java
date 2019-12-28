package br.com.adesozasilva;

import br.com.adesozasilva.model.Produto;

public class App {
	
    public static void main(String[] args) {
    	 Produto produtos[] = {
    	            new Produto("Lamborguini", 1000000),
    	            new Produto("Jipe", 46000),
    	            new Produto("Brasília", 16000),
    	            new Produto("Smart", 46000),
    	            new Produto("Fusca", 17000)
    	        };
    	 new InsertionSort(produtos).ordena();
    	 
    	 for (Produto produto : produtos) {
             System.out.println(produto.getNome() + " custa " + produto.getPreco());
         }

    }

	

	
    
}
