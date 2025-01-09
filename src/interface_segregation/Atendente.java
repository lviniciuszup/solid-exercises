package interface_segregation;

public class Atendente implements FuncaoAtendente{
    public void atenderCliente(){
        System.out.println("Atendendo Cliente...");
    }
}
