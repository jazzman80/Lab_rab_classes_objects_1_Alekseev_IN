class Person {
    String fullName;
    int age;

    Person(){
        fullName = "Ivan";
        age = 41;
    }

    Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    void move(){
        System.out.println(fullName + " идёт");
    }

    void talk(){
        System.out.println(fullName + " говорит");
    }
}
