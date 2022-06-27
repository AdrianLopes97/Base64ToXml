package com.example.Nf.repository;
import com.example.Nf.entity.Arquivo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArquivoRepository extends CrudRepository<Arquivo, Long> {

}