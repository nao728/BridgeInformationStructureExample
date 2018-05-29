package kr.co.giloh.model.bean;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Point3D;

public class BasicLinePlan {
    private DoubleProperty widening_left;
    private DoubleProperty widening_right;
    private ObjectProperty<Point3D> P_st;
    private ObjectProperty<Point3D> P_st_sibling;

    public BasicLinePlan(double widening_left, double widening_right, Point3D P_st, Point3D P_st_sibling){
        this.widening_left = new SimpleDoubleProperty(widening_left);
        this.widening_right = new SimpleDoubleProperty(widening_right);
        this.P_st = new SimpleObjectProperty<>(P_st);
        this.P_st_sibling = new SimpleObjectProperty<>(P_st_sibling);
    }

    public double getWidening_left() {
        return widening_left.get();
    }

    public DoubleProperty widening_leftProperty() {
        return widening_left;
    }

    public void setWidening_left(double widening_left) {
        this.widening_left.set(widening_left);
    }

    public double getWidening_right() {
        return widening_right.get();
    }

    public DoubleProperty widening_rightProperty() {
        return widening_right;
    }

    public void setWidening_right(double widening_right) {
        this.widening_right.set(widening_right);
    }

    public Point3D getP_st() {
        return P_st.get();
    }

    public ObjectProperty<Point3D> p_stProperty() {
        return P_st;
    }

    public void setP_st(Point3D p_st) {
        this.P_st.set(p_st);
    }

    public Point3D getP_st_sibling() {
        return P_st_sibling.get();
    }

    public ObjectProperty<Point3D> p_st_siblingProperty() {
        return P_st_sibling;
    }

    public void setP_st_sibling(Point3D p_st_sibling) {
        this.P_st_sibling.set(p_st_sibling);
    }
}
