package controle;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class UsuarioBean {
    
    private String email, senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public UsuarioBean() {
        
    }
    
    public void login(){
        FacesContext fc = FacesContext.getCurrentInstance();
        
        fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Email ou Senha incorreta!!"));
    }
    
}
