package animals;


public  class Kotik {
    private String name; //имя
    private String voice; //голос
    private int satiety; //сытость
    private int weight; //вес
    private static int count;
    private static final int METHODS = 5;
    String foodName;
    String[] mas = new String[24];
    String text;


    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        koticCount();
    }

    public Kotik() {
        koticCount();
    }

    public static int getCount() {
        return count;
    }

    public int koticCount() {
        count++;
        //System.out.println("Создано - " + count + "Обьектов класса котик");
        return count;
    }


    public void eat(int satiety) {
        setSatiety(satiety);
    }

    public void eat(int satiety, String foodName) {
        setSatiety(satiety);
        this.foodName = foodName;
    }

    public void eat() {
        eat(satiety, foodName);
    }


    public boolean plaid() {   //играет
        if (getSatiety() > 0) {
            text = "Котик играет";
            //System.out.print(text);
            setSatiety(getSatiety() - 1);
            return true;
        } else {
            text = "Котик просит есть";
            //System.out.print(text);
            return false;
        }
    }

    public boolean sleep() {    //спит
        if (getSatiety() > 0) {
            text = "Котик спит";
            //System.out.print(text);
            setSatiety(getSatiety() - 1);
            return true;
        } else {
            text = "Котик просит есть";
            //System.out.print(text);
            return false;
        }
    }

    public boolean wash() {     //умываеться
        if (getSatiety() > 0) {
            text = "Котик умываеться";
            //System.out.print(text);
            setSatiety(getSatiety() - 1);
            return true;
        } else {
            text = "Котик просит есть";
           // System.out.print(text);
            return false;
        }
    }

    public boolean walk() {     //гуляет
        if (getSatiety() > 0) {
            text = "Котик гуляет";
           // System.out.print(text);
            setSatiety(getSatiety() - 1);
            return true;
        } else {
            text = "Котик просит есть";
            //System.out.print(text);
            return false;
        }
    }

    public boolean hunt() {    //охотиться
        if (getSatiety() > 0) {
            text = "Котик охотиться";
            //System.out.print(text);
            setSatiety(getSatiety() - 1);
            return true;
        } else {
            text = "Котик просит есть";
            //System.out.print(text);
            return false;
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String[] liveAnotherDay() {
        String eat = "Котик ест!";
        int y;
        //eat();
        for (int x = 0; x < 24; x++) {
            y = (int) (Math.random() * METHODS) + 1;
            switch (y) {
                case 1:
                    mas[x] = x + " - " + eat;
                    break;
                case 2:
                    plaid();
                    mas[x] = x + " - " + text;
                    break;
                case 3:
                    sleep();
                    mas[x] = x + " - " + text;
                    break;
                case 4:
                    walk();
                    mas[x] = x + " - " + text;
                    break;
                case 5:
                    wash();
                    mas[x] = x + " - " + text;
                    break;
                case 6:
                    hunt();
                    mas[x] = x + " - " + text;
                    break;
            }
        }
        return mas;
    }
}