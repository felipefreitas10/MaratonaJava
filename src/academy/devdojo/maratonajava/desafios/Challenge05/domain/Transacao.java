package academy.devdojo.maratonajava.desafios.Challenge05.domain;

public abstract class Transacao {
    protected final String id; //Ninguém pode alterar o id após ele ser instanciado
    protected double valorBase;
    protected TipoPagamento tipoPagamento;

    public Transacao(String id, double valorBase, TipoPagamento tipoPagamento){
        this.id = id;
        this.valorBase = valorBase;
        this.tipoPagamento = tipoPagamento;
    }

    public abstract void processarPagamento();

    public final String getId(){ //final pois não poderá ser sobreescrito e será a única forma de recuperar esse id
        return this.id;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "id='" + id + '\'' +
                ", valorBase=" + valorBase +
                ", tipoPagamento=" + tipoPagamento +
                ", valorFinal=" + tipoPagamento.calcularValorFinal(valorBase) +
                '}';
    }
}
