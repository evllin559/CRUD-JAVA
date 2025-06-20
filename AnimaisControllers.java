package com.gestopet.api.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AnimaisDTO {
    private Long id;
    private String nome;
    private String urlFoto; // renomeado
    private Long idEspecie;
    private Long idRaca;
    private LocalDate dataNascimento;
    private Integer idadeEstimada;
    private String sexo;
    private Boolean castrado;
    private Float peso;
    private LocalDateTime criadoEm;
    private String caracteristicas;

 
    // Builder mágico
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String nome;
        private String urlFoto;
        private Long idEspecie;
        private Long idRaca;
        private LocalDate dataNascimento;
        private Integer idadeEstimada;
        private String sexo;
        private Boolean castrado;
        private Float peso;
        private LocalDateTime criadoEm;
        private String caracteristicas;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder urlFoto(String urlFoto) {
            this.urlFoto = urlFoto;
            return this;
        }

        public Builder idEspecie(Long idEspecie) {
            this.idEspecie = idEspecie;
            return this;
        }

        public Builder idRaca(Long idRaca) {
            this.idRaca = idRaca;
            return this;
        }

        public Builder dataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public Builder idadeEstimada(Integer idadeEstimada) {
            this.idadeEstimada = idadeEstimada;
            return this;
        }

        public Builder sexo(String sexo) {
            this.sexo = sexo;
            return this;
        }

        public Builder castrado(Boolean castrado) {
            this.castrado = castrado;
            return this;
        }

        public Builder peso(Float peso) {
            this.peso = peso;
            return this;
        }

        public Builder criadoEm(LocalDateTime criadoEm) {
            this.criadoEm = criadoEm;
            return this;
        }

        public Builder caracteristicas(String caracteristicas) {
            this.caracteristicas = caracteristicas;
            return this;
        }

        public AnimaisDTO build() {
            return new AnimaisDTO(this);
        }
    }

    // Getters e Setters padrão

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getUrlFoto() { return urlFoto; }
    public void setUrlFoto(String urlFoto) { this.urlFoto = urlFoto; }

    public Long getIdEspecie() { return idEspecie; }
    public void setIdEspecie(Long idEspecie) { this.idEspecie = idEspecie; }

    public Long getIdRaca() { return idRaca; }
    public void setIdRaca(Long idRaca) { this.idRaca = idRaca; }

    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }

    public Integer getIdadeEstimada() { return idadeEstimada; }
    public void setIdadeEstimada(Integer idadeEstimada) { this.idadeEstimada = idadeEstimada; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public Boolean getCastrado() { return castrado; }
    public void setCastrado(Boolean castrado) { this.castrado = castrado; }

    public Float getPeso() { return peso; }
    public void setPeso(Float peso) { this.peso = peso; }

    public LocalDateTime getCriadoEm() { return criadoEm; }
    public void setCriadoEm(LocalDateTime criadoEm) { this.criadoEm = criadoEm; }

    public String getCaracteristicas() { return caracteristicas; }
    public void setCaracteristicas(String caracteristicas) { this.caracteristicas = caracteristicas; }
}
