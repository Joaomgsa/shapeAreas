package entities;

import entities.enums.Color;

public class Rectangle extends Shape{

    private Double width;
    private Double height;

    public Rectangle() {
        super();
    }

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area(){
        return width * height;
    }
}
