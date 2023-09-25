package day17_constructors;

public class C08_CarRunner {

    public static void main(String[] args) {
        C07_Car car1 = new C07_Car();

        System.out.println(car1.marka); // Marka atanmamis
        System.out.println(car1.model); // Model atanmamis

        System.out.println(car1); // day17_constructors.C07_Car@e580929
        System.out.println(car1.toString()); // day17_constructors.C07_Car@e580929

        // eger bir class'dan obje olusturdugumuzda
        // objenin tum ozelliklerini tek bir sout ile yazdirmak isterseniz
        // o class'a toString() olusturmalisiniz

        System.out.println(car1);
        // C07_Car{marka='Marka atanmamis', model='Model atanmamis', renk='Renk atanmamis', yil=1900, fiyat=0}
        // C07_Car Ozellikler ==>marka :'Marka atanmamis', model :'Model atanmamis', renk :'Renk atanmamis', yil :1900, fiyat :0

        C07_Car car2 = new C07_Car();
        car2.marka = "Toyota";
        car2.model = "Corolla";
        car2.renk = "Kirmizi";
        car2.yil = 2015;
        car2.fiyat = 10000;
        System.out.println(car2);
        // C07_Car Ozellikler ==>marka :'Toyota', model :'Corolla', renk :'Kirmizi', yil :2015, fiyat :10000

        C07_Car car3 = new C07_Car();
        car3.marka = "Mercedes";
        car3.model = "E200";
        car3.renk = "Siyah";
        car3.yil = 2015;
        car3.fiyat = 15000;
        System.out.println(car3);
        // C07_Car Ozellikler ==>marka :'Mercedes', model :'E200', renk :'Siyah', yil :2015, fiyat :15000

        // Eger atamayi her seferinde tek tek yapmak istemezseniz
        // atama islemini constructor'da yapabiliriz

        C07_Car car4 = new C07_Car("Porsche","Carrera");
        System.out.println(car4);
        // C07_Car Ozellikler ==>marka :'Porsche', model :'Carrera', renk :'Renk atanmamis', yil :1900, fiyat :0

        C07_Car car5 = new C07_Car("Citroen","C3");
        System.out.println("Car5 : "+car5);
        // C07_Car Ozellikler ==>marka :'Citroen', model :'C3', renk :'Renk atanmamis', yil :1900, fiyat :0

        // marka, model, yil, fiyat olan araclar uretmek istiyoruz
        C07_Car car6 = new C07_Car("Honda","Jazz",2016,7000);
        System.out.println("Car6 " + car6 );
        // Car6  Ozellikler ==>marka :'Honda', model :'Jazz', renk :'Renk atanmamis', yil :2016, fiyat :7000

        C07_Car car7 = new C07_Car("Audi","A4",2015,15000);
        System.out.println("Car7 "+ car7);
        // Car7  Ozellikler ==>marka :'Audi', model :'A4', renk :'Renk atanmamis', yil :2015, fiyat :15000
    }
}

