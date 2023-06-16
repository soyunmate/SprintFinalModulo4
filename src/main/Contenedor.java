package main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import actividades.Capacitacion;
import usuarios.Administrativo;
import usuarios.Cliente;
import usuarios.IAsesoria;
import usuarios.Profesional;
import usuarios.Usuario;

public class Contenedor {
	private List<IAsesoria> listaUsuarios;
	private List<Capacitacion> listaCapacitaciones;

	public Contenedor() {
		super();
		this.listaUsuarios = new ArrayList<IAsesoria>();
		this.listaCapacitaciones = new ArrayList<Capacitacion>();
	}

	public Contenedor(List<IAsesoria> listaUsuarios, List<Capacitacion> listaCapacitaciones) {
		super();
		this.listaUsuarios = listaUsuarios;
		this.listaCapacitaciones = listaCapacitaciones;
	}
	

	public List<IAsesoria> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<IAsesoria> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Capacitacion> getListaCapacitaciones() {
		return listaCapacitaciones;
	}

	public void setListaCapacitaciones(List<Capacitacion> listaCapacitaciones) {
		this.listaCapacitaciones = listaCapacitaciones;
	}
	
	private Usuario crearUsuario(String tipoUsuario, Scanner scanner) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String nombre = "";
		LocalDate fechaNac = null;
		String run = "";
		System.out.println("\nDatos Generales de Usuarios: ");
		System.out.println("\nIngrese nombre: ");
		while (nombre.isBlank()) {
			try {
				nombre = scanner.nextLine();
				if (nombre.length() < 10 || nombre.length() > 50) {
					nombre = "";
					throw new InvalidInputException(
							"El nombre es invalido. Debe tener como minimo" + "10 caracteres y maximo 50 caracteres");
				}
			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("\nIngrese fecha de nacimiento: ");
		while (fechaNac == null) {
			try {
				fechaNac = LocalDate.parse(scanner.nextLine(), formatter) ;
			} catch(DateTimeParseException e) {
				System.out.println("Formato de fecha Invalido. Por favor ingresar una fecha en formato DD/MM/AAAA");
			}
		}
		
		System.out.println("\nIngresar RUN sin puntos ni digito verificador ");
		while (run.isBlank()) {
			try {
				run = scanner.nextLine();
				if(Integer.parseInt(run) > 99_999_999) {
					run = "";
					throw new InvalidInputException("RUN debe ser un numero menor a 99.999.999");
				}
			} catch (InvalidInputException e) {
				run = "";
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				run = "";
				System.out.println("Ingrese un numero de rut valido");

			}
		}
		
		System.out.println("\nDatos Especificos para usuarios tipo: " + tipoUsuario);
		
		if(tipoUsuario == "Cliente") {
			Cliente cliente = new Cliente();
			String nombres = "";
			String apellidos = "";
			String rut = "";
			int telefono = 0;
			int sistemaDeSalud = 0;
			String direccion = "";
			String comuna = "";
			int edad = -1;
			
			System.out.println("\nIngrese Nombres: ");
			while (nombres.isBlank()) {
				try {
					nombres = scanner.nextLine();
					if (nombres.length() < 5 || nombres.length() > 30) {
						nombres = "";
						throw new InvalidInputException(
								"Nombres: obligatorio, mínimo 5 caracteres, máximo 30");
					}
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage());
				}
			}
			
			System.out.println("\nIngrese Apellidos: ");
			while (apellidos.isBlank()) {
				try {
					apellidos = scanner.nextLine();
					if (apellidos.length() < 5 || apellidos.length() > 30) {
						throw new InvalidInputException("Apellidos: obligatorio, mínimo 5 caracteres, máximo 30");
					}
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage());
				}
			}
			
			System.out.println("\nIngresar RUT sin puntos ni digito verificador ");
			while (rut.isBlank()) {
				try {
					rut = scanner.nextLine();
					if(Integer.parseInt(rut) > 99_999_999) {
						rut = "";
						throw new InvalidInputException("RUT debe ser un numero menor a 99.999.999");
					}
				} catch (InvalidInputException e) {
					rut = "";
					System.out.println(e.getMessage());
				} catch (NumberFormatException e) {
					rut = "";
					System.out.println("Ingrese un numero de rut valido");
				}
			}
			
			System.out.println("\nIngrese Telefono: ");
			while (telefono == 0) {
				try {
					telefono = Integer.parseInt(scanner.nextLine());
					if (telefono == 0) {
						throw new InvalidInputException("El telefono es obligatorio");
					}
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage());
				} catch (NumberFormatException e) {
					System.out.println("Debe ingresar un telefono valido");
				}
			}
			
			System.out.println("\nIngrese Sistema de salud: (1) Fonasa o (2) Isapre: ");
			while (sistemaDeSalud == 0) {
				try {
				sistemaDeSalud = Integer.parseInt(scanner.nextLine());
				if (sistemaDeSalud > 2 || sistemaDeSalud < 1) {
					sistemaDeSalud = 0;
					throw new InvalidInputException("Debe elegir opcion 1 o 2");
					}
				} catch (InvalidInputException e){
					
					System.out.println(e.getMessage());
				} catch (NumberFormatException e) {
					System.out.println("Debe elegir opcion 1 o 2");
				}
			}
			
			System.out.println("\nIngrese Direccion: ");
			while (direccion == "") {
				try {
					direccion = scanner.nextLine();
					if(direccion.length() > 70) {
						direccion = "";
						throw new InvalidInputException("Dirección: máximo 70 caracteres");
					}
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage());
				}
			}
			
			System.out.println("\nIngrese Comuna: ");
			while (comuna == "") {
				try {
					comuna = scanner.nextLine();
					if (comuna.length() > 50) {
						throw new InvalidInputException("Comuna: máximo 50 caracteres");
					}
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage());
				}
			}
			
			System.out.println("\nIngrese edad: ");
			while (edad == -1) {
				try {
					edad = Integer.parseInt(scanner.nextLine());
					if (edad < 0 || edad > 150) {
						edad = -1;
						throw new InvalidInputException("Edad: obligatorio, número mayor o igual a cero, y menor a 150");
					}
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage());
				} catch (NumberFormatException e) {
					System.out.println("Ingrese una edad valida");
				}
			}
		
			cliente.setNombre(nombre);
			cliente.setFechaNacimiento(fechaNac);
			cliente.setRun(run);
			cliente.setNombres(nombres);
			cliente.setApellidos(apellidos);
			cliente.setRut(rut);
			cliente.setTelefono(telefono);
			cliente.setSistemaDeSalud(sistemaDeSalud);
			cliente.setDireccion(direccion);
			cliente.setComuna(comuna);
			cliente.setEdad(edad);
			
			return cliente;
		}
		
		if(tipoUsuario == "Profesional") {
			Profesional prof = new Profesional();
			String titulo = "";
			LocalDate fechaIngreso = null;
			
			System.out.println("\nIngrese Titulo: ");
			while (titulo == "") {
				try {
					titulo = scanner.nextLine();
					if (titulo.length() < 10 || titulo.length() > 50 ) {
						titulo = "";
						throw new InvalidInputException("Título: obligatorio, mínimo 10 caracteres, máximo 50");
					}
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage());
				}
			}
			
			System.out.println("\nIngrese fecha de ingreso: ");
			while (fechaIngreso == null) {
				try {
					fechaIngreso = LocalDate.parse(scanner.nextLine(), formatter) ;
				} catch(DateTimeParseException e) {
					System.out.println("Formato de fecha Invalido. Por favor ingresar una fecha en formato DD/MM/AAAA");
				}
			}
			
			prof.setNombre(nombre);
			prof.setFechaNacimiento(fechaNac);
			prof.setRun(run);
			prof.setTitulo(titulo);
			prof.setFechaIngreso(fechaIngreso);
			return prof;
		}
		
		if(tipoUsuario == "Administrativo") {
			Administrativo admin = new Administrativo();
			String area = "";
			int exp = -1;
			
			System.out.println("\nIngrese area: ");
			while (area.isBlank()) {
				try {
					area = scanner.nextLine();
					if (area.length() < 5 || area.length() > 20) {
						area = "";
						throw new InvalidInputException("Área: obligatorio, mínimo 5 caracteres, máximo 20");
					}
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage());
				}
			}
			
			System.out.println("\nIngrese años de experiencia: ");
			while (exp == -1) {
				try {
					exp = Integer.parseInt(scanner.nextLine());
					if (exp > 100) {
						exp = -1;
						throw new InvalidInputException("Maximo 100");
					}
				} catch (InvalidInputException e) {
					System.out.println(e.getMessage());
				}
			}
			
			admin.setNombre(nombre);
			admin.setFechaNacimiento(fechaNac);
			admin.setRun(run);
			admin.setArea(area);
			admin.setExperienciaPrevia(exp);
			return admin;
		}
		
		return new Usuario();
	}

	public void agregarCliente(Scanner scanner) {
		listaUsuarios.add(crearUsuario("Cliente", scanner));
	}

	public void agregarProfesional(Scanner scanner) {
		listaUsuarios.add(crearUsuario("Profesional", scanner));
	}
	
	public void agregarAdministrativo(Scanner scanner) {
		listaUsuarios.add(crearUsuario("Administrativo", scanner));
	}

	public void agregarCapacitacion(Scanner scanner) {
		Capacitacion cap = new Capacitacion();
		int id = -1;
		String rutCliente = "";
		String dia = "";
		String hora = "";
		String lugar = "";
		int duracion = -1;
		int cantidadAsistentes = -1;
		
		System.out.println("\nA continuacion rellene los datos de la capacitacion a ingresar: ");
		System.out.println("\nIngresar ID: ");
		while( id == -1) {
			try {
				id = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Numero Invalido");
			}
		}
		
		System.out.println("Ingresar Rut Cliente: ");
		while (rutCliente.isBlank()) {
			try {
				rutCliente = scanner.nextLine();
				if(Integer.parseInt(rutCliente) > 99_999_999) {
					rutCliente = "";
					throw new InvalidInputException("RUN debe ser un numero menor a 99.999.999");
				}
				boolean existeCliente = false;
				for (int i = 0; i < listaUsuarios.size(); i++) {
					  IAsesoria asesoria = listaUsuarios.get(i);
					  Usuario usuario = (Usuario) asesoria;
		              if (usuario.getRun().equals(rutCliente)) {
		            	  existeCliente = true;
		                  break;
		              }
				}
				
				if(existeCliente == false) {
					throw new InvalidInputException("El rut ingresado no corresponde a ningun cliente en la base de datos");
				}
				
			} catch (InvalidInputException e) {
				rutCliente = "";
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				rutCliente = "";
				System.out.println("Ingrese un numero de rut valido");

			}
		}
		
		System.out.println("\nIngresar Dia de la semana: \n1-Lunes\n2-Martes\n3-Miercoles\n4-Jueves\n5-Viernes\n6-Sabado\n7-Domingo");
		while (dia.isBlank()) {
			try {
				int numero = Integer.parseInt(scanner.nextLine());

			    switch (numero) {
			        case 1:
			            dia = "Lunes";
			            break;
			        case 2:
			            dia = "Martes";
			            break;
			        case 3:
			            dia = "Miércoles";
			            break;
			        case 4:
			            dia = "Jueves";
			            break;
			        case 5:
			            dia = "Viernes";
			            break;
			        case 6:
			            dia = "Sábado";
			            break;
			        case 7:
			            dia = "Domingo";
			            break;
			        default:
			            System.out.println("Número inválido. Por favor, ingrese un número del 1 al 7.");
			            break;
			    }
			} catch (NumberFormatException e) {
				System.out.println("Número inválido. Por favor, ingrese un número del 1 al 7.");
			}
			
		}
		
		System.out.println("\nIngresar Hora(HH:MM): ");
		while (hora.isBlank()) {
			try {
				LocalTime horaFormat = null;
				DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm");
				horaFormat = LocalTime.parse(scanner.nextLine(), formatterHora);
				hora = horaFormat.toString();
				
			} catch(DateTimeParseException e) {
				System.out.println("La hora debe estar en formato HH:MM");
			}
		}
		
		System.out.println("\nIngrese lugar: ");
		while (lugar.isBlank()) {
			try {
				lugar = scanner.nextLine();
				if (lugar.length() < 10 || lugar.length() > 50) {
					lugar = "";
					throw new InvalidInputException("Lugar: obligatorio, mínimo 10 caracteres, máximo 50");
				}
			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("\nIngrese Duracion en minutos: ");
		while (duracion == -1 ) {
			try {
				duracion = Integer.parseInt(scanner.nextLine());
				if (duracion > 300) {
					duracion = -1;
					throw new InvalidInputException("La duracion no puede ser mayor a 300 minutos");
				}
			} catch (NumberFormatException e) {
				System.out.println("Ingrese un numero valido");
			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("\nIngrese Cantidad de Asistentes: ");
		while(cantidadAsistentes == -1) {
			try {
				cantidadAsistentes = Integer.parseInt(scanner.nextLine());
				if (cantidadAsistentes > 1000 || cantidadAsistentes < 1) {
					throw new InvalidInputException("Cantidad de asistentes: obligatorio, número entero menor que 1000");
				}
			} catch (NumberFormatException e) {
				System.out.println("Ingresar un numero valido");
			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
			}
		}
		
		cap.setIdActividad(id);
		cap.setRutCliente(rutCliente);
		cap.setDia(dia);
		cap.setHora(hora);
		cap.setLugar(lugar);
		cap.setCantidadAsistentes(cantidadAsistentes);
		cap.setDuracion(duracion);
		
		for (IAsesoria u : listaUsuarios) {
			if (u instanceof usuarios.Cliente) {
				if (((usuarios.Cliente) u).getRut().equals(rutCliente)) {
					((usuarios.Cliente) u).getListaCapacitaciones().add(cap);
				}
			}
		}
		
		listaCapacitaciones.add(cap);
		
	}

	public void eliminarUsuario(Scanner scanner) {
		String run = "";
		while (run.isBlank()) {
			try {
				run = scanner.nextLine();
				if(Integer.parseInt(run) > 99_999_999) {
					run = "";
					throw new InvalidInputException("RUN debe ser un numero menor a 99.999.999");
				}
			} catch (InvalidInputException e) {
				run = "";
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				run = "";
				System.out.println("Ingrese un numero de rut valido");

			}
		}
		
		for (int i = 0; i < listaUsuarios.size(); i++) {
			  IAsesoria asesoria = listaUsuarios.get(i);
			  Usuario usuario = (Usuario) asesoria;
              if (usuario.getRun().equals(run)) {
                  listaUsuarios.remove(usuario);
                  System.out.println("El usuario ha sido borrado exitosamente");
                  break;
              } else {
            	  System.out.println("Usuario no encontrado");
              }
		}
	
	}
	
	public void listarUsuarios() {
		System.out.println("\t\t\t\tListado de Datos de Usuarios:");
		System.out.println("\t\t\tNOMBRE\t\tFECHA DE NACIMIENTO\tRUN");
		for (IAsesoria u : listaUsuarios) {
			Usuario temp = (Usuario) u;
			System.out.println("\t\t| "+temp.getNombre() + "\t" + temp.getFechaNacimiento() + "\t\t" + temp.getRun()+" |");
		}
		
	}
	public void listarUsuariosPorTipo(Scanner scanner) {
		System.out.println("Seleccione tipo de usuario a listar: \n(1) Cliente \n(2) Profesional \n(3) Administrativo");
		int seleccion = -1;
		while (seleccion == -1) {
			try {
				seleccion = Integer.parseInt(scanner.nextLine());
				
			} catch (NumberFormatException e){}
		}
		
		if (seleccion == 1) {
			System.out.println("Datos de Clientes almacenados: ");
			for (IAsesoria u : listaUsuarios) {
				if(u instanceof usuarios.Cliente) {
					System.out.println("\n-------------------");
					Cliente cliente = (Cliente) u;
					cliente.analizarUsuario();
					System.out.println("-------------------");
				}
			}
		}
		
		if (seleccion == 2) {
			System.out.println("Datos de Profesionales almacenados: ");
			for (IAsesoria u : listaUsuarios) {
				if(u instanceof usuarios.Profesional) {
					System.out.println("\n-------------------");
					Profesional prof = (Profesional) u;
					prof.analizarUsuario();
					System.out.println("-------------------");
				}
			}
		}
		
		if (seleccion == 3) {
			System.out.println("Datos de Administrativos almacenados: ");
			for (IAsesoria u : listaUsuarios) {
				if(u instanceof usuarios.Administrativo) {
					System.out.println("\n-------------------");
					Administrativo admin = (Administrativo) u;
					admin.analizarUsuario();
					System.out.println("-------------------");
				}
			}
		}
	}

	public void listarCapacitaciones() {
		
		for (Capacitacion c : listaCapacitaciones) {
			System.out.println("\nSolicitante: \n");
			for (IAsesoria u : listaUsuarios) {
				if (c.getRutCliente().equals(((usuarios.Cliente) u).getRut())) {
					u.analizarUsuario();
				}
			}
			
			System.out.println("\nDatos De la capacitacion: ");
			System.out.println("ID: " + c.getIdActividad() + "\nRut del Cliente: " + c.getRutCliente());
			System.out.println("Detalles: " + c.mostrarDetalle());
		}
	}

}