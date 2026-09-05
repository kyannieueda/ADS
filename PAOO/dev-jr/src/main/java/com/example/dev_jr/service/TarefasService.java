    package com.example.dev_jr.service;

    import java.util.List;
    import java.util.Optional;

    import org.springframework.stereotype.Service;

    import com.example.dev_jr.model.Tarefas;
    import com.example.dev_jr.repository.TarefasRepository;

    @Service
    public class TarefasService {

        private final TarefasRepository tarefasRepository;

        public TarefasService(TarefasRepository tarefasRepository) {
            this.tarefasRepository = tarefasRepository;
        }

        public List<Tarefas> listar() {
            return tarefasRepository.findAll();
        }

        public Optional<Tarefas> buscarPorId(Long id) {
            return tarefasRepository.findById(id);
        }

        public Optional<Tarefas> atualizar(Long id, Tarefas tarefaAtualizada) {
            return tarefasRepository.findById(id).map(tarefaExistente -> {
                tarefaExistente.setTitulo(tarefaAtualizada.getTitulo());
                tarefaExistente.setDescricao(tarefaAtualizada.getDescricao());
                tarefaExistente.setPrioridade(tarefaAtualizada.getPrioridade());
                return tarefasRepository.save(tarefaExistente);
            });        
        }

        public Tarefas salvar(Tarefas tarefa) {
            return tarefasRepository.save(tarefa);
        }

        public void deletar(Long id) {
            tarefasRepository.deleteById(id);
        }
    }
