public class Question_java {


    //Drucken Sie eine Methode, die die 2 höchsten 2 Zahlen in einem Array findet


    public static void main(String[] args) {

        int[] salaries = {2000, 3000, 4000, 5000, 6550, 2550, 1980};

        int highestNumber = Integer.MIN_VALUE;
        int highestNumber2 = Integer.MIN_VALUE;

        for (int salary : salaries) {
            if (salary>highestNumber) {
                highestNumber2 = highestNumber;
                highestNumber = salary;
            } else if (salary > highestNumber2) {
                highestNumber2 = salary;

            }

        }
        System.out.println(highestNumber);
        System.out.println(highestNumber2);

    }



}
