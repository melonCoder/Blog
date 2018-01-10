package cn.sdyb.debugTrap;

/**
 * Created by meloncoder on 2018/1/10.
 */
public class DebugTrapMain {

    public static void main(String[] args) {
        ObjectCollector collector = new ObjectCollector(10, MultiFeatureObject.class);
        System.out.println(collector.toString());

        collector = new ObjectCollector(10, MultiFeatureObjectNested.class);
        System.out.println(collector.toString());
    }
}
