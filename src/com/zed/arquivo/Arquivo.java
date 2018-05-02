/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zed.arquivo;

import com.zed.encriptador.Encriptador;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author 2016101383
 */
public class Arquivo {

    private static String texto = "";
    private static final String chave = "Zed";

    public void escrever(String nomeDoArquivo) throws FileNotFoundException {
        System.out.println("Digite um texto: ");
        try (PrintStream escritor = new PrintStream(new FileOutputStream(nomeDoArquivo + ".txt", true))) {
            do {
                texto += lerTexto()+"\n";
                if (!texto.contains("quit")) {
                    escritor.println(new Encriptador().encriptar(texto));
                }
            } while (!texto.contains("quit"));
        }
    }

    public void lerDoArquivo(String nomeDoArquivo) throws FileNotFoundException {
        try (Scanner leitor = new Scanner(new FileInputStream(nomeDoArquivo + ".txt"))) {
            while (leitor.hasNextLine()) {
                System.out.println(leitor.nextLine());
            }
        }
    }

    public String AcessarArquivo(String chave) {
        if (chave.equals(this.chave)) {
            texto = texto.replaceAll("quit", "");
            return texto;
        }
        throw new IllegalAccessError("Chave inválida");
    }

    private String lerTexto() {
        System.out.print(">> ");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }
}
