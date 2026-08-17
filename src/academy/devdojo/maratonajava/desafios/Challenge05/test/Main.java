package academy.devdojo.maratonajava.desafios.Challenge05.test;

import academy.devdojo.maratonajava.desafios.Challenge05.domain.Atendimento;
import academy.devdojo.maratonajava.desafios.Challenge05.domain.ConsultaEspecializada;
import academy.devdojo.maratonajava.desafios.Challenge05.domain.CirurgiaEspecializada;
import academy.devdojo.maratonajava.desafios.Challenge05.domain.NivelEmergencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Atendimento[] atendimentos = new Atendimento[2]; //índice temporário

        //Variáveis auxiliáres
        int i = 1;
        int j = 0;
        String nomePaciente, especialidadeMedica;
        int codigoFicha, equipeMedica;
        double custoBase;
        NivelEmergencia nivelEmergencia = null;

        while(i > 0 && i < 4){
            System.out.println("## MEDCORE");
            System.out.println("Informe o que você deseja fazer: ");
            System.out.println("1 - Realizar consulta especializada");
            System.out.println("2 - Realizar cirurgia");
            System.out.println("3 - Emitir relatório de atendimentos");
            System.out.println("4 - Fechar o sistema");
            i = sc.nextInt();

            if(i == 1){
                System.out.println("Informe o código de ficha: ");
                codigoFicha = sc.nextInt();
                System.out.println("Informe o nome do paciente: ");
                nomePaciente = sc.next();
                System.out.println("Informe a especialidade médica: ");
                especialidadeMedica = sc.next();
                System.out.println("Informe o custoBase: ");
                custoBase = sc.nextDouble();
                System.out.println("Informe o nível de emergência dentre as opções: ");

                do{
                    System.out.println("1 - VERDE");
                    System.out.println("2 - AMARELO");
                    System.out.println("3 - VERMELHO");
                    j = sc.nextInt();
                }while(j < 1 || j > 3);

                if(j == 1){
                    nivelEmergencia = NivelEmergencia.VERDE;
                }else if(j==2){
                    nivelEmergencia = NivelEmergencia.AMARELO;
                }else if(j == 3){
                    nivelEmergencia = NivelEmergencia.VERMELHO;
                }

                ConsultaEspecializada consulta = new ConsultaEspecializada(codigoFicha, nomePaciente, custoBase, nivelEmergencia, especialidadeMedica);

                atendimentos = consulta.adiconarAtendimento(atendimentos, consulta);


            }else if(i == 2){
                System.out.println("Informe o código de ficha: ");
                codigoFicha = sc.nextInt();
                System.out.println("Informe o nome do paciente: ");
                nomePaciente = sc.next();
                System.out.println("Informe a equipe médica (qtd): ");
                equipeMedica = sc.nextInt();
                System.out.println("Informe o custoBase: ");
                custoBase = sc.nextDouble();
                System.out.println("Informe o nível de emergência dentre as opções: ");

                do{
                    System.out.println("1 - VERDE");
                    System.out.println("2 - AMARELO");
                    System.out.println("3 - VERMELHO");
                    j = sc.nextInt();
                }while(j < 1 || j > 3);

                if(j == 1){
                    nivelEmergencia = NivelEmergencia.VERDE;
                }else if(j==2){
                    nivelEmergencia = NivelEmergencia.AMARELO;
                }else if(j == 3){
                    nivelEmergencia = NivelEmergencia.VERMELHO;
                }

                CirurgiaEspecializada cirurgia = new CirurgiaEspecializada(codigoFicha, nomePaciente, custoBase, nivelEmergencia, equipeMedica);

                atendimentos = cirurgia.adiconarAtendimento(atendimentos, cirurgia);
            }else if(i == 3){
                for(Atendimento atendimento : atendimentos){ //se for null obviamente não será uma instancia de nenhuma das classes, por isso não precisa testar
                    if(atendimento instanceof ConsultaEspecializada){
                        System.out.println(atendimento); //via toString
                        ((ConsultaEspecializada) atendimento).enviarAlertaAcompanhante();
                    }else if(atendimento instanceof CirurgiaEspecializada){
                        System.out.println(atendimento); //via toString
                        ((CirurgiaEspecializada)atendimento).enviarAlertaAcompanhante();
                        ((CirurgiaEspecializada)atendimento).prepararUTI();
                    }
                }
            }

        }

    }
}
