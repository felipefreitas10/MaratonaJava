package academy.devdojo.maratonajava.desafios.Challenge05.domain;

public enum NivelEmergencia {
    VERDE(120, 1.0){
        @Override
        public double calcularCustoAtendimento(double custoBase){ //implementação do metodo abstrato da classe enum
            return custoBase * this.FATOR_MULTIPLICADOR;
        }
    },
    AMARELO(30, 1.2){
        @Override
        public double calcularCustoAtendimento(double custoBase){
            return custoBase * this.FATOR_MULTIPLICADOR;
        }
    },
    VERMELHO(0, 1.5){
        @Override
        public double calcularCustoAtendimento(double custoBase){
            return custoBase * this.FATOR_MULTIPLICADOR;
        }
    };

    public final int TEMPO_MAXIMO_ESPERA;
    public final double FATOR_MULTIPLICADOR;
    NivelEmergencia(int tempo_maximo_espera, double fator_multiplicador){
        this.TEMPO_MAXIMO_ESPERA = tempo_maximo_espera;
        this.FATOR_MULTIPLICADOR = fator_multiplicador;
    }

    public abstract double calcularCustoAtendimento(double custoBase);

}
