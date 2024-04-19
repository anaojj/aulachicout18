package br.com;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Atv18 {
    public static void main(String[] args) {
        String arquivoCSV = "alunos.csv";

        try (CSVReader reader = new CSVReader(new FileReader(arquivoCSV))) {
            List<String[]> linhas = reader.readAll();

            // Exibir cabeçalho
            String[] cabecalho = linhas.remove(0);
            System.out.println("Cabeçalho:");
            for (String coluna : cabecalho) {
                System.out.print(coluna + "\t");
            }
            System.out.println();

            // Exibir dados dos alunos
            System.out.println("Dados dos Alunos:");
            for (String[] linha : linhas) {
                for (String dado : linha) {
                    System.out.print(dado + "\t");
                }
                System.out.println();
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
