/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author fernando.fernandes
 */
public class Main {

    /**
     * @param args the command line arguments
     */

        //Professor, o programa está funcionando corretamente com o Scanner junto do SOUT,
        //porém, quando introduzo o Scanner e o JOptionPane, o programa trava assim que defino a cor.
        //Poderia considerar mesmo assim? Eu quis fazer com Scanner para deixar um pouco mais completo.

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Instanciando o objeto da classe carro.
        Carro meuCarro = new Carro ();
        meuCarro.setModelo("BMW");

        System.out.println("Digite o modelo de carro do Rodízio: ");
        String modeloCarroRodizio = sc.nextLine();
        System.out.println();   
        
        //instanicando outro objeto da classe Carro.
        Carro carroRodizio = new Carro();
        carroRodizio.setModelo(modeloCarroRodizio);
        

        System.out.println();
        System.out.println("Digite a cor do Carro de Rodízio: ");
        String corCarroRodizio = sc.nextLine();
        carroRodizio.setCor(corCarroRodizio);

        
        System.out.println();
        carroRodizio.acelerar();
        
        //Professor, o programa está funcionando corretamente com o Scanner junto do SOUT,
        //porém, quando introduzo o Scanner e o JOptionPane, o programa trava assim que defino a cor.
        //Poderia considerar mesmo assim? Eu quis fazer com Scanner para deixar um pouco mais completo.

        //Abaixo a caixa de diálogo: 👇
         
        //JOptionPane.showMessageDialog(null, "Modelo: " + carroRodizio.getModelo() + ", Cor: " + carroRodizio.getCor() + ", Velocidade: " + carroRodizio.getVelocidadeAtual());
        
        System.out.println("Modelo: " + carroRodizio.getModelo() + ", Cor: " + carroRodizio.getCor() + ", Velocidade: " + carroRodizio.getVelocidadeAtual());
        
        sc.close();
    }
    
}
