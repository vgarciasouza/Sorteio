import java.util.ArrayList;
import java.util.Collections;

public class Sorteio {

	public static void main(String[] args) {

		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		Aluno aluno1 = new Aluno("João1");
		alunos.add(aluno1);
		Aluno aluno2 = new Aluno("Samuel");
		alunos.add(aluno2);
		Aluno aluno3 = new Aluno("Miguel");
		alunos.add(aluno3);
		Aluno aluno4 = new Aluno("Bernardo");
		alunos.add(aluno4);
		Aluno aluno5 = new Aluno("João2");
		alunos.add(aluno5);
		Aluno aluno6 = new Aluno("Arthur");
		alunos.add(aluno6);
		Aluno aluno7 = new Aluno("Kaíque");
		alunos.add(aluno7);
		Aluno aluno8 = new Aluno("Nícolas");
		alunos.add(aluno8);
		Aluno aluno9 = new Aluno("Johnatan");
		alunos.add(aluno9);

		System.out.println(alunos);

		Collections.shuffle(alunos);

		System.out.println(alunos);
		
//		System.out.println("Bumblebee: " + alunos.get(0) + ", " + alunos.get(1) + " e " + alunos.get(2));
//		System.out.println("Iron Hide: " + alunos.get(3) + " e " + alunos.get(4));
//		System.out.println("Ratchet: " + alunos.get(5) + " e " + alunos.get(6));
//		System.out.println("Bumblebee: " + alunos.get(7) + " e " + alunos.get(8));
//		

	}
}
