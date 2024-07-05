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
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "Apellidos", length = 50, nullable = false)
    private String apellidos;

    @Column(name = "Direccion", length = 80)
    private String direccion;

    @Column(name = "Telefono", length = 9)
    private String telefono;

    @Column(name = "Email", length = 40)
    private String email;

    @Column(name = "FechaContratacion", nullable = false)
    private Date fechaContratacion;

    @ManyToOne
    @JoinColumn(name = "IdRol", nullable = false)
    private Rol rol;

    @OneToOne(mappedBy = "empleado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Usuario usuario;
}
