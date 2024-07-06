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
@Table(name = "tb_compra")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Fecha", nullable = false)
    private Date fecha;

    @Column(name = "MontoCompra", precision = 10, scale = 2, nullable = false)
    private Double montoCompra;

    @ManyToOne
    @JoinColumn(name = "IdCliente", nullable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "compra", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<DetalleCompra> detalleCompras;
}
