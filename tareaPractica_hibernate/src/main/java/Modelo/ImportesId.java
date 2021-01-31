package Modelo;
// Generated 31 ene. 2021 20:57:12 by Hibernate Tools 5.4.21.Final

import java.math.BigDecimal;

/**
 * ImportesId generated by hbm2java
 */
public class ImportesId implements java.io.Serializable {

	private int pedidoId;
	private int productoId;
	private BigDecimal precioUnidad;
	private Short cantidad;
	private Double descuento;
	private Double importe;

	public ImportesId() {
	}

	public ImportesId(int pedidoId, int productoId) {
		this.pedidoId = pedidoId;
		this.productoId = productoId;
	}

	public ImportesId(int pedidoId, int productoId, BigDecimal precioUnidad, Short cantidad, Double descuento,
			Double importe) {
		this.pedidoId = pedidoId;
		this.productoId = productoId;
		this.precioUnidad = precioUnidad;
		this.cantidad = cantidad;
		this.descuento = descuento;
		this.importe = importe;
	}

	public int getPedidoId() {
		return this.pedidoId;
	}

	public void setPedidoId(int pedidoId) {
		this.pedidoId = pedidoId;
	}

	public int getProductoId() {
		return this.productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	public BigDecimal getPrecioUnidad() {
		return this.precioUnidad;
	}

	public void setPrecioUnidad(BigDecimal precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public Short getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Short cantidad) {
		this.cantidad = cantidad;
	}

	public Double getDescuento() {
		return this.descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Double getImporte() {
		return this.importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ImportesId))
			return false;
		ImportesId castOther = (ImportesId) other;

		return (this.getPedidoId() == castOther.getPedidoId()) && (this.getProductoId() == castOther.getProductoId())
				&& ((this.getPrecioUnidad() == castOther.getPrecioUnidad())
						|| (this.getPrecioUnidad() != null && castOther.getPrecioUnidad() != null
								&& this.getPrecioUnidad().equals(castOther.getPrecioUnidad())))
				&& ((this.getCantidad() == castOther.getCantidad()) || (this.getCantidad() != null
						&& castOther.getCantidad() != null && this.getCantidad().equals(castOther.getCantidad())))
				&& ((this.getDescuento() == castOther.getDescuento()) || (this.getDescuento() != null
						&& castOther.getDescuento() != null && this.getDescuento().equals(castOther.getDescuento())))
				&& ((this.getImporte() == castOther.getImporte()) || (this.getImporte() != null
						&& castOther.getImporte() != null && this.getImporte().equals(castOther.getImporte())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPedidoId();
		result = 37 * result + this.getProductoId();
		result = 37 * result + (getPrecioUnidad() == null ? 0 : this.getPrecioUnidad().hashCode());
		result = 37 * result + (getCantidad() == null ? 0 : this.getCantidad().hashCode());
		result = 37 * result + (getDescuento() == null ? 0 : this.getDescuento().hashCode());
		result = 37 * result + (getImporte() == null ? 0 : this.getImporte().hashCode());
		return result;
	}

}
