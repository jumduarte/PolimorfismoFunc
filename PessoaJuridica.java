package Polimorfismo2;

public class PessoaJuridica extends Funcionario{
	
	public PessoaJuridica(long id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}
	@Override
	public double calcularSalario(double valorBruto, double imposto) {
		return valorBruto - imposto;
	}
}