package br.edu.ifpb.web.jsf;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/06/2021, 08:41:10
 */

@Named
@SessionScoped
public class ControladorDeInformacoes implements Serializable{ //Bean Gerenciado

    private String nome;

    public String imprimirNome(){
        System.out.println("nome: " + this.nome);
//        return null; //redirecionamento a própria página
//        return "home.xhtml"; //redirecionamento para home.xhtml
        return "home?faces-redirect=true"; //redirecionamento para home.xhtml
    }
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
}
