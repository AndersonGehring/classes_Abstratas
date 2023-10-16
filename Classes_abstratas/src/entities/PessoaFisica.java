package entities;

public class PessoaFisica extends Pessoa {

    private double rendaAnual;
    private double impostoPF = 0.1;

    public PessoaFisica(String nome, double rendaAnual) {
        super(nome);
        this.rendaAnual = rendaAnual;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public double getImpostoPF() {
        return impostoPF;
    }


    @Override
    public double calculoSalario() {
        return rendaAnual - (rendaAnual * impostoPF);
    }
}
