package br.com.microsservice.mercado.cadastro.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Setter;

import java.util.List;

@Entity
@Table
public class Mercado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(value = AccessLevel.PRIVATE)
    private Long id;

    @Column
    private Long cnpj;

    @Column
    private String nome;

    @OneToMany
    @JoinColumn(name = "id_filial", referencedColumnName = "id")
    private List<Filial> filialList;

}
