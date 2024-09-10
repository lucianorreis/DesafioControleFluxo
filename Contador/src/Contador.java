import java.util.Scanner;
/**
 * @author Lucianorreis
 * @version 1.0
*  Recebe ambos os parametros e, mediante ao controle
*  de Fluxo, Calcula a diferença entre o primeiro parâmetro e o segundo.
 *  @param parametroUm
 *  @param parametroDois
 */
public class Contador {
    public static void main(String[] args) throws Exception {
        
        @SuppressWarnings("resource")
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        
    try { //? Tenta Executar a Função Contar()
        //chamando o método contendo a lógica de contagem
        contar(parametroUm,parametroDois);
        
    } catch (ParametrosInvalidosException e) {
        /** 
         * ? Pega a Classe "ParametrosInvalidosException" e atribui a "e".
         * ? Criando um print com o método que recebe a mensagem de dentro
         * ? do Else em Contar()
        */
        System.out.println(e.getMessage());
    }
}


 /*
 ? Cria o Objeto Contar(), onde o calculo e o contador são executados junto
 ? da Exceção    
 */   static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		/* 
        * validar se parametroUm é MAIOR que parametroDois e lançar a exceção.
         */
        if (parametroUm > parametroDois) {
            /*
             ! Como vimos no objeto Main,a mensagem aqui é criada e, quando o Try é feito, o  Objeto Contar() lança esta mensagem no 'e' ao qual foi atribuido, caso a exceção dispare, a mensagem armazenada em 'e.getMessage()' será printada no Terminal. 
             */
            throw new ParametrosInvalidosException("O Segundo parâmetro deve ser maior que o primeiro");
        }

		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
   
}