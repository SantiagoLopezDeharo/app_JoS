package com.platzi.market.persistence.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "compras")
public class ComprasProducto 
{
    @EmbeddedId
    private ComprasProductoPK id;
    
    private Integer cantidad;
    private Double total;
    private Boolean estado;

    /**
     * @return ComprasProductoPK return the id
     */
    public ComprasProductoPK getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(ComprasProductoPK id) {
        this.id = id;
    }

    /**
     * @return Integer return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return Double return the total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * @return Boolean return the estado
     */
    public Boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}
