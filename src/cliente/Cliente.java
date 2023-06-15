package cliente;
import java.util.ArrayList;

public abstract class Cliente implements InterfaceCliente {
    private String nome;
    private String cpf;
    private String email;
    private double renda;
    private int tempoFidelidade;
    private Boolean upgrade;
    private static ArrayList<String> listaCPFs = new ArrayList<>();

    public Cliente(String nome, String cpf, String email, double renda, int tempoFidelidade, boolean upgrade) {
        if (verificarCPF(cpf) && upgrade == false) {
            throw new IllegalArgumentException("CPF já cadastrado.");
        }
        else {
            this.nome = nome;
            this.cpf = cpf;
            this.email = email;
            this.renda = renda;
            this.tempoFidelidade = tempoFidelidade;
            listaCPFs.add(cpf);
        }
    }

    public static boolean verificarCPF(String cpf) {
        return listaCPFs.contains(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public int getTempoFidelidade() {
        return tempoFidelidade;
    }

    public void setTempoFidelidade(int tempoFidelidade) {
        this.tempoFidelidade = tempoFidelidade;
    }

    
    
}
