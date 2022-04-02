/** 
        Tipos de dados trabalhados em JAVA: 
        String -> Tudo tem  que está dentro de aspas compostas 
        int -> Números inteiros sem pontos flutuantes sem aspas 
        double -> Números flutuantes ou não flutuantes 
        char -> Aceita apenas um carácter com aspas simples 
        boolean -> Aceita um valor verdadeiro ou falso, 0 ou 1 (true, false)
  
*/ 

public class dados{
    public static void main(String[] args){
        // Definindo variáveis e seus respectivos valores
        String nome = "Fulano de tal";
        int idade = 25;
        char sexo = 'M';
        double nCasa = 40.0; 
        boolean morando = true; 
        // Exibindo os valores das mesmas na tela 
        System.out.println("Nome:" + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo:" + sexo);
        System.out.println("Número da casa:" + nCasa);
        System.out.println("Morando?" + morando);
    }
}
