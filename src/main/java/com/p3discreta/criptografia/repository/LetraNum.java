package com.p3discreta.criptografia.repository;

public class LetraNum {
    public static final String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ., ";

    public char letra;
    public int num;

    public LetraNum(char letra, int num){
        this.letra = letra;
        this.num = num;
    }

    public LetraNum(){}

    public static LetraNum[] alfabetoNumeradoDescriptografado = { new LetraNum('A',0), 
                                                        new LetraNum('B',0), 
                                                        new LetraNum('C',0), 
                                                        new LetraNum('D',0), 
                                                        new LetraNum('E',0), 
                                                        new LetraNum('F',0), 
                                                        new LetraNum('G',0), 
                                                        new LetraNum('H',0), 
                                                        new LetraNum('I',0), 
                                                        new LetraNum('J',0), 
                                                        new LetraNum('K',0), 
                                                        new LetraNum('L',0), 
                                                        new LetraNum('M',0), 
                                                        new LetraNum('N',0), 
                                                        new LetraNum('O',0), 
                                                        new LetraNum('P',0), 
                                                        new LetraNum('Q',0), 
                                                        new LetraNum('R',0), 
                                                        new LetraNum('S',0), 
                                                        new LetraNum('T',0), 
                                                        new LetraNum('U',0), 
                                                        new LetraNum('V',0), 
                                                        new LetraNum('W',0), 
                                                        new LetraNum('X',0), 
                                                        new LetraNum('Y',0), 
                                                        new LetraNum('Z',0), 
                                                        new LetraNum('.',0), 
                                                        new LetraNum(',',0), 
                                                        new LetraNum(' ',0) };



    public static LetraNum[] alfabetoNumerado = { new LetraNum('A',1), 
                                                        new LetraNum('B',2), 
                                                        new LetraNum('C',3), 
                                                        new LetraNum('D',4), 
                                                        new LetraNum('E',5), 
                                                        new LetraNum('F',6), 
                                                        new LetraNum('G',7), 
                                                        new LetraNum('H',8), 
                                                        new LetraNum('I',9), 
                                                        new LetraNum('J',10), 
                                                        new LetraNum('K',11), 
                                                        new LetraNum('L',12), 
                                                        new LetraNum('M',13), 
                                                        new LetraNum('N',14), 
                                                        new LetraNum('O',15), 
                                                        new LetraNum('P',16), 
                                                        new LetraNum('Q',17), 
                                                        new LetraNum('R',18), 
                                                        new LetraNum('S',19), 
                                                        new LetraNum('T',20), 
                                                        new LetraNum('U',21), 
                                                        new LetraNum('V',22), 
                                                        new LetraNum('W',23), 
                                                        new LetraNum('X',24), 
                                                        new LetraNum('Y',25), 
                                                        new LetraNum('Z',26), 
                                                        new LetraNum('.',27), 
                                                        new LetraNum(',',28), 
                                                        new LetraNum(' ',29) };
}
