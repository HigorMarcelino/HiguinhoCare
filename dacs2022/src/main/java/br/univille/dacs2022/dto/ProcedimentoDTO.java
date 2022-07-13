package br.univille.dacs2022.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProcedimentoDTO {
    private long id;
    @NotBlank(message = "Não pode estar vazio")
    @NotNull(message = "Não pode estar vazio")
    @Size(min = 10, message = "A descrição deve ter, no mínimo 10 caracteres.")
    private String descricao;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
