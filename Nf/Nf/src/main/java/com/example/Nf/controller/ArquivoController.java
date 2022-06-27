package com.example.Nf.controller;

import com.example.Nf.entity.Arquivo;
import com.example.Nf.service.ArquivoService;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Annotation
@RestController
// Class
public class ArquivoController {

    @Autowired private ArquivoService arquivoService;

    // Save operation
    @PostMapping("/arquivos")

    public Arquivo saveArquivo(
            @Valid @RequestBody Arquivo arquivo)
    {
        return arquivoService.saveArquivo(arquivo);
    }

    // Read operation
    @GetMapping("/arquivos")

    public List<Arquivo> fetchArquivoList()
    {
        return arquivoService.fetchArquivoList();
    }

    // Update operation
    @PutMapping("/arquivos/{id}")

    public Arquivo
    updateArquivo(@RequestBody Arquivo arquivo,
                     @PathVariable("id") Long arquivoId)
    {
        return arquivoService.updateArquivo(
                arquivo, arquivoId);
    }

    // Delete operation
    @DeleteMapping("/arquivos/{id}")

    public String deleteArquivoById(@PathVariable("id")
                                       Long arquivoId)
    {
        arquivoService.deleteArquivoById(
                arquivoId);
        return "Deleted Successfully";
    }
}
