
package modal.bean;

/**
 * USJ - Centro Universitário de São José
 * @author Matheus Alves Pereira - SC 
 */
public class Cliente {
    private int id;
    private String nome, cpf, dataNasc, sexo, estado, cep, email, telefone,  status;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        String[] nasc = dataNasc.split("/");
        String dataN = nasc[2]+"-"+nasc[1]+"-"+nasc[0];
        this.dataNasc = dataN;
    }
    
    public void setNasc(String dataNasc) {
        String[] nasc = dataNasc.split("-");
        String dataN = nasc[2] + "/" + nasc[1] + "/" + nasc[0];
        this.dataNasc = dataN;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
