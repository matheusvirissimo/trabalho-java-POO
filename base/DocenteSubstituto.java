
package base;

public class DocenteSubstituto extends Docente{
    private int cargaHoraria;
    
    public DocenteSubstituto(String codigo, String nome, String nivel, String departamento, String titulacao){
        super(codigo, nome, nivel, departamento, titulacao);
        setCargaHoraria(cargaHoraria);
        setDepartamento(departamento);
    }
    
    @Override
    public double calcularSalario(){
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
    public void setDepartamnto(String departamento){
        this.departamento = departamento;
    }
}