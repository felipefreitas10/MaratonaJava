package academy.devdojo.maratonajava.desafios.Challenge05.domain;

public class TransacaoVenda extends Transacao implements Notificavel{
    public String nomeCliente;
    public TransacaoVenda(String id, double valorBase, TipoPagamento tipoPagamento, String nomeCliente){
        super(id,valorBase, tipoPagamento);
        this.nomeCliente = nomeCliente;
    }

    @Override
    public void processarPagamento(){
        System.out.println("Processando venda do cliente " + nomeCliente + " no valor final de R$ " + tipoPagamento.calcularValorFinal(valorBase));
    }

    @Override
    public void enviarComprovante(){
        System.out.println("Enviando comprovante da venda por e-mail...");
    }
}
