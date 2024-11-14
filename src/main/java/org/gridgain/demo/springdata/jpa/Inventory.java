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
@Table(name = "CO.INVENTORY")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Inventory {

	@Id
	@Column(name = "INVENTORY_ID")
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "STORE_ID")
	private Stores store;
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Products product;
	@Column(name = "PRODUCT_INVENTORY")
	private Integer inventory;

}