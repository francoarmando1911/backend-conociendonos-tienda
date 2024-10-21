package model;

import jakarta.persistence.*;  // Asegúrate de que este es el paquete que deseas utilizar

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String image;
    private String hoverImage;
    private String title;
    private Double price;

    @Enumerated(EnumType.STRING)
    private Categoria categoria; // Agrega este campo

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHoverImage() {
        return hoverImage;
    }

    public void setHoverImage(String hoverImage) {
        this.hoverImage = hoverImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
