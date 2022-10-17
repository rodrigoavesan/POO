package br.edu.fatecfranca.projeto5;


// herança de comportamento, e não de código
// não herdamos código dos métodos das interfaces, mas herdamos o comportamento
// destes métodos
public class Ornitorrinco implements IMamifero, IAve {

    @Override
    public void darMama() {
        System.out.println("Ornitorrinco dando de mama");
    }

    @Override
    public void botarOvo() {
        System.out.println("Ornitorrinco botando ovo");
    }
    
    
}
