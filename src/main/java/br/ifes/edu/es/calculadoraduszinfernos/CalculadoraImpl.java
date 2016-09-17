/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.es.calculadoraduszinfernos;

import br.ifes.edu.es.calculadoraduszinfernos.comandos.Dividir;
import br.ifes.edu.es.calculadoraduszinfernos.comandos.Multiplicar;
import br.ifes.edu.es.calculadoraduszinfernos.comandos.Operacao;
import br.ifes.edu.es.calculadoraduszinfernos.comandos.Somar;
import br.ifes.edu.es.calculadoraduszinfernos.comandos.Subtrair;
import java.util.HashMap;

/**
 *
 * @author 1998547
 */
public class CalculadoraImpl implements Calculadora {

    private HashMap<Operador,Operacao> operacoes666 = new HashMap<Operador, Operacao>();
    
    public CalculadoraImpl(){
        
        operacoes666.put(Operador.SOMAR, new Somar());
        operacoes666.put(Operador.SUBTRAIR, new Subtrair());
        operacoes666.put(Operador.DIVIDIR, new Dividir());
        operacoes666.put(Operador.MULTIPLICAR, new Multiplicar());
        
    }
    
    @Override
    public int calcular(Operador operador, int valor1, int valor2) {
        return operacoes666.get(operador).executar(valor1, valor2);
        
    }

}
