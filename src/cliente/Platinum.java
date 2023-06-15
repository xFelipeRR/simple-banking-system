package cliente;
public class Platinum extends Cliente {
    private Boolean areaVip = true;
    private double limite = 12.000;
    private Boolean seguroDeVida = false;
    private int descontoPassagemAerea = 1000;

    public Platinum(String nome, String cpf, String email, double renda, int tempoFidelidade, Boolean upgrade) {
        super(nome, cpf, email, renda, tempoFidelidade, upgrade);
        this.areaVip = areaVip;
        this.limite = limite;
        this.seguroDeVida = seguroDeVida;
        this.descontoPassagemAerea = descontoPassagemAerea;
    }

    @Override
    public Black pedirUpgrade() {
        if(getRenda() > 12000 && getTempoFidelidade() >= 5) {
            return new Black(this.getNome(), this.getCpf(), this.getEmail(), this.getRenda(), this.getTempoFidelidade(), true);
        }
        else {
            throw new IllegalArgumentException("Sem requisitos suficientes para upgrade!");
        }
    }

    public Boolean getAreaVip() {
        return areaVip;
    }

    public void setAreaVip(Boolean areaVip) {
        this.areaVip = areaVip;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Boolean getSeguroDeVida() {
        return seguroDeVida;
    }

    public void setSeguroDeVida(Boolean seguroDeVida) {
        this.seguroDeVida = seguroDeVida;
    }

    public int getDescontoPassagemAerea() {
        return descontoPassagemAerea;
    }

    public void setDescontoPassagemAerea(int descontoPassagemAerea) {
        this.descontoPassagemAerea = descontoPassagemAerea;
    }

    

    
}
