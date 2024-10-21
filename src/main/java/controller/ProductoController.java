package controller;

import model.Categoria;
import model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    // Cambia el tipo de categoría a String en el método
    @GetMapping("/{categoria}")
    public List<Producto> obtenerProductosPorCategoria(@PathVariable String categoria) {
        // Convierte la cadena a enum
        Categoria categoriaEnum = Categoria.valueOf(categoria.toUpperCase());

        return productoService.obtenerProductosPorCategoria(String.valueOf(categoriaEnum));
    }

    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto) {
        return productoService.guardarProducto(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
    }
}
