package br.gov.unipe;

/**
 *
 * Classe que calcula e exibe o IMC da aula de Gerência de Configuração na Unipê
 *
 */
public class App 
{

	public static double calculaIMC(double peso, double altura) {
		return peso/(altura*altura);
	}

    public static void main( String[] args )
    {		
        System.out.println( "O seu IMC deu: " + calculaIMC(75,1.70) );
    }
	
}
