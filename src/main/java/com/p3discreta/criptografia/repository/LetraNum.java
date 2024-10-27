package com.p3discreta.criptografia.repository;

public class LetraNum {
    public char letra;
    public int num;

    public LetraNum(char letra, int num){
        this.letra = letra;
        this.num = num;
    }

    public LetraNum(){}

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
