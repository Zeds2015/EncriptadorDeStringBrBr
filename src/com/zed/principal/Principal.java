/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zed.principal;

import com.zed.arquivo.Arquivo;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 2016101383
 */
public class Principal {

    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo();
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Digite o nome do arquivo: ");
            String nomeArquivo = teclado.nextLine();
            arquivo.escrever(nomeArquivo);
        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo Errado viado");
        }
        
        System.out.println("O que foi escrito no arquivo");
        System.out.println(arquivo.AcessarArquivo("Zed"));
    }
}
