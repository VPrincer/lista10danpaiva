public class Caneta {
     //declarando caracteristicas do objeto.
            private String cor;
           private String tipo_de_tinta;
          private String marca;
        private String escrever;
       //dando valor as funcões. 
       public Caneta(String cor, String tipo_de_tinta, String marca, String escrever) {
         this.cor = cor;
          this.tipo_de_tinta = tipo_de_tinta;
           this.marca = marca;
            this.escrever = escrever;

         //gets e sets      
       }
       public String getCor() {
        System.out.println("Vermelha");
         return cor;
       }

       public String setCor() {
        System.out.println("Vermelha");
         return cor;
       }
       
       public String getTipo_de_tinta() {
        System.out.println("tinta Oléo");
         return tipo_de_tinta;
       }
      
       public String setTipo_de_tinta() {
        System.out.println("tinta Oléo");
         return tipo_de_tinta;
       }

       public String getMarca() {
        System.out.println("BIC");
         return marca;
       }

       public String setMarca() {
        System.out.println("BIC");
         return marca;
       }

       public String getEscrever() {
         return escrever;
       }

       public String setEscrever() {
         return escrever;
       } 

      }
