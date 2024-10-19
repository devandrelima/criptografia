package com.p3discreta.criptografia.model;

import com.p3discreta.criptografia.repository.LetraNum;

public class MaquinaDescriptografar {

    public String descriptografarEmPrimeiroGrau(String texto, int a, int b){
        String textoDesriptografado = "";
        texto = texto.toUpperCase();
        int index;
        int newIndex;

        for(int i = 0; i < texto.length(); i++){
            index = LetraNum.alfabeto.indexOf(texto.charAt(i)); // Vê qual letra do texto corresponde a qual número do alfabeto, por exemplo, A = 0
            newIndex = ((index%28)-b)/a; // criptografa

           

            textoDesriptografado += LetraNum.alfabeto.charAt(newIndex);
        }

        return textoDesriptografado;
    }

    public String descriptografarEmSegundoGrau(String texto, int a, int b, int c){
        String textoDescriptografado = "texto descriptografado em 2 grau";

        return textoDescriptografado;
    }

    //public String descriptografarEmTerceiroGrau(String texto, int a, int b, int c){
    //    String textoCriptografado = "";
    //
    //    return textoCriptografado;
    //}
}
