package model;

public class Student extends User {
        private Integer id;

        public Student(String name, String secondName, Integer year, Integer id) {
            super(name, secondName, year);
            this.id = id;
        }

        public Integer getId() {
            return id;
        }


        @Override
        public String toString() {
            return "Студент" +getName()+ "\n"+
                    "id=" + "\n" +id +
                    "\n"+ "Фомилия"+" "+ getSecondName()+" "+ "Год"+ getYear() ;
        }
    }
