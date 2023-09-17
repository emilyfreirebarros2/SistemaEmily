package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto_efb",
         catalog = "db_emily_barros"
)
public class ProdutoEfb implements java.io.Serializable {

    private int idprodutoEfb;
    private String nomeEfb;
    private double valorUnitarioEfb;
    private Integer quantidadeEstoqueEfb;
    private String categoriaEfb;

    public ProdutoEfb() {
    }

    public ProdutoEfb(int idprodutoEfb) {
        this.idprodutoEfb = idprodutoEfb;
    }

    public ProdutoEfb(int idprodutoEfb, String nomeEfb, double valorUnitarioEfb, Integer quantidadeEstoqueEfb, String categoriaEfb) {
        this.idprodutoEfb = idprodutoEfb;
        this.nomeEfb = nomeEfb;
        this.valorUnitarioEfb = valorUnitarioEfb;
        this.quantidadeEstoqueEfb = quantidadeEstoqueEfb;
        this.categoriaEfb = categoriaEfb;
    }

    @Id

    @Column(name = "idproduto_efb", unique = true, nullable = false)
    public int getIdprodutoEfb() {
        return this.idprodutoEfb;
    }

    public void setIdprodutoEfb(int idprodutoEfb) {
        this.idprodutoEfb = idprodutoEfb;
    }

    @Column(name = "nome_efb")
    public String getNomeEfb() {
        return this.nomeEfb;
    }

    public void setNomeEfb(String nomeEfb) {
        this.nomeEfb = nomeEfb;
    }

    @Column(name = "valorUnitario_efb", precision = 10)
    public double getValorUnitarioEfb() {
        return this.valorUnitarioEfb;
    }

    public void setValorUnitarioEfb(double valorUnitarioEfb) {
        this.valorUnitarioEfb = valorUnitarioEfb;
    }

    @Column(name = "quantidadeEstoque_efb")
    public Integer getQuantidadeEstoqueEfb() {
        return this.quantidadeEstoqueEfb;
    }

    public void setQuantidadeEstoqueEfb(Integer quantidadeEstoqueEfb) {
        this.quantidadeEstoqueEfb = quantidadeEstoqueEfb;
    }

    @Column(name = "categoria_efb")
    public String getCategoriaEfb() {
        return this.categoriaEfb;
    }

    public void setCategoriaEfb(String categoriaEfb) {
        this.categoriaEfb = categoriaEfb;
    }

}
