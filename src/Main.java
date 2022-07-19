import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java script");
        curso2.setDescricao("descrição curso java script");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso1.setTitulo("curso Sql");
        curso1.setDescricao("descrição curso Sql");
        curso1.setCargaHoraria(8);

        Curso curso4 = new Curso();
        curso1.setTitulo("curso Php");
        curso1.setDescricao("descrição curso Php");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
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

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gabriel " + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " + devGabriel.getConteudosConcluidos());
        System.out.print("XP: " + devGabriel.calcularTotalXp());

        System.out.println("--------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " + devJoao.getConteudosConcluidos());
        System.out.print("XP: " + devJoao.calcularTotalXp());

        System.out.println("--------------");

        Dev devRoberval = new Dev();
        devRoberval.setNome("Roberval");
        devRoberval.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Roberval " + devRoberval.getConteudosInscritos());
        devRoberval.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devRoberval.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " + devRoberval.getConteudosConcluidos());
        System.out.print("XP: " + devRoberval.calcularTotalXp());

        System.out.println("--------------");

        Dev devJuliana = new Dev();
        devJuliana.setNome("Juliana");
        devJuliana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Juliana " + devJuliana.getConteudosInscritos());
        devJuliana.progredir();
        devJuliana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devJuliana.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " + devJuliana.getConteudosConcluidos());
        System.out.print("XP: " + devJuliana.calcularTotalXp());
    }
}