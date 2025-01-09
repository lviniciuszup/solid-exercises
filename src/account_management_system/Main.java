package account_management_system;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String []args){
    Usuario usuario = new Usuario("Luiz", "00000000", "exemplo@exemplo.com", 123);
    Conta conta = new Conta("000-1", 0.0, usuario,new Date(), new ArrayList<Transacao>());
    Transacao transacao = new Transacao(TipoTransacao.CREDIDO, new Date());

    transacao.efetuarTransacao(conta,200.0);
    conta.adicionarTransacao(transacao);
        System.out.println(conta.getSaldo());
    }
}
