package Polimorfismo2;

public class Principal {

	public static void main(String[] args) {
		
			Jornada jornada = new Jornada(1,"Taylor","15999999999",2039,"itapetininga");
			System.out.println("\nJORNADA:");
			System.out.println("Id:"+jornada.getId());
			System.out.println("Nome:"+jornada.getNome());
			System.out.println("Telefone:"+jornada.getTelefone());
			System.out.println("Matricula:"+jornada.getMatricula());
			System.out.println("Endereco:"+jornada.getEndereco());
			System.out.println(jornada.calcularSalario(1000, 20));
			
			Horista horista = new Horista(2,"Abel","44859632",209,"orlando");
			System.out.println("\nHORISTA:");
			System.out.println("Id:"+horista.getId());
			System.out.println("Nome:"+horista.getNome());
			System.out.println("Telefone:"+horista.getTelefone());
			System.out.println("Matricula:"+horista.getMatricula());
			System.out.println("Endereco:"+horista.getEndereco());
			System.out.println(horista.calcularSalario(3333, 15));
			
			
			PessoaJuridica pessoaJuridica = new PessoaJuridica(3,"Isaac","181818181",1806,"new york");
			System.out.println("\nPESSOA JURIDICA:");
			System.out.println("Id:"+pessoaJuridica.getId());
			System.out.println("Nome:"+pessoaJuridica.getNome());
			System.out.println("Telefone:"+pessoaJuridica.getTelefone());
			System.out.println("Matricula:"+pessoaJuridica.getMatricula());
			System.out.println("Endereco:"+pessoaJuridica.getEndereco());
			System.out.println(pessoaJuridica.calcularSalario(5000, 20));
	}

}
