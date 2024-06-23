/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

public abstract class Docente extends Funcionario {
    protected String titulacao;
    
    public Docente(String codigo, String nome, double salario, String nivel, String titulacao){
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

