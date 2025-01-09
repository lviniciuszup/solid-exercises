package account_management_system;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private int numeroTelefone;


    public Usuario(String nome, String cpf, String email, int numeroTelefone){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome(){return nome;}
    public void setNome(String nome){
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome de usuário não pode ser vazio.");
        }
        this.nome = nome;
    }

    public String getCpf(){return cpf;}
    public void setCpf(String cpf){this.cpf = cpf;}

    public boolean validacaoCpf(String cpf){
        if (cpf.length() > 11) {
        }
        return true;
    }

    public String getEmail(){return email;}
    public void setEmail(){this.email = email;}

    public int getNumeroTelefone(){return numeroTelefone;}
    public void setNumeroTelefone(){this.numeroTelefone = numeroTelefone;}
}
