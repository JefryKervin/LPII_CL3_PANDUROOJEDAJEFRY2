package com.bd.crud.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.crud.modelo.ClassMedico;
import com.bd.crud.servicio.IMedicoServicio;

@Controller
@RequestMapping("/Vistas")
public class MedicoController {
	// inyeccion de dependencia
	@Autowired
	private IMedicoServicio imedicoservicio;

	@GetMapping("ListadoMedicos")
	public String ListadoMedicos(Model modelo) {
		// recuperamos los datos de la bd...
		List<ClassMedico> listado = imedicoservicio.ListadoMedicos();
		// enviamos hacia la vista
		modelo.addAttribute("listado", listado);
		// retornamos
		return "/Vistas/ListadoMedicos";
	} // fin del metodo listado medico...

	// creamos los respectivos metodos para registrar datos..
	@GetMapping("/RegistrarMedico")
	public String RegistrarMedico(Model modelo) {
		// realizamos la respectiva instancia..
		ClassMedico clmedico = new ClassMedico();
		// enviamos hacia la vista
		modelo.addAttribute("regmedico", clmedico);
		// retornamos
		return "/Vistas/FrmRegistrarMedicos";
	} // fin del metodo registrar...

	// realizamos el mapeo con postmapping..
	@PostMapping("/GuardarMedico")
	public String GuardarMedico(@ModelAttribute ClassMedico clMedico, Model modelo) {
		imedicoservicio.RegistrarMedico(clMedico);
		// emitimos mensaje por consola
		System.out.println("datos registrado en bd");
		// retornamos al listado
		return "redirect:/Vistas/ListadoMedicos";

	} // fin del metodo guardar producto...

	// creamos el metodo editar..
	@GetMapping("/editarmedico/{id}")
	public String Editar(@PathVariable("id") Integer idmedico, Model modelo) {
		ClassMedico clmedico = imedicoservicio.BuscarporId(idmedico);
		// enviamos hacia vista
		modelo.addAttribute("regmedico", clmedico);
		// enviamos al frmregproducto..
		return "/Vistas/FrmRegMedico";

	} // fin del metodo editar..
	// creamos el metodo eliminar...

	@GetMapping("/eliminarmedico/{id}")
	public String eliminar(@PathVariable("id") Integer idmedico, Model modelo) {
		// aplicamos la inyeccion de dependencia
		imedicoservicio.EliminarMedico(idmedico);
		// actualizar el listado
		List<ClassMedico> listado = imedicoservicio.ListadoMedicos();
		// enviamos hacia la vista
		modelo.addAttribute("listado", listado);
		// redireccionamos
		return "redirect:/Vistas/ListadoMedicos";

	}// fin del metodo eliminar...
}// fin de la clase controlador