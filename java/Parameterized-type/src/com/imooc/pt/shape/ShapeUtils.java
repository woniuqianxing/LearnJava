package com.imooc.pt.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeUtils {
    //extends決定了上限在哪
    public void drawAll(List<? extends Shape> shapeList){
        for (Shape shape:shapeList) {
            shape.draw();
        }
    }

    //super決定了下限在哪
    public void doSth(List<? super Rectangle> shapeList){
        System.out.println("");
    }
    public static void main(String[] args) {
        ShapeUtils utils = new ShapeUtils();
        List<Circle> circleList = new ArrayList<>();
        utils.drawAll(circleList);
        List<Shape> list = new ArrayList<>();
        utils.doSth(list);
    }
}
