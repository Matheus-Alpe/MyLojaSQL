package modal.bean;

/**
 * USJ - Centro Universitário de São José
 *
 * @author Matheus Alves Pereira - SC
 */
public class Usuario {

    private int id;
    private String nome, dataNasc, cpf, funcao, sexo, email, telefone, usuario, senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        String[] nasc = dataNasc.split("/");
        String dataN = nasc[2] + "-" + nasc[1] + "-" + nasc[0];
        this.dataNasc = dataN;
    }

    public void setNasc(String dataNasc) {
        String[] nasc = dataNasc.split("-");
        String dataN = nasc[2] + "/" + nasc[1] + "/" + nasc[0];
        this.dataNasc = dataN;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
