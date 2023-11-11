public class ParametrosInvalidosExeption extends Exception{

    private String msg1;
    

    public ParametrosInvalidosExeption(){
      super();
       msg1 = "O Segundo parametro deve se maior que o primeiro.";
    }

    public String ToString(){
      return msg1;
    } 
    
}
