package je14_java_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaCadastro {
    public static void main(String[] args) {

        // nossos cadastros na forma de objetos
        List<Cadastro> cadastros = new ArrayList<>();
        cadastros.add(new Cadastro("Joemia Giron Lyrio Monnera", "F", Long.parseLong("8321485886"),
                LocalDate.of(1984, 6, 30), 35.0, false));
        cadastros.add(new Cadastro("Reginaldo Folly Barboza Brito", "M", Long.parseLong("2127056726"),
                LocalDate.of(1990, 3, 17), 40.0, true));
        cadastros.add(new Cadastro("Mariza Gadelha Bastida Carneiro", "F", Long.parseLong("9124168455"),
                LocalDate.of(1889, 8, 18), 40.0, false));
        cadastros.add(new Cadastro("Mirian Venancio Portela Ignacia", "M", Long.parseLong("6832598389"),
                LocalDate.of(1975, 11, 21), 29.0, true));

        //escreverLayouDelimitado(cadastros);
        escreverLayoutPosicional(cadastros);
        //lerLayoutDelimitado();
    }

    private static void escreverLayouDelimitado(List<Cadastro> cadastros) {
        System.out.println("***** - LAYOUT DELIMITADO - *****");

        try {
            StringBuilder conteudo = getStringBuilder(cadastros);

            System.out.println(conteudo);

            Path arquivoDestino = Paths.get("C:\\rocket\\lista-contatos-modelo-delimitado.csv");

            Files.writeString(arquivoDestino, conteudo.toString(), StandardOpenOption.CREATE);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static StringBuilder getStringBuilder(List<Cadastro> cadastros) {
        StringBuilder conteudo = new StringBuilder();

        for (Cadastro cadastro: cadastros) {
            conteudo.append(cadastro.getNome()).append(";");
            conteudo.append(cadastro.getSexo()).append(";");
            conteudo.append(cadastro.getTelefone()).append(";");
            conteudo.append(cadastro.getDataNascimento()).append(";");
            conteudo.append(cadastro.getValorSugerido()).append(";");
            conteudo.append(cadastro.isCliente());
            conteudo.append(System.lineSeparator());
        }
        return conteudo;
    }

    private static List<Cadastro> lerLayoutDelimitado() {
        List<Cadastro> cadastros = new ArrayList<>();

        try {
            Path arquivoOrigem = Paths.get("C:\\rocket\\lista-contatos-modelo-delimitado.csv");

            List<String> linhas = Files.readAllLines(arquivoOrigem);
            // imprimindo cada linha obtida no arquivo
            for (String linha:linhas) {
                String[] colunas = linha.split(";");
                String nome = colunas[0];
                String sexo = colunas[1];
                Long telefone = Long.valueOf(colunas[2]);
                LocalDate dataAniversario = LocalDate.parse(colunas[3]);
                Double valorSugerido = Double.valueOf(colunas[4]);
                boolean cliente = Boolean.parseBoolean(colunas[5]);

                // criando um novo cadastro e adicionando na lista de acordo com os valores de cada coluna
                cadastros.add(new Cadastro(nome, sexo, telefone, dataAniversario, valorSugerido, cliente));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return cadastros;
    }

    private static void escreverLayoutPosicional(List<Cadastro> cadastros) {
        System.out.println("***** - LAYOUT POSICIONAL - *****");
        try {
            StringBuilder conteudo = new StringBuilder();
            for (Cadastro cadastro: cadastros) {
                String nome = cadastro.getNome();
                // calma, nao sera assim para sempre
                if (nome.length() > 30)
                    nome = nome.substring(0, 30);

                // pesquise sobre String.format
                if (nome.length() < 30)
                    nome = String.format("%-30s", nome);

                conteudo.append(nome);
                conteudo.append(cadastro.getSexo().toUpperCase());
                conteudo.append(cadastro.getTelefone());
                conteudo.append(cadastro.getDataNascimento());

                DecimalFormat decimalFormat = new DecimalFormat("#0000.00");

                String valorFormatado = decimalFormat.format(cadastro.getValorSugerido());
                conteudo.append(valorFormatado.replaceAll(",", "."));
                conteudo.append(cadastro.isCliente() ? "1" : "0");

                // nova linha
                conteudo.append(System.lineSeparator());
            }

            System.out.println(conteudo);

            Path arquivoDestino = Paths.get("C:\\rocket\\lista-contatos-modelo-delimitado.csv");

            Files.writeString(arquivoDestino, conteudo.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
