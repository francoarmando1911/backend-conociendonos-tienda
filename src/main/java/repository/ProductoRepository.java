package repository;

import model.Categoria;
import model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Método para buscar productos por categoría
    List<Producto> findByCategoria(String categoria);
}
