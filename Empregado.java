public class Empregado{
  private String nome;
  private int idade;
  private int tipo;
  private double salario;
  private double comissao;
  private double bonus;

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  public void setComissao(double comissao) {
    this.comissao = comissao;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getBonus() {
    return bonus;
  }

  public double getComissao() {
    return comissao;
  }

  public double getSalario() {
    return salario;
  }

  public void setTipo(int tipo) {
    this.tipo = tipo;
  }

  public int getTipo() {
    return tipo;
  }

  public double calcularSalario(){
    if (tipo == 1)
      return salario;
    if (tipo == 2)
      return salario + salario * comissao;
    if (tipo == 3)
      return salario + bonus;
    return 0;
  }

  public int getIdade() {
    return idade;
  }

  public String getNome() {
    return nome;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

}