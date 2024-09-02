package org.example;

public class Main {
    public static void main(String[] args) {

        PersonRepository personRepo = new PersonRepository();
        Person ross = new Person("1", "Ross", DaysOfWeek.SUNDAY, Gender.MALE);
        Person monika = new Person("2", "Monika", DaysOfWeek.FRIDAY, Gender.FEMALE);
        Person phoebe = new Person ("3", "Phoebe", DaysOfWeek.MONDAY, Gender.FEMALE);

        personRepo.persons.add(ross);
        personRepo.persons.add(monika);
        personRepo.persons.add(phoebe);

        System.out.println(personRepo.findById("2"));
        System.out.println(personRepo.findById("4"));

        System.out.println(personRepo.findById("1").isEmpty()); // false, not empty
        System.out.println(personRepo.findById("14").isEmpty()); // true, empty box

        System.out.println(personRepo.findByName("Phoebe"));
        System.out.println(personRepo.findByName("Ross"));

        System.out.println(personRepo.countByGender(Gender.MALE));
        System.out.println(personRepo.countByGender(Gender.FEMALE));
    }
        public static void checkDay(DaysOfWeek day){
            if (day.isWeekday()){
                System.out.println("Weekday");
            }else {
                System.out.println("Weekend");
            }
        }
}