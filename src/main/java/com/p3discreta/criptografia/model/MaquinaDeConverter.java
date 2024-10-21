package com.p3discreta.criptografia.model;

import java.util.ArrayList;
import java.util.List;

import com.p3discreta.criptografia.repository.LetraNum;

public class MaquinaDeConverter {
    public Integer[] transformarLetraEmNumero(String texto){
        List<Integer> textoTransformadoEmNumeros = new ArrayList<>();
       
        for(int i = 0; i < texto.length(); i++){
            for(int j = 0; j < LetraNum.alfabetoNumerado.length; j++){
                if(texto.charAt(i) == LetraNum.alfabetoNumerado[j].letra){
                    textoTransformadoEmNumeros.add(LetraNum.alfabetoNumerado[j].num);
                    break;
                }
            }
        }

        Integer[] vetortextoTransformadoEmNumeros = new Integer[textoTransformadoEmNumeros.size()];

        textoTransformadoEmNumeros.toArray(vetortextoTransformadoEmNumeros);

        return vetortextoTransformadoEmNumeros;
    }

    public String transformarNumeroEmLetra(Integer[] vetorNumero){
        String texto = "";
        int num;

        for(int i = 0; i < vetorNumero.length; i++){
            num = vetorNumero[i]; 

            while(num > 29){
                num -= 29;
            }

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
