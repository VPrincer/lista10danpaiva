public class Chave {
          //declarando caracteristicas do objeto.
          private String formato;
          private String marca;
        private String estilo;
       //dando valor as funcões. 
       public Chave(String formato, String marca, String estilo) {
         this.formato = formato;
           this.marca = marca;
            this.estilo = estilo;
     
         //gets e sets      
       }
       public String getFormato() {
         return formato;
       }
     
       public String setFormato() {
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