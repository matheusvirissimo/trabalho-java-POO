
package base;

public class Tecnico extends Funcionario{
    private String funcao;
    
    public Tecnico(String codigo, String nome, String nivel, String funcao, String departamento){
        super(codigo, nome, nivel, departamento);
        setFuncao(funcao);
    }
    
    @Override 
    public double calcularSalario(double salario){
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
    
    @Override 
    public void exibir(){
        System.out.println("*** TÉCNICO ***");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + calcularSalario(salario));
        System.out.println("Nível: " + nivel);
        System.out.println("Departamento: " + departamento);
        System.out.println("Função: " + funcao);
    }
    
    @Override
    public String dados(){
        String dados = "TÉCNICO \n" 
                        + "Código: " + codigo + "\n"
                        + "Nome: " + nome + "\n"
                        + "Salário: R$" + calcularSalario(salario) + "\n"
                        + "Nível: "+nivel + "\n"
                        + "Departamento: "+ departamento + "\n"
                        + "Função: " + funcao + "\n";
        return dados;
    }

    public String getFuncao() {
        return funcao;
    }
    
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
}