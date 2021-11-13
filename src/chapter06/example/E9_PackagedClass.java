package chapter06.example;

public class E9_PackagedClass { // 此处如果不加public，那么E9_PackagedClass在chapter06.exercise.E9_Foreign中无法访问
    public E9_PackagedClass() {
        System.out.println("Creating a packaged Class");
    }
}
