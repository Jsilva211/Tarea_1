public class Main {
    public static void main(String[] args)  {
        Expendedor exp = new Expendedor(4, 1000);
        Moneda m = null;
        Comprador c = null;

        System.out.println("Bebida que NO vende:");//-----Bebida que NO vende-----
        try{m = new Moneda500();
            c = new Comprador(m, 657, exp);
            System.out.println(c.queConsumiste() + ",vuelto " + c.cuantoVuelto());// null 500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{m = new Moneda500();
            c = new Comprador(m, 657, exp);
            System.out.println(c.queConsumiste() + ",vuelto " + c.cuantoVuelto());// null 500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        System.out.println("trata de comprar SIN Moneda:");//-----trata de comprar SIN Moneda-----
        try{//m = null
            c = new Comprador(null, Expendedor.SPRITE, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// sprite 500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{//m=null
            c = new Comprador(null, Expendedor.SPRITE, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// sprite 500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        System.out.println("con MENOS dinero que el precio:");//-----con MENOS dinero que el precio-----
        try{m = new Moneda500();
            c = new Comprador(m, Expendedor.SPRITE, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{m = new Moneda500();
            c = new Comprador(m, Expendedor.SPRITE, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        System.out.println("con dinero JUSTO para el precio:");//-----con dinero JUSTO para el precio-----
        try{m = new Moneda1000();
            c = new Comprador(m, Expendedor.SPRITE, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{m = new Moneda1000();
            c = new Comprador(m, Expendedor.SPRITE, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        System.out.println("con MAS dinero que el precio:");//-----con MAS dinero que el precio-----
        try{m = new Moneda1500();
            c = new Comprador(m, Expendedor.SPRITE, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{m = new Moneda1500();
            c = new Comprador(m, Expendedor.SPRITE, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        System.out.println("Deposito VACIO:");//-----Deposito VACIO-----
        try{m = new Moneda1500();
            c = new Comprador(m, Expendedor.SPRITE, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{m = new Moneda1500();
            c = new Comprador(m, Expendedor.SPRITE, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("trata de comprar SIN Moneda:");//-----trata de comprar SIN Moneda-----
        try{//m = null
            c = new Comprador(null, Expendedor.COCA, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// sprite 500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{//m=null
            c = new Comprador(null, Expendedor.COCA, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// sprite 500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        System.out.println("con MENOS dinero que el precio:");//-----con MENOS dinero que el precio-----
        try{m = new Moneda500();
            c = new Comprador(m, Expendedor.COCA, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{m = new Moneda500();
            c = new Comprador(m, Expendedor.COCA, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        System.out.println("con dinero JUSTO para el precio:");//-----con dinero JUSTO para el precio-----
        try{m = new Moneda1000();
            c = new Comprador(m, Expendedor.COCA, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{m = new Moneda1000();
            c = new Comprador(m, Expendedor.COCA, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        System.out.println("con MAS dinero que el precio:");//-----con MAS dinero que el precio-----
        try{m = new Moneda1500();
            c = new Comprador(m, Expendedor.COCA, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{m = new Moneda1500();
            c = new Comprador(m, Expendedor.COCA, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        System.out.println("Deposito VACIO:");//-----Deposito VACIO-----
        try{m = new Moneda1500();
            c = new Comprador(m, Expendedor.COCA, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{m = new Moneda1500();
            c = new Comprador(m, Expendedor.COCA, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}
        //////////////////////////////////////////////////////////
        System.out.println("trata de comprar SIN Moneda:");//-----trata de comprar SIN Moneda-----
        try{//m = null
            c = new Comprador(null, Expendedor.SNKR, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// sprite 500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{//m=null
            c = new Comprador(null, Expendedor.SNKR, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// sprite 500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        System.out.println("con MENOS dinero que el precio:");//-----con MENOS dinero que el precio-----
        try{m = new Moneda500();
            c = new Comprador(m, Expendedor.SNKR, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{m = new Moneda500();
            c = new Comprador(m, Expendedor.SNKR, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        System.out.println("con dinero JUSTO para el precio:");//-----con dinero JUSTO para el precio-----
        try{m = new Moneda1000();
            c = new Comprador(m, Expendedor.SNKR, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{m = new Moneda1000();
            c = new Comprador(m, Expendedor.SNKR, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        System.out.println("con MAS dinero que el precio:");//-----con MAS dinero que el precio-----
        try{m = new Moneda1500();
            c = new Comprador(m, Expendedor.SNKR, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{m = new Moneda1500();
            c = new Comprador(m, Expendedor.SNKR, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        System.out.println("Deposito VACIO:");//-----Deposito VACIO-----
        try{m = new Moneda1500();
            c = new Comprador(m, Expendedor.SNKR, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{m = new Moneda1500();
            c = new Comprador(m, Expendedor.SNKR, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("trata de comprar SIN Moneda:");//-----trata de comprar SIN Moneda-----
        try{//m = null
            c = new Comprador(null, Expendedor.SPR8, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// sprite 500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{//m=null
            c = new Comprador(null, Expendedor.SPR8, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// sprite 500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        System.out.println("con MENOS dinero que el precio:");//-----con MENOS dinero que el precio-----
        try{m = new Moneda500();
            c = new Comprador(m, Expendedor.SPR8, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{m = new Moneda500();
            c = new Comprador(m, Expendedor.SPR8, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        System.out.println("con dinero JUSTO para el precio:");//-----con dinero JUSTO para el precio-----
        try{m = new Moneda1000();
            c = new Comprador(m, Expendedor.SPR8, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{m = new Moneda1000();
            c = new Comprador(m, Expendedor.SPR8, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        System.out.println("con MAS dinero que el precio:");//-----con MAS dinero que el precio-----
        try{m = new Moneda1500();
            c = new Comprador(m, Expendedor.SPR8, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{m = new Moneda1500();
            c = new Comprador(m, Expendedor.SPR8, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        System.out.println("Deposito VACIO:");//-----Deposito VACIO-----
        try{m = new Moneda1500();
            c = new Comprador(m, Expendedor.SPR8, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}

        try{m = new Moneda1500();
            c = new Comprador(m, Expendedor.SPR8, exp);
            System.out.println(c.queConsumiste() + ",vuelto: " + c.cuantoVuelto());// null 1500
        }catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e ) {System.out.println(e);}


    }
}