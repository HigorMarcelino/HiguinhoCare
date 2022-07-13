package br.univille.dacs2022.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MedicoDTO {
    private long id;
    @NotBlank(message = "Não pode estar vazio")
    @NotNull(message = "Não pode estar vazio")
    private String nome;
    @NotBlank(message = "Não pode estar vazio")
    @NotNull(message = "Não pode estar vazio")
    @Size(min = 4, max = 4, message = "A CRM deve ser composta por 4 algarismos")
    private String crm;
    private List<ProcedimentoDTO> listaProcedimentos = new ArrayList<>();
    private long procedimentoId;

    public long getProcedimentoId() {
        return procedimentoId;
    }
    public void setProcedimentoId(long procedimentoId) {
        this.procedimentoId = procedimentoId;
    }
    public List<ProcedimentoDTO> getListaProcedimentos() {
        return listaProcedimentos;
    }
    public void setListaPlanos(List<ProcedimentoDTO> listaProcedimentos) {
        this.listaProcedimentos = listaProcedimentos;
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
    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    
}
