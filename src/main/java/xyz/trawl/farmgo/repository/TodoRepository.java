package xyz.trawl.farmgo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xyz.trawl.farmgo.model.TodoEntity;
@Repository  
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {}
