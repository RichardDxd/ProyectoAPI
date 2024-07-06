package pe.edu.cibertec.ProyectoAPI.model.bd;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_detalleCompra")

public class DetalleCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Cantidad", nullable = false)
    private Integer cantidad;

    @Column(name = "PrecioUnitario", precision = 10, scale = 2, nullable = false)
    private Double precioUnitario;

    @ManyToOne
    @JoinColumn(name = "IdCompra", nullable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "IdLibro", nullable = false)
    private Libro libro;
}
