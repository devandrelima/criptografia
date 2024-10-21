package com.p3discreta.criptografia.model;

import com.p3discreta.criptografia.repository.mensagemInterna;

public class MaquinaDescriptografar {

    public mensagemInterna descriptografar(Integer[] textoEmNumero, int a, int b, int c, int id){
        MaquinaDeConverter maquinaDeConverter = new MaquinaDeConverter();
        String textoDesriptografado;
        
        // Mostra os números criptografados
        System.out.println();
        for(Integer n: textoEmNumero){
            System.out.print(n + " - ");
        }

        if(id == 1){
            // Descriptografa com a função inversa do 1° grau
            for(int i = 0; i < textoEmNumero.length; i++){
                textoEmNumero[i] = (textoEmNumero[i] - b) / a;
            }

        } else if(id == 2){
            // Descriptografa com a função inversa do 2° grau
            for(int i = 0; i < textoEmNumero.length; i++){
                textoEmNumero[i] =  (int) ((-1 * b) + Math.sqrt(b*b - 4*a*(c-textoEmNumero[i])/(2*a))); // Considerar apenas x positivo
            }
        
        } else{
            // Descriptografa com a inversa do 3° grau
        }
        
        // Mostra os números descriptografados
        System.out.println();
        for(Integer n: textoEmNumero){
            System.out.print(n + " - ");
        }

        textoDesriptografado = maquinaDeConverter.transformarNumeroEmLetra(textoEmNumero);
        
        return new mensagemInterna(textoDesriptografado, textoEmNumero);
    }
}
