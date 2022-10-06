public class Familia {
    private int contador; 
    private int integrantes;
    private String direccion; 
    private int telefono;
    private int agua; 


    public Familia(int contador, int integrantes, String direccion, int telefono, int agua) {
        this.contador = contador;
        this.integrantes = integrantes;
        this.direccion = direccion;
        this.telefono = telefono;
        this.agua = agua;
    }


    
    /** 
     * @return int
     */
    public int getContador() {
        return this.contador;
    }

    
    /** 
     * @param contador
     */
    public void setContador(int contador) {
        this.contador = contador;
    }

    
    /** 
     * @return int
     */
    public int getIntegrantes() {
        return this.integrantes;
    }

    
    /** 
     * @param integrantes
     */
    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    
    /** 
     * @return String
     */
    public String getDireccion() {
        return this.direccion;
    }

    
    /** 
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    /** 
     * @return int
     */
    public int getTelefono() {
        return this.telefono;
    }

    
    /** 
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    /** 
     * @return int
     */
    public int getAgua() {
        return this.agua;
    }

    
    /** 
     * @param agua
     */
    public void setAgua(int agua) {
        this.agua = agua;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " contador='" + getContador() + "'" +
            ", integrantes='" + getIntegrantes() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", agua='" + getAgua() + "'" +
            "}";
    }

}
