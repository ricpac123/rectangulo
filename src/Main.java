import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        rectangulo rec1 = new rectangulo(2,3,"vermelho");
        rectangulo rec2 = new rectangulo(4,5,"azul");
        rectangulo rec3 = new rectangulo(4,6,"verde");
        rectangulo rec4 = new rectangulo(7,5,"amarelo");

        ArrayList<rectangulo> rectanguloArrayList = new ArrayList<>();

        rectanguloArrayList.add(rec1);
        rectanguloArrayList.add(rec2);
        rectanguloArrayList.add(rec3);
        rectanguloArrayList.add(rec4);

        System.out.println(rectanguloArrayList);


    }
}