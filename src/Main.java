import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso java");
        curso2.setDescricao("Descrição curso java");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em java");
        mentoria.setDescricao("Descrição mentoria em java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLavinia = new Dev();
        devLavinia.setNome("Lavínia");
        devLavinia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lavínia:" + devLavinia.getConteudosInscritos());
        devLavinia.progredir();
        devLavinia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lavínia:" + devLavinia.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Lavínia:" + devLavinia.getConteudosConcluidos());
        System.out.println("XP:" + devLavinia.calcularTotalXp());


        System.out.println("------------");

        Dev devMateus = new Dev();
        devMateus.setNome("Mateus");
        devMateus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mateus:" + devMateus.getConteudosInscritos());
        devMateus.progredir();
        devMateus.progredir();
        devMateus.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mateus:" + devMateus.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Mateus:" + devMateus.getConteudosConcluidos());
        System.out.println("XP:" + devMateus.calcularTotalXp());



    }
}
