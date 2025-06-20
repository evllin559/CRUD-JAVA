
package com.gestopet.api.mappers;

import com.gestopet.api.dtos.AnimaisDTO;
import com.gestopet.api.entities.Animais;

public final class AnimaisMapper {

    // Construtor privado para impedir instâncias
    private AnimaisMapper() {
        throw new UnsupportedOperationException("Classe utilitária");
    }

    public static AnimaisDTO toDTO(Animais animal) {
        if (animal == null) {
            return null;
        }

        return AnimaisDTO.builder()
                .id(animal.getId())
                .nome(animal.getNome())
                .urlFoto(animal.getFoto())        // Corrigido: urlFoto
                .idEspecie(animal.getEspecie())   // Corrigido: idEspecie
                .idRaca(animal.getRaca())         // Corrigido: idRaca
                .dataNascimento(animal.getDataNascimento())
                .sexo(animal.getSexo())
                .castrado(animal.getCastrado())
                .caracteristicas(animal.getCaracteristicas())
                .peso(animal.getPeso())
                .criadoEm(animal.getCriadoEm())
                .build();
    }

    public static Animais toEntity(AnimaisDTO dto) {
        if (dto == null) {
            return null;
        }

        Animais animal = new Animais();
        animal.setId(dto.getId());
        animal.setNome(dto.getNome());
        animal.setFoto(dto.getUrlFoto());
        animal.setEspecie(dto.getIdEspecie());
        animal.setRaca(dto.getIdRaca());
        animal.setDataNascimento(dto.getDataNascimento());
        animal.setSexo(dto.getSexo());
        animal.setCastrado(dto.getCastrado());
        animal.setCaracteristicas(dto.getCaracteristicas());
        animal.setPeso(dto.getPeso());
        animal.setCriadoEm(dto.getCriadoEm());

        return animal;
    }
}
