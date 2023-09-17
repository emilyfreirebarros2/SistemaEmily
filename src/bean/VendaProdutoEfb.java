package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venda_produto_efb",
         catalog = "db_emily_barros"
)
public class VendaProdutoEfb implements java.io.Serializable {

    private int idvendaProdutoEfb;
    private ProdutoEfb produtoEfb;
    private VendaEfb vendaEfb;
    private Integer quantidadeEfb;
    private double valorUnitarioEfb;

    public VendaProdutoEfb() {
    }

    public VendaProdutoEfb(int idvendaProdutoEfb) {
        this.idvendaProdutoEfb = idvendaProdutoEfb;
    }

    public VendaProdutoEfb(int idvendaProdutoEfb, ProdutoEfb produtoEfb, VendaEfb vendaEfb, Integer quantidadeEfb, double valorUnitarioEfb) {
        this.idvendaProdutoEfb = idvendaProdutoEfb;
        this.produtoEfb = produtoEfb;
        this.vendaEfb = vendaEfb;
        this.quantidadeEfb = quantidadeEfb;
        this.valorUnitarioEfb = valorUnitarioEfb;
    }

    @Id

    @Column(name = "idvenda_produto_efb", unique = true, nullable = false)
    public int getIdvendaProdutoEfb() {
        return this.idvendaProdutoEfb;
    }

    public void setIdvendaProdutoEfb(int idvendaProdutoEfb) {
        this.idvendaProdutoEfb = idvendaProdutoEfb;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_efb")
    public ProdutoEfb getProdutoEfb() {
        return this.produtoEfb;
    }

    public void setProdutoEfb(ProdutoEfb produtoEfb) {
        this.produtoEfb = produtoEfb;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "venda_efb")
    public VendaEfb getVendaEfb() {
        return this.vendaEfb;
    }

    public void setVendaEfb(VendaEfb vendaEfb) {
        this.vendaEfb = vendaEfb;
    }

    @Column(name = "quantidade_efb")
    public Integer getQuantidadeEfb() {
        return this.quantidadeEfb;
    }

    public void setQuantidadeEfb(Integer quantidadeEfb) {
        this.quantidadeEfb = quantidadeEfb;
    }

    @Column(name = "valor_unitario_efb", precision = 10)
    public double getValorUnitarioEfb() {
        return this.valorUnitarioEfb;
    }

    public void setValorUnitarioEfb(double valorUnitarioEfb) {
        this.valorUnitarioEfb = valorUnitarioEfb;
    }

}
