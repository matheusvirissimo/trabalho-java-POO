package Docente;

public abstract class Docente extends funcionario.Funcionario {
    protected String titulacao;
    
    public Docente(String codigo, String nome, double salario, String nivel){
        super(codigo, nome, salario, nivel);
        setTitulacao(titulacao);
    }
    
    @Override
    public abstract double calcularSalario();

    public String getTitulacao() {
        return titulacao;
    }
    
    public void setTitulacao(String titulacao){
        this.titulacao = titulacao;
    }
}