class StudentConstructor {
    String name;
    int age;
    String course;

    StudentConstructor(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    StudentConstructor(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + ", Age: " + age);
    }

    StudentConstructor(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }

    
}
