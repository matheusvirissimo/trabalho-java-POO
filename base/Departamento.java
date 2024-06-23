
package base;

public class Departamento {
    public String codigo;
    public String nome;
    public Funcionario[] funcionarios;
    
    private int cont;
    private final int MAX = 100;
    
    public Departamento(String codigo, String nome){
        setCodigo(codigo);
        setnome(nome);
        funcionarios = new Funcionario[MAX];
        this.cont = 0;
    }
    
    public void addTecnico(String codigo, String nome, String nivel, String funcao, String departamento){
        if(cont < MAX){
            funcionarios[cont] = new Tecnico(codigo, nome, nivel, funcao, departamento);
            cont++;
        }
    }
    
    public void addEfetivo(String codigo, String nome, String nivel, String departamento, String titulacao){
        if(cont < MAX){
            funcionarios[cont] = new DocenteEfetivo(codigo, nome, nivel, departamento, titulacao);
            cont++;
        }
    }
    
    public void addSubstituto(String codigo, String nome, String nivel, String departamento, String titulacao){
        if(cont < MAX){
            funcionarios[cont] = new DocenteSubstituto(codigo, nome, nivel, departamento, titulacao);
            cont++;
        }
    }
    
    public String resumoDepartamento(){
        String resumoDep;
        
        resumoDep = "\nDepartamento " + getNome() + "\n"
                + "Quantidade de funcionarios: " + cont + "\n"
                + "Gasto total: R$" + gastosTotais() + "\n";
        
        return resumoDep;
     }
    
    public String exibirFuncionarios(){
        String relatorio = ""; // do contrário ele diz que não está sendo inicializada
        
        for(int i = 0; i < cont; i++){
            if(funcionarios[i] instanceof Tecnico){
                Tecnico tec = (Tecnico) funcionarios[i];
                relatorio = relatorio + tec.dados() + "\n";
            }else{
                if(funcionarios[i] instanceof DocenteEfetivo){
                    DocenteEfetivo eft = (DocenteEfetivo) funcionarios[i];
                    relatorio = relatorio + eft.dados() + "\n"; 
                }else{
                    if(funcionarios[i] instanceof DocenteSubstituto){
                        DocenteSubstituto sub = (DocenteSubstituto) funcionarios[i];
                        relatorio = relatorio + sub.dados() + "\n";
                    }
                }
            }
        }
        
        return relatorio;
    }
    
    public String exibirTecnicos(){
        String relatorio = "";
        
        for(int i = 0; i < cont; i++){
            if(funcionarios[i] instanceof Tecnico){
                Tecnico tec = (Tecnico) funcionarios[i];
                relatorio = relatorio + tec.dados() + "\n"; 
            }
        }
        
        return relatorio;
    }
    
    public String exibirEfetivo(){
        String relatorio = ""; 
        
        for(int i = 0; i < cont; i++){
            if(funcionarios[i] instanceof DocenteEfetivo){
                DocenteEfetivo eft = (DocenteEfetivo) funcionarios[i];
                relatorio = relatorio + eft.dados() + "\n";
            }
        }
        
        return relatorio;
    }
    
    public String exibirSubstituto(){
        String relatorio = "";
        
        for(int i = 0; i < cont; i++){
            if(funcionarios[i] instanceof DocenteSubstituto){
                DocenteSubstituto sub = (DocenteSubstituto) funcionarios[i];
                relatorio = relatorio + sub.dados() + "\n";
            }
        }
        
        return relatorio;
    }
    
    public String exibirDocente(){
        String relatorio; 
        
        relatorio = exibirEfetivo() + exibirSubstituto();
        
        return relatorio;
    }
    
    public Funcionario buscarFuncCod(String chave){
        for(int i = 0; i < cont; i++){
            if(funcionarios[i].getCodigo().equalsIgnoreCase(chave)){
                if(funcionarios[i] instanceof Tecnico tec){
                    return tec;
                }else{
                    if(funcionarios[i] instanceof DocenteEfetivo eft){
                        return eft;
                    }else{
                        if(funcionarios[i] instanceof DocenteSubstituto sub){
                            return sub;
                        }
                    }
                }
            }
        }
        
        return null;
    }
    
    public Funcionario buscarFuncNome(String chave){
        for(int i = 0; i < cont; i++){
            if(funcionarios[i].getNome().equalsIgnoreCase(chave)){
                if(funcionarios[i] instanceof Tecnico tec){
                    return tec;
                }else{
                    if(funcionarios[i] instanceof DocenteEfetivo eft){
                        return eft;
                    }else{
                        if(funcionarios[i] instanceof DocenteSubstituto sub){
                            return sub;
                        }
                    }
                }
            }
        }
        
        return null;
    }
    
    public double gastosTotais(){
        double total = 0;
        
        for(int i = 0; i < cont; i++){
            total += funcionarios[i].calcularSalario(funcionarios[i].getSalario());
        }
        
        return total;
    }
    
    public String faixaEspecifica(double min, double max){
        String relatorio = "";
        
        for(int i = 0; i < cont; i++){
            if(funcionarios[i] instanceof Tecnico tec){
                double salarioAux = tec.calcularSalario(tec.getSalario());
                if(salarioAux >= min && salarioAux <= max){
                    relatorio = relatorio + tec.dados() + "\n"; 
                }
                
            }else if(funcionarios[i] instanceof DocenteEfetivo eft){
                 double salarioAux = eft.calcularSalario(eft.getSalario());
                 if(salarioAux >= min && salarioAux <= max){
                     relatorio = relatorio + eft.dados() + "\n";
                 }
                 
            }else if(funcionarios[i] instanceof DocenteSubstituto sub){
                double salarioAux = sub.calcularSalario(sub.getSalario());
                if(salarioAux >= min && salarioAux <= max){
                    relatorio = relatorio + sub.dados() + "\n";
                }
            }
        }
        
        return relatorio;
    }
    
    public String getCodigos(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    
}
