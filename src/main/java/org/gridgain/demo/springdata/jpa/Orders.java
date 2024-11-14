package org.gridgain.demo.springdata.jpa;

import java.sql.Timestamp;

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
@Table(name = "CO.ORDERS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Orders {

	@Id
	@Column(name = "ORDER_ID")
	private Integer id;
	@Column(name = "ORDER_TMS")
	private Timestamp orderTime;
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_ID")
	private Customers customer;
	@Column(name = "ORDER_STATUS")
	private String orderStatus;
	@ManyToOne
	@JoinColumn(name = "STORE_ID")
	private Stores store;

}