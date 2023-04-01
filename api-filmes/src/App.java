import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";

        var http = new ClienteHttp();
        String json = http.buscaDados(url);

        var parser = new JsonParser();
        List<Map<String, String>> listaDeConteudos = parser.parse(json);
        
        var geradora = new GeradorDeFigurinha();
        for (Map<String,String> Conteudo: listaDeConteudos) {
    
                String urlImagem = Conteudo.get("image");
                String titulo = Conteudo.get("title");
    
                InputStream inputStream = new URL(urlImagem).openStream();
                String nomeArquivo = "saida/" + titulo + ".png";
    
                geradora.cria(inputStream, nomeArquivo);
    
                System.out.println(titulo);
                System.out.println();
        }
    }
}

