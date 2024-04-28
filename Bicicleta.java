public class Bicicleta {
     //declarando caracteristicas do objeto.
     private String cor_da_lente;
     private String marca;
   private String estilo;
  //dando valor as funcões. 
  public Bicicleta(String cor_da_lente, String marca, String estilo) {
    this.cor_da_lente = cor_da_lente;
      this.marca = marca;
       this.estilo = estilo;
 
    //gets e sets      
  }
  public String getCor() {
    return cor_da_lente;
  }
 
  public String setCor() {
    return cor_da_lente;
  }
 
  public String getMarca() {
    return marca;
  }
 
  public String setMarca() {
    return marca;
  }
 
  public String getEstilo() {
    return estilo;
  }
 
  public String setEstilo() {
    return estilo;
  }
}
