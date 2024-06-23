
package base;

public class DocenteSubstituto extends Docente{
    private int cargaHoraria;
    
    public DocenteSubstituto(String codigo, String nome, String nivel, String departamento, String titulacao){
        super(codigo, nome, nivel, departamento, titulacao);
        setCargaHoraria(cargaHoraria);
        setDepartamento(departamento);
    }
    
    @Override
    public double calcularSalario(double salario){
       double novoSalario = 0;
        if(nivel.equalsIgnoreCase("s1")){
            novoSalario = novoSalario + (novoSalario * Utils.S1);
        }else{
            if(nivel.equalsIgnoreCase("s2")){
                novoSalario = novoSalario + (novoSalario * Utils.S2);
            }else{
                System.out.println("Nível não existente.");
            }
        }
        
        return novoSalario;
        
    }
    
    @Override
    public void exibir() {
        System.out.println("*** DOCENTE SUBSTITUTO ***");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + calcularSalario(salario));
        System.out.println("Nível: " + nivel);
        System.out.println("Titulação: " + titulacao);
        System.out.println("Área: " + cargaHoraria);
        System.out.println("Departamento: " + departamento);
    }

    @Override
    public String dados() {
        String dados = "SUBSTITUTO \n"
                + "Código: " + codigo + "\n"
                + "Nome: " + nome + "\n"
                + "Salário: R$" + calcularSalario(salario) + "\n"
                + "Nível: " + nivel + "\n"
                + "Titulação: " + titulacao + "\n"
                + "Departamento: " + departamento + "\n"
                + "Carga horária: " + cargaHoraria + "\n";
        return dados;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    
}