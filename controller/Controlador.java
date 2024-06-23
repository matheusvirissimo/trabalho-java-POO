package controller;

import base.Departamento;
import base.Funcionario; 
import base.Universidade;

public class Controlador {
    
    private Universidade univ;
    
    public Controlador(){

    }
    
    public void addDepartamento(String nome, String codigo) {
        univ.addDepartamento(nome, codigo);
    }

    public void addTecnico(String codigo, String nome, String nivel, String funcao, String departamento) {
        univ.addTecnico(codigo, nome, nivel, funcao, departamento);
    }

    public void addEfetivo(String codigo, String nome, String nivel, String departamento, String titulacao, String area) {
        univ.addEfetivo(codigo, nome, nivel, departamento, titulacao, area);
    }

    public void addSubstituto(String codigo, String nome, String nivel, String departamento, String titulacao, int cargaHoraria) {
        univ.addSubstituto(codigo, nome, nivel, departamento, titulacao, cargaHoraria);
    }

    public String exibirDepartamentos() {
        return univ.exibirTodosDepartamentos();
    }

    public String RelatorioGeral() {
        return univ.RelatorioGeral();
    }

    public double gastoTotal() {
        return univ.gastoTotal();
    }

    public String resumoDepartamentos() {
        return univ.resumoDepartamentos();
    }

    public void resumoUmDepartamento(String chave) {
        univ.resumoUmDepartamento(chave);
    }

    public String salarioEspecifico(double min, double max) {
        return univ.salarioEspecifico(min, max);
    }
    
    public String exibirTodosFuncionarios(){
        return univ.exibirTodosFuncionarios();
    }

    public String exibirTecnicos() {
        return univ.exibirTecnicos();
    }

    public String exibirDocentes() {
        return univ.exibirDocentes();
    }

    public String exibirEfetivos() {
        return univ.exibirEfetivos();
    }

    public String exibirSubstitutos() {
        return univ.exibirSubstitutos();
    }

    public Funcionario buscaCod(String cod) {
        return univ.buscaCod(cod);
    }

    public Funcionario buscaNome(String nome) {
        return univ.buscaNome(nome);
    }
    
    public Departamento buscaDepart(String chave){
        return univ.buscaDepart(chave);
    }
    
    public Departamento buscaNomeDepart(String nome){
        return univ.buscaNomeDepart(nome);
    }
    
    public String gastoEspecifico(double a, double b){
        return univ.gastoEspecifico(a, b);
    }
}
