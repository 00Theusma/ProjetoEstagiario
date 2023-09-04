package poo.projetoestagio;

import java.time.LocalDate;

public class Funcionario extends BasePessoa {
    
    private String contaCorrente;
    private String registro;
    private String cracha;

    public Funcionario(int codigo, String nome, String email, String telefone, LocalDate dataNascimento, String usuario,
    String senha) {
    super(codigo, nome, email, telefone, dataNascimento, usuario, senha);
    }

    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    
}
