package bean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cliente_efb",
         catalog = "db_emily_barros"
)
public class ClienteEfb implements java.io.Serializable {

    private int idclienteEfb;
    private String nomeEfb;
    private String rgEfb;
    private String cpfEfb;
    private String sexoEfb;
    private Date dataNascimentoEfb;
    private String emailEfb;
    private String telefoneEfb;
    private String enderecoEfb;
    private String bairroEfb;
    private String numeroEfb;
    private String cepEfb;
    private String cidadeEfb;
    private String estadoEfb;
    private String complementoEfb;

    public ClienteEfb() {
    }

    public ClienteEfb(int idclienteEfb) {
        this.idclienteEfb = idclienteEfb;
    }

    public ClienteEfb(int idclienteEfb, String nomeEfb, String rgEfb, String cpfEfb, String sexoEfb, Date dataNascimentoEfb, String emailEfb, String telefoneEfb, String enderecoEfb, String bairroEfb, String numeroEfb, String cepEfb, String cidadeEfb, String estadoEfb, String complementoEfb) {
        this.idclienteEfb = idclienteEfb;
        this.nomeEfb = nomeEfb;
        this.rgEfb = rgEfb;
        this.cpfEfb = cpfEfb;
        this.sexoEfb = sexoEfb;
        this.dataNascimentoEfb = dataNascimentoEfb;
        this.emailEfb = emailEfb;
        this.telefoneEfb = telefoneEfb;
        this.enderecoEfb = enderecoEfb;
        this.bairroEfb = bairroEfb;
        this.numeroEfb = numeroEfb;
        this.cepEfb = cepEfb;
        this.cidadeEfb = cidadeEfb;
        this.estadoEfb = estadoEfb;
        this.complementoEfb = complementoEfb;

    }

    @Id

    @Column(name = "idcliente_efb", unique = true, nullable = false)
    public int getIdclienteEfb() {
        return this.idclienteEfb;
    }

    public void setIdclienteEfb(int idclienteEfb) {
        this.idclienteEfb = idclienteEfb;
    }

    @Column(name = "nome_efb")
    public String getNomeEfb() {
        return this.nomeEfb;
    }

    public void setNomeEfb(String nomeEfb) {
        this.nomeEfb = nomeEfb;
    }

    @Column(name = "rg_efb")
    public String getRgEfb() {
        return this.rgEfb;
    }

    public void setRgEfb(String rgEfb) {
        this.rgEfb = rgEfb;
    }

    @Column(name = "cpf_efb")
    public String getCpfEfb() {
        return this.cpfEfb;
    }

    public void setCpfEfb(String cpfEfb) {
        this.cpfEfb = cpfEfb;
    }

    @Column(name = "sexo_efb")
    public String getSexoEfb() {
        return this.sexoEfb;
    }

    public void setSexoEfb(String sexoEfb) {
        this.sexoEfb = sexoEfb;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascimento_efb", length = 10)
    public Date getDataNascimentoEfb() {
        return this.dataNascimentoEfb;
    }

    public void setDataNascimentoEfb(Date dataNascimentoEfb) {
        this.dataNascimentoEfb = dataNascimentoEfb;
    }

    @Column(name = "email_efb")
    public String getEmailEfb() {
        return this.emailEfb;
    }

    public void setEmailEfb(String emailEfb) {
        this.emailEfb = emailEfb;
    }

    @Column(name = "telefone_efb")
    public String getTelefoneEfb() {
        return this.telefoneEfb;
    }

    public void setTelefoneEfb(String telefoneEfb) {
        this.telefoneEfb = telefoneEfb;
    }

    @Column(name = "endereco_efb")
    public String getEnderecoEfb() {
        return this.enderecoEfb;
    }

    public void setEnderecoEfb(String enderecoEfb) {
        this.enderecoEfb = enderecoEfb;
    }

    @Column(name = "bairro_efb")
    public String getBairroEfb() {
        return this.bairroEfb;
    }

    public void setBairroEfb(String bairroEfb) {
        this.bairroEfb = bairroEfb;
    }

    @Column(name = "numero_efb")
    public String getNumeroEfb() {
        return this.numeroEfb;
    }

    public void setNumeroEfb(String numeroEfb) {
        this.numeroEfb = numeroEfb;
    }

    @Column(name = "cep_efb")
    public String getCepEfb() {
        return this.cepEfb;
    }

    public void setCepEfb(String cepEfb) {
        this.cepEfb = cepEfb;
    }

    @Column(name = "cidade_efb")
    public String getCidadeEfb() {
        return this.cidadeEfb;
    }

    public void setCidadeEfb(String cidadeEfb) {
        this.cidadeEfb = cidadeEfb;
    }

    @Column(name = "estado_efb")
    public String getEstadoEfb() {
        return this.estadoEfb;
    }

    public void setEstadoEfb(String estadoEfb) {
        this.estadoEfb = estadoEfb;
    }

    @Column(name = "complemento_efb")
    public String getComplementoEfb() {
        return this.complementoEfb;
    }

    public void setComplementoEfb(String complementoEfb) {
        this.complementoEfb = complementoEfb;
    }

}
