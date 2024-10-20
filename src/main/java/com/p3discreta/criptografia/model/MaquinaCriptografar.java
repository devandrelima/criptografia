package com.p3discreta.criptografia.model;

import com.p3discreta.criptografia.repository.LetraNum;

public class MaquinaCriptografar {
    
    public String criptografarEmPrimeiroGrau(String texto, int a, int b){
        texto = texto.toUpperCase();
        String textoCriptografado = "";
        int index = 0;
        int newIndex = 0;
        LetraNum varLetraNum = new LetraNum();

        for(int i = 0; i < texto.length(); i++){
            // Vê qual letra do texto corresponde a qual número do alfabeto, por exemplo, A = 1
            for(LetraNum letraNum : varLetraNum.alfabetoNumerado){
                if(texto.charAt(i) == letraNum.letra){
                    index = letraNum.num;
                    break;
                }
            }
            
            newIndex = a*index + b; // função que criptografa

            while(newIndex > 28){
                newIndex -= 29;
            }

            // Relaciona o novo index criptografaso com a letra do alfabeto
            for(LetraNum letraNum : varLetraNum.alfabetoNumerado){
                if(letraNum.num == newIndex){
                    textoCriptografado += letraNum.letra;
                    break;
                }
            }
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
