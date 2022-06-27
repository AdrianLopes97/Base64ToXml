package com.example.Nf.service;

import com.example.Nf.entity.Nota;
import com.example.Nf.repository.NotaRepository;

import java.util.List;
import java.util.Objects;

import com.example.Nf.entity.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service
// Class implementing DepartmentService class
public class NotaServiceImpl
        implements NotaService {

    @Autowired
    private NotaRepository notaRepository;

    // Save operation
    @Override
    public Nota saveNota(Nota nota)
    {
        return notaRepository.save(nota);
    }

    // Read operation
    @Override public List<Nota> fetchNotaList()
    {
        return (List<Nota>)
                notaRepository.findAll();
    }

    // Update operation
    @Override
    public Nota
    updateNota(Nota nota,
                     Long nfsId)
    {

        Nota depDB
                = notaRepository.findById(nfsId)
                .get();

        if (Objects.nonNull(nota.getStatus())
                && !"".equalsIgnoreCase(
                nota.getStatus())){
            depDB.setStatus(
                    nota.getStatus());
        }

        return notaRepository.save(depDB);
    }

    // Delete operation
    @Override
    public void deleteNotaById(Long notaId)
    {
        notaRepository.deleteById(notaId);
    }
}