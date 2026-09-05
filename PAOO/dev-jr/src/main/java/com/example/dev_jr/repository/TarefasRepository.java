package com.example.dev_jr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.dev_jr.model.Tarefas;

public interface TarefasRepository extends JpaRepository<Tarefas, Long> {
        
}