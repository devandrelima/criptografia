package com.p3discreta.criptografia.model;

import com.p3discreta.criptografia.repository.LetraNum;

public class MaquinaDescriptografar {
/*
    public String descriptografarEmPrimeiroGrau(String texto, int a, int b){
        String textoDesriptografado = "";
        texto = texto.toUpperCase();
        int index = 0;
        LetraNum letraNum = new LetraNum();

        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        for(LetraNum let : letraNum.alfabetoNumeradoDescriptografado){
            let.num = (let.num*a) + b;

            while(let.num > 28){
                let.num -= 29;
            }

            System.out.println(let.num);
        }

        for(int i = 0; i < texto.length(); i++){
            
            for(LetraNum letraDescriptografada : letraNum.alfabetoNumeradoDescriptografado){
                if(texto.charAt(i) == letraDescriptografada.letra){
                    index = letraDescriptografada.num;
                    break;
                }
            }

            for(LetraNum let : letraNum.alfabetoNumeradoDescriptografado){
                if(let.num == index){
                    textoDesriptografado += let.letra;
                    break;
                }
            }
        }

        return textoDesriptografado;
    }
 */
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
