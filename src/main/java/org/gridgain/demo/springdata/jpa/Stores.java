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
@Table(name = "CO.STORES")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Stores {

	@Id
	@Column(name = "STORE_ID")
	private Integer id;
	@Column(name = "STORE_NAME")
	private String name;
	@Column(name = "WEB_ADDRESS")
	private String webAddress;
	@Column(name = "PHYSICAL_ADDRESS")
	private String physicalAddress;
	@Column(name = "LATITUDE")
	private Integer lattitude;
	@Column(name = "LONGITUDE")
	private Integer logitude;

}