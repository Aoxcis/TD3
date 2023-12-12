public class Complexe {
    
    double im;
    double re;

    Complexe(double re, double im) {
        this.re = re;
        this.im = im;
    }

    Complexe() {
        this.re = 0;
        this.im = 0;
    }

    Complexe(Complexe c) {
        this.re = c.re;
        this.im = c.im;
    }

    double getPartieReelle() {
        return this.re;
    }

    void setPartieReelle(double re) {
        this.re = re;
    }

    double getPartieImaginaire() {
        return this.im;
    }

    void setPartieImaginaire(double im) {
        this.im = im;
    }

    public String toString() {
        if(this.im < 0) {
            return this.re + " - " + Math.abs(this.im) + "i";
        } 
        else {
            return this.re + " + " + this.im + "i";
        }
    }

    public Complexe additionnerA(Complexe c) {
        return new Complexe(this.re + c.re, this.im + c.im);
    }

    public Complexe retrancher(Complexe c) {
        return new Complexe(this.re - c.re, this.im - c.im);
    }

    public Complexe multiplierPar(Complexe a, Complexe b) {
        return new Complexe(a.re * b.re - a.im * b.im, a.re * b.im + a.im * b.re);
    }

    public double abs(Complexe c) {
        return Math.sqrt(c.re * c.re + c.im * c.im);
    }
    public Complexe conjugue(Complexe c) {
        return new Complexe(c.re, -c.im);
    }

    
}