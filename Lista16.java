package primeiroProjeto;

import java.util.Scanner;

public class Lista16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // 1 - Criando um vetor de cores
        String[] cores = new String[6];
        for(int i = 0; i < cores.length; i++) {
            System.out.println("Digite a cor " + (i+1) + ":");
            cores[i] = sc.next();
        }
        System.out.println("Cores digitadas:");
        for(String cor : cores) {
            System.out.println(cor);
        }
        System.out.println("--------------------");

        // 2 - Vetor de números decimais
        double[] numeros = new double[8];
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número decimal " + (i+1) + ":");
            numeros[i] = sc.nextDouble();
        }
        System.out.println("Números digitados:");
        for(double num : numeros) {
            System.out.println(num);
        }
        System.out.println("--------------------");

        // 3 - Mostrando apenas os pares
        int[] inteiros = new int[10];
        for(int i = 0; i < inteiros.length; i++) {
            System.out.println("Digite o número inteiro " + (i+1) + ":");
            inteiros[i] = sc.nextInt();
        }
        System.out.println("Números pares:");
        for(int num : inteiros) {
            if(num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println("--------------------");

        // 4 - Menores que 50
        int[] numeros50 = new int[12];
        for(int i = 0; i < numeros50.length; i++) {
            System.out.println("Digite o número " + (i+1) + ":");
            numeros50[i] = sc.nextInt();
            if(numeros50[i] < 50) {
                System.out.println("menor que 50");
            }
        }
        System.out.println("--------------------");

        // 5 - Procurando um nome no vetor
        String[] nomes = new String[5];
        for(int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome " + (i+1) + ":");
            nomes[i] = sc.next();
        }
        System.out.println("Digite um nome para procurar:");
        String busca = sc.next();
        boolean encontrado = false;
        for(String nome : nomes) {
            if(nome.equalsIgnoreCase(busca)) {
                encontrado = true;
                break;
            }
        }
        if(encontrado) {
            System.out.println("O nome existe no vetor!");
        } else {
            System.out.println("O nome não existe no vetor.");
        }
        System.out.println("--------------------");

        // 6 - Produto e preço
        String[] produtos = new String[4];
        double[] precos = new double[4];
        for(int i = 0; i < produtos.length; i++) {
            System.out.println("Digite o nome do produto " + (i+1) + ":");
            produtos[i] = sc.next();
            System.out.println("Digite o preço do produto " + (i+1) + ":");
            precos[i] = sc.nextDouble();
        }
        for(int i = 0; i < produtos.length; i++) {
            System.out.println("O produto " + produtos[i] + " custa R$" + precos[i]);
        }
        System.out.println("--------------------");

        // 7 - Verificação de notas
        double[] notas = new double[6];
        for(int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i+1) + ":");
            notas[i] = sc.nextDouble();
            if(notas[i] < 6) {
                System.out.println("aluno reprovado");
            } else if(notas[i] >= 6 && notas[i] <= 7) {
                System.out.println("aluno em recuperação");
            } else {
                System.out.println("aluno aprovado");
            }
        }
        System.out.println("--------------------");

        // 8 - Promoção de ingressos
        double[] ingressos = new double[5];
        for(int i = 0; i < ingressos.length; i++) {
            System.out.println("Digite o preço do ingresso " + (i+1) + ":");
            ingressos[i] = sc.nextDouble();
            if(ingressos[i] > 100) {
                System.out.println("Ingresso com promoção disponível!");
            }
        }

	}

}
