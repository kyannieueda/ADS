package com.example.dev_jr.controller;

import com.example.dev_jr.model.Tarefas;
import com.example.dev_jr.service.TarefasService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
public class TarefasController {

    private final TarefasService tarefasService;
    public TarefasController(TarefasService tarefasService){
        this.tarefasService = tarefasService;
    }

    // GET - listar todos os usuários
    @GetMapping
    public ResponseEntity<List<Tarefas>> listar() {
        return ResponseEntity.ok().body(tarefasService.listar());
    }

        // GET - buscar usuário por ID
    @GetMapping("/{id}")
    public ResponseEntity<Tarefas> buscarPorId(@PathVariable Long id) {
        Optional<Tarefas> tarefa = tarefasService.buscarPorId(id);
        return tarefa.map(ResponseEntity::ok)
        .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // POST - adicionar usuário
    @PostMapping
    public ResponseEntity<Tarefas> salvar(@RequestBody Tarefas tarefa) {
        Tarefas novaTarefa = tarefasService.salvar(tarefa);
        return ResponseEntity.ok(novaTarefa);
    }

    // PUT - atualizar usuário
    @PutMapping("/{id}")
    public ResponseEntity<Tarefas> atualizar(@PathVariable Long id, @RequestBody Tarefas tarefa) {
        return tarefasService.buscarPorId(id).map(t -> {
            t.setTitulo(tarefa.getTitulo());
            t.setDescricao(tarefa.getDescricao());
            t.setPrioridade(tarefa.getPrioridade());
            Tarefas atualizada = tarefasService.salvar(t);
            return ResponseEntity.ok(atualizada);
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // DELETE - remover usuário
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (tarefasService.buscarPorId(id).isPresent()) {
            tarefasService.deletar(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }




    
}