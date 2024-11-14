package org.gridgain.demo.springdata.jpa;

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
@Table(name = "CO.CUSTOMERS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Customers {

	@Id
	@Column(name = "CUSTOMER_ID")
	private Integer customerId;
	@Column(name = "EMAIL_ADDRESS")
	private String emailAddress;
	@Column(name = "FULL_NAME")
	private String fullName;

}