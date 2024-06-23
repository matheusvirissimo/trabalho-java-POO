/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

public abstract class Funcionario {
    protected String codigo;
    protected String nome;
    protected double salario;
    protected String nivel;
    protected String departamento;
    
    public Funcionario(String codigo, String nome, String nivel, String departamento){
        setCodigo(codigo);
        setNome(nome);
        setNivel(nivel);
        setDepartamento(departamento);
    }
    
    public abstract double calcularSalario(); // todas as classes que se extendem precisam

    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    } 

    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getNivel() {
        return nivel;
    }
    
    public void setNivel(String nivel){
        this.nivel = nivel;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
}
