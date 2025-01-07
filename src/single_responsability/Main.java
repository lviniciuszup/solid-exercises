package single_responsability;

public class Main {
    public static void main(String args[]){
        EnviarPorEmail enviarPorEmail = new EnviarPorEmail();
        Relatorio relatorio = new Relatorio();

        enviarPorEmail.enviarRelatorio();
        relatorio.gerarRelatorio();

    }
}
