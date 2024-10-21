package com.p3discreta.criptografia.model;

import com.p3discreta.criptografia.repository.LetraNum;
import com.p3discreta.criptografia.repository.mensagemInterna;

public class MaquinaCriptografar {
    
    public mensagemInterna criptografarEmPrimeiroGrau(String texto, int a, int b){

        texto = texto.toUpperCase();
        MaquinaDeConverter maquinaDeConverter = new MaquinaDeConverter();
        Integer[] textoEmNumero = maquinaDeConverter.transformarLetraEmNumero(texto);
        String textoCriptografado;

        // Mostra o texto convertido em números antes de ser criptografado
        for(Integer n: textoEmNumero){
            System.out.print(n + " - ");
        }

        // Criptografa cada número com a equação do 1° grau ax + b
        for(int i = 0; i < textoEmNumero.length; i++){
            textoEmNumero[i] = textoEmNumero[i] * a + b;
        }

        // Mostra os números criptografados
        System.out.println();
        for(Integer n: textoEmNumero){
            System.out.print(n + " - ");
        }

        textoCriptografado = maquinaDeConverter.transformarNumeroEmLetra(textoEmNumero);

        return new mensagemInterna(textoCriptografado, textoEmNumero);
    }
    
    public String criptografarEmSegundoGrau(String texto, int a, int b, int c){
        texto = texto.toUpperCase();
        String textoCriptografado = "";
        int index = 0;
        int newIndex = 0;

        for(int i = 0; i < texto.length(); i++){
            // Vê qual letra do texto corresponde a qual número do alfabeto, por exemplo, A = 1
            for(LetraNum letraNum : LetraNum.alfabetoNumerado){
                if(texto.charAt(i) == letraNum.letra){
                    index = letraNum.num;
                    break;
                }
            }
            
            newIndex = (int) (a*Math.pow(index, 2) + b*index + c); // função que criptografa

            while(newIndex > 29){
                newIndex -= 29;
            }

            // Relaciona o novo index criptografaso com a letra do alfabeto
            for(LetraNum letraNum : LetraNum.alfabetoNumerado){
                if(letraNum.num == newIndex){
                    textoCriptografado += letraNum.letra;
                    break;
                }
            }
        }

        return textoCriptografado;
    }

    //public String criptografarEmTerceiroGrau(String texto, int a, int b, int c){
    //    String textoCriptografado = "";
    //
    //    return textoCriptografado;
    //}
}
