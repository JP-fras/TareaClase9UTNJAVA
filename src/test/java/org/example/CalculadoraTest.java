package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void punto1() {
        Calculadora c = new Calculadora();
        assertEquals(240, c.multiplicar(80,3));
    }

    @Test
    void punto2() {
        Calculadora c = new Calculadora();
        assertEquals(110, c.dividir(c.sumar(150, 180), 3));
    }

    @Test
    void punto3() {
        Calculadora c = new Calculadora();
        assertEquals(605, c.multiplicar(c.restar(90, 50), 15));
    }

    @Test
    void punto4() {
        Calculadora c = new Calculadora();
        assertEquals(2700, c.multiplicar(c.sumar(70, 40), 25));
    }
}