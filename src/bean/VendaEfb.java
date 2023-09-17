package bean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "venda_efb",
         catalog = "db_emily_barros"
)
public class VendaEfb implements java.io.Serializable {

    private int idvendaEfb;
    private ClienteEfb clienteEfb;
    private VendedorEfb vendedorEfb;
    private double totalEfb;
    private Date dataVendaEfb;

    public VendaEfb() {
    }

    public VendaEfb(int idvendaEfb) {
        this.idvendaEfb = idvendaEfb;
    }

    public VendaEfb(int idvendaEfb, ClienteEfb clienteEfb, VendedorEfb vendedorEfb, double totalEfb, Date dataVendaEfb) {
        this.idvendaEfb = idvendaEfb;
        this.clienteEfb = clienteEfb;
        this.vendedorEfb = vendedorEfb;
        this.totalEfb = totalEfb;
        this.dataVendaEfb = dataVendaEfb;
    }

    @Id

    @Column(name = "idvenda_efb", unique = true, nullable = false)
    public int getIdvendaEfb() {
        return this.idvendaEfb;
    }

    public void setIdvendaEfb(int idvendaEfb) {
        this.idvendaEfb = idvendaEfb;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_efb")
    public ClienteEfb getClienteEfb() {
        return this.clienteEfb;
    }

    public void setClienteEfb(ClienteEfb clienteEfb) {
        this.clienteEfb = clienteEfb;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vendedor_efb")
    public VendedorEfb getVendedorEfb() {
        return this.vendedorEfb;
    }

    public void setVendedorEfb(VendedorEfb vendedorEfb) {
        this.vendedorEfb = vendedorEfb;
    }

    @Column(name = "total_efb", precision = 10)
    public double getTotalEfb() {
        return this.totalEfb;
    }

    public void setTotalEfb(double totalEfb) {
        this.totalEfb = totalEfb;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "data_venda_efb", length = 10)
    public Date getDataVendaEfb() {
        return this.dataVendaEfb;
    }

    public void setDataVendaEfb(Date dataVendaEfb) {
        this.dataVendaEfb = dataVendaEfb;
    }

}
