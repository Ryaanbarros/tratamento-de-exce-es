/* Aparentemente é um programa simples, mas vamos listar algumas possíveis exceções, que podem acontecer.

Não informar o nome e sobrenome;

O valor da idade ter um caractere NÃO numérico;

O valor da altura ter uma vírgula ao invés de ser um ponto (conforme padrão americano);  */

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner; //essa classe pega inputs do terminal

public class AboutMe {
    public static void main(String[] args) throws Exception {
        try{ // o try vai acompanhar tudo que for positivo, se tudo ali acontecer ok, beleza ele não vai disparar nada, mas se der algum erro, iremos capturar com o catch
     //criando o objeto scanner
     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
     System.out.println("Digite seu nome");
     String nome = scanner.next();
     
     System.out.println("Digite seu sobrenome");
     String sobrenome = scanner.next();

     System.out.println("Digite sua idade");
     int idade = scanner.nextInt();
     
     System.out.println("Digite sua altura");
     double altura = scanner.nextDouble();

     
     //imprimindo os dados obtidos pelo usuario
     System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
     System.out.println("Tenho " + idade + " anos ");
     System.out.println("Minha altura é " + altura + "cm ");
     scanner.close();   
        } 
        catch (InputMismatchException e){ // se der algum erro tem que colocar no catch qual é a exceção que quer capturar, no caso o erro da exceção aparece quando você inicia e coloca algo errado de proposito, ai só copiar o erro e colar dentro dos parenteses do catch, e logo na frente dê algum nome, chamei de "e".. então caso ocorra aquele erro será disparado a seguinte mensagem abaixo:
            System.out.println("Os campos de idade e altura precisam ser numéricos");
        }
     }
}


/*Conhecendo algumas exceções já mapeadas
A linguagem Java, dispõe de uma vasta lista de classes que representam exceções, abaixo iremos apresentar as mais comuns:

Nome	Causa
java.lang.NullPointerException

Quando tentamos obter alguma informação de uma variável nula.

java.lang.ArithmeticException

Quando tentamos dividir um valor por zero.

java.sql.SQLException

Quando existe algum erro, relacionado a interação com banco de dados.

java.io.FileNotFoundException

Quando tentamos ler ou escrever, em um arquivo que não existe.  */


/* Tratamento de exceções
E quando inevitavelmente, ocorrer uma exceção? Como nós desenvolvedores podemos ajustar o nosso algoritmo para amenizar o ocorrido?

A instrução 
try, permite que você defina um bloco de código, para ser testado quanto a erros enquanto está sendo executado.

A instrução 
catch, permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.

A instrução 
finally, permite definir um bloco de código a ser executado, independente de ocorrer um erro ou não. As palavras-chave try e catch vem em pares:

Estrutura de um bloco com try e catch:

Copy
try {   */
  //  bloco de código conforme esperado
//}
//catch(Exception e) {// precisamos saber qual exceção
  // bloco de código que captura as exceções que podem acontecer
  // em caso de um fluxo não previsto
//}