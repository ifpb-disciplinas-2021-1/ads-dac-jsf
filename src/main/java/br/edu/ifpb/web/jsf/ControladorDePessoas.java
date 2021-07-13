package br.edu.ifpb.web.jsf;

import br.edu.ifpb.domain.Pessoa;
import br.edu.ifpb.domain.Pessoas;
import br.edu.ifpb.infra.persistence.memory.PessoasEmMemoria;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 06/07/2021, 08:23:56
 */
@Named
@SessionScoped
public class ControladorDePessoas implements Serializable{

    private Pessoa pessoa = new Pessoa("");

    private Pessoas pessoas = new PessoasEmMemoria();
    
    public String editar(Pessoa pessoa){
        this.pessoa = pessoa;
        return "edit";
    }
    
    public String excluir(Pessoa pessoa){
        pessoas.excluir(pessoa);
        return "list?faces-redirect=true";
    }
    
    public String adicionar(){
        Pessoa pessoaLocalizada = this.pessoas.localizarPessoaComId(
            this.pessoa.getId()
        );
        //verificando se já existe uma pessoa na base de dados
        if(Pessoa.fake().equals(pessoaLocalizada)){ 
            pessoas.nova(pessoa);
        }else{
            pessoas.atualizar(pessoa);
        }
        //pessoaService.adicionar(this.pessoa);
        pessoa = new Pessoa("");
        return "list?faces-redirect=true";
    }
    
    public List<Pessoa> todasAsPessoas(){
        return pessoas.todas();
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    
    
}
