package com.spachecor.pacheco_selene_tf_di.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "Detalles_Pedido")
public class DetallePedido extends Entidad<DetallePedido> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Integer id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_producto")
    private Producto producto;
    private Integer cantidad;
    private BigDecimal subtotal;

    public DetallePedido() {}

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public int compareTo(DetallePedido o) {
        return this.getId().compareTo(o.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetallePedido that = (DetallePedido) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "DetallePedido{" +
                "id=" + id +
                ", pedido=" + pedido +
                ", producto=" + producto +
                ", cantidad=" + cantidad +
                ", subtotal=" + subtotal +
                '}';
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }
}
