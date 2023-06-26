/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ambiente;

/**
 *
 * @author senai
 */
public class SalaDeAula {

    public static void main(String[] args) {
        System.out.println("Bem vindo a sala de aula!");
        Ventilador ventilador1 = new Ventilador(3);//ter=criar ventilador instanciar
        ventilador1.girar(1);
        ventilador1.mostrarVelocidade();
        
        
        
    }
}
