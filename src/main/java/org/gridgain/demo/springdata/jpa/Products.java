package org.gridgain.demo.springdata.jpa;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CO.PRODUCTS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Products {

	@Id
	@Column(name = "PRODUCT_ID")
	private Integer id;
	@Column(name = "PRODUCT_NAME")
	private String name;
	@Column(name = "UNIT_PRICE")
	private Integer unitPrice;
	@Column(name = "IMAGE_LAST_UPDATED")
	private Date lastUpdated;

}