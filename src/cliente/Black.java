package cliente;
public class Black extends Cliente {
    private Boolean areaVip = true;
    private double limite = 25.000;
    private Boolean seguroDeVida = true;
    private int descontoPassagemAerea = 2500;

    public Black(String nome, String cpf, String email, double renda, int tempoFidelidade, Boolean upgrade) {
        super(nome, cpf, email, renda, tempoFidelidade, upgrade);
        this.areaVip = areaVip;
        this.limite = limite;
        this.seguroDeVida = seguroDeVida;
        this.descontoPassagemAerea = descontoPassagemAerea;
    }

    @Override
    public Cliente pedirUpgrade() {
        return this;
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
