package br.com.alura.literalura.repository;

import br.com.alura.literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutorRepository extends JpaRepository<Autor,Integer> {
    List<Autor> findByanofalecimentoLessThan(Integer anofalecimento);
}
