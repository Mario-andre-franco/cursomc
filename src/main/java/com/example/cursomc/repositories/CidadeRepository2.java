package com.example.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursomc.domain.Cidad;

@Repository
public interface CidadeRepository2 extends JpaRepository<Cidad, Integer> {

	
}
