
package base;

public class Tecnico extends Funcionario{
    private String funcao;
    
    public Tecnico(String codigo, String nome, double salario, String nivel, String funcao){
        super(codigo, nome, salario, nivel);
        setFuncao(funcao);
    }
    
    @Override 
    public double calcularSalario(){
        if(nivel.equalsIgnoreCase("t1")){
            salario = salario + (salario *0.1);
        }else{
            if(nivel.equalsIgnoreCase("t2")){
                salario = salario + (salario * 0.2);
            }else{
                System.out.println("Nível não existente.");
            }
        }
        
        return salario;
        
    } 

    public String getFuncao() {
        return funcao;
    }
    
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
}
