public class Main{
    public static void main(String[] args)  {
        Ventana v = new Ventana();
        Expendedor exp = new Expendedor(4, 1000);
        Moneda m = null;
        Comprador c = null;
        System.out.println("Bebida que NO vende:");//-----Bebida que NO vende-----
        try{m = new Moneda500();
            c = new Comprador(m, 657, exp);
            System.out.println(c.queConsumiste() + ",vuelto " + c.cuantoVuelto());// null 500
        }catch(NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ){
            System.out.println(e);
        }
    }
}