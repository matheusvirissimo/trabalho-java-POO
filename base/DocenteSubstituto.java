
package base;

public class DocenteSubstituto extends Docente{
    private int cargaHoraria;
    
    public DocenteSubstituto(String codigo, String nome, double salario, String nivel, String titulacao){
        super(codigo, nome, salario, nivel, titulacao);
        setCargaHoraria(cargaHoraria);
    }
    
    @Override
    public double calcularSalario(){
        if(nivel.equalsIgnoreCase("s1")){
            salario = salario + (salario*0.05);
        }else{
            if(nivel.equalsIgnoreCase("s2")){
                salario = salario + (salario*0.1);
            }else{
                System.out.println("Não há nível com essa sigla");
            }
        }
        
        return salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
}