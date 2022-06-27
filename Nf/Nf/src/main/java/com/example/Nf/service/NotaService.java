package com.example.Nf.service;

import com.example.Nf.entity.Nota;
// Importing required classes


import java.util.List;

// Class
public interface NotaService {

    // Save operation
    Nota saveNota(Nota nota);

    // Read operation
    List<Nota> fetchNotaList();

    // Update operation
    Nota updateNota(Nota nota,
                             Long notaId);

    // Delete operation
    void deleteNotaById(Long notaId);
}
