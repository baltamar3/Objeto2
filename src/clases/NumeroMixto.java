/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author baltamar
 */
public class NumeroMixto {

    private int numerador;
    private int denominador;

    public NumeroMixto(int numerador, int denominador) throws DenominadorCeroException {
        this.numerador = numerador;
        this.denominador = denominador;

        if (denominador == 0) {
            throw new DenominadorCeroException();
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public NumeroMixto Sumar(NumeroMixto m2) throws DenominadorCeroException {
        NumeroMixto m;
        int num, dem;

        num = (this.numerador * m2.denominador) + (this.denominador * m2.numerador);
        dem = this.denominador * m2.denominador;

        m = new NumeroMixto(num, dem);
        return m;
    }

    public NumeroMixto Restar(NumeroMixto m2) throws DenominadorCeroException {
        NumeroMixto m;
        int num, dem;

        num = (this.numerador * m2.denominador) - (this.denominador * m2.numerador);
        dem = this.denominador * m2.denominador;

        m = new NumeroMixto(num, dem);
        return m;
    }

    public NumeroMixto Multiplicar(NumeroMixto m2) throws DenominadorCeroException {
        NumeroMixto m;
        int num, dem;

        num = this.numerador * m2.numerador;
        dem = this.denominador * m2.denominador;

        m = new NumeroMixto(num, dem);
        return m;
    }

    public NumeroMixto Dividir(NumeroMixto m2) throws DenominadorCeroException {
        NumeroMixto m;
        int num, dem;

        num = this.numerador * m2.denominador;
        dem = this.denominador * m2.numerador;

        m = new NumeroMixto(num, dem);
        return m;
    }
}
