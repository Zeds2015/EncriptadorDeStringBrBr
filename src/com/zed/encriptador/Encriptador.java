/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zed.encriptador;

import com.zed.arquivo.Arquivo;

/**
 *
 * @author 2016101383
 */
public class Encriptador {
    public char[] encriptar(String texto){
        char[] letra = texto.toCharArray();
        for(int i = 0; i < letra.length; i++){
            letra[i] = inserirBits(i);
        }
        return letra;
    }
    private char inserirBits(int pos){
        if(pos % 2 == 0){
            return '1';
        }
        return '0';
    }
}
