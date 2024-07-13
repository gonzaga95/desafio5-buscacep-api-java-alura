import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeradorJson {

    public void criaJson (Endereco enderecos) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter(enderecos.cep() + ".json");
        escrita.write(gson.toJson(enderecos));
        escrita.close();
    }
}
