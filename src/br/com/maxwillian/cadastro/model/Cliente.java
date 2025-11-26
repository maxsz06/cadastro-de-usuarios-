package br.com.maxwillian.cadastro.model;
import java.time.LocalDate;


public class Cliente {

    public String id;
    public String nome;
    public String email;
    public LocalDate dataNascimento;
    public double salario;

    public void exibirCliente(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Salario: " + salario);


    }


}