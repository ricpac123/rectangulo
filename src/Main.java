import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        rectangulo rec1 = new rectangulo(-5,-5,"vermelho",1);
        rectangulo rec2 = new rectangulo(4,5,"Azul",2);
        rectangulo rec3 = new rectangulo(4,6,"verde",3);
        rectangulo rec4 = new rectangulo(7,5,"amarelo",4);

        ArrayList<rectangulo> propriedadesArrayList = new ArrayList<>();

        propriedadesArrayList.add(rec1);
        propriedadesArrayList.add(rec2);
        propriedadesArrayList.add(rec3);
        propriedadesArrayList.add(rec4);

        System.out.println(propriedadesArrayList);



    }
}