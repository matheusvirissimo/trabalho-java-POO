
package base;

public class Tecnico extends Funcionario{
    private String funcao;
    
    public Tecnico(String codigo, String nome, String nivel, String funcao, String departamento){
        super(codigo, nome, nivel, departamento);
        setFuncao(funcao);
    }
    
    @Override 
    public double calcularSalario(){
        double novoSalario = 0;
        if(nivel.equalsIgnoreCase("t1")){
            novoSalario = novoSalario + (novoSalario * Utils.T1);
        }else{
            if(nivel.equalsIgnoreCase("t2")){
                novoSalario = novoSalario + (novoSalario * Utils.T2);
            }else{
                System.out.println("Nível não existente.");
            }
        }
        
        return novoSalario;
        
    } 

    public String getFuncao() {
        return funcao;
    }
    
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
}
