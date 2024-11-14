package org.gridgain.demo.springdata.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CO.ORDERITEMS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class OrderItems {

	@Id
	@Column(name = "ORDER_ID")
	private Integer id;
	@Column(name = "LINE_ITEM_ID")
	private Integer lineItemId;
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Products product;
	@Column(name = "UNIT_PRICE")
	private Integer unitPrice;
	@Column(name = "QUANTITY")
	private Integer quantity;
	@ManyToOne
	@JoinColumn(name = "SHIPMENT_ID")
	private Shipments shipment;

}