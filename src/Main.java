import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {


		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Mentoria mentoria1 = new Mentoria();
		Bootcamp bootcamp = new Bootcamp();
		

		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Aprendendo a programar em linguagem Java");
		curso1.setCargaHoraria(30);
		
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Aprendendo a programar em linguagem JS");
		curso2.setCargaHoraria(15);
		
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Mentoria em linguagem Java");
		mentoria1.setDate(LocalDate.now());
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Nível básico a intermediário");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devVitor = new Dev();
		devVitor.setNome("Vitor");
		devVitor.inscreverBootcamp(bootcamp);
		devVitor.progredir();
		System.out.println("Conteúdos inscritos "+ devVitor.getNome() + ": " + devVitor.getConteudosInscritos());
		System.out.println("Conteúdos concluídos "+ devVitor.getNome() + ": " + devVitor.getConteudosConcluidos());
		System.out.println("XP: " + devVitor.calcularTotalXp());
		
		System.out.println("\n---------------\n");
		
		Dev devMariana = new Dev();
		devMariana.setNome("Mariana");
		devMariana.inscreverBootcamp(bootcamp);
		devMariana.progredir();
		devMariana.progredir();
		devMariana.progredir();
		
		System.out.println("Conteúdos inscritos "+ devMariana.getNome() + ": " + devMariana.getConteudosInscritos());
		System.out.println("Conteúdos concluídos "+ devMariana.getNome() + ": " + devMariana.getConteudosConcluidos());
		System.out.println("XP: " + devMariana.calcularTotalXp());
	

	}

}
