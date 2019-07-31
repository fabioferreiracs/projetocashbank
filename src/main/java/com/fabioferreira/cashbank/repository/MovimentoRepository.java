package com.fabioferreira.cashbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabioferreira.cashbank.models.Movimento;

public interface MovimentoRepository extends JpaRepository<Movimento,String> {

}
