import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner ler = new Scanner(System.in);
	    
	    String name;
	    float imc=0, idade=0, altura=0, peso=0;
	    
	        
	   	    System.out.println("Digite seu nome:");
	        name=ler.nextLine();
	        
	        System.out.println("Digite sua idade:");
	        idade=ler.nextFloat();
	        
	        System.out.println("Digite sua altura:");
	        altura=ler.nextFloat();
	        
	        System.out.println("Digite sua altura:");
	        peso=ler.nextFloat();
	        
	        imc=peso/((altura)*2);
	        System.out.println("IMC:" +imc);
	        
	        if(idade<12 && imc<=20)
	        { System.out.println("Está acima do peso");}
	        
	       
	        
	}
}