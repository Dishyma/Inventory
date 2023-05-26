package com.dishyma.Inventory.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public class PiezaPlastico {
    @Id
    private Long id;
    @Column
    private String nombre;
    @Column
    private String referencia;
    @Column
    private Color color;
    @Column
    private int cantidad;

}
