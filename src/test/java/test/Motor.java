package test;

public class Motor {
	public int numeroCilindros;
	public String tipo;
	public int registro;
	
	public void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	public void asignarTipo(String tipo) {
		switch (tipo) {
		case "electrico": 
			break;
		case "gasolina":
			break;
		}
		this.tipo = tipo;
	}
}
