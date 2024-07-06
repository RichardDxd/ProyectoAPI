package pe.edu.cibertec.ProyectoAPI.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.ProyectoAPI.model.bd.Usuario;
import pe.edu.cibertec.ProyectoAPI.service.IUsuarioService;
import pe.edu.cibertec.ProyectoAPI.service.UsuarioService;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/usuarios")
public class UsuariosController {

    private IUsuarioService iUsuarioService;

   /* @GetMapping("")
    public ResponseEntity<List<Usuario>> listarUsuarios(){
        List<Usuario> usuarioList = new ArrayList<>(iUsuarioService.obtenerUsuarios());
        if(us)
    }*/

}
