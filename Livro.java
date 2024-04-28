public class Livro {
     //declarando caracteristicas do objeto.
     private String paginas;
     private String autor;
   private String estilo;
  //dando valor as funcões. 
  public Livro(String paginas, String autor, String estilo) {
    this.paginas = paginas;
      this.autor = autor;
       this.estilo = estilo;
 
    //gets e sets      
  }
  public String getPaginas() {
    return paginas;
  }
 
  public String setPaginas() {
    return paginas;
  }
 
  public String getMarca() {
    return autor;
  }
 
  public String setMarca() {
    return autor;
  }
 
  public String getEstilo() {
    return estilo;
  }
 
  public String setEstilo() {
    return estilo;
  }
}
