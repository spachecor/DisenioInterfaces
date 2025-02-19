package com.spachecor.pacheco_selene_tf_di.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Productos")
public class Producto extends Entidad<Producto>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer id;
    private String nombre;
    private String categoria;
    private BigDecimal precio;
    private Boolean disponibilidad;
    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "producto", orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<DetallePedido> detallesPedido;

    public Producto() {
        this.detallesPedido = new HashSet<>();
    }

    @Override
    public int compareTo(Producto o) {
        return o.getNombre().compareTo(this.getNombre());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    @Override
    public String toString() {
        return this.id.toString()+"- "+this.nombre;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Set<DetallePedido> getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(Set<DetallePedido> detallesPedido) {
        this.detallesPedido = detallesPedido;
    }
}
