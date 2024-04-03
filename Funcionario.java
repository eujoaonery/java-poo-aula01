public class Funcionario {
    double salario;

    public void setSalario (double salario) {
        this.salario = salario + 500;

    }
}

class Analista extends Funcionario {
    @Overrride 
    public void setSalario (double salario) {
        this.salario = salario + 100;
        
    }
}