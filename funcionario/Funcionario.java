
package funcionario;

public abstract class Funcionario {
    protected String codigo;
    protected String nome;
    protected double salario;
    protected String nivel;
    
    public abstract double calcularSalario(); // todas as classes que se extendem precisam
    
}
