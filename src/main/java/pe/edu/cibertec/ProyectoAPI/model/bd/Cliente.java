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
@Table(name = "tb_cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "Apellido", length = 50, nullable = false)
    private String apellido;

    @Column(name = "Direccion", length = 100)
    private String direccion;

    @Column(name = "Telefono", length = 9)
    private String telefono;

    @Column(name = "CorreoElectronico", length = 40)
    private String correoElectronico;
}
