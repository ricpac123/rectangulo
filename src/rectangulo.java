public class rectangulo {

    int index;
    int largura;
    int altura;
    String cor;

    public rectangulo (int largura, int altura, String cor, int index) {
        if (largura < 0) {this.largura=Math.abs(largura);}
        if (altura < 0) {this.altura=Math.abs(altura);}
        if (cor.equalsIgnoreCase("amarelo") || cor.equalsIgnoreCase("vermelho") || cor.equalsIgnoreCase("verde") || cor.equalsIgnoreCase("azul")) {
            this.cor=cor;}
        else{ System.out.println("cor incorrecta");
        }
        this.index = index;
    }

    public double area() {
        return this.largura*this.altura;
    }

    public double perimetro() {
        return 2*(this.largura+this.altura);
    }


    @Override
    public String toString() {
            return "\nRectangulo " + index + "\nLargura:" + largura + " Altura:" + altura + "\nArea:" + area() + " Perimetro:" + perimetro() + "\nCor:" + this.cor + "\n_____________________________";

        }

}




