package by.it.vesniachok.jd01_08;

class Scalar extends Var {

    private double value;
    public double getValue(){
        return value;
    }

    Scalar(double value) {
        this.value = value;
    }

    Scalar(String value) {
        this.value=Double.parseDouble(value);
    }

    Scalar(Scalar otherScalar) {
        this.value=otherScalar.value;
    }


    @Override
    public Var add(Var other) {
        if (other instanceof  Scalar){
            Scalar sc = (Scalar) other;
            double result=this.value+sc.value;
            return new Scalar(result);
        }
        return other.add(this);
    }

    @Override
    public Var mul(Var other) {
        if (other instanceof  Scalar){
            Scalar sc = (Scalar) other;
            double result=this.value*sc.value;
            return new Scalar(result);
        }
        return other.mul(this);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof  Scalar){
            Scalar sc = (Scalar) other;
            double result=this.value-sc.value;
            return new Scalar(result);
        }
        return other.add(this).mul(new Scalar(-1));
    }

    @Override
    public Var div(Var other) {
        if (other instanceof  Scalar){
            Scalar sc = (Scalar) other;
            double result=this.value/sc.value;
            return new Scalar(result);
        }
        return super.div(other);
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
