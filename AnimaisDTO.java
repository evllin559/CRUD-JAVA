package com.gestopet.api.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AnimaisDTO extends com.gestopet.api.controllers.AnimaisDTO {

    private Long idAnimal;
    private String nomeAnimal;
    private String fotoAnimal;
    private String especieAnimal;
    private String racaAnimal;
    private LocalDate dataNascimentoAnimal;
    private String sexoAnimal;
    private Boolean castradoAnimal;
    private String caracteristicasAnimal;
    private Double pesoAnimal;
    private LocalDateTime criadoEmAnimal;

    public AnimaisDTO() {
    }

    public AnimaisDTO(Long idAnimal, String nomeAnimal, String fotoAnimal, String especieAnimal, String racaAnimal,
                      LocalDate dataNascimentoAnimal, String sexoAnimal, Boolean castradoAnimal,
                      String caracteristicasAnimal, Double pesoAnimal, LocalDateTime criadoEmAnimal) {
        this.idAnimal = idAnimal;
        this.nomeAnimal = nomeAnimal;
        this.fotoAnimal = fotoAnimal;
        this.especieAnimal = especieAnimal;
        this.racaAnimal = racaAnimal;
        this.dataNascimentoAnimal = dataNascimentoAnimal;
        this.sexoAnimal = sexoAnimal;
        this.castradoAnimal = castradoAnimal;
        this.caracteristicasAnimal = caracteristicasAnimal;
        this.pesoAnimal = pesoAnimal;
        this.criadoEmAnimal = criadoEmAnimal;
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getFotoAnimal() {
        return fotoAnimal;
    }

    public void setFotoAnimal(String fotoAnimal) {
        this.fotoAnimal = fotoAnimal;
    }

    public String getEspecieAnimal() {
        return especieAnimal;
    }

    public void setEspecieAnimal(String especieAnimal) {
        this.especieAnimal = especieAnimal;
    }

    public String getRacaAnimal() {
        return racaAnimal;
    }

    public void setRacaAnimal(String racaAnimal) {
        this.racaAnimal = racaAnimal;
    }

    public LocalDate getDataNascimentoAnimal() {
        return dataNascimentoAnimal;
    }

    public void setDataNascimentoAnimal(LocalDate dataNascimentoAnimal) {
        this.dataNascimentoAnimal = dataNascimentoAnimal;
    }

    public String getSexoAnimal() {
        return sexoAnimal;
    }

    public void setSexoAnimal(String sexoAnimal) {
        this.sexoAnimal = sexoAnimal;
    }

    public Boolean getCastradoAnimal() {
        return castradoAnimal;
    }

    public void setCastradoAnimal(Boolean castradoAnimal) {
        this.castradoAnimal = castradoAnimal;
    }

    public String getCaracteristicasAnimal() {
        return caracteristicasAnimal;
    }

    public void setCaracteristicasAnimal(String caracteristicasAnimal) {
        this.caracteristicasAnimal = caracteristicasAnimal;
    }

    public Double getPesoAnimal() {
        return pesoAnimal;
    }

    public void setPesoAnimal(Double pesoAnimal) {
        this.pesoAnimal = pesoAnimal;
    }

    public LocalDateTime getCriadoEmAnimal() {
        return criadoEmAnimal;
    }

    public void setCriadoEmAnimal(LocalDateTime criadoEmAnimal) {
        this.criadoEmAnimal = criadoEmAnimal;
    }
}
