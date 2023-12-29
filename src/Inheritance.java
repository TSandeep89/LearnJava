public class Inheritance {

    void car() {
        System.out.println("car class");
    }

}

 class truck extends Inheritance {

    void bus() {
        System.out.println("bus class");
    }
}

class Van {
    public static void main(String[] args) {

        truck ts = new truck();
        ts.bus();

    }

}


