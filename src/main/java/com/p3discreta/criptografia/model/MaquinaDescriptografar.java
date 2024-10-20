package com.p3discreta.criptografia.model;

import com.p3discreta.criptografia.repository.LetraNum;

public class MaquinaDescriptografar {

    public String descriptografarEmPrimeiroGrau(String texto, int a, int b){
        String textoDesriptografado = "";
        texto = texto.toUpperCase();
        int index = 0;
        int j = 0;

        // Reinicializa vetor global para os valores default
        for(LetraNum letraNum : LetraNum.alfabetoNumerado){
            LetraNum.alfabetoNumeradoDescriptografado[j].num = letraNum.num;
            j++;
        }

        // Cria vetor com gabarito dos indices e suas respectivas letras (chave)
        for(LetraNum let : LetraNum.alfabetoNumeradoDescriptografado){
            let.num = (let.num*a) + b;

            while(let.num > 29){
                let.num -= 29;
            }

            System.out.println(let.num);
        }

        for(int i = 0; i < texto.length(); i++){
            // Procura o número correspondente no alfabeto numerado
            for(LetraNum letraDescriptografada : LetraNum.alfabetoNumerado){
                if(texto.charAt(i) == letraDescriptografada.letra){
                    index = letraDescriptografada.num;
                    break;
                }
            }

            // Relaciona o alfabeto 
            for(LetraNum let : LetraNum.alfabetoNumeradoDescriptografado){
                if(let.num == index){
                    textoDesriptografado += let.letra;
                    break;
                }
            }
        }

        return textoDesriptografado;
    }
 
    public String descriptografarEmSegundoGrau(String texto, int a, int b, int c){
        String textoDesriptografado = "";
        texto = texto.toUpperCase();
        int index = 0;
        int j = 0;

        // Reinicializa vetor global para os valores default
        for(LetraNum letraNum : LetraNum.alfabetoNumerado){
            LetraNum.alfabetoNumeradoDescriptografado[j].num = letraNum.num;
            j++;
        }

        // Cria vetor com gabarito dos indices e suas respectivas letras (chave)
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        for(LetraNum let : LetraNum.alfabetoNumeradoDescriptografado){
            let.num = (int) (a*Math.pow(let.num,2) + b*let.num + c);

            while(let.num > 29){
                let.num -= 29;
            }
        
            System.out.println(let.num);
        }

        for(int i = 0; i < texto.length(); i++){
            // Procura o número correspondente no alfabeto numerado
            for(LetraNum letraDescriptografada : LetraNum.alfabetoNumerado){
                if(texto.charAt(i) == letraDescriptografada.letra){
                    index = letraDescriptografada.num;
                    break;
                }
            }

            // Relaciona o alfabeto 
            for(LetraNum let : LetraNum.alfabetoNumeradoDescriptografado){
                if(let.num == index){
                    textoDesriptografado += let.letra;
                    break;
                }
            }
        }

        return textoDesriptografado;
    }

    //public String descriptografarEmTerceiroGrau(String texto, int a, int b, int c){
    //    String textoCriptografado = "";
    //
    //    return textoCriptografado;
    //}
}
