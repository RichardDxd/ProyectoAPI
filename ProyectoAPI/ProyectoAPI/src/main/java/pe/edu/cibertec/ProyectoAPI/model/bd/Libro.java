package pe.edu.cibertec.ProyectoAPI.model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Titulo", length = 80, nullable = false)
    private String titulo;

    @Column(name = "Autor", length = 80, nullable = false)
    private String autor;

    @Column(name = "Editorial", length = 100, nullable = false)
    private String editorial;

    @Column(name = "FechaPublicacion", nullable = false)
    private Date fechaPublicacion;

    @Column(name = "Genero", length = 30, nullable = false)
    private String genero;

    @Column(name = "Precio", precision = 10, scale = 2, nullable = false)
    private Double precio;

    @Column(name = "CantidadStock", nullable = false)
    private Integer cantidadStock;

    @OneToMany(mappedBy = "libro", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Inventario> inventarios;
}
