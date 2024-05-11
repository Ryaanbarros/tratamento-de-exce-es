public class FormatadorDeCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("233333373");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O cep não corresponde com as regras de negócio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{ //quando eu tentar formatar um Cep
        if(cep.length() != 8)//ele vai verificar se o cep for diferente de 8
          throw new CepInvalidoException(); // ele vai lançar essa exceção
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
