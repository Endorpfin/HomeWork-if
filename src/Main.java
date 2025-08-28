//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //#1
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age +
                    ", то  он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    ",он не достиг совершеннолетия, нужно немного подождать");
        }
        int age2 = 17;
        if (age2 >= 18) {
            System.out.println("Если возраст человека равен " + age2 +
                    ", то  он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age2 +
                    ", он не достиг совершеннолетия, нужно немного подождать");
        }

        //#2
        int temper = 7;
        if (temper > 5) {
            System.out.println("На улице " + temper + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temper + " градуса, нужно надеть шапку");
        }

        //#3
        int speed = 65;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " можно ехать спокойно");
        }
        //#4
        int ageOfPerson = 5;
        if (ageOfPerson >= 2 && ageOfPerson <= 6) {
            System.out.println("Если возраст человека равен " + ageOfPerson +
                    ", то ему нужно ходить в детский сад");
        }
        if (ageOfPerson >= 7 && ageOfPerson <= 17) {
            System.out.println("Если возраст человека равен " + ageOfPerson +
                    ", то ему нужно ходить в школу");
        }
        if (ageOfPerson >= 18 && ageOfPerson <= 24) {
            System.out.println("Если возраст человека равен " + ageOfPerson +
                    ", то его место в университете");
        }
        if (ageOfPerson > 24) {
            System.out.println("Если возраст человека равен " + ageOfPerson +
                    ", то ему пора ходить на работу");
        }

        //#5
        int ageOfChildren = 16;
        if (ageOfChildren <= 5) {
            System.out.println("Если возраст ребенка равен " + ageOfChildren +
                    " года, то ему нельзя кататься на аттракционе");
        }
        if (ageOfChildren > 5 && ageOfChildren < 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChildren +
                    " лет, то ему можно кататься на аттракционе в сопровождении взрослых");
        }
        if (ageOfChildren >= 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChildren +
                    " лет, то ему можно кататься на аттракционе");
        }
        //#6
        int capacityOfTheCarriage = 102;
        int sitting = 60;
        int passenger = 60;
        if (capacityOfTheCarriage > passenger) {
            System.out.println("В вагоне есть места");
        } else {
            System.out.println("В вагоне нет мест");
        }
        if (sitting > passenger) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (sitting <= passenger && capacityOfTheCarriage > passenger) {
            System.out.println("в вагоне есть только стоячие места");
        }
        //#7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " самое большое");
        }
        if (two > one && two > three) {
            System.out.println("Число " + two + " самое большое");
        }
        if (three > one && three > two) {
            System.out.println("Число " + three + " самое большое");
        }


    }
}