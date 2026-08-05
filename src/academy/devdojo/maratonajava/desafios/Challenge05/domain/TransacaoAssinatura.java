package academy.devdojo.maratonajava.desafios.Challenge05.domain;

public class TransacaoAssinatura extends Transacao implements Notificavel, Auditivel{
    public int mesesRecorrencia;
    public TransacaoAssinatura(String id, double valorBase, TipoPagamento tipoPagamento, int mesesRecorrencia){
        super(id,valorBase, tipoPagamento);
        this.mesesRecorrencia = mesesRecorrencia;
    }

    @Override
    public void processarPagamento(){
        System.out.println("Processando assinatura de " + mesesRecorrencia + " meses, no valor final de R$ " + tipoPagamento.calcularValorFinal(valorBase));
    }

    @Override
    public void enviarComprovante(){
        System.out.println("Envaindo comprovante por e-mail...");
    }

    @Override
    public void registrarLogAuditorial(){
        System.out.println("Registrando a assinatura...");
    }


}
