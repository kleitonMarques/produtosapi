package br.com.kleitonmarques.produtosapi.repository;

import br.com.kleitonmarques.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
