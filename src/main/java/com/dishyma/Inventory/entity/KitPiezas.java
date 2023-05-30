package com.dishyma.Inventory.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_kit_piezas")
public class KitPiezas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private PiezaPlastico silla;
    @OneToOne
    private PiezaPlastico espaldar;
    @Column(name = "amount")
    private int cantidad;

}
