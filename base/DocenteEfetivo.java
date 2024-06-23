/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

public class DocenteEfetivo extends Docente{
    private String area;
    
    public DocenteEfetivo(String codigo, String nome, double salario, String nivel, String titulacao){
        super(codigo, nome, salario, nivel, titulacao);
        setArea(area);
    }
    
    @Override
    public double calcularSalario(){
        if(nivel.equalsIgnoreCase("d1")){
            salario = salario + (salario*0.05);
        }else{
            if(nivel.equalsIgnoreCase("d2")){
                salario = salario + (salario*0.1);
            }else{
                if(nivel.equalsIgnoreCase("d3")){
                    salario = salario + (salario*0.2);
                }else{
                    System.out.println("Não há nivel com essa sigla.");
                }
            }
        }
        
        return salario;
    }

    public String getArea() {
        return area;
    }
    
    public void setArea(String area){
        this.area = area;
    }
}