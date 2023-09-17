package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_efb",
         catalog = "db_emily_barros"
)
public class UsuarioEfb implements java.io.Serializable {

    private int idusuarioEfb;
    private String nomeEfb;
    private String senhaEfb;
    private String nivelEfb;
    private String ativoEfb;
    private String apelidoEfb;

    public UsuarioEfb() {
    }

    public UsuarioEfb(int idusuarioEfb) {
        this.idusuarioEfb = idusuarioEfb;
    }

    public UsuarioEfb(int idusuarioEfb, String nomeEfb, String senhaEfb, String nivelEfb, String ativoEfb, String apelidoEfb) {
        this.idusuarioEfb = idusuarioEfb;
        this.nomeEfb = nomeEfb;
        this.senhaEfb = senhaEfb;
        this.nivelEfb = nivelEfb;
        this.ativoEfb = ativoEfb;
        this.apelidoEfb = apelidoEfb;
    }

    @Id

    @Column(name = "idusuario_efb", unique = true, nullable = false)
    public int getIdusuarioEfb() {
        return this.idusuarioEfb;
    }

    public void setIdusuarioEfb(int idusuarioEfb) {
        this.idusuarioEfb = idusuarioEfb;
    }

    @Column(name = "nome_efb")
    public String getNomeEfb() {
        return this.nomeEfb;
    }

    public void setNomeEfb(String nomeEfb) {
        this.nomeEfb = nomeEfb;
    }

    @Column(name = "senha_efb")
    public String getSenhaEfb() {
        return this.senhaEfb;
    }

    public void setSenhaEfb(String senhaEfb) {
        this.senhaEfb = senhaEfb;
    }

    @Column(name = "nivel_efb", length = 20)
    public String getNivelEfb() {
        return this.nivelEfb;
    }

    public void setNivelEfb(String nivelEfb) {
        this.nivelEfb = nivelEfb;
    }

    @Column(name = "ativo_efb", length = 5)
    public String getAtivoEfb() {
        return this.ativoEfb;
    }

    public void setAtivoEfb(String ativoEfb) {
        this.ativoEfb = ativoEfb;
    }

    @Column(name = "apelido_efb")
    public String getApelidoEfb() {
        return this.apelidoEfb;
    }

    public void setApelidoEfb(String apelidoEfb) {
        this.apelidoEfb = apelidoEfb;
    }

}
