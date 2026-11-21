import java.io.File;
import java.io.FileReader;
import java.io.PushbackReader;
import quinas.lexer.Lexer;
import quinas.node.Start;
import quinas.parser.Parser;

public class Main {
    public static void main(String[] args) {
        File pastaTestes = new File("testes");
        
        if (!pastaTestes.exists() || !pastaTestes.isDirectory()) {
            System.out.println("Erro: A pasta 'testes' não foi encontrada.");
            return;
        }

        File[] arquivos = pastaTestes.listFiles((dir, name) -> name.endsWith(".qui"));
        
        if (arquivos == null || arquivos.length == 0) {
            System.out.println("Nenhum arquivo de teste (.qui) encontrado na pasta.");
            return;
        }

        System.out.println("=== INICIANDO BATERIA DE TESTES (" + arquivos.length + " arquivos) ===\n");

        int sucessos = 0;
        int falhas = 0;

        for (File arquivo : arquivos) {
            System.out.println("Testando: " + arquivo.getName() + " ... [SUCESSO]");
            try {
                Lexer lexer = new Lexer(new PushbackReader(new FileReader(arquivo), 1024));
                Parser parser = new Parser(lexer);
                
                Start arvore = parser.parse();
                
                // OPÇÃO: Imprimir a representação da árvore gerada
                System.out.println("--- Árvore para " + arquivo.getName() + " ---");
                // O método toString() do nó Start imprime toda a estrutura hierárquica formatada
                System.out.println(arvore.toString());
                System.out.println("--------------------------------------------------\n");
                
                sucessos++;
            } catch (Exception e) {
                System.out.println("Testando: " + arquivo.getName() + " ... [FALHA]");
                System.out.println("  -> Erro: " + e.getMessage());
                falhas++;
            }
        }

        System.out.println("\n=== RESUMO DOS TESTES ===");
        System.out.println("Total de sucessos: " + sucessos);
        System.out.println("Total de falhas:   " + falhas);
    }
}