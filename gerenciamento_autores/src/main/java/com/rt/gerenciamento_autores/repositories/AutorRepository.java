package com.rt.gerenciamento_autores.repositories;

import com.rt.gerenciamento_autores.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {

}
