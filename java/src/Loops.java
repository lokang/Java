public class Loops {
    public static void main(String[] args){
        //if
        String name="Lokang";
        int age = 40;
        if(name == "Lokang" ){
            System.out.println(name);
        }
        //elseif
        if(name != "Lokang"){
            System.out.println(name);
        }else if (age < 40){
            System.out.println(name+"You are "+age+"Years old");
        }
        //else
        if(name != "Lokang"){
            System.out.println("You are not Lokang");
        }else{
            System.out.println("You are "+name);
        }

        /**
         * switch
         */
        String month = "February";
        switch (month){
            case "January":
                System.out.println(month);
                break;
            case "February":
                System.out.println(month);
                break;
            case "March":
                System.out.println(month);
                break;
            case "April":
                System.out.println(month);
                break;
            case "May":
                System.out.println(month);
                break;
            case "June":
                System.out.println(month);
                break;
            case "July":
                System.out.println(month);
                break;
            case "August":
                System.out.println(month);
                break;
            case "September":
                System.out.println(month);
                break;
            case "October":
                System.out.println(month);
                break;
            case "November":
                System.out.println(month);
                break;
            case "December":
                System.out.println(month);
                break;
                default:
                    System.out.println("Not one of the month");
                    break;

        }

        /**
         * for loop
         */
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        /**
         * while
         */
        int j = 0;
        while(j < 5){
            System.out.println(j);
            j++;
        }

        /**
         * do while
         */

        int k = 0;
        do{
            System.out.println(k);
            k++;
        }while (k<5);
    }
}
