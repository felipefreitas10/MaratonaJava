package academy.devdojo.maratonajava.desafios.Challenge05.domain;

public abstract class Atendimento {
    protected final int codigoFicha;
    protected String nomePaciente;
    protected double custoBase;
    protected NivelEmergencia nivelEmergencia;

    public Atendimento(int codigoFicha, String nomePaciente, double custoBase, NivelEmergencia nivelEmergencia) {
        this.codigoFicha = codigoFicha;
        this.nomePaciente = nomePaciente;
        this.custoBase = custoBase;
        this.nivelEmergencia = nivelEmergencia;
    }

    public abstract void realizarAtendimento();

    public int getFicha(){ //única forma de recuperar o código ficha
        return codigoFicha;
    }

    @Override
    public String toString() {
        return "Atendimento{" +
                "codigoFicha=" + codigoFicha +
                ", nomePaciente='" + nomePaciente + '\'' +
                ", nivelEmergencia=" + nivelEmergencia +
                ", nivelEmergencia=" + nivelEmergencia.calcularCustoAtendimento(custoBase) +
                '}';
    }

    public Atendimento[] adiconarAtendimento(Atendimento[] atendimentos, Atendimento novoAtendimento){
        int i = 0;
        for(Atendimento atendimento : atendimentos){ //verificando se o array está cheio
            if(atendimento != null){
                i++;
            }
        }

        if(i < atendimentos.length){ // o array não está cheio
            for(int j = 0; j < atendimentos.length; j++){
                if(atendimentos[j] == null){
                    atendimentos[j] = novoAtendimento;
                    break; //sai do loop imediatamente
                }
            }
        }

        if(i == atendimentos.length){ //array lotado
            Atendimento[] atendimentosCopy = new Atendimento[atendimentos.length + 1]; //novo array com uma posição a mais
            System.arraycopy(atendimentos,0, atendimentosCopy, 0, atendimentos.length);

            atendimentos = atendimentosCopy; //atualiza a referência
        }

        return atendimentos; //retorna a nova referência
    }
}
