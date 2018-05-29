package kr.co.giloh.app;

import javafx.geometry.Point3D;
import javafx.scene.Group;
import kr.co.giloh.model.bean.BasicLinePlan;
import kr.co.giloh.model.bean.GirderPlanAssembler;
import kr.co.giloh.model.bean.InclinedLinePlan;
import kr.co.giloh.util.transform.ShapeNodeWheel;

public class Examples {
    private static Point3D[] lineCoordinates = new Point3D[]{
            new Point3D(224504650.4300000, 180940187.3900000, 73.480),
            new Point3D(224495794.7923786, 180958119.8703532, 73.859),
            new Point3D(224486872.1420936, 180976019.1956494, 74.238),
            new Point3D(224477882.6409459, 180993885.0402497, 74.618),
            new Point3D(224468826.4145638, 181011717.1544788, 74.997),
            new Point3D(224459703.5895081, 181029515.2891330, 75.376),
            new Point3D(224450514.2932703, 181047279.1954833, 75.755),
            new Point3D(224441258.6542708, 181065008.6252789, 76.134),
            new Point3D(224431936.8018573, 181082703.3307510, 76.513),
            new Point3D(224422548.8663027, 181100363.0646162, 76.893),
            new Point3D(224413094.9788033, 181117987.5800795, 77.272),
            new Point3D(224403575.2714773, 181135576.6308382, 77.651),
            new Point3D(224393989.8773627, 181153129.9710854, 78.030),
            new Point3D(224384338.9304153, 181170647.3555130, 78.409),
            new Point3D(224374622.5655072, 181188128.5393156, 78.788),
            new Point3D(224364840.9184246, 181205573.2781935, 79.168),
            new Point3D(224354994.1258661, 181222981.3283564, 79.547),
            new Point3D(224345082.3254406, 181240352.4465268, 79.926),
            new Point3D(224335105.6556655, 181257686.3899433, 80.305),
            new Point3D(224325064.2559649, 181274982.9163639, 80.684),
            new Point3D(224314958.2666673, 181292241.7840697, 81.063),
            new Point3D(224304787.8290041, 181309462.7518678, 81.443),
            new Point3D(224294553.0851070, 181326645.5790952, 81.822),
            new Point3D(224284254.1780066, 181343790.0256218, 82.201),
            new Point3D(224273891.2516303, 181360895.8518540, 82.580),
            new Point3D(224263464.4508000, 181377962.8187378, 82.959),
            new Point3D(224252973.9212302, 181394990.6877622, 83.338),
            new Point3D(224242426.8377816, 181411983.5940470, 83.718),
            new Point3D(224231897.6888002, 181428987.5838275, 84.097),
            new Point3D(224221521.0435293, 181446085.0100092, 84.476),
            new Point3D(224211313.7483028, 181463284.0760674, 84.855),
            new Point3D(224201276.7985977, 181480583.1046451, 85.234),
            new Point3D(224191411.1732782, 181497980.4086365, 85.613),
            new Point3D(224181717.8344996, 181515474.2913514, 85.993),
            new Point3D(224172197.7276150, 181533063.0466803, 86.372),
            new Point3D(224162851.7810828, 181550744.9592616, 86.751),
            new Point3D(224153680.9063762, 181568518.3046483, 87.130),
            new Point3D(224144685.9978944, 181586381.3494760, 87.509),
            new Point3D(224135867.9328753, 181604332.3516329, 87.889),
            new Point3D(224127227.5713098, 181622369.5604284, 88.268),
            new Point3D(224118765.7558584, 181640491.2167650, 88.647),
            new Point3D(224110483.3117683, 181658695.5533091, 89.026),
            new Point3D(224102381.0467937, 181676980.7946637, 89.405),
            new Point3D(224094459.7511165, 181695345.1575416, 89.784),
            new Point3D(224086720.1972692, 181713786.8509389, 90.164),
            new Point3D(224079163.1400600, 181732304.0763103, 90.543),
            new Point3D(224071789.3164989, 181750895.0277438, 90.922),
            new Point3D(224064599.4457256, 181769557.8921376, 91.301),
            new Point3D(224057594.2289398, 181788290.8493761, 91.680),
            new Point3D(224050774.3493327, 181807092.0725081, 92.059),
            new Point3D(224044140.4720202, 181825959.7279247, 92.439),
            new Point3D(224037693.2439781, 181844891.9755379, 92.818),
            new Point3D(224031433.2939791, 181863886.9689606, 93.197),
            new Point3D(224025361.2325313, 181882942.8556859, 93.576),
            new Point3D(224019477.6518189, 181902057.7772687, 93.955),
            new Point3D(224013783.1256443, 181921229.8695062, 94.334),
            new Point3D(224008278.2093721, 181940457.2626200, 94.714),
            new Point3D(224002963.4398750, 181959738.0814384, 95.093),
            new Point3D(223997839.3354816, 181979070.4455795, 95.472),
            new Point3D(223992906.3959253, 181998452.4696340, 95.851),
            new Point3D(223988165.1022965, 182017882.2633498, 96.230),
            new Point3D(223983615.9169946, 182037357.9318160, 96.609),
            new Point3D(223979259.2836837, 182056877.5756476, 96.989),
            new Point3D(223975095.6272491, 182076439.2911708, 97.368),
            new Point3D(223971125.3537558, 182096041.1706088, 97.747),
            new Point3D(223967348.8504087, 182115681.3022679, 98.126),
            new Point3D(223963766.4855154, 182135357.7707236, 98.505),
            new Point3D(223960378.6084497, 182155068.6570076, 98.884),
            new Point3D(223957185.5496179, 182174812.0387953, 99.264),
            new Point3D(223954187.6204264, 182194585.9905925, 99.643),
            new Point3D(223951385.1132515, 182214388.5839239, 100.022),
            new Point3D(223948778.3014104, 182234217.8875209, 100.401),
            new Point3D(223946367.4391354, 182254071.9675098, 100.780),
            new Point3D(223944152.7615482, 182273948.8876007, 101.160),
            new Point3D(223942134.4846376, 182293846.7092762, 101.539),
            new Point3D(223940312.8052382, 182313763.4919803, 101.918),
            new Point3D(223938687.9010113, 182333697.2933079, 102.297),
            new Point3D(223937259.9304271, 182353646.1691942, 102.676),
            new Point3D(223936029.0327502, 182373608.1741042, 103.055),
            new Point3D(223934995.3280250, 182393581.3612223, 103.435),
            new Point3D(223934158.9170647, 182413563.7826427, 103.814),
    };

    public static void main(String[] args) {
        example2();
    }

    public static void example0() {
        double widening_left = 14_000;
        double widening_right = 14_000;

        Point3D P_st = new Point3D(224495794.7923786, 180958119.8703532, 73.859);
        Point3D P_st_sibling = new Point3D(224486872.1420936, 180976019.1956494, 74.238);

        Point3D P_st_bcn = new Point3D(0, 0, 0);
        Point3D P_st_ecn = new Point3D(0, 0, P_st_sibling.subtract(P_st).magnitude());
        Point3D P_widening_left = new Point3D(widening_left, 0, 0);
        Point3D P_widening_right = new Point3D(-widening_right, 0, 0);


        Group girderPlanAssembler = new Group();


        ShapeNodeWheel.turnInto(girderPlanAssembler, P_st, P_st_sibling);

        Point3D gP_st_bcn = girderPlanAssembler.localToScene(P_st_bcn);
        Point3D gP_st_ecn = girderPlanAssembler.localToScene(P_st_ecn);
        Point3D gP_widening_left = girderPlanAssembler.localToScene(P_widening_left);
        Point3D gP_widening_right = girderPlanAssembler.localToScene(P_widening_right);

        System.out.println(gP_st_bcn.getX() + "," + gP_st_bcn.getY() + "," + gP_st_bcn.getZ());
        System.out.println(gP_st_ecn.getX() + "," + gP_st_ecn.getY() + "," + gP_st_ecn.getZ());
        System.out.println();
        System.out.println(gP_widening_left.getX() + "," + gP_widening_left.getY() + "," + gP_widening_left.getZ());
        System.out.println(gP_widening_right.getX() + "," + gP_widening_right.getY() + "," + gP_widening_right.getZ());


        System.out.println();
    }

    public static void example1(){
        double widening_left = 14_000;
        double widening_right = 14_000;

        BasicLinePlan[] linePlans = new BasicLinePlan[lineCoordinates.length - 1];
        for (int i = 0; i < linePlans.length; i++) {
            linePlans[i] = new BasicLinePlan(widening_left, widening_right, lineCoordinates[i], lineCoordinates[i + 1]);
        }

        GirderPlanAssembler[] girderPlanAssemblers = new GirderPlanAssembler[linePlans.length];
        for (int i = 0; i < girderPlanAssemblers.length; i++) {
            girderPlanAssemblers[i] = new GirderPlanAssembler(linePlans[i]);

            girderPlanAssemblers[i].assemble();

            printCoords(girderPlanAssemblers[i]);
        }
    }

    public static void example2(){
        double widening_left = 14_000;
        double widening_right = 14_000;

        InclinedLinePlan[] linePlans = new InclinedLinePlan[lineCoordinates.length - 1];
        for (int i = 0; i < linePlans.length; i++) {
            linePlans[i] = new InclinedLinePlan(widening_left, widening_right, lineCoordinates[i], lineCoordinates[i + 1], 10);
        }

        GirderPlanAssembler[] girderPlanAssemblers = new GirderPlanAssembler[linePlans.length];
        for (int i = 0; i < girderPlanAssemblers.length; i++) {
            girderPlanAssemblers[i] = new GirderPlanAssembler(linePlans[i]);

            girderPlanAssemblers[i].assemble();

            printCoords(girderPlanAssemblers[i]);
        }
    }


    public static void printCoords(GirderPlanAssembler girderPlanAssembler) {
        Point3D gP_st_bcn = girderPlanAssembler.getgP_st_bcn();
        Point3D gP_st_ecn = girderPlanAssembler.getgP_st_ecn();
        Point3D gP_widening_left = girderPlanAssembler.getgP_widening_left();
        Point3D gP_widening_right = girderPlanAssembler.getgP_widening_right();


        System.out.println(gP_st_bcn.getX() + "," + gP_st_bcn.getY() + "," + gP_st_bcn.getZ());
        System.out.println(gP_st_ecn.getX() + "," + gP_st_ecn.getY() + "," + gP_st_ecn.getZ());
        System.out.println();
        System.out.println(gP_widening_left.getX() + "," + gP_widening_left.getY() + "," + gP_widening_left.getZ());
        System.out.println(gP_widening_right.getX() + "," + gP_widening_right.getY() + "," + gP_widening_right.getZ());
        System.out.println();
        System.out.println();

    }
}
