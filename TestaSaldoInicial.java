
public class TestaSaldoInicial {

    public static void main(String[] args){
        ContaBancaria cb;
        
        try{
            cb = new ContaBancaria(-3000.0);
        }catch(IllegalArgumentException iae){
            System.out.println("OK, exceção lançada, como esperado!");
            iae.printStackTrace();
        }
        
    }
}
