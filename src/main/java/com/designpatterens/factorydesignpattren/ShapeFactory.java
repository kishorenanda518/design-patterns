package com.designpatterens.factorydesignpattren;

public class ShapeFactory {

    Shape getShape(String shapeName) {
        switch (shapeName) {
            case "Circle":
               return new Cricle();
            case "Rectangle":
               return new Rectangle();
            case "Square":
               return new Square();
            default:
                return null;
        }
    }
}
