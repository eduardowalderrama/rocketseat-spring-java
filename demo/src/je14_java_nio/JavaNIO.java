package je14_java_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaNIO {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\rocket\\curso-java\\aula-java.txt");

            // Lendo o path e convertendo todos os caracteres (bytes) de uma so vez
            byte[] bytesArquivo = Files.readAllBytes(path);

            // Como sao bytes podemos criar uma String a partir de agora
            String conteudo = new String(bytesArquivo);
            System.out.println(conteudo);

            Path pathNio = Paths.get("C:\\rocket\\curso-java\\aula-java-nio.txt");
            List<String> nomes = new ArrayList<>();
            nomes.add("James Stewart");
            nomes.add("Ruth Wellington");

            StringBuilder assunto = new StringBuilder();
            nomes.forEach(a -> assunto.append(a).append("\n"));

            Files.writeString(pathNio, assunto.toString());
            System.out.println(assunto);
        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }
}
