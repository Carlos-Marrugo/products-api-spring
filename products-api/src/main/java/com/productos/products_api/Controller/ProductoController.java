package com.productos.products_api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productos.products_api.Model.Producto;
import com.productos.products_api.Repository.ProductoRepository;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    
    @Autowired
    private ProductoRepository productoRepository;

    @PostMapping("/crear")
    public Producto crearProducto(@RequestBody Producto producto){
        return productoRepository.save(producto);
    }

    @GetMapping("/menor-precio/{precio}")
    public List<Producto> productoMenorPrecio(@PathVariable double precio){
        return productoRepository.findByPrecioLessThan(precio);
    }

    @GetMapping("/buscar")
    public List<Producto> buscarProdcuto(@RequestParam String nombre) {
        return productoRepository.findByNombreContaining(nombre);
    }


}
