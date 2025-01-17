package com.productos.products_api.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productos.products_api.Model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    List<Producto> findByPrecioLessThan(double precio);
    List<Producto> findByNombreContaining(String nombre);
    
} 
