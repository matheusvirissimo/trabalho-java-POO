
package funcionario;

public abstract class Funcionario {
    protected String codigo;
    protected String nome;
    protected double salario;
    protected String nivel;
    
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
    
}
