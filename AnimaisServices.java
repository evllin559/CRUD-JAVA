package com.gestopet.api.services;

import com.gestopet.api.entities.Animais;
import com.gestopet.api.mappers.AnimaisMapper;
import com.gestopet.api.repositories.AnimaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnimaisService {

    @Autowired
    private AnimaisRepository animaisRepository;

    public void atualizar(AnimaisDTO animaisDTO) {
        if (animaisDTO.getId() == null) {
            throw new IllegalArgumentException("ID do animal é necessário para a atualização.");
        }

        Optional<Animais> existingAnimalOptional = animaisRepository.findById(animaisDTO.getId());

        if (existingAnimalOptional.isPresent()) {
            Animais existingAnimal = existingAnimalOptional.get();

            // Mapeia o DTO para Entity e preserva campos imutáveis
            Animais updatedAnimal = AnimaisMapper.toEntity(animaisDTO);
            updatedAnimal.setId(existingAnimal.getId());
            updatedAnimal.setCriadoEm(existingAnimal.getCriadoEm());

            animaisRepository.save(updatedAnimal);
        } else {
            throw new RuntimeException("Animal com ID " + animaisDTO.getId() + " não encontrado para atualização.");
        }
    }

}
