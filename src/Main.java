import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Produto produto;
        boolean encerrar = false;
        String nome = "";
        double valor = 0;
        double total = 0;

        do {

            nome = JOptionPane.showInputDialog("Nome do produto");

            valor = Double.parseDouble(
                    JOptionPane
                            .showInputDialog("Valor do produto [apenas números]")
                    );

            produto = new Produto(nome, valor);

            System.out.println(produto);

            total = total + produto.getValor();


            int opcao = Integer.parseInt(
                    JOptionPane
                            .showInputDialog("Deseja mais alguma coisa?" +
                    " [ 1 ] = SIM " +
                    "[ 0 ] = NÃO"));

            encerrar = opcao == 1 ? false : true;

        } while (encerrar == false);

        System.out.println("TOTAL DA COMPRA: " + total);


    }
}