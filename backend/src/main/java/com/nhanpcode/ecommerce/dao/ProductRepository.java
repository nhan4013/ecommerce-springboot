package com.nhanpcode.ecommerce.dao;

import com.nhanpcode.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
