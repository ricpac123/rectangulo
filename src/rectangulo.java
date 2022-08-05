public class rectangulo {

    int index;
    int largura;
    int altura;
    String cor;

    public rectangulo(int largura, int altura, String cor, int index) {
        this.largura = largura;
        this.altura = altura;
        this.cor = cor;
        this.index = index;
    }

    /*public void medidas (int largura, int altura) {

        if (largura < 0 || altura < 0) {
            System.out.println("largura ou altura menor que zero");

        }
    }*/

    /*public void cores (String cor) {
        if (cor.equals("amarelo") || cor.equals("vermelho") || cor.equals("verde") || cor.equals("azul")) {
            System.out.println("cor certa");
        }

    }*/

    public double area() {
        return this.largura*this.altura;
    }

    public double perimetro() {
        return 2*this.largura+2*this.altura;
    }


    @Override
    public String toString() {
            return "\nRectangulo " + index + "\nLargura:" + largura + " Altura:" + altura + "\nArea:" + area() + " Perimetro:" + perimetro() + "\nCor:" + this.cor + "\n_____________________________";

        }





}




