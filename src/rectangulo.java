import java.awt.geom.Area;

public class rectangulo {

    int largura;
    int altura;
    String cor;

    public rectangulo (int largura, int altura, String cor) {
        this.largura = largura;
        this.altura = altura;
        this.cor = cor;
    }

public void medidas (int largura, int altura){

        if (largura<0 || altura<0){
            System.out.println("largura ou altura menor que zero");

        }
}

public void cores (String cor){
        if (cor.equals("amarelo")||cor.equals("vermelho")||cor.equals("verde")||cor.equals("azul")){
            System.out.println("cor certa");
        }

}

public double area() { return this.largura*this.altura; }

public double perimetro(){
        return 2*largura+2*altura;
}



    @Override
    public String toString() {
        return "\nLargura:"+largura+" Altura:"+altura+"\nArea:"+area()+" Perimetro:"+perimetro()+"\nCor:"+this.cor+"\n_____________________________";
    }


}




