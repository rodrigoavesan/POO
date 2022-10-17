package br.edu.fatecfranca.projeto5.exe1;

public class Cidade {
    
    public void contrata(IProfessor p){
	p.ensina();
	p.trabalha();
}

    public void contrata(IEmpregado e){
            e.trabalha();
    }

    public void cobraDe(IContribuinte c) {
            c.pagarImpostoRenda();
    }

    public void registra(ICidadao c) {
            c.obterRG();
    }

    public void alimenta(Animal a ){
            a.come();
    }


    
}
