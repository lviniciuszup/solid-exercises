package interface_segregation;


public class Main {
    private FuncaoAtendente funcaoAtendente;
    private FuncaoProgramador funcaoProgramador;

    public Main(FuncaoAtendente funcaoAtendente, FuncaoProgramador funcaoProgramador){
        this.funcaoAtendente = funcaoAtendente;
        this.funcaoProgramador = funcaoProgramador;
    }


    public static void main(String[] args){
        Atendente atendente = new Atendente();
        Desenvolvedor desenvolvedor = new Desenvolvedor();

        atendente.atenderCliente();
    }

}
