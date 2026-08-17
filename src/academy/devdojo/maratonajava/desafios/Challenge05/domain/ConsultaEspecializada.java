package academy.devdojo.maratonajava.desafios.Challenge05.domain;

public class ConsultaEspecializada extends Atendimento implements Notificavel{
    private final String especialidadeMedica; //Não vou alterá-la em momento algum por isso é final

    public ConsultaEspecializada(int codigoFicha, String nomePaciente, double custoBase, NivelEmergencia nivelEmergencia, String especialidadeMedica){
        super(codigoFicha, nomePaciente, custoBase, nivelEmergencia);
        this.especialidadeMedica = especialidadeMedica;
    }

    @Override
    public void realizarAtendimento(){
        System.out.println("Iniciando consulta de " + especialidadeMedica + " para " + nomePaciente + ". Custo final " + nivelEmergencia.calcularCustoAtendimento(custoBase));
    }

    @Override
    public void enviarAlertaAcompanhante() {
        System.out.println("Alerta! Procure informar o acompanhante do paciente para a consulta...");
    }
}
