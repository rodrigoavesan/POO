package br.edu.fatecfranca.projeto5.exe1;


public class Pessoa extends Animal implements ICidadao , IContribuinte, IProfessor {

    @Override
    public void vota(){
        System.out.println("Votando ...");
    }

    @Override
    public void obterRG(){
        System.out.println("Tirando RG  ...");
    }

    @Override
    public void pagarImpostoRenda(){
        System.out.println("Pagando Imposto de Renda ...");
    }

    @Override
    public void obterCPF(){
        System.out.println("Obtendo CPF ...");
    }

    @Override
    public void trabalha() {
        System.out.println("Trabalhando ...");
    }

    @Override
    public void ensina() {
        System.out.println("Ensinando ...");
    }
    
    
    
}
