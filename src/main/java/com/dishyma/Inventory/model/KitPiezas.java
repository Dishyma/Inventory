package com.dishyma.Inventory.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class KitPiezas {
    @Id
    private Long id;
    @OneToOne
    private PiezaPlastico silla;
    @OneToOne
    private PiezaPlastico espaldar;
    @Column
    private int cantidad;

}
