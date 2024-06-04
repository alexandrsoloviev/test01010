public class Main {

    public static void main(String[] args) {
        char l = 123;
        System.out.println(l);
    }

    public static String getAgeCategory(int age) {
        String ageCategory;

        if (age > 0 && age < 12) {
            return ageCategory = "Child";
        } else if (age >= 13 && age <= 19) {
            return ageCategory = "Teen";
        } else if (age >= 20 && age <= 64) {
            return ageCategory = "Adult";
        } else if (age >= 65 && age <= 120) {
            return ageCategory = "Senior";
        }else return ageCategory = "error";

        //  Я ВНЕС ИЗМИНЕНИЯ
    }
}