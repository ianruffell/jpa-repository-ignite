package org.gridgain.demo.springdata.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class JpaApp implements CommandLineRunner {

	@Autowired
	private CustomersRepository customersRepository;
	@Autowired
	private InventoryRepository inventoryRepository;
	@Autowired
	private OrderItemsRepository orderItemsRepository;
	@Autowired
	private OrdersRepository ordersRepository;
	@Autowired
	private ProductsRepository productsRepository;
	@Autowired
	private ShipmentsRepository shipmentsRepository;
	@Autowired
	private StoresRepository storesRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaApp.class, args);
	}

	@Override
	public void run(String... args) {
		// Retrieve a record by id
		Customers customers = customersRepository.findById(1).orElse(null);
		System.out.printf("findById : %s\n", customers);
		
		customers = customersRepository.findByFullName("Adam Miller");
		System.out.printf("findByName : %s\n", customers);
		
		Inventory inventory = inventoryRepository.findById(1).orElse(null);
		System.out.printf("findById : %s\n", inventory);

		OrderItems orderItems = orderItemsRepository.findById(1).orElse(null);
		System.out.printf("findById : %s\n", orderItems);

		Orders orders = ordersRepository.findById(1).orElse(null);
		System.out.printf("findById : %s\n", orders);

		Products products = productsRepository.findById(1).orElse(null);
		System.out.printf("findById : %s\n", products);

		Shipments shipments = shipmentsRepository.findById(1).orElse(null);
		System.out.printf("findById : %s\n", shipments);

		Stores stores = storesRepository.findById(1).orElse(null);
		System.out.printf("findById : %s\n", stores);


		/*
		// Retrieve a record by id
		customers = customersRepository.findById(1001).orElse(null);
		System.out.println(customers);

		// Update a record
		customers.setEmailAddress("newemail@example.com");
		customersRepository.save(customers);
		System.out.println(customers);

		// Delete a record
		customersRepository.delete(customers);
		*/
	}

}