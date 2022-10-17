package br.edu.fatecfranca.projeto5;

public class Projeto5 {

    public static void main(String[] args) {
        
        Ornitorrinco objOrn1 = new Ornitorrinco();
        objOrn1.botarOvo();
        objOrn1.darMama();
        
        
        IMamifero objMam1 = new Ornitorrinco();
        
        objMam1.darMama();
        
        IAve objAv1 = new Ornitorrinco();
        objAv1.botarOvo();
        
        
    }
}
