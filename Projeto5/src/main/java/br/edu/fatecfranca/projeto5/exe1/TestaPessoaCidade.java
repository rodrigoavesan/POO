package br.edu.fatecfranca.projeto5.exe1;


public class TestaPessoaCidade {

    
    public static void main(String[] args) {
        
        Pessoa rodolfo = new Pessoa();
        Cidade franca = new Cidade();
        
        franca.contrata(rodolfo); //Está contratando um professsor
        
        //Conversão
	franca.contrata((IEmpregado) rodolfo);//Está contratando um empregado
        
        franca.cobraDe(rodolfo);
        franca.registra(rodolfo);
	franca.alimenta(rodolfo);

        
    }
    
}
