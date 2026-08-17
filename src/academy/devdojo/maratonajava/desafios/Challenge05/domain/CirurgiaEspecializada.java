package academy.devdojo.maratonajava.desafios.Challenge05.domain;

public class CirurgiaEspecializada extends Atendimento implements Notificavel, Higienizavel{
    private final int equipeMedica; //Não vou alterá-la em momento algum por isso é final

    public CirurgiaEspecializada(int codigoFicha, String nomePaciente, double custoBase, NivelEmergencia nivelEmergencia, int equipeMedica){
        super(codigoFicha, nomePaciente, custoBase, nivelEmergencia);
        this.equipeMedica = equipeMedica;
    }

    @Override
    public void realizarAtendimento(){
        System.out.println("Iniciando cirurgia de urgência com " + equipeMedica + " profissionais para " + nomePaciente + ". Custo final: R$ " + nivelEmergencia.calcularCustoAtendimento(custoBase));
    }

    @Override
    public void prepararUTI() {
        System.out.println("Sala de cirurgia está sendo preparada...");
    }

    @Override
    public void enviarAlertaAcompanhante() {
        System.out.println("Alerta! Procure informar o acompanhante do paciente na cirurgia...");
    }
}
