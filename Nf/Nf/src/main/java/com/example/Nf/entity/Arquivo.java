package com.example.Nf.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Arquivo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long arquivoId;
    private String arquivoNome;
    private String arquivoTipo;
    private Long nfsId;
}
