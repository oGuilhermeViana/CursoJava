package exercicios;

import java.util.Scanner;

public class exercicio02 {
    Scanner scan = new Scanner(System.in);
    
    public void ex01 () {

        System.out.println("Digite o 1° número: ");
        double number1 = scan.nextDouble();
        System.out.println("Digite o 2° número: ");
        double number2 = scan.nextDouble();

        if (number1 > number2) {
            System.out.println("O número " + number1 + " E maior que o número " + number2);
        }else if (number1 == number2) {
            System.out.println("O número " + number1 + " E igual ao número " + number2);
        }  else {
            System.out.println("O número " + number2 + " E maior que o número " + number1);
        }
    }

    public void ex02 () {
        System.out.println("Digite um número: ");
        int number = scan.nextInt();

        if (number < 0) {
            System.out.println("O número é negativo");
        } else if (number > 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é nulo");
        }
    }

    public void ex03 () {
        System.out.println("Digite [F] Feminino [M] Masculino");

        String sexo = scan.next().toLowerCase();

        switch (sexo) {
            case "f": {
                System.out.println("Feminino");
            };break;
            case "m": {
                System.out.println("Masculino");
            }break;
            default: {
                System.out.println("Opção invalida");
            }
        }
    }

    public void ex04 () {
        System.out.println("Digite uma letra: ");
        String letra = scan.next().toLowerCase();

        if(
            letra.equals("a") ||
            letra.equals("e") ||
            letra.equals("i") ||
            letra.equals("o") ||
            letra.equals("u") 
            ){
                System.out.println("A letra digitada é uma vogal");
        } else {
            System.out.println("A letra digitada é uma consoante");
        }

    }

    public void ex05 () {
        System.out.println("Digite a 1° nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a 2° nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10){
            System.out.println("Aprovado com distinção");
        } else if (media < 7) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
    }

    public void ex06 () {
        double maior = Double.MIN_VALUE;

        System.out.println("Digite o 1° número: ");
        double number1 = scan.nextDouble();
        maior = number1;

        System.out.println("Digite o 2° número: ");
        double number2 = scan.nextDouble();
        System.out.println("Digite o 3° número: ");
        double number3 = scan.nextDouble();

        if (number2 > maior) {
            maior = number2;
        }
        if (number3 > maior) {
            maior = number3;
        }

        System.out.println("O maior nuúmero digitado foi : " + maior);
    }

    public void ex07 () {
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        System.out.println("Digite o 1° número: ");
        double number1 = scan.nextDouble();
        maior = number1;
        menor = number1;

        System.out.println("Digite o 2° número: ");
        double number2 = scan.nextDouble();
        System.out.println("Digite o 3° número: ");
        double number3 = scan.nextDouble();

        if (number2 > maior) {
            maior = number2;
        }
        if (number3 > maior) {
            maior = number3;
        }

        if (number2 < menor) {
            menor = number2;
        }
        if (number3 < menor) {
            menor = number3;
        }

        System.out.println("O maior nuúmero digitado foi : " + maior);
        System.out.println("O menor nuúmero digitado foi : " + menor);
    }

    public void ex08 () {
        System.out.println("Digite o preço do 1° produto: ");
        double preco1 = scan.nextDouble();

        System.out.println("Digite o preço do 2° produto: ");
        double preco2 = scan.nextDouble();

        System.out.println("Digite o preço do 3° produto: ");
        double preco3 = scan.nextDouble();

        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("Levar o 1° produto");
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("Levar o 2° produto");
        } else {
            System.out.println("Levar o 3° produto");
        }
    }

    public void ex09 () {
        System.out.println("Digite o 1° número: ");
        double number1 = scan.nextDouble();

        System.out.println("Digite o 2° número: ");
        double number2 = scan.nextDouble();

        System.out.println("Digite o 3° número: ");
        double number3 = scan.nextDouble();

        if (number1 <= number2 && number1 <= number3 && number2 <= number3) {
            System.out.println(number3 + " -> " + number2 + " -> " + number1);
        } else  if (number1 <= number2 && number1 <= number3 && number3 <= number2) {
            System.out.println(number2 + " -> " + number3 + " -> " + number1);
        } else  if (number2 <= number1 && number2 <= number3 && number1 <= number3) {
            System.out.println(number3 + " -> " + number1 + " -> " + number2);
        }  else  if (number2 <= number1 && number2 <= number3 && number3 <= number1) {
            System.out.println(number1 + " -> " + number3 + " -> " + number2);
        } else  if (number3 <= number1 && number3 <= number2 && number1 <= number2) {
            System.out.println(number2 + " -> " + number1 + " -> " + number3);
        } else {
            System.out.println(number1 + " -> " + number2 + " -> " + number3);

        }
    } 

    public void ex10 () {
        System.out.println("[M]- Matutino" );
        System.out.println("[V] - Vespertino");
        System.out.println("[N] - Noturno");
        System.out.println("Digite: ");
        String turno = scan.nextLine().toLowerCase();

        switch(turno){
            case "m": {
                System.out.println("Bom dia!");
            }break;
            case "v": {
                System.out.println("Boa tarde!");
            }break;
            case "n": {
                System.out.println("Boa noite!");
            }break;
            default: {
                System.out.println("Opção inválida");
            }
        }

    }

    public void ex11 () {
        System.out.println("Digite o valor do sálario atual: ");
        double salarioAtual = scan.nextDouble();
        
        double novoSalario, aumento;
        int taxaAumento;

        if (salarioAtual <= 280){
            taxaAumento = 20;
            aumento = (salarioAtual * taxaAumento) / 100;
            novoSalario = salarioAtual + aumento;

            System.out.println("----------------------------------------------------------------");
            System.out.println("Sálario antigo: " + salarioAtual);
            System.out.println("porcentagem de aumento: " + taxaAumento + "%");
            System.out.println("Valor do aumento: " + aumento);
            System.out.println("Novo sálario: " + novoSalario);
            System.out.println("----------------------------------------------------------------");
        } else if (salarioAtual <= 700){
            taxaAumento = 20;
            aumento = (salarioAtual * taxaAumento) / 100;
            novoSalario = salarioAtual + aumento;

            System.out.println("----------------------------------------------------------------");
            System.out.println("Sálario antigo: " + salarioAtual);
            System.out.println("porcentagem de aumento: " + taxaAumento + "%");
            System.out.println("Valor do aumento: " + aumento);
            System.out.println("Novo sálario: " + novoSalario);
            System.out.println("----------------------------------------------------------------");
        } else if (salarioAtual <= 1500) {
            taxaAumento = 20;
            aumento = (salarioAtual * taxaAumento) / 100;
            novoSalario = salarioAtual + aumento;

            System.out.println("----------------------------------------------------------------");
            System.out.println("Sálario antigo: " + salarioAtual);
            System.out.println("porcentagem de aumento: " + taxaAumento + "%");
            System.out.println("Valor do aumento: " + aumento);
            System.out.println("Novo sálario: " + novoSalario);
            System.out.println("----------------------------------------------------------------");
        } else {
            taxaAumento = 20;
            aumento = (salarioAtual * taxaAumento) / 100;
            novoSalario = salarioAtual + aumento;

            System.out.println("----------------------------------------------------------------");
            System.out.println("Sálario antigo: " + salarioAtual);
            System.out.println("porcentagem de aumento: " + taxaAumento + "%");
            System.out.println("Valor do aumento: " + aumento);
            System.out.println("Novo sálario: " + novoSalario);
            System.out.println("----------------------------------------------------------------");
        }
    }

    public void ex12 () {
        System.out.println("Digite o total de horas trabalhadas no mês: ");
        int horasTrabalhadas = scan.nextInt();
        System.out.println("Digite o valor/hora que você ganhar: ");
        double valorHoras = scan.nextDouble();

        double salarioBruto = valorHoras * horasTrabalhadas;

        int percentualIR;

        if (salarioBruto <= 900) {
            percentualIR = 0;
        } else if (salarioBruto <= 1500) {
            percentualIR = 5;
        } else if (salarioBruto <= 2500) {
            percentualIR = 10;
        } else {
            percentualIR = 20;
        }

        double ir = (salarioBruto / 100) * percentualIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("------------------------------");
        System.out.println("Salário Bruto: " + valorHoras + " * " + horasTrabalhadas + " : " + salarioBruto);
        System.out.println("(-) IR (" + percentualIR + "%)  : " + ir);
        System.out.println("(-) INSS (10%) :" + inss);
        System.out.println("FGTS (11%) :" + fgts);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Sálario Liquido: " + salarioLiquido);
        System.out.println("------------------------------");

    }

    public void ex13 () {
        System.out.println("Digite um número de 1-7");
        int dia = scan.nextInt();

        switch (dia) {
            case 1: {
                System.out.println("Domingo");
            }break;
            case 2:{
                System.out.println("Segunda-feira");
            }break;
            case 3: {
                System.out.println("Terça-feira");
            }break;
            case 4: {
                System.out.println("Quarta-feira");
            }break;
            case 5: {
                System.out.println("Quinta-feira");
            }break;
            case 6: {
                System.out.println("Sexta-feira");
            }break;
            case 7: {
                System.out.println("Sábado");
            }break;
            default: {
                System.out.println("Opção inválida");
            }
        }
    }

    public void ex14 () {
        System.out.println("Digite a 1° nota:");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a 2° nota:");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        char conceito;

        if (media <= 4 ){
            conceito = 'E';
            System.out.println("Conceito: " + conceito);
            System.out.println("Reprovado");
        } else if (media <= 6) {
            conceito = 'D';
            System.out.println("Conceito: " + conceito);
            System.out.println("Reprovado");
        } else if (media <= 7.5) {
            conceito = 'C';
            System.out.println("Conceito: " + conceito);
            System.out.println("Aprovado");
        } else if (media <= 9) {
            conceito = 'B';
            System.out.println("Conceito: " + conceito);
            System.out.println("Aprovado");
        } else {
            conceito = 'A';
            System.out.println("Conceito: " + conceito);
            System.out.println("Aprovado");
        }

    }

    public void ex15 () {
        System.out.println("Digite o lado 1");
        int lado1 = scan.nextInt();
        System.out.println("Digite o lado 2");
        int lado2 = scan.nextInt();
        System.out.println("Digite o lado 3");
        int lado3 = scan.nextInt();

        if ((lado1 + lado2 > lado3) || (lado1 + lado3 > lado2) || (lado2 + lado3 > lado1)) {
            System.out.println("É um triangulo");

            if (lado1 == lado2 && lado3 == lado1 && lado2 == lado3) {
                System.out.println("Equilátero");
            } else if (lado1 != lado2 && lado3 != lado1 && lado2 != lado3) {
                System.out.println("Escaleno");
            } else {
                System.out.println("Isóceles");
            }

        } else {
            System.out.println("Não é um triangulo");
        }


    }

    public void ex16 () {
        System.out.println("Digite o valor do A");
        int a = scan.nextInt();

        if (a == 0) {
            System.out.println("Não é uma equação do 2° grau");
        } else {
            System.out.println("Digite o valor do B");
            int b = scan.nextInt();
            System.out.println("Digite o valor do C");
            int c = scan.nextInt();

            double delta = Math.pow(b, 2) - 4 * a * c;

            if(delta < 0) {
                System.out.println("A equação não possui raizes reais");
            } else if (delta == 1) {
                double x = (-b + Math.sqrt(delta)) / 2 * a;

                System.out.println("Só possui uma raiz");
                System.out.println("X = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / 2 * a;

                double x2 = (-b - Math.sqrt(delta)) / 2 * a;

                System.out.println("Possui 2 raiz");
                System.out.println("X1: " + x1);
                System.out.println("X2: " + x2);
            }


        }


    }



}
