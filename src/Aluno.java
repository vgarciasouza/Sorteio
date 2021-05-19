
public class Aluno {
	
	private String nome;
	public static int total = 0;
	
	public Aluno (String nome) {
		total++;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return this.nome;
	}
	
}
