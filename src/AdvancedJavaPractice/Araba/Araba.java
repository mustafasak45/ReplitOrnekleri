package AdvancedJavaPractice.Araba;

public class Araba {//POJO class: planing old java object(model class)
  private   String model;
  private   String renk;
  private   int motor;
  private   int yil;

    public Araba() {//parametresiz constructor

    }

    public Araba(int motor, int yil) {
        setMotor(motor);
        this.yil = yil;
    }

    public Araba(String model, String renk, int motor, int yil) {//parametreli constructor
        this.model = model;
        this.renk = renk;
      // this.motor = motor;
      // this.yil = yil;
        setMotor(motor);
        setYil(yil);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor<1000){
            System.out.println("Bu cc de motor olmaz");
            this.motor=1200;
        }else this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil<0){
            this.yil=(-1)*yil;
            System.out.printf("Eksi Yil Pozitife Cevirildi");
        }else this.yil = yil;

    }

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }



}
