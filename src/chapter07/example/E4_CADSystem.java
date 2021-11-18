package chapter07.example;
import static hexon.util.Print.*;

class Shape{
    Shape(int i) {
        print("Shape constructor: " + i);
    }
    void dispose(){
        print("Shape dispose");
    }
}

class Circle extends Shape {
    Circle(int i){
        super(i);
        print("Drawing Circle");
    }
    void dispose() {
        print("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        print("Drawing Triangle");
    }
    void dispose() {
        print("Erasing Triangle");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        print("Drawing Line: " + start + ". " + end);
    }

    void dispose() {
        print("Erasing Line: " + start + ". " + end);
        super.dispose();
    }
}

public class E4_CADSystem extends Shape {
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];

    public E4_CADSystem(int i) {
        super(i + 1);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j, j * j);
        }
        c = new Circle(i);
        t = new Triangle(i);
        print("Combined constructor");
    }

    public void dispose() {
        print("CADSystem.dispose()");
        t.dispose();
        c.dispose();
        // 销毁与生成类的顺序是想法的
        for(int i = lines.length - 1; i >= 0 ; i--) {
            lines[i].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        E4_CADSystem x = new E4_CADSystem(47);
        try {

        } finally {
            x.dispose();
        }
    }
}


