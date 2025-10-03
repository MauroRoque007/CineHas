package br.com.etec.cinehas.listas;

import br.com.etec.cinehas.entity.Sala;

import java.util.ArrayList;
import java.util.List;

public class TesteLista
{
    public static void main(String[] args)
    {
        //tipo variavel
        int[] vet = new int[10];
        List<String> nomes = new ArrayList<>();
        nomes.add("Joao");          //Adicionar nome na lista
        nomes.add("Mauro");         //Adicionar nome na lista
        System.out.println(nomes);
        for(String nome : nomes)
            System.out.println(nome);

        Sala sala = new Sala();
        sala.setId(1);
        sala.setNome("XD");
        sala.setPreco(30.0);
        List<Sala> salas = new ArrayList<>();

        salas.add(sala);
        System.out.println(salas.size());
        for(Sala s : salas)
        {
            System.out.println(s.getNome());
        }
    }
}