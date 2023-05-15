/**
 * Clase Moneda, molde para crear las monedas
 * utilizadas para comprar en el expendedor
 *
 */
abstract class Moneda implements Comparable<Moneda>{
    /**
     * Metodo constructor de moneda
     */
    public Moneda(){}
    /**
     * Metodo que retorna la serie de moneda(su direccion de memoria)
     * @return : retorna la direccion de memoria de moneda
     */
    public Moneda getSerie(){
        return this;
    }
    @Override
    public int compareTo(Moneda monedaprueba){
        return (this.getValor()-monedaprueba.getValor());
    }

    /**
     * Metodo que retorna el valor de la moneda
     * @return : Valor de la moneda
     */
    public abstract int getValor();

}