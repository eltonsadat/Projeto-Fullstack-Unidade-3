
package com.unyleya.elton.Unidade3.repository;

import com.unyleya.elton.Unidade3.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
    Produto findByCodigo(String codigo);
}
