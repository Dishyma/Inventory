package com.dishyma.Inventory.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_pieza_plastico")
public class PiezaPlastico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true)
    private String nombre;

    @Column(name = "reference", unique = true)
    private String referencia;

    @Enumerated(EnumType.STRING)
    private Color color;
    @Column(name = "amount")
    private int cantidad;

}
