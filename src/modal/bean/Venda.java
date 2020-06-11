package modal.bean;

/**
 * USJ - Centro Universitário de São José
 *
 * @author Matheus Alves Pereira - SC
 */
public class Venda {

    int id, idCliente;
    String nomeCliente, dataVenda;
    Double valorTotal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        String[] currentDate = dataVenda.split("/");
        String dataC = currentDate[2] + "-" + currentDate[1] + "-" + currentDate[0];
        this.dataVenda = dataC;
    }

    public void setDataV(String dataVenda) {
        String[] currentDate = dataVenda.split("-");
        String dataC = currentDate[2] + "/" + currentDate[1] + "/" + currentDate[0];
        this.dataVenda = dataC;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

   

}
