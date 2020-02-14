public class Operators {
    public static void main(String[] args){
        /**
         * logical
         * logical operators are &&(and), ||(or) and !(Not)
         * I've done &&, please do || and !.
         */
        String name = "Lokang";
        int age = 40;
        if((name == "Lokang") && (age == 40)){
            System.out.println(name + " You are " + age);
        }

        /**
         * Arithmetic Operators
         * Arithmetic operators are +(plus), -(minus), *(multiplication)
         * /(division) and %(modulo or remainder)
         * plus can sometimes be used for string concatenation.
         */
        int yearBorn = 1985;
        int currentYear = 2025;
        int myAge = currentYear - yearBorn;
        System.out.println(myAge);

        /**
         * comparision operator
         * ==      Equal to
         * !=      Not equal to
         * >       Greater than
         * >=      Greater than or equal to
         * <       Less than
         * <=      Less than or equal to
         */
        int x = 4;
        int y = 5;
        System.out.println(x <= y);;

        /**
         * assignment operator
         * =(assignment)
         * +=   increment(x += 1 = x = x+1)
         * *=   multiplication(x *=2 = x = x * 2)
         */
        int k = 5;
        System.out.println(k);
    }
}
