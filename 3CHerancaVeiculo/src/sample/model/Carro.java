package sample.model;

/** Class carro */
public final class Carro extends Veiculo {


    /** Atributo */
   private int nPortas;

    /** Construtor de carro */
    public Carro(String nome) {
        super(nome);
    }
    public Carro(String nome) {
        super(nome, desc);
    }
    public Carro(String nome, String desc, int nPortas) {
        super(nome, desc);
        this.nPortas = nPortas
    }


       /**
    * Get número de portas
    * @return número de portas
    */
   public int getnPortas() {
       return nPortas;
   }

   /**
    * Informar o número de portas
    * @param nPortas
    */
   public void  setnPortas(int nPortas) {
       this.nPortas = nPortas;
   }
    /**
     * Imprimir o objeto
     */
    @Override
    public String toString() {
        return super.toString()
                + "Número de Portas: " + nPortas;
    }
}



