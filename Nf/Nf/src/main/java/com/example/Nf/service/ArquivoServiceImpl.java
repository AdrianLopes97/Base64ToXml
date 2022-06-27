package com.example.Nf.service;

import com.example.Nf.entity.Arquivo;
import com.example.Nf.repository.ArquivoRepository;

import java.util.List;
import java.util.Objects;

import com.example.Nf.entity.Arquivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service
// Class implementing DepartmentService class
public class ArquivoServiceImpl
        implements ArquivoService {

    @Autowired
    private ArquivoRepository arquivoRepository;

    // Save operation
    @Override
    public Arquivo saveArquivo(Arquivo arquivo)
    {
        return arquivoRepository.save(arquivo);
    }

    // Read operation
    @Override public List<Arquivo> fetchArquivoList()
    {
        return (List<Arquivo>)
                arquivoRepository.findAll();
    }


    // Update operation
    @Override
    public Arquivo

    updateArquivo(Arquivo arquivo,
                     Long arquivoId)
    {

        Arquivo depDB
                = arquivoRepository.findById(arquivoId)
                .get();

        if (Objects.nonNull(arquivo.getArquivoNome())
                && !"".equalsIgnoreCase(
                arquivo.getArquivoNome())) {
            depDB.setArquivoNome(
                    arquivo.getArquivoNome());
        }

        if (Objects.nonNull(
                arquivo.getArquivoTipo())
                && !"".equalsIgnoreCase(
                arquivo.getArquivoTipo())) {
            depDB.setArquivoTipo(
                    arquivo.getArquivoTipo());
        }

        return arquivoRepository.save(depDB);
    }

    // Delete operation
    @Override
    public void deleteArquivoById(Long arquivoId)
    {
        arquivoRepository.deleteById(arquivoId);
    }
}