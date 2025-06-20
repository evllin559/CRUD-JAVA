package com.gestopet.api.repositories; // Certifique-se de que o caminho do pacote está correto

import com.gestopet.api.entities.Animais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface de repositório para a entidade Animais.
 * Estende JpaRepository para fornecer operações CRUD básicas e paginação/ordenação.
 *
 * @param Animais A entidade que este repositório gerencia.
 * @param Long O tipo do ID da entidade.
 */
@Repository // Indica que esta interface é um componente de repositório Spring
public interface AnimaisRepository extends JpaRepository<Animais, Long> {


}