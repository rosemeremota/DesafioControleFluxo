import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
       
       Scanner terminal = new Scanner(System.in);

       int parametroUm = terminal.nextInt();
       int parametroDois = terminal.nextInt();

       try {
        
        contar(parametroUm, parametroDois);

       } catch (ParametrosInvalidosExeption e) {
        System.out.println("mensgem " + e.ToString()); 
       }


    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExeption     
    { 
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosExeption();
        }
        
        int contagem = parametroDois - parametroUm;

        for(int i=1;  i<= contagem; i++){
            System.out.println("Imprimindo o numero "+ i);
        } 
    }
}