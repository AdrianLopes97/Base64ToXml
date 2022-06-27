package com.example.Nf.service;

import com.example.Nf.entity.Arquivo;
// Importing required classes


import java.util.List;

// Class
public interface ArquivoService {

    // Save operation
    Arquivo saveArquivo(Arquivo arquivo);

    // Read operation
    List<Arquivo> fetchArquivoList();

    // Update operation
    Arquivo updateArquivo(Arquivo arquivo,
                             Long arquivoId);

    // Delete operation
    void deleteArquivoById(Long arquivoId);
}

