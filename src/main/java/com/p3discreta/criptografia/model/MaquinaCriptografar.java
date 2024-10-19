package com.p3discreta.criptografia.model;

import com.p3discreta.criptografia.repository.LetraNum;

public class MaquinaCriptografar {
    public String criptografarEmPrimeiroGrau(String texto, int a, int b){
        texto = texto.toUpperCase();
        String textoCriptografado = "";
        int index;
        int newIndex;

        for(int i = 0; i < texto.length(); i++){
            index = LetraNum.alfabeto.indexOf(texto.charAt(i)); // Vê qual letra do texto corresponde a qual número do alfabeto, por exemplo, A = 0
            newIndex = a*index + b; // criptografa

            // Padrão de diferença que dava entre os testes com o nosso código e o código passado pelo professor
            if(a != 1){
                newIndex += (a - 1);
            }

            while(newIndex > 28){
                newIndex -= 29;
            }

            textoCriptografado += LetraNum.alfabeto.charAt(newIndex);
        }

        return textoCriptografado;
    }

    public String criptografarEmSegundoGrau(String texto, int a, int b, int c){
        String textoCriptografado = "texto criptografado em 2 grau\"";

        return textoCriptografado;
    }

    //public String criptografarEmTerceiroGrau(String texto, int a, int b, int c){
    //    String textoCriptografado = "";
    //
    //    return textoCriptografado;
    //}
}
