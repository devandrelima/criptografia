package com.p3discreta.criptografia.model;

import com.p3discreta.criptografia.repository.mensagemInterna;

public class MaquinaCriptografar {
    
    public mensagemInterna criptografar(String texto, int a, int b, int c, int id){

        texto = texto.toUpperCase();
        MaquinaDeConverter maquinaDeConverter = new MaquinaDeConverter();
        Integer[] textoEmNumero = maquinaDeConverter.transformarLetraEmNumero(texto);
        String textoCriptografado;

        // Mostra o texto convertido em números antes de ser criptografado
        for(Integer n: textoEmNumero){
            System.out.print(n + " - ");
        }

        if(id == 1){
            // Criptografa cada número com a equação do 1° grau f(x) = ax + b
            for(int i = 0; i < textoEmNumero.length; i++){
                textoEmNumero[i] = textoEmNumero[i] * a + b;
            }

        } else if(id == 2){
            // Criptografa cada número com a equação do 2° grau f(x) = ax^2 + bx + c
            for(int i = 0; i < textoEmNumero.length; i++){
                textoEmNumero[i] =  (int) (a * Math.pow(textoEmNumero[i], 2) + b * textoEmNumero[i] + c);
            }
        } else {
            // criptografa em 3° grau
        }
        
        // Mostra os números criptografados
        System.out.println();
        for(Integer n: textoEmNumero){
            System.out.print(n + " - ");
        }

        textoCriptografado = maquinaDeConverter.transformarNumeroEmLetra(textoEmNumero);

        return new mensagemInterna(textoCriptografado, textoEmNumero);
    }
}
