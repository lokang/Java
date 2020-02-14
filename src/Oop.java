public class Oop { //class
    //properties or attributes
    String eyeColour = "Blue";
    String hairColour = "Black";
    String cloth = "Jean";

    /**
     * Method
     * access modifier public
     * @return
     */
    public String appearance(){
        String app = this.eyeColour + this.hairColour;
        return app;
    }

    /**
     * Method
     * access modifier public
     * @return
     */
    public String hygiene(){
        String h = this.cloth;
        return h;
    }

    public static void main(String[] args){
        Oop oop = new Oop();
        System.out.println(oop.appearance());
        System.out.println(oop.hygiene());
    }
}
