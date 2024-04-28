public class Guarda_chuva {
    //declarando caracteristicas do objeto.
    private String formato;
    private String marca;
  private String estilo;
 //dando valor as funcões. 
 public Guarda_chuva(String formato, String marca, String estilo) {
   this.formato = formato;
     this.marca = marca;
      this.estilo = estilo;

   //gets e sets      
 }
 public String getFormato() {
    System.err.println("Quadrado");
   return formato;
 }

 public String setFormato() {
    System.err.println("Quadrado");
   return formato;
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
