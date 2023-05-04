package pkgPessoa;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa("Daniel", 19, 87.5f, 1.79f);
		
		p1.envelhercer();
		p1.emagrecer(10);
		p1.crescer(0.20f);
		System.out.println(p1);

	}

}