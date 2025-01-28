/** @author Hugo Pérez Muñoz */
public class Libros {

    String fechaLibro;
    String NomLibro;
    String AutorLibro;
    String EditorialLibro;
    private String categoria;
    private boolean prestado;

    public Libros(String fechaLibro, String nomLibro, String autorLibro, String editorialLibro, String categoria) {
        this.fechaLibro = fechaLibro;
        this.NomLibro = nomLibro;
        this.AutorLibro = autorLibro;
        this.EditorialLibro = editorialLibro;
        this.categoria = categoria;
        this.prestado = false;

    }  

    public void setFechaLibro(String fechaLibro){
        this.fechaLibro = fechaLibro;
    }

    public String getFechaLibro(){
        return this.fechaLibro;
    }  
    
    public void setNomLibro(String nomLibro){
        this.NomLibro = nomLibro;
    }
    public String getNomLibro(){
        return this.NomLibro;
    }  
    public void setAutorLibro(String autorLibro){
        this.AutorLibro = autorLibro;
    }
    public String getAutorLibro(){
        return this.AutorLibro;
    }  
    public void setEditorialLibro(String editorialLibro){
        this.EditorialLibro = editorialLibro;
    }

    public String getEditorialLibro(){
        return this.EditorialLibro;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }


    @Override
    public String toString() {
        return "{" +
            " fechaLibro='" + getFechaLibro() + "'" +
            ", nomLibro='" + getNomLibro() + "'" +
            ", autorLibro='" + getAutorLibro() + "'" +
            ", editorialLibro='" + getEditorialLibro() + "'" +
            ", categoria='" + getCategoria() + "'" +
            ", prestado='" + isPrestado() + "'" +
            "}";
    }
}