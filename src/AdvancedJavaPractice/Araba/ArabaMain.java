package AdvancedJavaPractice.Araba;

public class ArabaMain {
    public static void main(String[] args) {

        // araclarin motor hacmi 1000 cc ve ustu olmasi ve yilini hatali veri girisine karsi kontrol ediniz.


        Araba honda=new Araba();//p'siz obj create edildi
        honda.setModel("accord");
        honda.setYil(2018);
        honda.setMotor(90);
        honda.setRenk("Kirmizi");

        Araba toyota=new Araba("avensis","beyaz",300,-2020);//p'li obj create edildi
        Araba volvo=new Araba("s80","füme",2400,2010);//p'li obj create edildi
        Araba haciMurat=new Araba(12,1974);

        System.out.println("HONDA : "+honda);
        System.out.println("Volvo : "+volvo);
        System.out.println("sectiginiz arac toyota-> "+" modeli :"+toyota.getModel()+
                            " renk :"+toyota.getRenk()+" motor gucu :"+
                             toyota.getMotor()+"yili :"+toyota.getYil());
        System.out.printf("Hacii"+haciMurat);


    }
}
