public class SortingOut {
    public static void Sort(Deposito<Moneda> a){
        Moneda arm[]= new Moneda[a.tam()];
        int b=a.tam();

        for(int x=0;x<b;x++){
            arm[x]=a.getProducto();
        }
        for(int j=0;j<b;j++) {
            for (int i = 0; i < b-1; i++) {
                if (arm[i + 1].compareTo(arm[i]) > 0) {
                   Moneda aux = arm[i];
                   arm[i] = arm[i + 1];
                   arm[i + 1] = aux;
                }
            }
        }
            for(int y=0;y< b;y++){
                a.addProducto(arm[y]);
            }

        }

    }

