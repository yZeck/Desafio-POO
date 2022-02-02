import br.com.dio.desafio.diminio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cursos curso1 = new Cursos();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(7);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao damentoria de java");
        mentoria.setData(LocalDate.now());



       // System.out.println(curso1);
       // System.out.println(curso2);
       // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos_Bot().add(curso1);
        bootcamp.getConteudos_Bot().add(curso2);
        bootcamp.getConteudos_Bot().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Lucas" + devLucas.getConteudosInscritos());

        devLucas.progredir();
        System.out.println("--");
        System.out.println("Conteudos inscritos Lucas" + devLucas.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Lucas" + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());

        System.out.println("------");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos João" + devJoao.getConteudosInscritos());

        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteudos inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluídos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        System.out.println("-----");


        
}
}
