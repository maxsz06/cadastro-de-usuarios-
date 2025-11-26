package br.com.maxwillian.cadastro.repository;
import br.com.maxwillian.cadastro.model.Cliente;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ClienteRepository {

    private Cliente cliente;

    public void  cadastrar(){

    //Obter o caminho para o caminho

        //Path arquivo = Path.of("C:\\Users\\25203648\\ds1m\\clientes.csv");
        Path arquivo = Path.of("C:\\Users\\25203648\\ds1m\\clientes\\clientes.csv");
        try {
            Files.writeString(arquivo,"SENAI JANDIRA\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

    public void excluir (){


    }

    public void listar(){


    }

    public void excluirPorId(){

    }
    public void atualizar(){


    }

}
