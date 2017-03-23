package modelo;

public class main {

	public static void main(String[] args) {

		Funcionario f = new Funcionario("Atila", 1000);
		Funcionario f2 = new Funcionario("Bete", 1000);
		Funcionario f3 = new Funcionario("Caio", 1000);
		Funcionario f4 = new Funcionario("Denis", 1000);
		Funcionario f5 = new Funcionario("Eva", 1000);
		
		Departamento d = new Departamento("Financeiro");
		Departamento d2 = new Departamento("Recepcao");
		Departamento d3 = new Departamento("Chefia");
		
		Chefe c = new Chefe("Arya", 1000);
		Chefe c2 = new Chefe("Ben", 1000);
		Chefe c3 = new Chefe("Cat", 1000);
		
		System.out.println("######## Testando print() #########");
		System.out.println("");
		f.print();
		d.print();
		c.print();
		System.out.println("");
		
		System.out.println("######## Testando setLocacao() ########");
		f.setLotacao(d);
		f.print();
		d.print();
		f.setLotacao(d2);
		f.print();
		d.print();
		d2.print();
		f.setLotacao(d3);
		f.print();
		d.print();
		d2.print();
		d3.print();
		System.out.println("");
		
		System.out.println("####### Testando adicionarFuncionario() #######");
		d.print();
		d.adicionarFuncionario(f);
		d.adicionarFuncionario(f2);
		d.adicionarFuncionario(f3);
		d.print();
		d2.adicionarFuncionario(f);
		d.print();
		d2.print();
		System.out.println("");
		
		System.out.println("####### Testando removerFuncionario() #######");
		d.removerFuncionario(f2);
		d.removerFuncionario(f3);
		d.removerFuncionario(f5);
		d2.removerFuncionario(f);
		d.print();
		d2.print();
		d3.print();
		f.print();
		f2.print();
		f3.print();
		f4.print();
		f5.print();
		System.out.println("");
		
		System.out.println("####### Testando setChefe() #######");
		System.out.println("##### E setDpto() por tabela ######");
		d.setChefe(c);
		d.print();
		c.print();
		c2.print();
		c3.print();
		d.setChefe(c2);
		d.print();
		c.print();
		c2.print();
		c3.print();
		d.setChefe(c3);
		d.print();
		c.print();
		c2.print();
		c3.print();
		d.setChefe(c2);
		d.print();
		c.print();
		c2.print();
		c3.print();
		d.setChefe(null);
		d.print();
		c.print();
		c2.print();
		c3.print();
		
		
		
	}

}
