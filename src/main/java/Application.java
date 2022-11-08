import animals.Kotik;

public class Application {
    public static void compareVoice(Kotik xot, Kotik xit){
        if(xit.getVoice().equals(xot.getVoice())){
            System.out.println("Котики мяукают одинаково!");
        }
        else{
            System.out.println("Котики мяукают по разному");
        }
    }

    public static void main(String[] args) {
        Kotik kat = new Kotik("Василий", "Мяу", 5, 4);
        Kotik xot = new Kotik("Гарфилд", "Мяу", 5, 4);
        Kotik kit = new Kotik();
        kit.setName("Барсик");
        kit.setVoice("Мяууу");
        kit.setSatiety(4);
        kit.setWeight(3);
        System.out.println(kat.getName() + " " + kat.getWeight() + " " + "кг");

        for(String x: kat.liveAnotherDay()){
            System.out.println(x);
        }
        System.out.println(kit.getCount());
        compareVoice(kat, xot);
    }
 }




