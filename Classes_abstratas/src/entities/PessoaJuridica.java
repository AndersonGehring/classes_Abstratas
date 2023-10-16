package entities;

public class PessoaJuridica extends Pessoa {

    private double rendaAnual;
    private double impostoPJ = 0.15;

    public PessoaJuridica(String nome, double rendaAnual) {
        super(nome);
        this.rendaAnual = rendaAnual;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public double getImpostoPJ() {
        return impostoPJ;
    }

    @Override
    public double calculoSalario() {
        return rendaAnual - (rendaAnual * impostoPJ);
    }
}
