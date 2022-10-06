public class Comunidad  { //creamos la clase comunidad
    private int personas;
    private String nombre;
    private int[] drenajes = new int[3]; 

	public Comunidad() {
        nombre = "";
    	personas = 0;
        for(int i =0; i<4; i++) {
            drenajes[i]= 0;
        }
        
    }

	public Comunidad(String nom, int per){
		nombre = nom;
		personas = per;
	}

	public int getPersonas() {
		return this.personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDrenajes(int capacidad, int posicion){
        drenajes[posicion] = capacidad;
    }


    public int getDrenajes(int posicion){
        return drenajes[posicion];
    }    
}
