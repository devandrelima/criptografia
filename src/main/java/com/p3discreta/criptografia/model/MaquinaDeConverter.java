package com.p3discreta.criptografia.model;

import java.util.ArrayList;
import java.util.List;

import com.p3discreta.criptografia.repository.LetraNum;

public class MaquinaDeConverter {
    // Trabalho com Integer em vez de int pois tem umas funções prontas que ajudam, coisa que o tipo int nativo não tem
    public Integer[] transformarLetraEmNumero(String texto){
        // Primeiro uso uma lista, pois inicialmente não sei o tamanho do texto passado
        List<Integer> textoTransformadoEmNumeros = new ArrayList<>();
       
        for(int i = 0; i < texto.length(); i++){
            for(int j = 0; j < LetraNum.alfabetoNumerado.length; j++){
                // Esse if faz com que quando a letra do texto enviado for igual a letra do alfabeto que está
                // sendo percorrido, ele pega o número correspondente a letra e coloca em um vetor de inteiros
                if(texto.charAt(i) == LetraNum.alfabetoNumerado[j].letra){
                    textoTransformadoEmNumeros.add(LetraNum.alfabetoNumerado[j].num);
                    break;
                }
            }
        }

        Integer[] vetortextoTransformadoEmNumeros = new Integer[textoTransformadoEmNumeros.size()];

        // Após toda a conversão eu passo a Lista para um array estático (é mais leve e rápido para manipular)
        textoTransformadoEmNumeros.toArray(vetortextoTransformadoEmNumeros);

        return vetortextoTransformadoEmNumeros;
    }

    public String transformarNumeroEmLetra(Integer[] vetorNumero){
        String texto = "";
        int num;

        for(int i = 0; i < vetorNumero.length; i++){
            num = vetorNumero[i]; 

            if(num < 0) {
                num *=-1;
            }
            
            // Não existe a letra 355, então essas subtrações sucessivas são uma espécie de módulo para
            // o número grande ficar entre o intervalo de 1 e 29
            while(num > 29){
                num -= 29;
            }

            // Após fazer o "módulo" dos números criptografados, transformo eles em letras
            for(int j = 0; j < LetraNum.alfabetoNumerado.length; j++){
                if(num == LetraNum.alfabetoNumerado[j].num){
                    texto += LetraNum.alfabetoNumerado[j].letra;
                    break;
                }
            }
        }
        
        return texto;
    }
}
