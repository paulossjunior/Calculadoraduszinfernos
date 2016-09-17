/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.es.calculadoraduszinfernos.comandos;

/**
 *
 * @author 1998547
 */
public class Subtrair implements Operacao{

    @Override
    public int executar(int valor1, int valor2) {
       return valor1 - valor2;
    }
    
}
