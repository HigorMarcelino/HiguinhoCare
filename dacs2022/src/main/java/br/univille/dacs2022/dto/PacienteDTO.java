package br.univille.dacs2022.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

public class PacienteDTO {
    private long id;
    @NotBlank(message = "Não pode estar vazio")
    @NotNull(message = "Não pode estar vazio")
    private String nome;
    @NotBlank(message = "Não pode estar vazio")
    @NotNull(message = "Não pode estar vazio")
    @Pattern(regexp = "Masc|Fem", flags = Pattern.Flag.CANON_EQ, message = "O campo deve ser preenchido 'Masc' ou 'Fem'.")
    private String sexo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataNascimento;
    private long cidadeId;
    private CidadeDTO cidade;
    private List<PlanoDeSaudeDTO> listaPlanos = new ArrayList<>();
    private long planoId;

    public long getPlanoId() {
        return planoId;
    }
    public void setPlanoId(long planoId) {
        this.planoId = planoId;
    }
    public List<PlanoDeSaudeDTO> getListaPlanos() {
        return listaPlanos;
    }
    public void setListaPlanos(List<PlanoDeSaudeDTO> listaPlanos) {
        this.listaPlanos = listaPlanos;
    }
    public long getCidadeId() {
        return cidadeId;
    }
    public void setCidadeId(long cidadeId) {
        this.cidadeId = cidadeId;
    }
    public CidadeDTO getCidade() {
        return cidade;
    }
    public void setCidade(CidadeDTO cidade) {
        this.cidade = cidade;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
}
