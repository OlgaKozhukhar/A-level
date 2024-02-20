package ua.kozhukhar.hw8;

public class Task1 {

    public static void main(String[] args) {
        Student student1 = new Student("Іван", "Василенко", "Група1", 4.4);
        Student student2 = new Student("Ольга", "Скубак", "Група2", 5.0);

        Aspirant aspirant1 = new Aspirant("Анна", "Міршниченко", "Група3", 5.0, "Програмування на виробництві");
        Aspirant aspirant2 = new Aspirant("Крістіна", "Федорова", "Група4", 4.8, "Машинобудування");

        Student[] students = {student1, student2, aspirant1, aspirant2};

        for (Student student : students) {
            System.out.println(student.getScholarship() + " грн");
        }
    }
    static class Student {
        private String firstName;
        private String lastName;
        private String group;
        private double averageMark;

        public Student(String firstName, String lastName, String group, double averageMark) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.group = group;
            this.averageMark = averageMark;
        }

        public double getAverageMark() {
            return averageMark;
        }

        public int getScholarship() {
            return (averageMark == 5) ? 100 : 80;
        }
    }

    static class Aspirant extends Student {
        private String scientificWork;

        public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
            super(firstName, lastName, group, averageMark);
            this.scientificWork = scientificWork;
        }

        @Override
        public int getScholarship() {
            return (getAverageMark() == 5) ? 200 : 180;
        }
    }
}
