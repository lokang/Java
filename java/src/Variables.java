public class Variables {
    public static void main(String[] args){
        /**
         * Variables are declared
         * @ data_type and variable_name
         */
        String name;
        int age;
        /**
         * assigning variables values.
         * 1.you do not need to write type name once it was declared.
         * 2.write name of variable, equal(=) which is an assignment
         * operator then the value you want to assign.
         */
        name = "Lokang";
        age = 40;

        /**
         * outputting variables
         */
        System.out.println(name);
        System.out.println(age);

        /**
         * concatenating variables
         * in java, + is used for variables concatenation.
         */

        System.out.println(name + age);

        /**
         * + is also used for adding numbers or variables
         * you can declare multiple variables separated by comma if
         * they are of same type.
         */
        int a = 5, b = 7;
        int sum = a+b;
        System.out.println(sum);
    }
}
