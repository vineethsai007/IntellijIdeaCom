package com.vinz;
class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No Plot Found";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {

        return "A shark Story which sucks";
    }
}
    class Bahubali extends Movie {
        public Bahubali() {
            super("Bahubali");
        }

        public String plot() {
            return "Fuktard Movie ";
        }

    }
    class ArjunReddy extends Movie {
        public ArjunReddy() {
            super("ArjunReddy");
        }

        public String plot() {
            return "Tremendous Performance ";
        }

    }
    class Tamil extends Movie {
        public Tamil() {
            super("Tamil");
        }

        public String plot() {
            return "Thokkalo basha ";
        }

    }
    class Forgettable extends Movie {
        public Forgettable() {
            super("Does not Exist Movie");
        }
    }

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }


    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) +1 ;
        System.out.println("random number generated is:" + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new Bahubali();
            case 3:
                return new ArjunReddy();
            case 4:
                return new Tamil();
            case 5:
                return new Forgettable();

        }
        return null;
    }
}



