package com.example.Nf.controller;

import com.example.Nf.entity.Nota;
import com.example.Nf.service.NotaService;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Annotation
@RestController
// Class
public class NotaController {

    @Autowired private NotaService notaService;

    // Save operation
    @PostMapping("/notas")

    public Nota saveNota(
            @Valid @RequestBody Nota nota)
    {
        return notaService.saveNota(nota);
    }

    // Read operation
    @GetMapping("/notas")

    public List<Nota> fetchNotaList()
    {
        return notaService.fetchNotaList();
    }

    // Update operation
    @PutMapping("/notas/{id}")

    public Nota
    updateNota(@RequestBody Nota nota,
                  @PathVariable("id") Long nfsId)
    {
        return notaService.updateNota(
                nota, nfsId);
    }

    // Delete operation
    @DeleteMapping("/notas/{id}")

    public String deleteNotaById(@PathVariable("id")
                                    Long notaId)
    {
        notaService.deleteNotaById(
                notaId);
        return "Deleted Successfully";
    }
}
