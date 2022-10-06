public class Comunidad  { //creamos la clase Comunidad
    private int personas;
    private String nombre;
    private ArrayList<Familia> familias;
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

	
	/** 
	 * @return int
	 */
	public int getPersonas() {
		return this.personas;
	}

	
	/** 
	 * @param personas
	 */
	public void setPersonas(int personas) {
		this.personas = personas;
	}

	
	/** 
	 * @return String
	 */
	public String getNombre() {
		return this.nombre;
	}

	
	/** 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	/** 
	 * @param capacidad
	 * @param posicion
	 */
	public void setDrenajes(int capacidad, int posicion){
        drenajes[posicion] = capacidad;
    }


    
	/** 
	 * @param posicion
	 * @return int
	 */
	public int getDrenajes(int posicion){
        return drenajes[posicion];
    }    


	
	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return "{" +
			" personas='" + getPersonas() + "'" +
			", nombre='" + getNombre() + "'" +
			", familias='" + getFamilias() + "'" +
			", drenajes='" + getDrenajes() + "'" +
			"}";
	}

}
