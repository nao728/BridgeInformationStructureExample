package kr.co.giloh.model.bean;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import kr.co.giloh.util.transform.ShapeNodeWheel;

public class GirderPlanAssembler extends Group {
    private ObjectProperty<BasicLinePlan> linePlan;

    private final ObjectProperty<Point3D> P_st_bcn = new SimpleObjectProperty<>(new Point3D(0, 0, 0));
    private final ObjectProperty<Point3D> P_st_ecn = new SimpleObjectProperty<>(new Point3D(0, 0, 0));

    private final ObjectProperty<Point3D> P_widening_left = new SimpleObjectProperty<>(new Point3D(0, 0, 0));
    private final ObjectProperty<Point3D> P_widening_right = new SimpleObjectProperty<>(new Point3D(0, 0, 0));

    private final ObjectProperty<Point3D> gP_st_bcn = new SimpleObjectProperty<>(new Point3D(0, 0, 0));
    private final ObjectProperty<Point3D> gP_st_ecn = new SimpleObjectProperty<>(new Point3D(0, 0, 0));

    private final ObjectProperty<Point3D> gP_widening_left = new SimpleObjectProperty<>(new Point3D(0, 0, 0));
    private final ObjectProperty<Point3D> gP_widening_right = new SimpleObjectProperty<>(new Point3D(0, 0, 0));


    public GirderPlanAssembler(BasicLinePlan linePlan) {
        this.linePlan = new SimpleObjectProperty<>(linePlan);
    }

    public void assemble() {
        // local variables
        Point3D gP_st = getLinePlan().getP_st();
        Point3D gP_st_sibling = getLinePlan().getP_st_sibling();
        double widening_left = getLinePlan().getWidening_left();
        double widening_right = getLinePlan().getWidening_right();

        // LCS 상에 포인트 정의
        setP_st_bcn(new Point3D(0, 0, 0));
        setP_st_ecn(new Point3D(0, 0, gP_st_sibling.subtract(gP_st).magnitude()));

        setP_widening_left(new Point3D(widening_left, 0, 0));
        setP_widening_right(new Point3D(-widening_right, 0, 0));

        // LCS 를 WCS 에서 gP_st ~ gP_st_sibling 으로 축 이동
        if(getLinePlan() instanceof BasicLinePlan){
            ShapeNodeWheel.turnInto(this, gP_st, gP_st_sibling, 0);
        } else if(getLinePlan() instanceof InclinedLinePlan){
            ShapeNodeWheel.turnInto(this, gP_st, gP_st_sibling, ((InclinedLinePlan) getLinePlan()).getThetaDegree());
        }


        // WCS 상의 좌표 설정
        setgP_st_bcn(this.localToScene(getP_st_bcn()));
        setgP_st_ecn(this.localToScene(getP_st_ecn()));
        setgP_widening_left(this.localToScene(getP_widening_left()));
        setgP_widening_right(this.localToScene(getP_widening_right()));
    }

    public Point3D getP_st_bcn() {
        return P_st_bcn.get();
    }

    public ObjectProperty<Point3D> p_st_bcnProperty() {
        return P_st_bcn;
    }

    public void setP_st_bcn(Point3D p_st_bcn) {
        this.P_st_bcn.set(p_st_bcn);
    }

    public Point3D getP_st_ecn() {
        return P_st_ecn.get();
    }

    public ObjectProperty<Point3D> p_st_ecnProperty() {
        return P_st_ecn;
    }

    public void setP_st_ecn(Point3D p_st_ecn) {
        this.P_st_ecn.set(p_st_ecn);
    }

    public Point3D getP_widening_left() {
        return P_widening_left.get();
    }

    public ObjectProperty<Point3D> p_widening_leftProperty() {
        return P_widening_left;
    }

    public void setP_widening_left(Point3D p_widening_left) {
        this.P_widening_left.set(p_widening_left);
    }

    public Point3D getP_widening_right() {
        return P_widening_right.get();
    }

    public ObjectProperty<Point3D> p_widening_rightProperty() {
        return P_widening_right;
    }

    public void setP_widening_right(Point3D p_widening_right) {
        this.P_widening_right.set(p_widening_right);
    }

    public BasicLinePlan getLinePlan() {
        return linePlan.get();
    }

    public ObjectProperty<BasicLinePlan> linePlanProperty() {
        return linePlan;
    }

    public Point3D getgP_st_bcn() {
        return gP_st_bcn.get();
    }

    public ObjectProperty<Point3D> gP_st_bcnProperty() {
        return gP_st_bcn;
    }

    public void setgP_st_bcn(Point3D gP_st_bcn) {
        this.gP_st_bcn.set(gP_st_bcn);
    }

    public Point3D getgP_st_ecn() {
        return gP_st_ecn.get();
    }

    public ObjectProperty<Point3D> gP_st_ecnProperty() {
        return gP_st_ecn;
    }

    public void setgP_st_ecn(Point3D gP_st_ecn) {
        this.gP_st_ecn.set(gP_st_ecn);
    }

    public Point3D getgP_widening_left() {
        return gP_widening_left.get();
    }

    public ObjectProperty<Point3D> gP_widening_leftProperty() {
        return gP_widening_left;
    }

    public void setgP_widening_left(Point3D gP_widening_left) {
        this.gP_widening_left.set(gP_widening_left);
    }

    public Point3D getgP_widening_right() {
        return gP_widening_right.get();
    }

    public ObjectProperty<Point3D> gP_widening_rightProperty() {
        return gP_widening_right;
    }

    public void setgP_widening_right(Point3D gP_widening_right) {
        this.gP_widening_right.set(gP_widening_right);
    }
}
