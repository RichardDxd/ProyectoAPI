package pe.edu.cibertec.ProyectoAPI.model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "inventario")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Cantidad_stock", nullable = false)
    private Integer cantidadStock;

    @Column(name = "FechaUltimaActualizacion", nullable = false)
    private Date fechaUltimaActualizacion;

    @ManyToOne
    @JoinColumn(name = "IdLibro", nullable = false)
    private Libro libro;
}
