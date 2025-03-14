package com.spachecor.pacheco_selene_tf_di.model.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Clase Cliente, que representa un cliente del restaurante
 * @see Entidad
 * @author Selene
 * @version 1.0
 */
@Entity
@Table(name = "Clientes")
public class Cliente extends Entidad<Cliente>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer id;
    private String nombre;
    private String telefono;
    private String direccion;
    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "cliente", orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Pedido> pedidos;

    public Cliente() {
        this.pedidos = new HashSet<>();
    }

    @Override
    public int compareTo(Cliente o) {
        //2 clientes son iguales si tienen el mismo teléfono
        return o.getTelefono().compareTo(this.getTelefono());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(telefono, cliente.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(telefono);
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
