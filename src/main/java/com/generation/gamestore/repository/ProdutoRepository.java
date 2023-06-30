package com.generation.gamestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.gamestore.model.Produtos;

public interface ProdutoRepository extends JpaRepository<Produtos, Long>{

}
