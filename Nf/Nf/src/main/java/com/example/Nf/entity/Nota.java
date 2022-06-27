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

public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long nfsId;
    private Long arquivoId;
    private String status;
}
