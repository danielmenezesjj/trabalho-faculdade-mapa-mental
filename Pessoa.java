package pkgPessoa;
/*
Atributos: nome, idade, peso e altura
Métodos: Envelhercer, engordar, emagrecer, crescer. Obs: Por padrão, 
a cada ano que nossa pessoa envelhece, sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm.
*/

public class Pessoa {
	private String nome;
	private int idade;
	private float peso;
	private float altura;
	
	
	public Pessoa(String nome, int idade, float peso, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + "]";
	}


	public void envelhercer() {
		this.setIdade(this.getIdade() + 1);
		if(this.getIdade() < 21) {
			this.setAltura(this.getAltura() + 0.5f);
			
		}
	}
	
	public void engordar(float novopeso) {
		this.setPeso(this.getPeso() + novopeso);
		
	}
	public void emagrecer(float pesoPerdido) {
		this.setPeso(this.getPeso() - pesoPerdido);
		
	}
	public void crescer(float novaAltura) {
		this.setAltura(this.getAltura() + novaAltura);
		
	}

}