public class Libros {

    String fechaLibro;
    String nomLibro;
    String autorLibro;
    String editorialLibro;

    public Libros(String fechaLibro, String nomLibro, String autorLibro, String editorialLibro) {
        this.fechaLibro = fechaLibro;
        this.nomLibro = nomLibro;
        this.autorLibro = autorLibro;
        this.editorialLibro = editorialLibro;

    }  

    public void setFechaLibro(String fechaLibro){
        this.fechaLibro = fechaLibro;
    }

    public String getFechaLibro(){
        return this.fechaLibro;
    }  
    
    public void setnomLibro(String nomLibro){
        this.nomLibro = nomLibro;
    }
    public String getnomLibro(){
        return this.nomLibro;
    }  
    public void setautorLibro(String autorLibro){
        this.autorLibro = autorLibro;
    }
    public String getautorLibro(){
        return this.autorLibro;
    }  
      public void seteditorialLibro(String editorialLibro){
        this.editorialLibro = editorialLibro;
    }

      public String geteditorialLibro(){
        return this.editorialLibro;
    }  
}
