package kr.co.giloh.model.bean;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Point3D;

public class InclinedLinePlan extends BasicLinePlan {
    private DoubleProperty thetaDegree;

    public InclinedLinePlan(double widening_left, double widening_right, Point3D P_st, Point3D P_st_sibling, double thetaDegree) {
        super(widening_left, widening_right, P_st, P_st_sibling);
        this.thetaDegree = new SimpleDoubleProperty(thetaDegree);
    }

    public double getThetaDegree() {
        return thetaDegree.get();
    }

    public DoubleProperty thetaDegreeProperty() {
        return thetaDegree;
    }

    public void setThetaDegree(double thetaDegree) {
        this.thetaDegree.set(thetaDegree);
    }
}
