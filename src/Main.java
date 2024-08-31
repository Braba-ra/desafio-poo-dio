import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();

        curso2.setTitulo("Curso java");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBarbara = new Dev();
        devBarbara.setNome("Bárbara");
        devBarbara.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Bárbara: " + devBarbara.getConteudosInscritos());
        devBarbara.progredir();
        devBarbara.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Bárbara: " + devBarbara.getConteudosInscritos());
        System.out.println("Conteudos concluídos Bárbara: " + devBarbara.getConteudosConcluidos());
        System.out.println("XP:" + devBarbara.calcularTotalXp());

        System.out.println("------");

        Dev devDavid = new Dev();
        devDavid.setNome("David");
        devDavid.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos David: " + devDavid.getConteudosInscritos());
        devDavid.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos David: " + devDavid.getConteudosInscritos());
        System.out.println("Conteudos concluídos David: " + devDavid.getConteudosConcluidos());
        System.out.println("XP:" + devDavid.calcularTotalXp());

       /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria)*/



    }
}