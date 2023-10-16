package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        List<Pessoa> pessoa = new ArrayList<>();

        System.out.print("Quantas pessoas vão ser registradas: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Pessoa: " + i);
            System.out.print("É pessoa física ou juridica? (f/j): ");
            char resposta = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Ganho anual: ");
            double ganhoAnual = sc.nextDouble();
            if(resposta == 'f'){
                pessoa.add(new PessoaFisica(nome, ganhoAnual));
            }
            else if(resposta == 'j'){
                pessoa.add(new PessoaJuridica(nome, ganhoAnual));
            }
        }

        System.out.println();
        System.out.println("Pagamentos: ");

        for(Pessoa pes : pessoa){
            System.out.println(pes.getNome() + " -- " + String.format("%.2f", pes.calculoSalario()));
        }
        sc.close();
    }




}
