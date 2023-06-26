package com.mycompany.ambiente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author senai
 */
public class Ventilador {
    public int velocidade;
    public int numerodePas;
    
    public Ventilador (int valor){
        numerodePas=valor;
        System.out.println("Ventilador Com "+numerodePas+" pas");
    }
    public void girar(int valor){
        velocidade=valor;
                System.out.println(velocidade);
        }
    public void mostrarVelocidade (){
        System.out.println("A velocidade atual é:"+ velocidade );
    }
}

