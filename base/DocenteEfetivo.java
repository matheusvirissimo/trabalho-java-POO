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
    public double calcularSalario(double salario){
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
    
    @Override
    public void exibir() {
        System.out.println("*** DOCENTE EFETIVO ***");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + calcularSalario(salario));
        System.out.println("Nível: " + nivel);
        System.out.println("Titulacao" + titulacao);
        System.out.println("Departamento: " + departamento);
        System.out.println("Área: " + area);
    }

    @Override
    public String dados() {
        String dados = "EFETIVO \n"
                + "Código: " + codigo + "\n"
                + "Nome: " + nome + "\n"
                + "Salário: R$" + calcularSalario(salario) + "\n"
                + "Nível: " + nivel + "\n"
                + "Titulação: " + titulacao + "\n"
                + "Departamento: " + departamento + "\n"
                + "Área: " + area + "\n";
        return dados;
    }
    

    public String getArea() {
        return area;
    }
    
    public void setArea(String area){
        this.area = area;
    }
   
    
}