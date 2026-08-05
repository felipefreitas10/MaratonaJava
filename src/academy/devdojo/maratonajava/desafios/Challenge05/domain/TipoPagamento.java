package academy.devdojo.maratonajava.desafios.Challenge05.domain;

public enum TipoPagamento {
    BOLETO(0, 2){
        @Override
        public double calcularValorFinal(double valorOriginal){
            return valorOriginal + this.TAXA_PROCESSAMENTO;
        }
    },
    CARTAO_CREDITO(0, 0.035){
        @Override
        public double calcularValorFinal(double valorOriginal){
            return valorOriginal + valorOriginal*this.TAXA_PROCESSAMENTO;
        }
    },
    PIX(0.05, 0){
        @Override
        public double calcularValorFinal(double valorOriginal){
            return valorOriginal - valorOriginal*this.DESCONTO;
        }
    };

    public final double DESCONTO; //Constantes para evitar que alguém mude os valores de taxa e desconto das formas de pagamentos
    public final double TAXA_PROCESSAMENTO;

    TipoPagamento(double desconto, double taxa_processamento){
        this.DESCONTO = desconto;
        this.TAXA_PROCESSAMENTO = taxa_processamento;
    }

    public abstract double calcularValorFinal(double valorOriginal);

}
