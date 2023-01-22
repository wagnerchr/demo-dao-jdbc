package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDAO {

	// Operations to manipulate a Seller
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
