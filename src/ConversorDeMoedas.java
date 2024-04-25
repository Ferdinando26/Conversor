import com.google.gson.Gson;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDeMoedas {

    public static CambioConvertido converterCambio(String baseCode, String targetCode, String busca) throws IOException, InterruptedException {
        String endereco = "https://v6.exchangerate-api.com/v6/ad9e6543299e0c5f771e7a6d/pair/"
                + baseCode + "/" + targetCode + "/" + busca;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        Gson gson = new Gson();
        return gson.fromJson(json, CambioConvertido.class);
    }
}
