package br.edu.ifpb.infra.persistence.memory;

import br.edu.ifpb.domain.Dependente;
import br.edu.ifpb.domain.Pessoa;
import br.edu.ifpb.domain.Pessoas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 06/07/2021, 08:07:18
 */

public class PessoasEmMemoria implements Pessoas {

    private final List<Pessoa> pessoas = new ArrayList<>();
    private final List<Dependente> dependentes = new ArrayList<>();

    public PessoasEmMemoria() {
        this.pessoas.addAll(
                Arrays.asList(
                        new Pessoa("Jubileu", "12312312332"),
                        new Pessoa("Cleus", "12312312339"),
                        new Pessoa("Magnus", "12312312330"),
                        new Pessoa("Carlsen", "12312312388"),
                        new Pessoa("Bob Fisher", "12312312337")
                )
        );

        this.dependentes.addAll(
                Arrays.asList(
                        new Dependente("5366b487-bf9e-46c9-aac1-99e96dcea70b", "Job", LocalDate.now().plusDays(1)), //amanhã
                        new Dependente("db9aee2d-811b-42e8-945a-5d10a4560f33", "Antonio", null), //nulo
                        new Dependente("21ce7508-5a9e-4f8b-9a41-b497f91c79bb", "Mariana", LocalDate.now().minusDays(1)), //ontem
                        new Dependente("e41f0a5e-095e-4f4a-9d60-f6fd5465965d", "Ana", LocalDate.now()) //hoje
                )
        );
    }


    public void nova(Pessoa pessoa) {
        //TODO: implementar
        this.pessoas.add(pessoa);
    }

    public List<Pessoa> todas() {
        //TODO: implementar
        return Collections.unmodifiableList(pessoas);

    }

    public void excluir(Pessoa pessoa) {
        //TODO: implementar
        this.pessoas.remove(pessoa);
    }

    public void atualizar(Pessoa pessoa) {
        //TODO: implementar
        this.pessoas
                .removeIf(p -> p.getId() == pessoa.getId());
        this.pessoas.add(pessoa);

    }

    @Override
    public Pessoa localizarPessoaComId(long id) {
        return todas() // List<Pessoa>
                .stream() //Stream<Pessoa>
                .filter(p->p.getId() == id) //Stream<Pessoa>
                .findFirst() //Optional<Pessoa>
                .orElse(Pessoa.fake());
    }

    @Override
    public List<Dependente> todosOsDepentendes() {
        return Collections.unmodifiableList(dependentes);
    }

    @Override
    public Dependente localizarDependenteComId(String uuid) {
        //TODO: implementar
        return todosOsDepentendes()
                .stream()
                .filter(d -> d.getUuid().equals(uuid))
                .findFirst()
                .orElse(Dependente.fake());
    }

    @Override
    public void novo(Dependente dependente) {
        this.dependentes.add(dependente);
    }

}