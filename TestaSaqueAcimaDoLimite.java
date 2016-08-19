
public class TestaSaqueAcimaDoLimite {
       public static void main(String[] args){
        ContaBancaria cb;
        cb = new ContaBancaria(3000.0);
        try{
            cb.saque(5000.0);
        }catch(IllegalArgumentException iae){
            System.out.println("OK, exceção lançada, como esperado!");
            iae.printStackTrace();
        }
        
    }
}
