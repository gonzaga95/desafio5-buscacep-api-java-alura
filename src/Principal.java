import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        BuscadorCEP buscadorCEP = new BuscadorCEP();
        Scanner scanner = new Scanner(System.in);
        String cep;


        try {
            System.out.println("Digite um CEP para busca: ");
            cep = scanner.nextLine();
            Endereco novoEndereco = buscadorCEP.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorJson geradorJson = new GeradorJson();
            geradorJson.criaJson(novoEndereco);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Tente novamente ou digite 'sair' ");
        }

    }
}
