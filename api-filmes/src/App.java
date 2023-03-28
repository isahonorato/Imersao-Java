import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String url = "https://discord.com/channels/1085208160651980901/1085208161792831561/1089926100622262363";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
    }
}
