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
                double numeroDaLetra = textoEmNumero[i];

                if(numeroDaLetra >= 0){
                    textoEmNumero[i] =  (int) (((-1 * b) + Math.sqrt(b*b - 4*a*(c-numeroDaLetra)))/(2*a)); // Considerar o 'x' positivo
                } else {
                    textoEmNumero[i] =  (int) (((-1 * b) - Math.sqrt(b*b - 4*a*(c-numeroDaLetra)))/(2*a)); // Considerar o 'x' negativo    
                }

                textoEmNumero[i] = Math.abs(textoEmNumero[i]);
            }
        
        } else{
            // Descriptografa com a inversa do 3° grau
            for(int i = 0; i < textoEmNumero.length; i++){
                double numeroDaLetra = textoEmNumero[i];
                double raizQuadradaInterna = Math.sqrt(27 * numeroDaLetra * numeroDaLetra - 54 * numeroDaLetra + 31);
                double equacaoDoParentesesCompleta = -9 * numeroDaLetra + Math.sqrt(3) * raizQuadradaInterna + 9;

                double numerador = Math.pow(12, 1.0 / 3.0) * Math.pow(equacaoDoParentesesCompleta, 2.0 / 3.0) + 2 * Math.pow(18, 1.0 / 3.0);
                double denominador = 6 * Math.pow(equacaoDoParentesesCompleta, 1.0 / 3.0);

                double resultado = numerador / denominador;
                
                textoEmNumero[i] = (int) resultado; 
            }
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
