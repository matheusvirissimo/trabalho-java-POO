package base;

public class Universidade {
    public String nome;
    public Departamento[] departamentos;
    
    private int MAX = 10;
    private int cont = 0;

    
    public Universidade(String nome){
        setNome(nome);
        departamentos = new Departamento[MAX];
    }
    
    public void addDepartamento(String codigo, String nome) {
        if (cont < MAX) {
            departamentos[cont] = new Departamento(codigo, nome);
            cont++;
        }
    }

    public void addTecnico(String codigo, String nome, String nivel, String funcao, String departamento) {
        for (int i = 0; i < cont; i++) {
            if (departamentos[i].nome.equalsIgnoreCase(departamento)) {
                departamentos[i].addTecnico(codigo, nome, nivel, funcao, departamento);
            }
        }
    }

    public void addEfetivo(String codigo, String nome, String nivel, String departamento, String titulacao, String area) {
        for (int i = 0; i < cont; i++) {
            if (departamentos[i].nome.equalsIgnoreCase(departamento)) {
                departamentos[i].addEfetivo(codigo, nome, nivel, departamento, titulacao, area);
            }
        }
    }

    public void addSubstituto(String codigo, String nome, String nivel, String departamento, String titulacao, int cargaHoraria) {
        for (int i = 0; i < cont; i++) {
            if (departamentos[i].nome.equalsIgnoreCase(departamento)) {
                departamentos[i].addSubstituto(codigo, nome, nivel, departamento, titulacao, cargaHoraria);
            }
        }
    }

    public String exibirTodosDepartamentos() {
        String dados = "";
        for (int i = 0; i < cont; i++) {
            String gasto = Double.toString(departamentos[i].gastosTotais());
            dados = dados + departamentos[i].getDadosDepartamentos() + "Gasto do departamento: R$"+ gasto +"\n";
        }
        return dados;
    }

    public String RelatorioGeral() {
        String relatorio = "";
        for (int i = 0; i < cont; i++) {
            String gasto = Double.toString(departamentos[i].gastosTotais());
            relatorio = relatorio + "\n\n*** Departamento " + departamentos[i].getNome() + "***\n"
                                  + "\n" + departamentos[i].exibirFuncionarios() 
                                  + "Gasto do departamento: R$"+ gasto + "\n";

        }
        return relatorio;
    }
    
    public String exibirTodosFuncionarios() {
        String relatorio = "";
        for (int i = 0; i < cont; i++) {
            relatorio = relatorio + "\n" + departamentos[i].exibirFuncionarios() + "\n";

        }
        return relatorio;
    }

    public String exibirTecnicos() {
        String relatorio = "";
        for (int i = 0; i < cont; i++) {
            relatorio = relatorio + departamentos[i].exibirTecnicos() + "\n";

        }
        return relatorio;
    }

    public String exibirDocentes() {
        String relatorio = "";
        for (int i = 0; i < cont; i++) {
            relatorio = relatorio + departamentos[i].exibirDocente()+ "\n";
        }
        return relatorio;
    }

    public String exibirEfetivos() {
        String relatorio = "";
        for (int i = 0; i < cont; i++) {
            relatorio = relatorio + departamentos[i].exibirEfetivo() + "\n";
        }
        return relatorio;
    }

    public String exibirSubstitutos() {
        String relatorio = "";
        for (int i = 0; i < cont; i++) {
            relatorio = relatorio + departamentos[i].exibirSubstituto() + "\n";
        }
        return relatorio;
    }

    public double gastoTotal() {
        double total = 0;
        for (int i = 0; i < cont; i++) {
            total = total + departamentos[i].gastosTotais();
        }
        return total;
    }

    public String resumoDepartamentos() {
        String resumo = "";
        for (int i = 0; i < cont; i++) {
            resumo = resumo + departamentos[i].resumoDepartamento();
            
        }
        return resumo;
    }

    public void resumoUmDepartamento(String chave) {
        for (int i = 0; i < cont; i++) {
            if (departamentos[i].getCodigos().equalsIgnoreCase(chave)) {
                departamentos[i].resumoDepartamento();
            }
        }

    }

    public Funcionario buscaCod(String codigo) {
        Funcionario f = null;
        for (int i = 0; i < cont; i++) {
            Funcionario aux = departamentos[i].buscarFuncCod(codigo);
            if(aux != null){
                f = aux;
            } 
        }
        return f;
    }

    public Funcionario buscaNome(String nome) {
        Funcionario f = null;
        for (int i = 0; i < cont; i++) {
            Funcionario aux = departamentos[i].buscarFuncNome(nome);
            if(aux != null){
                f = aux;
            } 
        }
        return f;
    }

    public String salarioEspecifico(double min, double max) {
        String relatorio = "";
        for (int i = 0; i < cont; i++) {
            relatorio = relatorio + departamentos[i].faixaEspecifica(min, max) + "\n";
        }
        return relatorio;
    }
    
    public Departamento buscaDepart(String chave){
        Departamento d = null;
        for(int i=0; i<cont; i++){
            if(departamentos[i].getCodigos().equalsIgnoreCase(chave)){
                d = departamentos[i];
            }
        }
        return d;
    }
    
    public Departamento buscaNomeDepart(String nome){
        Departamento d = null;
        for(int i=0; i<cont; i++){
            if(departamentos[i].getNome().equalsIgnoreCase(nome)){
                d = departamentos[i];
            }
        }
        return d;
    }
    
    public String gastoEspecifico(double a, double b) {
        double min = a, max = b;
        String relatorio = "";
        for (int i = 0; i < cont; i++) {
            if(departamentos[i].gastosTotais() >= min && departamentos[i].gastosTotais() <=max){
                relatorio = relatorio + departamentos[i].resumoDepartamento();
            }
        }
        return relatorio;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
}
