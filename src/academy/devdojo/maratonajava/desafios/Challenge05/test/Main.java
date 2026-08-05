package academy.devdojo.maratonajava.desafios.Challenge05.test;

import java.util.Scanner;
import academy.devdojo.maratonajava.desafios.Challenge05.domain.Transacao;
import academy.devdojo.maratonajava.desafios.Challenge05.domain.TransacaoVenda;
import academy.devdojo.maratonajava.desafios.Challenge05.domain.TransacaoAssinatura;
import academy.devdojo.maratonajava.desafios.Challenge05.domain.TipoPagamento;


public class Main {
    public static void main(String[] args){
        Transacao[] transacoes = new Transacao[10];
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int j = 0;
        String nomeCliente, id;
        int mesesRecorrencia;
        TipoPagamento tipoPagamento = null;
        double valorBase;

        while(i >= 0 && i <=3){
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Realizar venda");
            System.out.println("2 - Realizar assinatura");
            System.out.println("3 - Relatório de transações");
            i = sc.nextInt();

            if(i == 1){
                System.out.println("##Venda##");
                System.out.println("Informe o id do cliente: ");
                id = sc.next();
                System.out.println("Informe o nome do cliente: ");
                nomeCliente = sc.next();
                System.out.println("Informe o valor base da venda: ");
                valorBase = sc.nextDouble();
                do{
                    System.out.println("Informe o tipo de pagamento dentre as opções: ");
                    System.out.println("1 - Boleto");
                    System.out.println("2 - Cartão de Crédito");
                    System.out.println("3 - PIX");
                    j = sc.nextInt();
                }while(j <= 0 || j> 3);

                if(j == 1){
                    tipoPagamento = TipoPagamento.BOLETO;
                } else if (j == 2) {
                    tipoPagamento = TipoPagamento.CARTAO_CREDITO;
                }else if(j == 3){
                    tipoPagamento = TipoPagamento.PIX;
                }


                Transacao transacaoVenda = new TransacaoVenda(id, valorBase, tipoPagamento, nomeCliente);

                for(int w = 0; w < 10; w++){
                    if(transacoes[w] == null){
                        transacoes[w] = transacaoVenda;
                        break; //encerra completamente o loop
                    }
                }


            }else if (i == 2){
                System.out.println("##Assinatura##");
                System.out.println("Informe o id do cliente: ");
                id = sc.next();
                System.out.println("Informe os meses de recorrência: ");
                mesesRecorrencia = sc.nextInt();
                System.out.println("Informe o valor base da venda: ");
                valorBase = sc.nextDouble();
                do {
                    System.out.println("Informe o tipo de pagamento dentre as opções: ");
                    System.out.println("1 - Boleto");
                    System.out.println("2 - Cartão de Crédito");
                    System.out.println("3 - PIX");
                    j = sc.nextInt();
                }while(j <= 0 || j > 3);

                if(j == 1){
                    tipoPagamento = TipoPagamento.BOLETO;
                } else if (j == 2) {
                    tipoPagamento = TipoPagamento.CARTAO_CREDITO;
                }else if(j == 3){
                    tipoPagamento = TipoPagamento.PIX;
                }


                Transacao transacaoAssinatura = new TransacaoAssinatura(id, valorBase, tipoPagamento, mesesRecorrencia);

                for(int w = 0; w < 10; w++){
                    if(transacoes[w] == null){
                        transacoes[w] = transacaoAssinatura;
                        break; //encerra completamente o loop
                    }
                }


            } else if (i == 3){
                System.out.println("##Relatório##");
                for(Transacao transacao : transacoes){
                    if(transacao != null){
                        if(transacao instanceof TransacaoVenda){
                            transacao.processarPagamento();
                            transacao.toString();
                            ((TransacaoVenda) transacao).enviarComprovante(); //notificável
                        }else if (transacao instanceof TransacaoAssinatura){
                            transacao.processarPagamento();
                            transacao.toString();
                            ((TransacaoAssinatura) transacao).enviarComprovante(); //notificável
                            ((TransacaoAssinatura) transacao).registrarLogAuditorial(); //auditivel
                        }
                    }
                }
            }
        }
    }
}
