/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

public class DocenteEfetivo extends Docente{
    private String area;
    
    public DocenteEfetivo(String codigo, String nome, String nivel, String departamento, String titulacao){
        super(codigo, nome, nivel, departamento, titulacao);
        setArea(area);
    }
    
    @Override
    public double calcularSalario(){
        double salarioNovo = 0;
        
        if(nivel.equalsIgnoreCase("d1")){
            salarioNovo = salarioNovo + (salarioNovo * Utils.D1);
        }else{
            if(nivel.equalsIgnoreCase("d2")){
                salarioNovo = salarioNovo + (salarioNovo * Utils.D2);
            }else{
                if(nivel.equalsIgnoreCase("d3")){
                    salarioNovo = salarioNovo + (salarioNovo * Utils.D3);
                }else{
                    System.out.println("Não há nivel com essa sigla.");
                }
            }
        }
        
        return salarioNovo;
    }

    public String getArea() {
        return area;
    }
    
    public void setArea(String area){
        this.area = area;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
    public void setDepartamnto(String departamento){
        this.departamento = departamento;
    }
    
}