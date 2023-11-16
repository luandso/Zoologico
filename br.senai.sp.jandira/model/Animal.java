package br.senai.sp.jandira.model;

import java.time.LocalDateTime;
import java.util.*;

public class Animal {

    Scanner scanner = new Scanner(System.in);

    String nome, tipoAlimento, especie, genero;
    int idade, habitat;
    double peso;
    private LocalDateTime dataCadastro;

    List<Animal> listaAnimais = new ArrayList<>();

    public void realizarCadastro(){

        System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
        System.out.println("         Novo Cadastro de Animal");
        System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
        System.out.print("Informe o nome do animal: ");
        this.nome = scanner.nextLine();
        System.out.print("Informe o gênero do animal: ");
        this.genero = scanner.nextLine();
        System.out.print("Informe o tipo de alimentação do animal: ");
        this.tipoAlimento = scanner.nextLine();
        System.out.print("Informe a idade do animal: ");
        this.idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Informe o peso do animal: ");
        this.peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
        System.out.println("");

        this.setDataCadastro(LocalDateTime.now());
        System.out.println(getDataCadastro());
    }

    public void adicionarAnimal(Animal animal){
        listaAnimais.add(animal);
    }

    public boolean verificarListaAnimais(){
        return listaAnimais.isEmpty();
    }

    public void exibirTodosAnimais(){

        if(!listaAnimais.isEmpty()){
            for (Animal animal: listaAnimais) {
                System.out.println("");

                System.out.println("Nome: " + animal.nome);
                System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
                System.out.println("Gênero: " + animal.genero);
                System.out.println("Idade: " + animal.idade);
                System.out.println("Espécie: " + animal.especie);
                System.out.println("Peso: " + animal.peso);
                System.out.println("Tipo de Alimentação: " + animal.tipoAlimento);

                System.out.println("");
            }
        }else{
            System.out.println("");
            System.out.println("ERRO: Nenhum animal cadastrado até o momento.");
            System.out.println("");
        }
    }

    public void exibirMamiferos(){

        for (Animal animal: listaAnimais) {

            if (animal.habitat == 1){

                System.out.println("");

                System.out.println("Nome: " + animal.nome);
                System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
                System.out.println("Gênero: " + animal.genero);
                System.out.println("Idade: " + animal.idade);
                System.out.println("Espécie: " + animal.especie);
                System.out.println("Peso: " + animal.peso);
                System.out.println("Tipo de Alimentação: " + animal.tipoAlimento);

                System.out.println("");

            }
        }
    }

    public void exibirAves(){

        for (Animal animal: listaAnimais) {

            if (animal.habitat == 2){

                System.out.println("");

                System.out.println("Nome: " + animal.nome);
                System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
                System.out.println("Gênero: " + animal.genero);
                System.out.println("Idade: " + animal.idade);
                System.out.println("Espécie: " + animal.especie);
                System.out.println("Peso: " + animal.peso);
                System.out.println("Tipo de Alimentação: " + animal.tipoAlimento);

                System.out.println("");

            }
        }
    }

    public void exibirRepteis(){

        for (Animal animal: listaAnimais) {

            if (animal.habitat == 3){

                System.out.println("");

                System.out.println("Nome: " + animal.nome);
                System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
                System.out.println("Gênero: " + animal.genero);
                System.out.println("Idade: " + animal.idade);
                System.out.println("Espécie: " + animal.especie);
                System.out.println("Peso: " + animal.peso);
                System.out.println("Tipo de Alimentação: " + animal.tipoAlimento);

                System.out.println("");

            }
        }
    }
    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
